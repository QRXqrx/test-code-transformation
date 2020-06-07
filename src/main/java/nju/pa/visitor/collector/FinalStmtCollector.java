package nju.pa.visitor.collector;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.stmt.*;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import nju.pa.util.JunitAssertUtil;
import nju.pa.util.enums.JunitAssert;

import java.util.List;

/**
 * Define final statement:
 *     Statements which contain "junit assert statement" is final statement.
 *
 * This class is used to collect all final statement.
 *
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-06-07
 */
public class FinalStmtCollector extends VoidVisitorAdapter<List<Statement>>  {

    /**
     * Simple implementation.
     * TODO - Specified for different statements.
     *
     * @param stmt a statement
     * @param arg a list of statement
     */
    private void addFinalStmt(Statement stmt, List<Statement> arg) {
        if(JunitAssert.hasJunitAssert(stmt.toString()))
            arg.add(stmt);
    }


    @Override
    public void visit(ExpressionStmt n, List<Statement> arg) {
        super.visit(n, arg);
        addFinalStmt(n, arg);
    }

    @Override
    public void visit(TryStmt n, List<Statement> arg) {
        super.visit(n, arg);
        addFinalStmt(n, arg);
    }

    @Override
    public void visit(IfStmt n, List<Statement> arg) {
        super.visit(n, arg);
        addFinalStmt(n, arg);
    }

    @Override
    public void visit(ForStmt n, List<Statement> arg) {
        super.visit(n, arg);
        addFinalStmt(n, arg);
    }

    @Override
    public void visit(DoStmt n, List<Statement> arg) {
        super.visit(n, arg);
        addFinalStmt(n, arg);
    }

    @Override
    public void visit(ForEachStmt n, List<Statement> arg) {
        super.visit(n, arg);
        addFinalStmt(n, arg);
    }

    @Override
    public void visit(WhileStmt n, List<Statement> arg) {
        super.visit(n, arg);
        addFinalStmt(n, arg);
    }


    @Override
    public void visit(SwitchStmt n, List<Statement> arg) {
        super.visit(n, arg);
        addFinalStmt(n, arg);
    }
}
