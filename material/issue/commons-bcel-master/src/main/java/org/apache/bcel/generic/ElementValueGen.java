/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.apache.bcel.generic;

import java.io.DataInput;
import java.io.DataOutputStream;
import java.io.IOException;
import org.apache.bcel.classfile.AnnotationElementValue;
import org.apache.bcel.classfile.AnnotationEntry;
import org.apache.bcel.classfile.ArrayElementValue;
import org.apache.bcel.classfile.ClassElementValue;
import org.apache.bcel.classfile.ElementValue;
import org.apache.bcel.classfile.EnumElementValue;
import org.apache.bcel.classfile.SimpleElementValue;

/**
 * @since 6.0
 */
public abstract class ElementValueGen {

    /**
     * @deprecated (since 6.0) will be made private and final; do not access directly, use getter
     */
    @Deprecated
    protected int type;

    /**
     * @deprecated (since 6.0) will be made private and final; do not access directly, use getter
     */
    @Deprecated
    protected ConstantPoolGen cpGen;

    protected ElementValueGen(final int type, final ConstantPoolGen cpGen) {
        this.type = type;
        this.cpGen = cpGen;
    }

    /**
     * Subtypes return an immutable variant of the ElementValueGen
     */
    public abstract ElementValue getElementValue();

    public int getElementValueType() {
        return type;
    }

    public abstract String stringifyValue();

    public abstract void dump(DataOutputStream dos) throws IOException;

    public static final int STRING = 's';

    public static final int ENUM_CONSTANT = 'e';

    public static final int CLASS = 'c';

    public static final int ANNOTATION = '@';

    public static final int ARRAY = '[';

    public static final int PRIMITIVE_INT = 'I';

    public static final int PRIMITIVE_BYTE = 'B';

    public static final int PRIMITIVE_CHAR = 'C';

    public static final int PRIMITIVE_DOUBLE = 'D';

    public static final int PRIMITIVE_FLOAT = 'F';

    public static final int PRIMITIVE_LONG = 'J';

    public static final int PRIMITIVE_SHORT = 'S';

    public static final int PRIMITIVE_BOOLEAN = 'Z';

    public static ElementValueGen readElementValue(final DataInput dis, final ConstantPoolGen cpGen) throws IOException {
        final int type = dis.readUnsignedByte();
        switch(type) {
            case // byte
            'B':
                return new SimpleElementValueGen(PRIMITIVE_BYTE, dis.readUnsignedShort(), cpGen);
            case // char
            'C':
                return new SimpleElementValueGen(PRIMITIVE_CHAR, dis.readUnsignedShort(), cpGen);
            case // double
            'D':
                return new SimpleElementValueGen(PRIMITIVE_DOUBLE, dis.readUnsignedShort(), cpGen);
            case // float
            'F':
                return new SimpleElementValueGen(PRIMITIVE_FLOAT, dis.readUnsignedShort(), cpGen);
            case // int
            'I':
                return new SimpleElementValueGen(PRIMITIVE_INT, dis.readUnsignedShort(), cpGen);
            case // long
            'J':
                return new SimpleElementValueGen(PRIMITIVE_LONG, dis.readUnsignedShort(), cpGen);
            case // short
            'S':
                return new SimpleElementValueGen(PRIMITIVE_SHORT, dis.readUnsignedShort(), cpGen);
            case // boolean
            'Z':
                return new SimpleElementValueGen(PRIMITIVE_BOOLEAN, dis.readUnsignedShort(), cpGen);
            case // String
            's':
                return new SimpleElementValueGen(STRING, dis.readUnsignedShort(), cpGen);
            case // Enum constant
            'e':
                return new EnumElementValueGen(dis.readUnsignedShort(), dis.readUnsignedShort(), cpGen);
            case // Class
            'c':
                return new ClassElementValueGen(dis.readUnsignedShort(), cpGen);
            case // Annotation
            '@':
                // TODO: isRuntimeVisible ??????????
                // FIXME
                return new AnnotationElementValueGen(ANNOTATION, new AnnotationEntryGen(AnnotationEntry.read(dis, cpGen.getConstantPool(), true), cpGen, false), cpGen);
            case // Array
            '[':
                final int numArrayVals = dis.readUnsignedShort();
                final ElementValue[] evalues = new ElementValue[numArrayVals];
                for (int j = 0; j < numArrayVals; j++) {
                    evalues[j] = ElementValue.readElementValue(dis, cpGen.getConstantPool());
                }
                return new ArrayElementValueGen(ARRAY, evalues, cpGen);
            default:
                throw new IllegalArgumentException("Unexpected element value kind in annotation: " + type);
        }
    }

    protected ConstantPoolGen getConstantPool() {
        return cpGen;
    }

    /**
     * Creates an (modifiable) ElementValueGen copy of an (immutable)
     * ElementValue - constant pool is assumed correct.
     */
    public static ElementValueGen copy(final ElementValue value, final ConstantPoolGen cpool, final boolean copyPoolEntries) {
        switch(value.getElementValueType()) {
            // byte
            case 'B':
            // char
            case 'C':
            // double
            case 'D':
            // float
            case 'F':
            // int
            case 'I':
            // long
            case 'J':
            // short
            case 'S':
            // boolean
            case 'Z':
            case // String
            's':
                return new SimpleElementValueGen((SimpleElementValue) value, cpool, copyPoolEntries);
            case // Enum constant
            'e':
                return new EnumElementValueGen((EnumElementValue) value, cpool, copyPoolEntries);
            case // Annotation
            '@':
                return new AnnotationElementValueGen((AnnotationElementValue) value, cpool, copyPoolEntries);
            case // Array
            '[':
                return new ArrayElementValueGen((ArrayElementValue) value, cpool, copyPoolEntries);
            case // Class
            'c':
                return new ClassElementValueGen((ClassElementValue) value, cpool, copyPoolEntries);
            default:
                throw new UnsupportedOperationException("Not implemented yet! (" + value.getElementValueType() + ")");
        }
    }
}

