/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 09 03:00:49 GMT 2018
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.mooctest.Node;
import net.mooctest.RedBlackTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractBinaryTree_ESTest extends AbstractBinaryTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      Integer.valueOf(1437);
      Node node0 = null;
      try { 
        Integer.parseUnsignedInt("oUN;12f9");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"oUN;12f9\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      Integer.getInteger("");
      Node node0 = new Node((Integer) null, (Node) null, (Node) null, (Node) null);
      Node node1 = new Node((Integer) null, (Node) null, (Node) null, node0);
      node1.parent = node0;
      node0.left = node1;
      Integer integer0 = new Integer(0);
      Integer.getInteger("_I");
      node0.value = integer0;
      // Undeclared exception!
      try { 
        redBlackTree0.rotateRight(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.RedBlackTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      Node node0 = redBlackTree0.insert((-2664));
      // Undeclared exception!
      redBlackTree0.insert((int) node0.value);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      Node node0 = redBlackTree0.insert(0);
      redBlackTree0.root = node0;
      RedBlackTree.RedBlackNode redBlackTree_RedBlackNode0 = RedBlackTree.nilNode;
      Node node1 = redBlackTree0.rotateLeft(redBlackTree_RedBlackNode0);
      Node node2 = redBlackTree0.getMaximum(node1);
      Node node3 = redBlackTree0.delete(node2);
      int int0 = (-2160);
      node2.right = (Node) redBlackTree_RedBlackNode0;
      node1.left = node3;
      RedBlackTree redBlackTree1 = new RedBlackTree();
      int int1 = (-302);
      node3.parent = redBlackTree0.root;
      Node node4 = redBlackTree1.insert(int1);
      redBlackTree_RedBlackNode0.right = node4;
      // Undeclared exception!
      redBlackTree0.delete((int) node1.value);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      Node node0 = redBlackTree0.insert(2);
      node0.left = redBlackTree0.root;
      node0.left.left = redBlackTree0.root;
      // Undeclared exception!
      redBlackTree0.getMinimum(node0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      redBlackTree0.delete(0);
      // Undeclared exception!
      try { 
        redBlackTree0.getSuccessor(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.AbstractBinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      int int0 = 504;
      // Undeclared exception!
      try { 
        redBlackTree0.printSubtree((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.AbstractBinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      int int0 = 0;
      // Undeclared exception!
      try { 
        redBlackTree0.printTree();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.AbstractBinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      Node node0 = redBlackTree0.insert(1433);
      Node node1 = redBlackTree0.rotateLeft(node0);
      redBlackTree0.rotateRight(node0);
      redBlackTree0.delete(node1);
      redBlackTree0.rotateLeft(node1);
      int int0 = (-582);
      // Undeclared exception!
      redBlackTree0.getSuccessor(int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      redBlackTree0.printTreePreOrder();
      redBlackTree0.getSize();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      Node node0 = redBlackTree0.insert((-1697));
      Node node1 = redBlackTree0.getMinimum(node0);
      redBlackTree0.getMaximum(node1);
      // Undeclared exception!
      try { 
        redBlackTree0.printTreePostOrder();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      redBlackTree0.printTreePostOrder();
      Integer integer0 = new Integer((-1880));
      Node node0 = new Node(integer0, (Node) null, (Node) null, (Node) null);
      redBlackTree0.root = node0;
      int int0 = (-728);
      // Undeclared exception!
      try { 
        redBlackTree0.insert(0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // net.mooctest.Node cannot be cast to net.mooctest.RedBlackTree$RedBlackNode
         //
         verifyException("net.mooctest.RedBlackTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      int int0 = 31;
      RedBlackTree redBlackTree1 = new RedBlackTree();
      // Undeclared exception!
      try { 
        redBlackTree1.getMinimum((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.RedBlackTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      redBlackTree0.printTreePostOrder();
      RedBlackTree redBlackTree1 = new RedBlackTree();
      // Undeclared exception!
      try { 
        redBlackTree1.printTree();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.AbstractBinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      int int0 = 0;
      redBlackTree0.search(0);
      // Undeclared exception!
      try { 
        redBlackTree0.getSuccessor((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.AbstractBinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      redBlackTree0.delete((-1652));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      int int0 = 31;
      // Undeclared exception!
      try { 
        redBlackTree0.getSuccessor(31);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.AbstractBinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      Integer integer0 = new Integer(989);
      RedBlackTree.ColorEnum redBlackTree_ColorEnum0 = RedBlackTree.ColorEnum.BLACK;
      RedBlackTree.RedBlackNode redBlackTree_RedBlackNode0 = new RedBlackTree.RedBlackNode(integer0, (Node) null, (Node) null, (Node) null, redBlackTree_ColorEnum0);
      redBlackTree0.printSubtree(redBlackTree_RedBlackNode0);
      // Undeclared exception!
      try { 
        redBlackTree0.getMinimum();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.RedBlackTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      Integer integer0 = new Integer(1);
      RedBlackTree.RedBlackNode redBlackTree_RedBlackNode0 = RedBlackTree.nilNode;
      Integer.getInteger("");
      RedBlackTree.ColorEnum redBlackTree_ColorEnum0 = RedBlackTree.ColorEnum.BLACK;
      RedBlackTree.RedBlackNode redBlackTree_RedBlackNode1 = new RedBlackTree.RedBlackNode(redBlackTree_RedBlackNode0.value, (Node) null, (Node) null, (Node) null, redBlackTree_ColorEnum0);
      Node node0 = new Node(integer0, (Node) null, redBlackTree_RedBlackNode0, redBlackTree_RedBlackNode1);
      // Undeclared exception!
      try { 
        redBlackTree0.getMaximum(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.RedBlackTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      // Undeclared exception!
      try { 
        redBlackTree0.getMinimum();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.RedBlackTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      redBlackTree0.printTreePreOrder();
      redBlackTree0.printTreePostOrder();
      RedBlackTree redBlackTree1 = new RedBlackTree();
      redBlackTree1.printTreePostOrder();
      // Undeclared exception!
      try { 
        redBlackTree1.rotateRight((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.RedBlackTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      Integer integer0 = new Integer(0);
      Node node0 = new Node(integer0, (Node) null, (Node) null, (Node) null);
      // Undeclared exception!
      try { 
        redBlackTree0.delete(node0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // net.mooctest.Node cannot be cast to net.mooctest.RedBlackTree$RedBlackNode
         //
         verifyException("net.mooctest.RedBlackTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      redBlackTree0.printTreeInOrder();
      redBlackTree0.delete((-1457));
      RedBlackTree.RedBlackNode redBlackTree_RedBlackNode0 = RedBlackTree.nilNode;
      Node node0 = redBlackTree0.createNode((-361), redBlackTree_RedBlackNode0, redBlackTree_RedBlackNode0, redBlackTree_RedBlackNode0);
      Node node1 = redBlackTree0.getMinimum(node0);
      node0.parent = node1;
      Node node2 = redBlackTree0.rotateRight(node1);
      int int0 = 0;
      node0.value = redBlackTree_RedBlackNode0.value;
      redBlackTree0.search(int0);
      Node node3 = redBlackTree0.rotateRight(node2);
      redBlackTree0.printSubtree(node3);
      redBlackTree0.delete(node1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      Node node0 = redBlackTree0.insert((-1));
      redBlackTree0.delete(node0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      redBlackTree0.printTreePreOrder();
      RedBlackTree redBlackTree1 = new RedBlackTree();
      Node node0 = redBlackTree1.insert((-1718));
      redBlackTree0.delete(node0);
      // Undeclared exception!
      redBlackTree0.contains((-1718));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      Integer integer0 = new Integer((-791));
      Integer.compareUnsigned((-791), 112);
      Node node0 = new Node(integer0, (Node) null, (Node) null, (Node) null);
      RedBlackTree.RedBlackNode redBlackTree_RedBlackNode0 = RedBlackTree.nilNode;
      RedBlackTree.ColorEnum redBlackTree_ColorEnum0 = RedBlackTree.ColorEnum.RED;
      node0.right = null;
      RedBlackTree.RedBlackNode redBlackTree_RedBlackNode1 = new RedBlackTree.RedBlackNode(node0.value, node0, node0, redBlackTree_RedBlackNode0, redBlackTree_ColorEnum0);
      redBlackTree_RedBlackNode1.parent = null;
      Node node1 = redBlackTree0.createNode(0, node0, redBlackTree_RedBlackNode1, redBlackTree_RedBlackNode1);
      Node node2 = redBlackTree0.rotateLeft(node1);
      node1.parent = null;
      node2.parent = node0;
      // Undeclared exception!
      redBlackTree0.getSuccessor(node2);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      RedBlackTree redBlackTree1 = new RedBlackTree();
      int int0 = 1;
      // Undeclared exception!
      try { 
        redBlackTree0.printSubtree((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.AbstractBinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      redBlackTree0.size = 0;
      Node node0 = null;
      redBlackTree0.root = null;
      redBlackTree0.getSize();
      redBlackTree0.delete(0);
      // Undeclared exception!
      try { 
        redBlackTree0.rotateLeft((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.RedBlackTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      Integer integer0 = Integer.getInteger("", 1420);
      Node node0 = new Node(integer0, (Node) null, (Node) null, (Node) null);
      redBlackTree0.root = node0;
      // Undeclared exception!
      try { 
        redBlackTree0.getMaximum();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.RedBlackTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      redBlackTree0.printTreeInOrder();
      int int0 = 0;
      redBlackTree0.insert(0);
      // Undeclared exception!
      redBlackTree0.delete(1760);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      Node node0 = redBlackTree0.insert((-712));
      Node node1 = redBlackTree0.delete(node0);
      node1.right = redBlackTree0.root;
      redBlackTree0.printSubtree(node1);
      Node node2 = redBlackTree0.getMaximum(node1);
      redBlackTree0.getMinimum(node2);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      redBlackTree0.printTreeInOrder();
      RedBlackTree.RedBlackNode redBlackTree_RedBlackNode0 = RedBlackTree.nilNode;
      redBlackTree_RedBlackNode0.parent = null;
      Node node0 = redBlackTree0.createNode(0, redBlackTree_RedBlackNode0, redBlackTree_RedBlackNode0, redBlackTree_RedBlackNode0);
      redBlackTree_RedBlackNode0.parent = null;
      node0.left = (Node) redBlackTree_RedBlackNode0;
      node0.parent = null;
      redBlackTree0.printSubtree(node0);
      Node node1 = null;
      int int0 = (-589);
      redBlackTree0.size = int0;
      redBlackTree0.rotateLeft(node1);
      redBlackTree0.printTreeInOrder();
      int int1 = 31;
      redBlackTree0.delete(int1);
      redBlackTree0.printTreeInOrder();
      int int2 = 4298;
      Node node2 = redBlackTree0.insert(int2);
      redBlackTree0.rotateLeft(node2);
      redBlackTree0.getMaximum();
      int int3 = 0;
      redBlackTree0.insert(int3);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      RedBlackTree.RedBlackNode redBlackTree_RedBlackNode0 = RedBlackTree.nilNode;
      // Undeclared exception!
      try { 
        redBlackTree0.rotateRight(redBlackTree_RedBlackNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.RedBlackTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      Node node0 = redBlackTree0.insert(0);
      redBlackTree0.delete(node0);
      RedBlackTree redBlackTree1 = new RedBlackTree();
      redBlackTree1.delete(redBlackTree0.root);
      // Undeclared exception!
      try { 
        redBlackTree0.getMaximum((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.RedBlackTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      redBlackTree0.insert((-1028));
      // Undeclared exception!
      redBlackTree0.search(0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      Node node0 = redBlackTree0.insert(1918);
      Node node1 = redBlackTree0.rotateLeft(node0);
      Node node2 = redBlackTree0.rotateLeft(node1);
      Node node3 = redBlackTree0.search(1918);
      redBlackTree0.printSubtree(node3);
      redBlackTree0.printTreePostOrder();
      Node node4 = redBlackTree0.rotateLeft(node3);
      redBlackTree0.getMaximum();
      Node node5 = redBlackTree0.rotateRight(node4);
      Node node6 = redBlackTree0.rotateRight(node4);
      redBlackTree0.delete(node6);
      redBlackTree0.printTree();
      Node node7 = redBlackTree0.insert((int) node4.value);
      Node node8 = redBlackTree0.delete(node7);
      node8.right = node5;
      int int0 = 2251;
      node7.right = node3;
      redBlackTree0.createNode(int0, node8, node7, node4);
      redBlackTree0.getMaximum();
      int int1 = 684;
      redBlackTree0.delete(int1);
      redBlackTree0.delete(node8);
      redBlackTree0.getMinimum(node8);
      redBlackTree0.createNode(int0, node3, node2, node6);
      redBlackTree0.getSize();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      redBlackTree0.printTreePostOrder();
      Node node0 = redBlackTree0.insert(1960);
      int int0 = (-7077);
      node0.left = redBlackTree0.root;
      Integer integer0 = new Integer((-7077));
      node0.parent = redBlackTree0.root;
      Integer.max(29, 2683);
      Integer.remainderUnsigned(1960, (-7077));
      node0.value = integer0;
      redBlackTree0.rotateLeft(node0);
      // Undeclared exception!
      redBlackTree0.delete((-2253));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      redBlackTree0.contains(1184);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      redBlackTree0.printTreePostOrder();
      Node node0 = redBlackTree0.insert(0);
      node0.right = redBlackTree0.root;
      redBlackTree0.rotateLeft(node0.right);
      node0.right.value = node0.right.value;
      node0.parent = redBlackTree0.root;
      node0.right = redBlackTree0.root;
      // Undeclared exception!
      redBlackTree0.getSuccessor(node0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      redBlackTree0.insert(161);
      int int0 = 31;
      // Undeclared exception!
      redBlackTree0.insert(31);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RedBlackTree redBlackTree0 = new RedBlackTree();
      Integer integer0 = new Integer(0);
      RedBlackTree.ColorEnum redBlackTree_ColorEnum0 = RedBlackTree.ColorEnum.RED;
      RedBlackTree.RedBlackNode redBlackTree_RedBlackNode0 = new RedBlackTree.RedBlackNode(integer0, (Node) null, (Node) null, (Node) null, redBlackTree_ColorEnum0);
      Node node0 = redBlackTree0.createNode(0, redBlackTree_RedBlackNode0, (Node) null, redBlackTree_RedBlackNode0);
      // Undeclared exception!
      try { 
        redBlackTree0.delete(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
