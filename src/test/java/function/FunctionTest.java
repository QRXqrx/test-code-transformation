package function;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.Statement;
import nju.pa.util.Util;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-06-07
 */
public class FunctionTest {

    @Test
    public void testBlockStmtEquals() {
        BlockStmt blockStmt1 = new BlockStmt();
        BlockStmt blockStmt2 = new BlockStmt();
        // Generate content.
        // System.out.println("Hello world!");
        Statement statement1 = StaticJavaParser.parseStatement("System.out.println(\"Hello world!\");");
        Statement statement2 = StaticJavaParser.parseStatement("System.out.println(\"Hello world!\");");
        // Add content.
        blockStmt1.addStatement(statement1);
        blockStmt2.addStatement(statement2);
        // Print Result
        Util.simpleLog("BStmt1", blockStmt1);
        Util.simpleLog("BStmt2", blockStmt2);
        Util.simpleLog("blockStmt1.equals(blockStmt2)", blockStmt1.equals(blockStmt2));
        Util.simpleLog("blockStmt1 == blockStmt2", blockStmt1 == blockStmt2);
    }

    @SuppressWarnings(value = "all")
    @Test
    public void test() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(1, 3);
        Assert.assertEquals(3, map.get(1).intValue());
    }
}
