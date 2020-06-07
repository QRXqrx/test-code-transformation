package nju.pa.visitor.modifier;

import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.ModifierVisitor;

import java.util.List;

/**
 * Remove method declarations from a ClassOrInterfaceDeclaration
 *
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-04-22
 */
public class OldTestRemover extends ModifierVisitor<List<MethodDeclaration>> {

    @Override
    public ClassOrInterfaceDeclaration visit(ClassOrInterfaceDeclaration cid, List<MethodDeclaration> toBeRemoved) {
        super.visit(cid, toBeRemoved);
        toBeRemoved.forEach(cid::remove);
        return cid;
    }
}
