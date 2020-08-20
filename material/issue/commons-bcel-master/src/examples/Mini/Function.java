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
package Mini;

/**
 * Represents a function declaration and its arguments. Type information is contained
 * in the ASTIdent fields.
 */
public class Function implements org.apache.bcel.Constants, EnvEntry {

    // Reference to the original declaration
    private final ASTIdent name;

    // Reference to argument identifiers
    private ASTIdent[] args;

    // private ASTExpr    body;         // Reference to function expression body
    // Is a key word?
    private final boolean reserved;

    // Short for name.getToken()
    private final int line, column;

    // Short for name.getName()
    private final String fun_name;

    private int no_args;

    public Function(final ASTIdent name, final ASTIdent[] args) {
        this(name, args, false);
    }

    public Function(final ASTIdent name, final ASTIdent[] args, final boolean reserved) {
        this.name = name;
        this.args = args;
        this.reserved = reserved;
        fun_name = name.getName();
        line = name.getLine();
        column = name.getColumn();
        setArgs(args);
    }

    @Override
    public String toString() {
        final StringBuffer buf = new StringBuffer();
        for (int i = 0; i < no_args; i++) {
            buf.append(args[i].getName());
            if (i < no_args - 1) {
                buf.append(", ");
            }
        }
        final String prefix = "Function " + fun_name + "(" + buf.toString() + ")";
        if (!reserved) {
            return prefix + " declared at line " + line + ", column " + column;
        } else {
            return prefix + " <predefined function>";
        }
    }

    public int getNoArgs() {
        return no_args;
    }

    public ASTIdent getName() {
        return name;
    }

    public String getHashKey() {
        return fun_name;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public ASTIdent getArg(final int i) {
        return args[i];
    }

    public ASTIdent[] getArgs() {
        return args;
    }

    public void setArgs(final ASTIdent[] args) {
        this.args = args;
        no_args = (args == null) ? 0 : args.length;
    }
}
