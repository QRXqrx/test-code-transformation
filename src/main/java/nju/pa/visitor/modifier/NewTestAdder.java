package nju.pa.visitor.modifier;

import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.BodyDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.ModifierVisitor;

import java.util.List;

/**
 * Add method declarations into an interface of ClassOrInterfaceDeclarations.
 * These interface doesn't represent inner class.
 *
 * @author QRX
 * @email QRXwzx@outlook.com
 * @date 2020-04-22
 */
public class NewTestAdder extends ModifierVisitor<List<MethodDeclaration>> {
    @Override
    public ClassOrInterfaceDeclaration visit(ClassOrInterfaceDeclaration cid, List<MethodDeclaration> toBeAdded) {
        super.visit(cid, toBeAdded);
        if(!cid.isInnerClass()) { // Don't add test methods to inner class.
            NodeList<BodyDeclaration<?>> members = cid.getMembers();
            members.addAll(toBeAdded);
            cid.setMembers(members);
        }
        return cid;
    }
}
