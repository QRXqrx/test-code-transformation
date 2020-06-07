package net.mooctest;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import static org.junit.Assert.*;

public class RedBlackTreeTest {

    private class MooctestHasNoBTree extends AbstractBinaryTree {

        @Override
        protected Node createNode(int value, Node parent, Node left, Node right) {
            return new Node(value, parent, left, right);
        }
    }

    @Test
    public void test() {
        RedBlackTree tree = new RedBlackTree();
        assertNull(tree.delete(12345));
    }

    @Test
    public void test_1() {
        RedBlackTree tree = new RedBlackTree();
        /*[Transform from] assertNull(tree.delete(12345));*/
        tree.delete(12345);
        assertFalse(tree.contains(12345));
    }

    @Test
    public void test_2() {
        RedBlackTree tree = new RedBlackTree();
        /*[Transform from] assertNull(tree.delete(12345));*/
        tree.delete(12345);
        /*[Transform from] assertFalse(tree.contains(12345));*/
        tree.contains(12345);
        Random rand = new Random();
        List<Node> nodes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            nodes.add(tree.insert(i));
            sb.append(i);
            sb.append(System.lineSeparator());
        }
        assertEquals(255, tree.root.value.intValue());
    }

    @Test
    public void test_3() {
        RedBlackTree tree = new RedBlackTree();
        /*[Transform from] assertNull(tree.delete(12345));*/
        tree.delete(12345);
        /*[Transform from] assertFalse(tree.contains(12345));*/
        tree.contains(12345);
        Random rand = new Random();
        List<Node> nodes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            nodes.add(tree.insert(i));
            sb.append(i);
            sb.append(System.lineSeparator());
        }
        /*[Transform from] assertEquals(255, tree.root.value.intValue());*/
        tree.root.value.intValue();
        assertEquals(1000, tree.getSize());
    }

    @Test
    public void test_4() {
        RedBlackTree tree = new RedBlackTree();
        /*[Transform from] assertNull(tree.delete(12345));*/
        tree.delete(12345);
        /*[Transform from] assertFalse(tree.contains(12345));*/
        tree.contains(12345);
        Random rand = new Random();
        List<Node> nodes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            nodes.add(tree.insert(i));
            sb.append(i);
            sb.append(System.lineSeparator());
        }
        /*[Transform from] assertEquals(255, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        assertEquals(0, tree.getMinimum());
    }

    @Test
    public void test_5() {
        RedBlackTree tree = new RedBlackTree();
        /*[Transform from] assertNull(tree.delete(12345));*/
        tree.delete(12345);
        /*[Transform from] assertFalse(tree.contains(12345));*/
        tree.contains(12345);
        Random rand = new Random();
        List<Node> nodes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            nodes.add(tree.insert(i));
            sb.append(i);
            sb.append(System.lineSeparator());
        }
        /*[Transform from] assertEquals(255, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        /*[Transform from] assertEquals(0, tree.getMinimum());*/
        tree.getMinimum();
        assertEquals(999, tree.getMaximum());
    }

    @Test
    public void test_6() {
        RedBlackTree tree = new RedBlackTree();
        /*[Transform from] assertNull(tree.delete(12345));*/
        tree.delete(12345);
        /*[Transform from] assertFalse(tree.contains(12345));*/
        tree.contains(12345);
        Random rand = new Random();
        List<Node> nodes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            nodes.add(tree.insert(i));
            sb.append(i);
            sb.append(System.lineSeparator());
        }
        /*[Transform from] assertEquals(255, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        /*[Transform from] assertEquals(0, tree.getMinimum());*/
        tree.getMinimum();
        /*[Transform from] assertEquals(999, tree.getMaximum());*/
        tree.getMaximum();
        tree.printTreePreOrder();
        tree.printTreePostOrder();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        tree.printTreeInOrder();
        assertEquals(sb.toString(), os.toString());
    }

    @Test
    public void test_7() {
        RedBlackTree tree = new RedBlackTree();
        /*[Transform from] assertNull(tree.delete(12345));*/
        tree.delete(12345);
        /*[Transform from] assertFalse(tree.contains(12345));*/
        tree.contains(12345);
        Random rand = new Random();
        List<Node> nodes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            nodes.add(tree.insert(i));
            sb.append(i);
            sb.append(System.lineSeparator());
        }
        /*[Transform from] assertEquals(255, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        /*[Transform from] assertEquals(0, tree.getMinimum());*/
        tree.getMinimum();
        /*[Transform from] assertEquals(999, tree.getMaximum());*/
        tree.getMaximum();
        tree.printTreePreOrder();
        tree.printTreePostOrder();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        tree.printTreeInOrder();
        /*[Transform from] assertEquals(sb.toString(), os.toString());*/
        {
            sb.toString();
            os.toString();
        }
        Collections.shuffle(nodes);
        for (Node node : nodes) {
            assertEquals(31 + node.value.hashCode(), node.hashCode());
            assertTrue(node.equals(node));
            assertTrue(tree.contains(node.value));
            tree.delete(node.value);
        }
    }

    @Test
    public void test_8() {
        RedBlackTree tree = new RedBlackTree();
        /*[Transform from] assertNull(tree.delete(12345));*/
        tree.delete(12345);
        /*[Transform from] assertFalse(tree.contains(12345));*/
        tree.contains(12345);
        Random rand = new Random();
        List<Node> nodes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            nodes.add(tree.insert(i));
            sb.append(i);
            sb.append(System.lineSeparator());
        }
        /*[Transform from] assertEquals(255, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        /*[Transform from] assertEquals(0, tree.getMinimum());*/
        tree.getMinimum();
        /*[Transform from] assertEquals(999, tree.getMaximum());*/
        tree.getMaximum();
        tree.printTreePreOrder();
        tree.printTreePostOrder();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        tree.printTreeInOrder();
        /*[Transform from] assertEquals(sb.toString(), os.toString());*/
        {
            sb.toString();
            os.toString();
        }
        Collections.shuffle(nodes);
        for (Node node : nodes) {
            /*[Transform from] assertEquals(31 + node.value.hashCode(), node.hashCode());*/
            node.hashCode();
            /*[Transform from] assertTrue(node.equals(node));*/
            node.equals(node);
            /*[Transform from] assertTrue(tree.contains(node.value));*/
            tree.contains(node.value);
            tree.delete(node.value);
        }
        assertEquals(0, tree.getSize());
    }

    @Test
    public void test_9() {
        RedBlackTree tree = new RedBlackTree();
        /*[Transform from] assertNull(tree.delete(12345));*/
        tree.delete(12345);
        /*[Transform from] assertFalse(tree.contains(12345));*/
        tree.contains(12345);
        Random rand = new Random();
        List<Node> nodes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            nodes.add(tree.insert(i));
            sb.append(i);
            sb.append(System.lineSeparator());
        }
        /*[Transform from] assertEquals(255, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        /*[Transform from] assertEquals(0, tree.getMinimum());*/
        tree.getMinimum();
        /*[Transform from] assertEquals(999, tree.getMaximum());*/
        tree.getMaximum();
        tree.printTreePreOrder();
        tree.printTreePostOrder();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        tree.printTreeInOrder();
        /*[Transform from] assertEquals(sb.toString(), os.toString());*/
        {
            sb.toString();
            os.toString();
        }
        Collections.shuffle(nodes);
        for (Node node : nodes) {
            /*[Transform from] assertEquals(31 + node.value.hashCode(), node.hashCode());*/
            node.hashCode();
            /*[Transform from] assertTrue(node.equals(node));*/
            node.equals(node);
            /*[Transform from] assertTrue(tree.contains(node.value));*/
            tree.contains(node.value);
            tree.delete(node.value);
        }
        /*[Transform from] assertEquals(0, tree.getSize());*/
        tree.getSize();
        nodes.clear();
        tree = new RedBlackTree();
        for (int i = 1000; i >= 1; i--) {
            nodes.add(tree.insert(i));
        }
        assertEquals(745, tree.root.value.intValue());
    }

    @Test
    public void test_10() {
        RedBlackTree tree = new RedBlackTree();
        /*[Transform from] assertNull(tree.delete(12345));*/
        tree.delete(12345);
        /*[Transform from] assertFalse(tree.contains(12345));*/
        tree.contains(12345);
        Random rand = new Random();
        List<Node> nodes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            nodes.add(tree.insert(i));
            sb.append(i);
            sb.append(System.lineSeparator());
        }
        /*[Transform from] assertEquals(255, tree.root.value.intValue());*/
        tree.root.value.intValue();
        assertEquals(1000, tree.getSize());
    }

    @Test
    public void test_11() {
        RedBlackTree tree = new RedBlackTree();
        /*[Transform from] assertNull(tree.delete(12345));*/
        tree.delete(12345);
        /*[Transform from] assertFalse(tree.contains(12345));*/
        tree.contains(12345);
        Random rand = new Random();
        List<Node> nodes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            nodes.add(tree.insert(i));
            sb.append(i);
            sb.append(System.lineSeparator());
        }
        /*[Transform from] assertEquals(255, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        /*[Transform from] assertEquals(0, tree.getMinimum());*/
        tree.getMinimum();
        /*[Transform from] assertEquals(999, tree.getMaximum());*/
        tree.getMaximum();
        tree.printTreePreOrder();
        tree.printTreePostOrder();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        tree.printTreeInOrder();
        /*[Transform from] assertEquals(sb.toString(), os.toString());*/
        {
            sb.toString();
            os.toString();
        }
        Collections.shuffle(nodes);
        for (Node node : nodes) {
            /*[Transform from] assertEquals(31 + node.value.hashCode(), node.hashCode());*/
            node.hashCode();
            /*[Transform from] assertTrue(node.equals(node));*/
            node.equals(node);
            /*[Transform from] assertTrue(tree.contains(node.value));*/
            tree.contains(node.value);
            tree.delete(node.value);
        }
        /*[Transform from] assertEquals(0, tree.getSize());*/
        tree.getSize();
        nodes.clear();
        tree = new RedBlackTree();
        for (int i = 1000; i >= 1; i--) {
            nodes.add(tree.insert(i));
        }
        /*[Transform from] assertEquals(745, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        assertEquals(1, tree.getMinimum());
    }

    @Test
    public void test_12() {
        RedBlackTree tree = new RedBlackTree();
        /*[Transform from] assertNull(tree.delete(12345));*/
        tree.delete(12345);
        /*[Transform from] assertFalse(tree.contains(12345));*/
        tree.contains(12345);
        Random rand = new Random();
        List<Node> nodes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            nodes.add(tree.insert(i));
            sb.append(i);
            sb.append(System.lineSeparator());
        }
        /*[Transform from] assertEquals(255, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        /*[Transform from] assertEquals(0, tree.getMinimum());*/
        tree.getMinimum();
        /*[Transform from] assertEquals(999, tree.getMaximum());*/
        tree.getMaximum();
        tree.printTreePreOrder();
        tree.printTreePostOrder();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        tree.printTreeInOrder();
        /*[Transform from] assertEquals(sb.toString(), os.toString());*/
        {
            sb.toString();
            os.toString();
        }
        Collections.shuffle(nodes);
        for (Node node : nodes) {
            /*[Transform from] assertEquals(31 + node.value.hashCode(), node.hashCode());*/
            node.hashCode();
            /*[Transform from] assertTrue(node.equals(node));*/
            node.equals(node);
            /*[Transform from] assertTrue(tree.contains(node.value));*/
            tree.contains(node.value);
            tree.delete(node.value);
        }
        /*[Transform from] assertEquals(0, tree.getSize());*/
        tree.getSize();
        nodes.clear();
        tree = new RedBlackTree();
        for (int i = 1000; i >= 1; i--) {
            nodes.add(tree.insert(i));
        }
        /*[Transform from] assertEquals(745, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        /*[Transform from] assertEquals(1, tree.getMinimum());*/
        tree.getMinimum();
        assertEquals(1000, tree.getMaximum());
    }

    @Test
    public void test_13() {
        RedBlackTree tree = new RedBlackTree();
        /*[Transform from] assertNull(tree.delete(12345));*/
        tree.delete(12345);
        /*[Transform from] assertFalse(tree.contains(12345));*/
        tree.contains(12345);
        Random rand = new Random();
        List<Node> nodes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            nodes.add(tree.insert(i));
            sb.append(i);
            sb.append(System.lineSeparator());
        }
        /*[Transform from] assertEquals(255, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        /*[Transform from] assertEquals(0, tree.getMinimum());*/
        tree.getMinimum();
        /*[Transform from] assertEquals(999, tree.getMaximum());*/
        tree.getMaximum();
        tree.printTreePreOrder();
        tree.printTreePostOrder();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        tree.printTreeInOrder();
        /*[Transform from] assertEquals(sb.toString(), os.toString());*/
        {
            sb.toString();
            os.toString();
        }
        Collections.shuffle(nodes);
        for (Node node : nodes) {
            /*[Transform from] assertEquals(31 + node.value.hashCode(), node.hashCode());*/
            node.hashCode();
            /*[Transform from] assertTrue(node.equals(node));*/
            node.equals(node);
            /*[Transform from] assertTrue(tree.contains(node.value));*/
            tree.contains(node.value);
            tree.delete(node.value);
        }
        /*[Transform from] assertEquals(0, tree.getSize());*/
        tree.getSize();
        nodes.clear();
        tree = new RedBlackTree();
        for (int i = 1000; i >= 1; i--) {
            nodes.add(tree.insert(i));
        }
        /*[Transform from] assertEquals(745, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        /*[Transform from] assertEquals(1, tree.getMinimum());*/
        tree.getMinimum();
        /*[Transform from] assertEquals(1000, tree.getMaximum());*/
        tree.getMaximum();
        assertTrue(new Node(0, null, null, null).isLeaf());
    }

    @Test
    public void test_14() {
        RedBlackTree tree = new RedBlackTree();
        /*[Transform from] assertNull(tree.delete(12345));*/
        tree.delete(12345);
        /*[Transform from] assertFalse(tree.contains(12345));*/
        tree.contains(12345);
        Random rand = new Random();
        List<Node> nodes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            nodes.add(tree.insert(i));
            sb.append(i);
            sb.append(System.lineSeparator());
        }
        /*[Transform from] assertEquals(255, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        /*[Transform from] assertEquals(0, tree.getMinimum());*/
        tree.getMinimum();
        /*[Transform from] assertEquals(999, tree.getMaximum());*/
        tree.getMaximum();
        tree.printTreePreOrder();
        tree.printTreePostOrder();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        tree.printTreeInOrder();
        /*[Transform from] assertEquals(sb.toString(), os.toString());*/
        {
            sb.toString();
            os.toString();
        }
        Collections.shuffle(nodes);
        for (Node node : nodes) {
            /*[Transform from] assertEquals(31 + node.value.hashCode(), node.hashCode());*/
            node.hashCode();
            /*[Transform from] assertTrue(node.equals(node));*/
            node.equals(node);
            /*[Transform from] assertTrue(tree.contains(node.value));*/
            tree.contains(node.value);
            tree.delete(node.value);
        }
        /*[Transform from] assertEquals(0, tree.getSize());*/
        tree.getSize();
        nodes.clear();
        tree = new RedBlackTree();
        for (int i = 1000; i >= 1; i--) {
            nodes.add(tree.insert(i));
        }
        /*[Transform from] assertEquals(745, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        /*[Transform from] assertEquals(1, tree.getMinimum());*/
        tree.getMinimum();
        /*[Transform from] assertEquals(1000, tree.getMaximum());*/
        tree.getMaximum();
        /*[Transform from] assertTrue(new Node(0, null, null, null).isLeaf());*/
        new Node(0, null, null, null).isLeaf();
        assertFalse(new Node(0, null, new Node(0, null, null, null), null).isLeaf());
    }

    @Test
    public void test_15() {
        RedBlackTree tree = new RedBlackTree();
        /*[Transform from] assertNull(tree.delete(12345));*/
        tree.delete(12345);
        /*[Transform from] assertFalse(tree.contains(12345));*/
        tree.contains(12345);
        Random rand = new Random();
        List<Node> nodes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            nodes.add(tree.insert(i));
            sb.append(i);
            sb.append(System.lineSeparator());
        }
        /*[Transform from] assertEquals(255, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        /*[Transform from] assertEquals(0, tree.getMinimum());*/
        tree.getMinimum();
        /*[Transform from] assertEquals(999, tree.getMaximum());*/
        tree.getMaximum();
        tree.printTreePreOrder();
        tree.printTreePostOrder();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        tree.printTreeInOrder();
        /*[Transform from] assertEquals(sb.toString(), os.toString());*/
        {
            sb.toString();
            os.toString();
        }
        Collections.shuffle(nodes);
        for (Node node : nodes) {
            /*[Transform from] assertEquals(31 + node.value.hashCode(), node.hashCode());*/
            node.hashCode();
            /*[Transform from] assertTrue(node.equals(node));*/
            node.equals(node);
            /*[Transform from] assertTrue(tree.contains(node.value));*/
            tree.contains(node.value);
            tree.delete(node.value);
        }
        /*[Transform from] assertEquals(0, tree.getSize());*/
        tree.getSize();
        nodes.clear();
        tree = new RedBlackTree();
        for (int i = 1000; i >= 1; i--) {
            nodes.add(tree.insert(i));
        }
        /*[Transform from] assertEquals(745, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        /*[Transform from] assertEquals(1, tree.getMinimum());*/
        tree.getMinimum();
        /*[Transform from] assertEquals(1000, tree.getMaximum());*/
        tree.getMaximum();
        /*[Transform from] assertTrue(new Node(0, null, null, null).isLeaf());*/
        new Node(0, null, null, null).isLeaf();
        /*[Transform from] assertFalse(new Node(0, null, new Node(0, null, null, null), null).isLeaf());*/
        new Node(0, null, new Node(0, null, null, null), null).isLeaf();
        assertFalse(new Node(0, null, null, new Node(0, null, null, null)).isLeaf());
    }

    @Test
    public void test_16() {
        RedBlackTree tree = new RedBlackTree();
        /*[Transform from] assertNull(tree.delete(12345));*/
        tree.delete(12345);
        /*[Transform from] assertFalse(tree.contains(12345));*/
        tree.contains(12345);
        Random rand = new Random();
        List<Node> nodes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            nodes.add(tree.insert(i));
            sb.append(i);
            sb.append(System.lineSeparator());
        }
        /*[Transform from] assertEquals(255, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        /*[Transform from] assertEquals(0, tree.getMinimum());*/
        tree.getMinimum();
        /*[Transform from] assertEquals(999, tree.getMaximum());*/
        tree.getMaximum();
        tree.printTreePreOrder();
        tree.printTreePostOrder();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        tree.printTreeInOrder();
        /*[Transform from] assertEquals(sb.toString(), os.toString());*/
        {
            sb.toString();
            os.toString();
        }
        Collections.shuffle(nodes);
        for (Node node : nodes) {
            /*[Transform from] assertEquals(31 + node.value.hashCode(), node.hashCode());*/
            node.hashCode();
            /*[Transform from] assertTrue(node.equals(node));*/
            node.equals(node);
            /*[Transform from] assertTrue(tree.contains(node.value));*/
            tree.contains(node.value);
            tree.delete(node.value);
        }
        /*[Transform from] assertEquals(0, tree.getSize());*/
        tree.getSize();
        nodes.clear();
        tree = new RedBlackTree();
        for (int i = 1000; i >= 1; i--) {
            nodes.add(tree.insert(i));
        }
        /*[Transform from] assertEquals(745, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        /*[Transform from] assertEquals(1, tree.getMinimum());*/
        tree.getMinimum();
        /*[Transform from] assertEquals(1000, tree.getMaximum());*/
        tree.getMaximum();
        /*[Transform from] assertTrue(new Node(0, null, null, null).isLeaf());*/
        new Node(0, null, null, null).isLeaf();
        /*[Transform from] assertFalse(new Node(0, null, new Node(0, null, null, null), null).isLeaf());*/
        new Node(0, null, new Node(0, null, null, null), null).isLeaf();
        /*[Transform from] assertFalse(new Node(0, null, null, new Node(0, null, null, null)).isLeaf());*/
        new Node(0, null, null, new Node(0, null, null, null)).isLeaf();
        assertFalse(new Node(0, null, null, null).equals(null));
    }

    @Test
    public void test_17() {
        RedBlackTree tree = new RedBlackTree();
        /*[Transform from] assertNull(tree.delete(12345));*/
        tree.delete(12345);
        /*[Transform from] assertFalse(tree.contains(12345));*/
        tree.contains(12345);
        Random rand = new Random();
        List<Node> nodes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            nodes.add(tree.insert(i));
            sb.append(i);
            sb.append(System.lineSeparator());
        }
        /*[Transform from] assertEquals(255, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        /*[Transform from] assertEquals(0, tree.getMinimum());*/
        tree.getMinimum();
        /*[Transform from] assertEquals(999, tree.getMaximum());*/
        tree.getMaximum();
        tree.printTreePreOrder();
        tree.printTreePostOrder();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        tree.printTreeInOrder();
        /*[Transform from] assertEquals(sb.toString(), os.toString());*/
        {
            sb.toString();
            os.toString();
        }
        Collections.shuffle(nodes);
        for (Node node : nodes) {
            /*[Transform from] assertEquals(31 + node.value.hashCode(), node.hashCode());*/
            node.hashCode();
            /*[Transform from] assertTrue(node.equals(node));*/
            node.equals(node);
            /*[Transform from] assertTrue(tree.contains(node.value));*/
            tree.contains(node.value);
            tree.delete(node.value);
        }
        /*[Transform from] assertEquals(0, tree.getSize());*/
        tree.getSize();
        nodes.clear();
        tree = new RedBlackTree();
        for (int i = 1000; i >= 1; i--) {
            nodes.add(tree.insert(i));
        }
        /*[Transform from] assertEquals(745, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        /*[Transform from] assertEquals(1, tree.getMinimum());*/
        tree.getMinimum();
        /*[Transform from] assertEquals(1000, tree.getMaximum());*/
        tree.getMaximum();
        /*[Transform from] assertTrue(new Node(0, null, null, null).isLeaf());*/
        new Node(0, null, null, null).isLeaf();
        /*[Transform from] assertFalse(new Node(0, null, new Node(0, null, null, null), null).isLeaf());*/
        new Node(0, null, new Node(0, null, null, null), null).isLeaf();
        /*[Transform from] assertFalse(new Node(0, null, null, new Node(0, null, null, null)).isLeaf());*/
        new Node(0, null, null, new Node(0, null, null, null)).isLeaf();
        /*[Transform from] assertFalse(new Node(0, null, null, null).equals(null));*/
        new Node(0, null, null, null).equals(null);
        assertFalse(new Node(0, null, null, null).equals(""));
    }

    @Test
    public void test_18() {
        RedBlackTree tree = new RedBlackTree();
        /*[Transform from] assertNull(tree.delete(12345));*/
        tree.delete(12345);
        /*[Transform from] assertFalse(tree.contains(12345));*/
        tree.contains(12345);
        Random rand = new Random();
        List<Node> nodes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            nodes.add(tree.insert(i));
            sb.append(i);
            sb.append(System.lineSeparator());
        }
        /*[Transform from] assertEquals(255, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        /*[Transform from] assertEquals(0, tree.getMinimum());*/
        tree.getMinimum();
        /*[Transform from] assertEquals(999, tree.getMaximum());*/
        tree.getMaximum();
        tree.printTreePreOrder();
        tree.printTreePostOrder();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        tree.printTreeInOrder();
        /*[Transform from] assertEquals(sb.toString(), os.toString());*/
        {
            sb.toString();
            os.toString();
        }
        Collections.shuffle(nodes);
        for (Node node : nodes) {
            /*[Transform from] assertEquals(31 + node.value.hashCode(), node.hashCode());*/
            node.hashCode();
            /*[Transform from] assertTrue(node.equals(node));*/
            node.equals(node);
            /*[Transform from] assertTrue(tree.contains(node.value));*/
            tree.contains(node.value);
            tree.delete(node.value);
        }
        /*[Transform from] assertEquals(0, tree.getSize());*/
        tree.getSize();
        nodes.clear();
        tree = new RedBlackTree();
        for (int i = 1000; i >= 1; i--) {
            nodes.add(tree.insert(i));
        }
        /*[Transform from] assertEquals(745, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        /*[Transform from] assertEquals(1, tree.getMinimum());*/
        tree.getMinimum();
        /*[Transform from] assertEquals(1000, tree.getMaximum());*/
        tree.getMaximum();
        /*[Transform from] assertTrue(new Node(0, null, null, null).isLeaf());*/
        new Node(0, null, null, null).isLeaf();
        /*[Transform from] assertFalse(new Node(0, null, new Node(0, null, null, null), null).isLeaf());*/
        new Node(0, null, new Node(0, null, null, null), null).isLeaf();
        /*[Transform from] assertFalse(new Node(0, null, null, new Node(0, null, null, null)).isLeaf());*/
        new Node(0, null, null, new Node(0, null, null, null)).isLeaf();
        /*[Transform from] assertFalse(new Node(0, null, null, null).equals(null));*/
        new Node(0, null, null, null).equals(null);
        /*[Transform from] assertFalse(new Node(0, null, null, null).equals(""));*/
        new Node(0, null, null, null).equals("");
        assertFalse(new Node(null, null, null, null).equals(new Node(233, null, null, null)));
    }

    @Test
    public void test_19() {
        RedBlackTree tree = new RedBlackTree();
        /*[Transform from] assertNull(tree.delete(12345));*/
        tree.delete(12345);
        /*[Transform from] assertFalse(tree.contains(12345));*/
        tree.contains(12345);
        Random rand = new Random();
        List<Node> nodes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            nodes.add(tree.insert(i));
            sb.append(i);
            sb.append(System.lineSeparator());
        }
        /*[Transform from] assertEquals(255, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        /*[Transform from] assertEquals(0, tree.getMinimum());*/
        tree.getMinimum();
        /*[Transform from] assertEquals(999, tree.getMaximum());*/
        tree.getMaximum();
        tree.printTreePreOrder();
        tree.printTreePostOrder();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        tree.printTreeInOrder();
        /*[Transform from] assertEquals(sb.toString(), os.toString());*/
        {
            sb.toString();
            os.toString();
        }
        Collections.shuffle(nodes);
        for (Node node : nodes) {
            /*[Transform from] assertEquals(31 + node.value.hashCode(), node.hashCode());*/
            node.hashCode();
            /*[Transform from] assertTrue(node.equals(node));*/
            node.equals(node);
            /*[Transform from] assertTrue(tree.contains(node.value));*/
            tree.contains(node.value);
            tree.delete(node.value);
        }
        /*[Transform from] assertEquals(0, tree.getSize());*/
        tree.getSize();
        nodes.clear();
        tree = new RedBlackTree();
        for (int i = 1000; i >= 1; i--) {
            nodes.add(tree.insert(i));
        }
        /*[Transform from] assertEquals(745, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        /*[Transform from] assertEquals(1, tree.getMinimum());*/
        tree.getMinimum();
        /*[Transform from] assertEquals(1000, tree.getMaximum());*/
        tree.getMaximum();
        /*[Transform from] assertTrue(new Node(0, null, null, null).isLeaf());*/
        new Node(0, null, null, null).isLeaf();
        /*[Transform from] assertFalse(new Node(0, null, new Node(0, null, null, null), null).isLeaf());*/
        new Node(0, null, new Node(0, null, null, null), null).isLeaf();
        /*[Transform from] assertFalse(new Node(0, null, null, new Node(0, null, null, null)).isLeaf());*/
        new Node(0, null, null, new Node(0, null, null, null)).isLeaf();
        /*[Transform from] assertFalse(new Node(0, null, null, null).equals(null));*/
        new Node(0, null, null, null).equals(null);
        /*[Transform from] assertFalse(new Node(0, null, null, null).equals(""));*/
        new Node(0, null, null, null).equals("");
        /*[Transform from] assertFalse(new Node(null, null, null, null).equals(new Node(233, null, null, null)));*/
        new Node(null, null, null, null).equals(new Node(233, null, null, null));
        assertTrue(new Node(null, null, null, null).equals(new Node(null, null, null, null)));
    }

    @Test
    public void test_20() {
        RedBlackTree tree = new RedBlackTree();
        /*[Transform from] assertNull(tree.delete(12345));*/
        tree.delete(12345);
        /*[Transform from] assertFalse(tree.contains(12345));*/
        tree.contains(12345);
        Random rand = new Random();
        List<Node> nodes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            nodes.add(tree.insert(i));
            sb.append(i);
            sb.append(System.lineSeparator());
        }
        /*[Transform from] assertEquals(255, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        /*[Transform from] assertEquals(0, tree.getMinimum());*/
        tree.getMinimum();
        /*[Transform from] assertEquals(999, tree.getMaximum());*/
        tree.getMaximum();
        tree.printTreePreOrder();
        tree.printTreePostOrder();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        tree.printTreeInOrder();
        /*[Transform from] assertEquals(sb.toString(), os.toString());*/
        {
            sb.toString();
            os.toString();
        }
        Collections.shuffle(nodes);
        for (Node node : nodes) {
            /*[Transform from] assertEquals(31 + node.value.hashCode(), node.hashCode());*/
            node.hashCode();
            /*[Transform from] assertTrue(node.equals(node));*/
            node.equals(node);
            /*[Transform from] assertTrue(tree.contains(node.value));*/
            tree.contains(node.value);
            tree.delete(node.value);
        }
        /*[Transform from] assertEquals(0, tree.getSize());*/
        tree.getSize();
        nodes.clear();
        tree = new RedBlackTree();
        for (int i = 1000; i >= 1; i--) {
            nodes.add(tree.insert(i));
        }
        /*[Transform from] assertEquals(745, tree.root.value.intValue());*/
        tree.root.value.intValue();
        /*[Transform from] assertEquals(1000, tree.getSize());*/
        tree.getSize();
        /*[Transform from] assertEquals(1, tree.getMinimum());*/
        tree.getMinimum();
        /*[Transform from] assertEquals(1000, tree.getMaximum());*/
        tree.getMaximum();
        /*[Transform from] assertTrue(new Node(0, null, null, null).isLeaf());*/
        new Node(0, null, null, null).isLeaf();
        /*[Transform from] assertFalse(new Node(0, null, new Node(0, null, null, null), null).isLeaf());*/
        new Node(0, null, new Node(0, null, null, null), null).isLeaf();
        /*[Transform from] assertFalse(new Node(0, null, null, new Node(0, null, null, null)).isLeaf());*/
        new Node(0, null, null, new Node(0, null, null, null)).isLeaf();
        /*[Transform from] assertFalse(new Node(0, null, null, null).equals(null));*/
        new Node(0, null, null, null).equals(null);
        /*[Transform from] assertFalse(new Node(0, null, null, null).equals(""));*/
        new Node(0, null, null, null).equals("");
        /*[Transform from] assertFalse(new Node(null, null, null, null).equals(new Node(233, null, null, null)));*/
        new Node(null, null, null, null).equals(new Node(233, null, null, null));
        /*[Transform from] assertTrue(new Node(null, null, null, null).equals(new Node(null, null, null, null)));*/
        new Node(null, null, null, null).equals(new Node(null, null, null, null));
        assertFalse(new Node(233, null, null, null).equals(new Node(234, null, null, null)));
    }

    @Test
    public void testBTree() {
        AbstractBinaryTree bTree = new MooctestHasNoBTree();
        List<Node> nodes = new ArrayList<>();
        nodes.add(bTree.insert(500));
        nodes.add(bTree.insert(250));
        nodes.add(bTree.insert(750));
        for (int i = 0; i < 500; i++) {
            nodes.add(bTree.insert(i));
            nodes.add(bTree.insert(999 - i));
        }
        bTree.rotateLeft(bTree.root);
        bTree.rotateRight(bTree.root);
        bTree.rotateLeft(bTree.root.left);
        bTree.rotateLeft(bTree.root.right);
        bTree.rotateRight(bTree.root.left);
        bTree.rotateRight(bTree.root.right);
        assertEquals(500, bTree.root.value.intValue());
    }

    @Test
    public void testBTree_1() {
        AbstractBinaryTree bTree = new MooctestHasNoBTree();
        List<Node> nodes = new ArrayList<>();
        nodes.add(bTree.insert(500));
        nodes.add(bTree.insert(250));
        nodes.add(bTree.insert(750));
        for (int i = 0; i < 500; i++) {
            nodes.add(bTree.insert(i));
            nodes.add(bTree.insert(999 - i));
        }
        bTree.rotateLeft(bTree.root);
        bTree.rotateRight(bTree.root);
        bTree.rotateLeft(bTree.root.left);
        bTree.rotateLeft(bTree.root.right);
        bTree.rotateRight(bTree.root.left);
        bTree.rotateRight(bTree.root.right);
        /*[Transform from] assertEquals(500, bTree.root.value.intValue());*/
        bTree.root.value.intValue();
        assertEquals(1003, bTree.getSize());
    }

    @Test
    public void testBTree_2() {
        AbstractBinaryTree bTree = new MooctestHasNoBTree();
        List<Node> nodes = new ArrayList<>();
        nodes.add(bTree.insert(500));
        nodes.add(bTree.insert(250));
        nodes.add(bTree.insert(750));
        for (int i = 0; i < 500; i++) {
            nodes.add(bTree.insert(i));
            nodes.add(bTree.insert(999 - i));
        }
        bTree.rotateLeft(bTree.root);
        bTree.rotateRight(bTree.root);
        bTree.rotateLeft(bTree.root.left);
        bTree.rotateLeft(bTree.root.right);
        bTree.rotateRight(bTree.root.left);
        bTree.rotateRight(bTree.root.right);
        /*[Transform from] assertEquals(500, bTree.root.value.intValue());*/
        bTree.root.value.intValue();
        /*[Transform from] assertEquals(1003, bTree.getSize());*/
        bTree.getSize();
        assertEquals(0, bTree.getMinimum());
    }

    @Test
    public void testBTree_3() {
        AbstractBinaryTree bTree = new MooctestHasNoBTree();
        List<Node> nodes = new ArrayList<>();
        nodes.add(bTree.insert(500));
        nodes.add(bTree.insert(250));
        nodes.add(bTree.insert(750));
        for (int i = 0; i < 500; i++) {
            nodes.add(bTree.insert(i));
            nodes.add(bTree.insert(999 - i));
        }
        bTree.rotateLeft(bTree.root);
        bTree.rotateRight(bTree.root);
        bTree.rotateLeft(bTree.root.left);
        bTree.rotateLeft(bTree.root.right);
        bTree.rotateRight(bTree.root.left);
        bTree.rotateRight(bTree.root.right);
        /*[Transform from] assertEquals(500, bTree.root.value.intValue());*/
        bTree.root.value.intValue();
        /*[Transform from] assertEquals(1003, bTree.getSize());*/
        bTree.getSize();
        /*[Transform from] assertEquals(0, bTree.getMinimum());*/
        bTree.getMinimum();
        assertEquals(999, bTree.getMaximum());
    }

    @Test
    public void testBTree_4() {
        AbstractBinaryTree bTree = new MooctestHasNoBTree();
        List<Node> nodes = new ArrayList<>();
        nodes.add(bTree.insert(500));
        nodes.add(bTree.insert(250));
        nodes.add(bTree.insert(750));
        for (int i = 0; i < 500; i++) {
            nodes.add(bTree.insert(i));
            nodes.add(bTree.insert(999 - i));
        }
        bTree.rotateLeft(bTree.root);
        bTree.rotateRight(bTree.root);
        bTree.rotateLeft(bTree.root.left);
        bTree.rotateLeft(bTree.root.right);
        bTree.rotateRight(bTree.root.left);
        bTree.rotateRight(bTree.root.right);
        /*[Transform from] assertEquals(500, bTree.root.value.intValue());*/
        bTree.root.value.intValue();
        /*[Transform from] assertEquals(1003, bTree.getSize());*/
        bTree.getSize();
        /*[Transform from] assertEquals(0, bTree.getMinimum());*/
        bTree.getMinimum();
        /*[Transform from] assertEquals(999, bTree.getMaximum());*/
        bTree.getMaximum();
        assertNull(bTree.delete(12345));
    }

    @Test
    public void testBTree_5() {
        AbstractBinaryTree bTree = new MooctestHasNoBTree();
        List<Node> nodes = new ArrayList<>();
        nodes.add(bTree.insert(500));
        nodes.add(bTree.insert(250));
        nodes.add(bTree.insert(750));
        for (int i = 0; i < 500; i++) {
            nodes.add(bTree.insert(i));
            nodes.add(bTree.insert(999 - i));
        }
        bTree.rotateLeft(bTree.root);
        bTree.rotateRight(bTree.root);
        bTree.rotateLeft(bTree.root.left);
        bTree.rotateLeft(bTree.root.right);
        bTree.rotateRight(bTree.root.left);
        bTree.rotateRight(bTree.root.right);
        /*[Transform from] assertEquals(500, bTree.root.value.intValue());*/
        bTree.root.value.intValue();
        /*[Transform from] assertEquals(1003, bTree.getSize());*/
        bTree.getSize();
        /*[Transform from] assertEquals(0, bTree.getMinimum());*/
        bTree.getMinimum();
        /*[Transform from] assertEquals(999, bTree.getMaximum());*/
        bTree.getMaximum();
        /*[Transform from] assertNull(bTree.delete(12345));*/
        bTree.delete(12345);
        assertNull(bTree.delete(null));
    }

    @Test
    public void testBTree_6() {
        AbstractBinaryTree bTree = new MooctestHasNoBTree();
        List<Node> nodes = new ArrayList<>();
        nodes.add(bTree.insert(500));
        nodes.add(bTree.insert(250));
        nodes.add(bTree.insert(750));
        for (int i = 0; i < 500; i++) {
            nodes.add(bTree.insert(i));
            nodes.add(bTree.insert(999 - i));
        }
        bTree.rotateLeft(bTree.root);
        bTree.rotateRight(bTree.root);
        bTree.rotateLeft(bTree.root.left);
        bTree.rotateLeft(bTree.root.right);
        bTree.rotateRight(bTree.root.left);
        bTree.rotateRight(bTree.root.right);
        /*[Transform from] assertEquals(500, bTree.root.value.intValue());*/
        bTree.root.value.intValue();
        /*[Transform from] assertEquals(1003, bTree.getSize());*/
        bTree.getSize();
        /*[Transform from] assertEquals(0, bTree.getMinimum());*/
        bTree.getMinimum();
        /*[Transform from] assertEquals(999, bTree.getMaximum());*/
        bTree.getMaximum();
        /*[Transform from] assertNull(bTree.delete(12345));*/
        bTree.delete(12345);
        /*[Transform from] assertNull(bTree.delete(null));*/
        bTree.delete(null);
        assertEquals(500, bTree.getSuccessor(500));
    }

    @Test
    public void testBTree_7() {
        AbstractBinaryTree bTree = new MooctestHasNoBTree();
        List<Node> nodes = new ArrayList<>();
        nodes.add(bTree.insert(500));
        nodes.add(bTree.insert(250));
        nodes.add(bTree.insert(750));
        for (int i = 0; i < 500; i++) {
            nodes.add(bTree.insert(i));
            nodes.add(bTree.insert(999 - i));
        }
        bTree.rotateLeft(bTree.root);
        bTree.rotateRight(bTree.root);
        bTree.rotateLeft(bTree.root.left);
        bTree.rotateLeft(bTree.root.right);
        bTree.rotateRight(bTree.root.left);
        bTree.rotateRight(bTree.root.right);
        /*[Transform from] assertEquals(500, bTree.root.value.intValue());*/
        bTree.root.value.intValue();
        /*[Transform from] assertEquals(1003, bTree.getSize());*/
        bTree.getSize();
        /*[Transform from] assertEquals(0, bTree.getMinimum());*/
        bTree.getMinimum();
        /*[Transform from] assertEquals(999, bTree.getMaximum());*/
        bTree.getMaximum();
        /*[Transform from] assertNull(bTree.delete(12345));*/
        bTree.delete(12345);
        /*[Transform from] assertNull(bTree.delete(null));*/
        bTree.delete(null);
        /*[Transform from] assertEquals(500, bTree.getSuccessor(500));*/
        bTree.getSuccessor(500);
        assertNull(bTree.getSuccessor(bTree.search(999)));
    }

    @Test
    public void testBTree_8() {
        AbstractBinaryTree bTree = new MooctestHasNoBTree();
        List<Node> nodes = new ArrayList<>();
        nodes.add(bTree.insert(500));
        nodes.add(bTree.insert(250));
        nodes.add(bTree.insert(750));
        for (int i = 0; i < 500; i++) {
            nodes.add(bTree.insert(i));
            nodes.add(bTree.insert(999 - i));
        }
        bTree.rotateLeft(bTree.root);
        bTree.rotateRight(bTree.root);
        bTree.rotateLeft(bTree.root.left);
        bTree.rotateLeft(bTree.root.right);
        bTree.rotateRight(bTree.root.left);
        bTree.rotateRight(bTree.root.right);
        /*[Transform from] assertEquals(500, bTree.root.value.intValue());*/
        bTree.root.value.intValue();
        /*[Transform from] assertEquals(1003, bTree.getSize());*/
        bTree.getSize();
        /*[Transform from] assertEquals(0, bTree.getMinimum());*/
        bTree.getMinimum();
        /*[Transform from] assertEquals(999, bTree.getMaximum());*/
        bTree.getMaximum();
        /*[Transform from] assertNull(bTree.delete(12345));*/
        bTree.delete(12345);
        /*[Transform from] assertNull(bTree.delete(null));*/
        bTree.delete(null);
        /*[Transform from] assertEquals(500, bTree.getSuccessor(500));*/
        bTree.getSuccessor(500);
        /*[Transform from] assertNull(bTree.getSuccessor(bTree.search(999)));*/
        bTree.getSuccessor(bTree.search(999));
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        bTree.printTree();
        assertEquals(1003, os.toString().split("\n").length);
    }

    @Test
    public void testBTree_9() {
        AbstractBinaryTree bTree = new MooctestHasNoBTree();
        List<Node> nodes = new ArrayList<>();
        nodes.add(bTree.insert(500));
        nodes.add(bTree.insert(250));
        nodes.add(bTree.insert(750));
        for (int i = 0; i < 500; i++) {
            nodes.add(bTree.insert(i));
            nodes.add(bTree.insert(999 - i));
        }
        bTree.rotateLeft(bTree.root);
        bTree.rotateRight(bTree.root);
        bTree.rotateLeft(bTree.root.left);
        bTree.rotateLeft(bTree.root.right);
        bTree.rotateRight(bTree.root.left);
        bTree.rotateRight(bTree.root.right);
        /*[Transform from] assertEquals(500, bTree.root.value.intValue());*/
        bTree.root.value.intValue();
        /*[Transform from] assertEquals(1003, bTree.getSize());*/
        bTree.getSize();
        /*[Transform from] assertEquals(0, bTree.getMinimum());*/
        bTree.getMinimum();
        /*[Transform from] assertEquals(999, bTree.getMaximum());*/
        bTree.getMaximum();
        /*[Transform from] assertNull(bTree.delete(12345));*/
        bTree.delete(12345);
        /*[Transform from] assertNull(bTree.delete(null));*/
        bTree.delete(null);
        /*[Transform from] assertEquals(500, bTree.getSuccessor(500));*/
        bTree.getSuccessor(500);
        /*[Transform from] assertNull(bTree.getSuccessor(bTree.search(999)));*/
        bTree.getSuccessor(bTree.search(999));
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        bTree.printTree();
        /*[Transform from] assertEquals(1003, os.toString().split("\n").length);[NONE Params]*/
        ;
        assertEquals(1003, os.toString().split("-----").length);
    }

    @Test
    public void testBTree_10() {
        AbstractBinaryTree bTree = new MooctestHasNoBTree();
        List<Node> nodes = new ArrayList<>();
        nodes.add(bTree.insert(500));
        nodes.add(bTree.insert(250));
        nodes.add(bTree.insert(750));
        for (int i = 0; i < 500; i++) {
            nodes.add(bTree.insert(i));
            nodes.add(bTree.insert(999 - i));
        }
        bTree.rotateLeft(bTree.root);
        bTree.rotateRight(bTree.root);
        bTree.rotateLeft(bTree.root.left);
        bTree.rotateLeft(bTree.root.right);
        bTree.rotateRight(bTree.root.left);
        bTree.rotateRight(bTree.root.right);
        /*[Transform from] assertEquals(500, bTree.root.value.intValue());*/
        bTree.root.value.intValue();
        /*[Transform from] assertEquals(1003, bTree.getSize());*/
        bTree.getSize();
        /*[Transform from] assertEquals(0, bTree.getMinimum());*/
        bTree.getMinimum();
        /*[Transform from] assertEquals(999, bTree.getMaximum());*/
        bTree.getMaximum();
        /*[Transform from] assertNull(bTree.delete(12345));*/
        bTree.delete(12345);
        /*[Transform from] assertNull(bTree.delete(null));*/
        bTree.delete(null);
        /*[Transform from] assertEquals(500, bTree.getSuccessor(500));*/
        bTree.getSuccessor(500);
        /*[Transform from] assertNull(bTree.getSuccessor(bTree.search(999)));*/
        bTree.getSuccessor(bTree.search(999));
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        bTree.printTree();
        /*[Transform from] assertEquals(1003, os.toString().split("\n").length);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(1003, os.toString().split("-----").length);[NONE Params]*/
        ;
        assertEquals(502, os.toString().split("\\\\").length);
    }

    @Test
    public void testBTree_11() {
        AbstractBinaryTree bTree = new MooctestHasNoBTree();
        List<Node> nodes = new ArrayList<>();
        nodes.add(bTree.insert(500));
        nodes.add(bTree.insert(250));
        nodes.add(bTree.insert(750));
        for (int i = 0; i < 500; i++) {
            nodes.add(bTree.insert(i));
            nodes.add(bTree.insert(999 - i));
        }
        bTree.rotateLeft(bTree.root);
        bTree.rotateRight(bTree.root);
        bTree.rotateLeft(bTree.root.left);
        bTree.rotateLeft(bTree.root.right);
        bTree.rotateRight(bTree.root.left);
        bTree.rotateRight(bTree.root.right);
        /*[Transform from] assertEquals(500, bTree.root.value.intValue());*/
        bTree.root.value.intValue();
        /*[Transform from] assertEquals(1003, bTree.getSize());*/
        bTree.getSize();
        /*[Transform from] assertEquals(0, bTree.getMinimum());*/
        bTree.getMinimum();
        /*[Transform from] assertEquals(999, bTree.getMaximum());*/
        bTree.getMaximum();
        /*[Transform from] assertNull(bTree.delete(12345));*/
        bTree.delete(12345);
        /*[Transform from] assertNull(bTree.delete(null));*/
        bTree.delete(null);
        /*[Transform from] assertEquals(500, bTree.getSuccessor(500));*/
        bTree.getSuccessor(500);
        /*[Transform from] assertNull(bTree.getSuccessor(bTree.search(999)));*/
        bTree.getSuccessor(bTree.search(999));
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        bTree.printTree();
        /*[Transform from] assertEquals(1003, os.toString().split("\n").length);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(1003, os.toString().split("-----").length);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(502, os.toString().split("\\\\").length);[NONE Params]*/
        ;
        assertEquals(502, os.toString().split("/").length);
    }

    @Test
    public void testBTree_12() {
        AbstractBinaryTree bTree = new MooctestHasNoBTree();
        List<Node> nodes = new ArrayList<>();
        nodes.add(bTree.insert(500));
        nodes.add(bTree.insert(250));
        nodes.add(bTree.insert(750));
        for (int i = 0; i < 500; i++) {
            nodes.add(bTree.insert(i));
            nodes.add(bTree.insert(999 - i));
        }
        bTree.rotateLeft(bTree.root);
        bTree.rotateRight(bTree.root);
        bTree.rotateLeft(bTree.root.left);
        bTree.rotateLeft(bTree.root.right);
        bTree.rotateRight(bTree.root.left);
        bTree.rotateRight(bTree.root.right);
        /*[Transform from] assertEquals(500, bTree.root.value.intValue());*/
        bTree.root.value.intValue();
        /*[Transform from] assertEquals(1003, bTree.getSize());*/
        bTree.getSize();
        /*[Transform from] assertEquals(0, bTree.getMinimum());*/
        bTree.getMinimum();
        /*[Transform from] assertEquals(999, bTree.getMaximum());*/
        bTree.getMaximum();
        /*[Transform from] assertNull(bTree.delete(12345));*/
        bTree.delete(12345);
        /*[Transform from] assertNull(bTree.delete(null));*/
        bTree.delete(null);
        /*[Transform from] assertEquals(500, bTree.getSuccessor(500));*/
        bTree.getSuccessor(500);
        /*[Transform from] assertNull(bTree.getSuccessor(bTree.search(999)));*/
        bTree.getSuccessor(bTree.search(999));
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        bTree.printTree();
        /*[Transform from] assertEquals(1003, os.toString().split("\n").length);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(1003, os.toString().split("-----").length);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(502, os.toString().split("\\\\").length);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(502, os.toString().split("/").length);[NONE Params]*/
        ;
        os.reset();
        bTree.printSubtree(new Node(null, null, null, null));
        assertEquals("<null>", os.toString().trim());
    }

    @Test
    public void testBTree_13() {
        AbstractBinaryTree bTree = new MooctestHasNoBTree();
        List<Node> nodes = new ArrayList<>();
        nodes.add(bTree.insert(500));
        nodes.add(bTree.insert(250));
        nodes.add(bTree.insert(750));
        for (int i = 0; i < 500; i++) {
            nodes.add(bTree.insert(i));
            nodes.add(bTree.insert(999 - i));
        }
        bTree.rotateLeft(bTree.root);
        bTree.rotateRight(bTree.root);
        bTree.rotateLeft(bTree.root.left);
        bTree.rotateLeft(bTree.root.right);
        bTree.rotateRight(bTree.root.left);
        bTree.rotateRight(bTree.root.right);
        /*[Transform from] assertEquals(500, bTree.root.value.intValue());*/
        bTree.root.value.intValue();
        /*[Transform from] assertEquals(1003, bTree.getSize());*/
        bTree.getSize();
        /*[Transform from] assertEquals(0, bTree.getMinimum());*/
        bTree.getMinimum();
        /*[Transform from] assertEquals(999, bTree.getMaximum());*/
        bTree.getMaximum();
        /*[Transform from] assertNull(bTree.delete(12345));*/
        bTree.delete(12345);
        /*[Transform from] assertNull(bTree.delete(null));*/
        bTree.delete(null);
        /*[Transform from] assertEquals(500, bTree.getSuccessor(500));*/
        bTree.getSuccessor(500);
        /*[Transform from] assertNull(bTree.getSuccessor(bTree.search(999)));*/
        bTree.getSuccessor(bTree.search(999));
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        bTree.printTree();
        /*[Transform from] assertEquals(1003, os.toString().split("\n").length);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(1003, os.toString().split("-----").length);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(502, os.toString().split("\\\\").length);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(502, os.toString().split("/").length);[NONE Params]*/
        ;
        os.reset();
        bTree.printSubtree(new Node(null, null, null, null));
        /*[Transform from] assertEquals("<null>", os.toString().trim());*/
        os.toString().trim();
        Collections.shuffle(nodes);
        for (Node node : nodes) {
            assertTrue(bTree.contains(node.value));
            bTree.delete(node.value);
        }
    }

    @Test
    public void testBTree_14() {
        AbstractBinaryTree bTree = new MooctestHasNoBTree();
        List<Node> nodes = new ArrayList<>();
        nodes.add(bTree.insert(500));
        nodes.add(bTree.insert(250));
        nodes.add(bTree.insert(750));
        for (int i = 0; i < 500; i++) {
            nodes.add(bTree.insert(i));
            nodes.add(bTree.insert(999 - i));
        }
        bTree.rotateLeft(bTree.root);
        bTree.rotateRight(bTree.root);
        bTree.rotateLeft(bTree.root.left);
        bTree.rotateLeft(bTree.root.right);
        bTree.rotateRight(bTree.root.left);
        bTree.rotateRight(bTree.root.right);
        /*[Transform from] assertEquals(500, bTree.root.value.intValue());*/
        bTree.root.value.intValue();
        /*[Transform from] assertEquals(1003, bTree.getSize());*/
        bTree.getSize();
        /*[Transform from] assertEquals(0, bTree.getMinimum());*/
        bTree.getMinimum();
        /*[Transform from] assertEquals(999, bTree.getMaximum());*/
        bTree.getMaximum();
        /*[Transform from] assertNull(bTree.delete(12345));*/
        bTree.delete(12345);
        /*[Transform from] assertNull(bTree.delete(null));*/
        bTree.delete(null);
        /*[Transform from] assertEquals(500, bTree.getSuccessor(500));*/
        bTree.getSuccessor(500);
        /*[Transform from] assertNull(bTree.getSuccessor(bTree.search(999)));*/
        bTree.getSuccessor(bTree.search(999));
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        bTree.printTree();
        /*[Transform from] assertEquals(1003, os.toString().split("\n").length);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(1003, os.toString().split("-----").length);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(502, os.toString().split("\\\\").length);[NONE Params]*/
        ;
        /*[Transform from] assertEquals(502, os.toString().split("/").length);[NONE Params]*/
        ;
        os.reset();
        bTree.printSubtree(new Node(null, null, null, null));
        /*[Transform from] assertEquals("<null>", os.toString().trim());*/
        os.toString().trim();
        Collections.shuffle(nodes);
        for (Node node : nodes) {
            /*[Transform from] assertTrue(bTree.contains(node.value));*/
            bTree.contains(node.value);
            bTree.delete(node.value);
        }
        assertEquals(0, bTree.getSize());
    }
}

