package nju.pa.visitor.modifier;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.stmt.*;
import com.github.javaparser.ast.visitor.ModifierVisitor;
import com.github.javaparser.ast.visitor.Visitable;
import nju.pa.util.JunitAssertUtil;


/**
 * This Modifier can transform all non-final jas into expected format, operate like:
 *      assertEquals(255, tree.root.value.intValue()) --> tree.root.value.intValue();
 *
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-06-07
 */
public class JasModifier extends ModifierVisitor<Void> {

    @Override
    public Visitable visit(ExpressionStmt n, Void arg) {
        super.visit(n, arg);
        // Only modify when n is a jas
        if(JunitAssertUtil.isJunitAssertStmt(n)) {
            NodeList<Statement> statements = JunitAssertUtil.transformJunitAssertStmt(n);
            n.removeComment(); // When transform twice, parsing error will occur.
            if(statements.size() > 1) {
                BlockStmt bs = new BlockStmt();
                bs.setBlockComment("[Transform from] " + n.toString());
                statements.forEach(bs::addStatement);
                return bs;
            } else if(statements.size() == 1) {
                Statement stmt = statements.get(0);
                stmt.setBlockComment("[Transform from] " + n.toString());
                return stmt;
            } else {
                EmptyStmt emptyStmt = new EmptyStmt();
                emptyStmt.setBlockComment("[Transform from] " + n.toString() + "[NONE Params]");
                return emptyStmt;
            }
        }
        // Don't modify.
        return n;
    }

}
