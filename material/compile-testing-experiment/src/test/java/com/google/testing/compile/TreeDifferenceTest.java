/*
 * Copyright (C) 2014 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.testing.compile;

import static com.google.common.truth.Truth.assertThat;
import com.google.common.collect.Iterables;
import com.google.testing.compile.Parser.ParseResult;
import com.sun.source.tree.CompilationUnitTree;
import com.sun.source.tree.Tree;
import com.sun.source.util.TreePath;
import com.sun.source.util.Trees;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * A unit test for {@link TreeDifference}
 */
@RunWith(JUnit4.class)
public class TreeDifferenceTest {

    private static final ParseResult PARSE_RESULTS = MoreTrees.parseLines("package test;", "", "final class TestClass {", "    public String toString() {", "        Object variable = new Object();", "        return \"literal\" + variable;", "    }", "", "    public void nonsense() {", "        int[] numbers = {0, 1, 2, 3, 4};", "        for (int x : numbers) {", "            if (x % 2 == 0) {", "                throw new IllegalStateException();", "            }", "        }", "    }", "}");

    private static final CompilationUnitTree COMPILATION_UNIT = Iterables.getOnlyElement(PARSE_RESULTS.compilationUnits());

    private static final Trees TREES = PARSE_RESULTS.trees();

    private TreeDifference emptyDiff() {
        return new TreeDifference();
    }

    private TreeDifference onlyExpectedDiffs() {
        return new TreeDifference.Builder().addExtraExpectedNode(expectedDiffSubtree(), expectedDiffMessage()).addExtraExpectedNode(expectedDiffSubtree(), expectedDiffMessage()).build();
    }

    private String expectedDiffMessage() {
        return "expected";
    }

    private TreePath expectedDiffSubtree() {
        return MoreTrees.findSubtreePath(COMPILATION_UNIT, Tree.Kind.METHOD);
    }

    private String expectedDiffContextStr() {
        return Tree.Kind.METHOD.toString();
    }

    private TreeDifference onlyActualDiffs() {
        return new TreeDifference.Builder().addExtraActualNode(actualDiffSubtree(), actualDiffMessage()).addExtraActualNode(actualDiffSubtree(), actualDiffMessage()).build();
    }

    private String actualDiffMessage() {
        return "actual";
    }

    private TreePath actualDiffSubtree() {
        return MoreTrees.findSubtreePath(COMPILATION_UNIT, Tree.Kind.THROW);
    }

    private String actualDiffContextStr() {
        return Tree.Kind.THROW.toString();
    }

    private TreeDifference twoWayDiffs() {
        return new TreeDifference.Builder().addDifferingNodes(expectedDiffSubtree(), actualDiffSubtree(), twoWayDiffMessage()).addDifferingNodes(actualDiffSubtree(), expectedDiffSubtree(), twoWayDiffMessage()).build();
    }

    private String twoWayDiffMessage() {
        return "center";
    }

    private String twoWayDiffContextStr() {
        return Tree.Kind.COMPILATION_UNIT.toString();
    }

    private TreeDifference multiDiffs() {
        return new TreeDifference.Builder().addExtraExpectedNode(expectedDiffSubtree(), expectedDiffMessage()).addExtraActualNode(actualDiffSubtree(), actualDiffMessage()).addDifferingNodes(expectedDiffSubtree(), actualDiffSubtree(), twoWayDiffMessage()).build();
    }

    private TreeContext treeContext() {
        return new TreeContext(COMPILATION_UNIT, TREES);
    }

    private TreeContext treeContext(CompilationUnitTree compilationUnit) {
        return new TreeContext(compilationUnit, TREES);
    }

    @Test
    public void isEmpty() {
        assertThat(emptyDiff().isEmpty()).isTrue();
    }

    @Test
    public void isEmpty_1() {
        /*[Transform from] assertThat(emptyDiff().isEmpty()).isTrue();[NONE Params]*/
        ;
        assertThat(onlyExpectedDiffs().isEmpty()).isFalse();
    }

    @Test
    public void isEmpty_2() {
        /*[Transform from] assertThat(emptyDiff().isEmpty()).isTrue();[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().isEmpty()).isFalse();[NONE Params]*/
        ;
        assertThat(onlyActualDiffs().isEmpty()).isFalse();
    }

    @Test
    public void isEmpty_3() {
        /*[Transform from] assertThat(emptyDiff().isEmpty()).isTrue();[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().isEmpty()).isFalse();[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyActualDiffs().isEmpty()).isFalse();[NONE Params]*/
        ;
        assertThat(twoWayDiffs().isEmpty()).isFalse();
    }

    @Test
    public void isEmpty_4() {
        /*[Transform from] assertThat(emptyDiff().isEmpty()).isTrue();[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().isEmpty()).isFalse();[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyActualDiffs().isEmpty()).isFalse();[NONE Params]*/
        ;
        /*[Transform from] assertThat(twoWayDiffs().isEmpty()).isFalse();[NONE Params]*/
        ;
        assertThat(multiDiffs().isEmpty()).isFalse();
    }

    @Test
    public void getExtraExpectedNodes() {
        assertThat(emptyDiff().getExtraExpectedNodes().size()).isEqualTo(0);
    }

    @Test
    public void getExtraExpectedNodes_1() {
        /*[Transform from] assertThat(emptyDiff().getExtraExpectedNodes().size()).isEqualTo(0);[NONE Params]*/
        ;
        assertThat(onlyExpectedDiffs().getExtraExpectedNodes().size()).isEqualTo(2);
    }

    @Test
    public void getExtraExpectedNodes_2() {
        /*[Transform from] assertThat(emptyDiff().getExtraExpectedNodes().size()).isEqualTo(0);[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getExtraExpectedNodes().size()).isEqualTo(2);[NONE Params]*/
        ;
        assertThat(onlyActualDiffs().getExtraExpectedNodes().size()).isEqualTo(0);
    }

    @Test
    public void getExtraExpectedNodes_3() {
        /*[Transform from] assertThat(emptyDiff().getExtraExpectedNodes().size()).isEqualTo(0);[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getExtraExpectedNodes().size()).isEqualTo(2);[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyActualDiffs().getExtraExpectedNodes().size()).isEqualTo(0);[NONE Params]*/
        ;
        assertThat(twoWayDiffs().getExtraExpectedNodes().size()).isEqualTo(0);
    }

    @Test
    public void getExtraExpectedNodes_4() {
        /*[Transform from] assertThat(emptyDiff().getExtraExpectedNodes().size()).isEqualTo(0);[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getExtraExpectedNodes().size()).isEqualTo(2);[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyActualDiffs().getExtraExpectedNodes().size()).isEqualTo(0);[NONE Params]*/
        ;
        /*[Transform from] assertThat(twoWayDiffs().getExtraExpectedNodes().size()).isEqualTo(0);[NONE Params]*/
        ;
        assertThat(multiDiffs().getExtraExpectedNodes().size()).isEqualTo(1);
    }

    @Test
    public void getExtraActualNodes() {
        assertThat(emptyDiff().getExtraActualNodes().size()).isEqualTo(0);
    }

    @Test
    public void getExtraActualNodes_1() {
        /*[Transform from] assertThat(emptyDiff().getExtraActualNodes().size()).isEqualTo(0);[NONE Params]*/
        ;
        assertThat(onlyExpectedDiffs().getExtraActualNodes().size()).isEqualTo(0);
    }

    @Test
    public void getExtraActualNodes_2() {
        /*[Transform from] assertThat(emptyDiff().getExtraActualNodes().size()).isEqualTo(0);[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getExtraActualNodes().size()).isEqualTo(0);[NONE Params]*/
        ;
        assertThat(onlyActualDiffs().getExtraActualNodes().size()).isEqualTo(2);
    }

    @Test
    public void getExtraActualNodes_3() {
        /*[Transform from] assertThat(emptyDiff().getExtraActualNodes().size()).isEqualTo(0);[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getExtraActualNodes().size()).isEqualTo(0);[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyActualDiffs().getExtraActualNodes().size()).isEqualTo(2);[NONE Params]*/
        ;
        assertThat(twoWayDiffs().getExtraActualNodes().size()).isEqualTo(0);
    }

    @Test
    public void getExtraActualNodes_4() {
        /*[Transform from] assertThat(emptyDiff().getExtraActualNodes().size()).isEqualTo(0);[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getExtraActualNodes().size()).isEqualTo(0);[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyActualDiffs().getExtraActualNodes().size()).isEqualTo(2);[NONE Params]*/
        ;
        /*[Transform from] assertThat(twoWayDiffs().getExtraActualNodes().size()).isEqualTo(0);[NONE Params]*/
        ;
        assertThat(multiDiffs().getExtraActualNodes().size()).isEqualTo(1);
    }

    @Test
    public void getDifferingNodes() {
        assertThat(emptyDiff().getDifferingNodes().size()).isEqualTo(0);
    }

    @Test
    public void getDifferingNodes_1() {
        /*[Transform from] assertThat(emptyDiff().getDifferingNodes().size()).isEqualTo(0);[NONE Params]*/
        ;
        assertThat(onlyExpectedDiffs().getDifferingNodes().size()).isEqualTo(0);
    }

    @Test
    public void getDifferingNodes_2() {
        /*[Transform from] assertThat(emptyDiff().getDifferingNodes().size()).isEqualTo(0);[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDifferingNodes().size()).isEqualTo(0);[NONE Params]*/
        ;
        assertThat(onlyActualDiffs().getDifferingNodes().size()).isEqualTo(0);
    }

    @Test
    public void getDifferingNodes_3() {
        /*[Transform from] assertThat(emptyDiff().getDifferingNodes().size()).isEqualTo(0);[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDifferingNodes().size()).isEqualTo(0);[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyActualDiffs().getDifferingNodes().size()).isEqualTo(0);[NONE Params]*/
        ;
        assertThat(twoWayDiffs().getDifferingNodes().size()).isEqualTo(2);
    }

    @Test
    public void getDifferingNodes_4() {
        /*[Transform from] assertThat(emptyDiff().getDifferingNodes().size()).isEqualTo(0);[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDifferingNodes().size()).isEqualTo(0);[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyActualDiffs().getDifferingNodes().size()).isEqualTo(0);[NONE Params]*/
        ;
        /*[Transform from] assertThat(twoWayDiffs().getDifferingNodes().size()).isEqualTo(2);[NONE Params]*/
        ;
        assertThat(multiDiffs().getDifferingNodes().size()).isEqualTo(1);
    }

    @Test
    public void getDiffReport_NoContext() {
        assertThat(emptyDiff().getDiffReport() != null).isTrue();
    }

    @Test
    public void getDiffReport_NoContext_1() {
        /*[Transform from] assertThat(emptyDiff().getDiffReport() != null).isTrue();[NONE Params]*/
        ;
        assertThat(onlyExpectedDiffs().getDiffReport()).contains("unmatched nodes in the expected tree");
    }

    @Test
    public void getDiffReport_NoContext_2() {
        /*[Transform from] assertThat(emptyDiff().getDiffReport() != null).isTrue();[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport()).contains("unmatched nodes in the expected tree");[NONE Params]*/
        ;
        assertThat(onlyExpectedDiffs().getDiffReport()).contains(expectedDiffMessage());
    }

    @Test
    public void getDiffReport_NoContext_3() {
        /*[Transform from] assertThat(emptyDiff().getDiffReport() != null).isTrue();[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport()).contains("unmatched nodes in the expected tree");[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport()).contains(expectedDiffMessage());*/
        expectedDiffMessage();
        assertThat(onlyActualDiffs().getDiffReport()).contains("unmatched nodes in the actual tree");
    }

    @Test
    public void getDiffReport_NoContext_4() {
        /*[Transform from] assertThat(emptyDiff().getDiffReport() != null).isTrue();[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport()).contains("unmatched nodes in the expected tree");[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport()).contains(expectedDiffMessage());*/
        expectedDiffMessage();
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport()).contains("unmatched nodes in the actual tree");[NONE Params]*/
        ;
        assertThat(onlyActualDiffs().getDiffReport()).contains(actualDiffMessage());
    }

    @Test
    public void getDiffReport_NoContext_5() {
        /*[Transform from] assertThat(emptyDiff().getDiffReport() != null).isTrue();[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport()).contains("unmatched nodes in the expected tree");[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport()).contains(expectedDiffMessage());*/
        expectedDiffMessage();
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport()).contains("unmatched nodes in the actual tree");[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport()).contains(actualDiffMessage());*/
        actualDiffMessage();
        assertThat(twoWayDiffs().getDiffReport()).contains("differed in expected and actual");
    }

    @Test
    public void getDiffReport_NoContext_6() {
        /*[Transform from] assertThat(emptyDiff().getDiffReport() != null).isTrue();[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport()).contains("unmatched nodes in the expected tree");[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport()).contains(expectedDiffMessage());*/
        expectedDiffMessage();
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport()).contains("unmatched nodes in the actual tree");[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport()).contains(actualDiffMessage());*/
        actualDiffMessage();
        /*[Transform from] assertThat(twoWayDiffs().getDiffReport()).contains("differed in expected and actual");[NONE Params]*/
        ;
        assertThat(twoWayDiffs().getDiffReport()).contains(twoWayDiffMessage());
    }

    @Test
    public void getDiffReport_NoContext_7() {
        /*[Transform from] assertThat(emptyDiff().getDiffReport() != null).isTrue();[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport()).contains("unmatched nodes in the expected tree");[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport()).contains(expectedDiffMessage());*/
        expectedDiffMessage();
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport()).contains("unmatched nodes in the actual tree");[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport()).contains(actualDiffMessage());*/
        actualDiffMessage();
        /*[Transform from] assertThat(twoWayDiffs().getDiffReport()).contains("differed in expected and actual");[NONE Params]*/
        ;
        /*[Transform from] assertThat(twoWayDiffs().getDiffReport()).contains(twoWayDiffMessage());*/
        twoWayDiffMessage();
        assertThat(multiDiffs().getDiffReport()).contains(expectedDiffMessage());
    }

    @Test
    public void getDiffReport_NoContext_8() {
        /*[Transform from] assertThat(emptyDiff().getDiffReport() != null).isTrue();[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport()).contains("unmatched nodes in the expected tree");[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport()).contains(expectedDiffMessage());*/
        expectedDiffMessage();
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport()).contains("unmatched nodes in the actual tree");[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport()).contains(actualDiffMessage());*/
        actualDiffMessage();
        /*[Transform from] assertThat(twoWayDiffs().getDiffReport()).contains("differed in expected and actual");[NONE Params]*/
        ;
        /*[Transform from] assertThat(twoWayDiffs().getDiffReport()).contains(twoWayDiffMessage());*/
        twoWayDiffMessage();
        /*[Transform from] assertThat(multiDiffs().getDiffReport()).contains(expectedDiffMessage());*/
        expectedDiffMessage();
        assertThat(multiDiffs().getDiffReport()).contains(actualDiffMessage());
    }

    @Test
    public void getDiffReport_NoContext_9() {
        /*[Transform from] assertThat(emptyDiff().getDiffReport() != null).isTrue();[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport()).contains("unmatched nodes in the expected tree");[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport()).contains(expectedDiffMessage());*/
        expectedDiffMessage();
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport()).contains("unmatched nodes in the actual tree");[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport()).contains(actualDiffMessage());*/
        actualDiffMessage();
        /*[Transform from] assertThat(twoWayDiffs().getDiffReport()).contains("differed in expected and actual");[NONE Params]*/
        ;
        /*[Transform from] assertThat(twoWayDiffs().getDiffReport()).contains(twoWayDiffMessage());*/
        twoWayDiffMessage();
        /*[Transform from] assertThat(multiDiffs().getDiffReport()).contains(expectedDiffMessage());*/
        expectedDiffMessage();
        /*[Transform from] assertThat(multiDiffs().getDiffReport()).contains(actualDiffMessage());*/
        actualDiffMessage();
        assertThat(multiDiffs().getDiffReport()).contains(twoWayDiffMessage());
    }

    @Test
    public void getDiffReport_WithContext() {
        assertThat(emptyDiff().getDiffReport(treeContext(), treeContext()) != null).isTrue();
    }

    @Test
    public void getDiffReport_WithContext_1() {
        /*[Transform from] assertThat(emptyDiff().getDiffReport(treeContext(), treeContext()) != null).isTrue();[NONE Params]*/
        ;
        assertThat(onlyExpectedDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffMessage());
    }

    @Test
    public void getDiffReport_WithContext_2() {
        /*[Transform from] assertThat(emptyDiff().getDiffReport(treeContext(), treeContext()) != null).isTrue();[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffMessage());*/
        expectedDiffMessage();
        assertThat(onlyExpectedDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffContextStr());
    }

    @Test
    public void getDiffReport_WithContext_3() {
        /*[Transform from] assertThat(emptyDiff().getDiffReport(treeContext(), treeContext()) != null).isTrue();[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffMessage());*/
        expectedDiffMessage();
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffContextStr());*/
        expectedDiffContextStr();
        assertThat(onlyActualDiffs().getDiffReport(treeContext(), treeContext())).contains(actualDiffMessage());
    }

    @Test
    public void getDiffReport_WithContext_4() {
        /*[Transform from] assertThat(emptyDiff().getDiffReport(treeContext(), treeContext()) != null).isTrue();[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffMessage());*/
        expectedDiffMessage();
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffContextStr());*/
        expectedDiffContextStr();
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport(treeContext(), treeContext())).contains(actualDiffMessage());*/
        actualDiffMessage();
        assertThat(onlyActualDiffs().getDiffReport(treeContext(), treeContext())).contains(actualDiffContextStr());
    }

    @Test
    public void getDiffReport_WithContext_5() {
        /*[Transform from] assertThat(emptyDiff().getDiffReport(treeContext(), treeContext()) != null).isTrue();[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffMessage());*/
        expectedDiffMessage();
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffContextStr());*/
        expectedDiffContextStr();
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport(treeContext(), treeContext())).contains(actualDiffMessage());*/
        actualDiffMessage();
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport(treeContext(), treeContext())).contains(actualDiffContextStr());*/
        actualDiffContextStr();
        assertThat(twoWayDiffs().getDiffReport(treeContext(), treeContext())).contains(twoWayDiffMessage());
    }

    @Test
    public void getDiffReport_WithContext_6() {
        /*[Transform from] assertThat(emptyDiff().getDiffReport(treeContext(), treeContext()) != null).isTrue();[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffMessage());*/
        expectedDiffMessage();
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffContextStr());*/
        expectedDiffContextStr();
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport(treeContext(), treeContext())).contains(actualDiffMessage());*/
        actualDiffMessage();
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport(treeContext(), treeContext())).contains(actualDiffContextStr());*/
        actualDiffContextStr();
        /*[Transform from] assertThat(twoWayDiffs().getDiffReport(treeContext(), treeContext())).contains(twoWayDiffMessage());*/
        twoWayDiffMessage();
        assertThat(twoWayDiffs().getDiffReport(treeContext(), treeContext())).contains(twoWayDiffContextStr());
    }

    @Test
    public void getDiffReport_WithContext_7() {
        /*[Transform from] assertThat(emptyDiff().getDiffReport(treeContext(), treeContext()) != null).isTrue();[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffMessage());*/
        expectedDiffMessage();
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffContextStr());*/
        expectedDiffContextStr();
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport(treeContext(), treeContext())).contains(actualDiffMessage());*/
        actualDiffMessage();
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport(treeContext(), treeContext())).contains(actualDiffContextStr());*/
        actualDiffContextStr();
        /*[Transform from] assertThat(twoWayDiffs().getDiffReport(treeContext(), treeContext())).contains(twoWayDiffMessage());*/
        twoWayDiffMessage();
        /*[Transform from] assertThat(twoWayDiffs().getDiffReport(treeContext(), treeContext())).contains(twoWayDiffContextStr());*/
        twoWayDiffContextStr();
        assertThat(multiDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffContextStr());
    }

    @Test
    public void getDiffReport_WithContext_8() {
        /*[Transform from] assertThat(emptyDiff().getDiffReport(treeContext(), treeContext()) != null).isTrue();[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffMessage());*/
        expectedDiffMessage();
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffContextStr());*/
        expectedDiffContextStr();
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport(treeContext(), treeContext())).contains(actualDiffMessage());*/
        actualDiffMessage();
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport(treeContext(), treeContext())).contains(actualDiffContextStr());*/
        actualDiffContextStr();
        /*[Transform from] assertThat(twoWayDiffs().getDiffReport(treeContext(), treeContext())).contains(twoWayDiffMessage());*/
        twoWayDiffMessage();
        /*[Transform from] assertThat(twoWayDiffs().getDiffReport(treeContext(), treeContext())).contains(twoWayDiffContextStr());*/
        twoWayDiffContextStr();
        /*[Transform from] assertThat(multiDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffContextStr());*/
        expectedDiffContextStr();
        assertThat(multiDiffs().getDiffReport(treeContext(), treeContext())).contains(actualDiffMessage());
    }

    @Test
    public void getDiffReport_WithContext_9() {
        /*[Transform from] assertThat(emptyDiff().getDiffReport(treeContext(), treeContext()) != null).isTrue();[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffMessage());*/
        expectedDiffMessage();
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffContextStr());*/
        expectedDiffContextStr();
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport(treeContext(), treeContext())).contains(actualDiffMessage());*/
        actualDiffMessage();
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport(treeContext(), treeContext())).contains(actualDiffContextStr());*/
        actualDiffContextStr();
        /*[Transform from] assertThat(twoWayDiffs().getDiffReport(treeContext(), treeContext())).contains(twoWayDiffMessage());*/
        twoWayDiffMessage();
        /*[Transform from] assertThat(twoWayDiffs().getDiffReport(treeContext(), treeContext())).contains(twoWayDiffContextStr());*/
        twoWayDiffContextStr();
        /*[Transform from] assertThat(multiDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffContextStr());*/
        expectedDiffContextStr();
        /*[Transform from] assertThat(multiDiffs().getDiffReport(treeContext(), treeContext())).contains(actualDiffMessage());*/
        actualDiffMessage();
        assertThat(multiDiffs().getDiffReport(treeContext(), treeContext())).contains(actualDiffContextStr());
    }

    @Test
    public void getDiffReport_WithContext_10() {
        /*[Transform from] assertThat(emptyDiff().getDiffReport(treeContext(), treeContext()) != null).isTrue();[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffMessage());*/
        expectedDiffMessage();
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffContextStr());*/
        expectedDiffContextStr();
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport(treeContext(), treeContext())).contains(actualDiffMessage());*/
        actualDiffMessage();
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport(treeContext(), treeContext())).contains(actualDiffContextStr());*/
        actualDiffContextStr();
        /*[Transform from] assertThat(twoWayDiffs().getDiffReport(treeContext(), treeContext())).contains(twoWayDiffMessage());*/
        twoWayDiffMessage();
        /*[Transform from] assertThat(twoWayDiffs().getDiffReport(treeContext(), treeContext())).contains(twoWayDiffContextStr());*/
        twoWayDiffContextStr();
        /*[Transform from] assertThat(multiDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffContextStr());*/
        expectedDiffContextStr();
        /*[Transform from] assertThat(multiDiffs().getDiffReport(treeContext(), treeContext())).contains(actualDiffMessage());*/
        actualDiffMessage();
        /*[Transform from] assertThat(multiDiffs().getDiffReport(treeContext(), treeContext())).contains(actualDiffContextStr());*/
        actualDiffContextStr();
        assertThat(multiDiffs().getDiffReport(treeContext(), treeContext())).contains(twoWayDiffMessage());
    }

    @Test
    public void getDiffReport_WithContext_11() {
        /*[Transform from] assertThat(emptyDiff().getDiffReport(treeContext(), treeContext()) != null).isTrue();[NONE Params]*/
        ;
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffMessage());*/
        expectedDiffMessage();
        /*[Transform from] assertThat(onlyExpectedDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffContextStr());*/
        expectedDiffContextStr();
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport(treeContext(), treeContext())).contains(actualDiffMessage());*/
        actualDiffMessage();
        /*[Transform from] assertThat(onlyActualDiffs().getDiffReport(treeContext(), treeContext())).contains(actualDiffContextStr());*/
        actualDiffContextStr();
        /*[Transform from] assertThat(twoWayDiffs().getDiffReport(treeContext(), treeContext())).contains(twoWayDiffMessage());*/
        twoWayDiffMessage();
        /*[Transform from] assertThat(twoWayDiffs().getDiffReport(treeContext(), treeContext())).contains(twoWayDiffContextStr());*/
        twoWayDiffContextStr();
        /*[Transform from] assertThat(multiDiffs().getDiffReport(treeContext(), treeContext())).contains(expectedDiffContextStr());*/
        expectedDiffContextStr();
        /*[Transform from] assertThat(multiDiffs().getDiffReport(treeContext(), treeContext())).contains(actualDiffMessage());*/
        actualDiffMessage();
        /*[Transform from] assertThat(multiDiffs().getDiffReport(treeContext(), treeContext())).contains(actualDiffContextStr());*/
        actualDiffContextStr();
        /*[Transform from] assertThat(multiDiffs().getDiffReport(treeContext(), treeContext())).contains(twoWayDiffMessage());*/
        twoWayDiffMessage();
        assertThat(multiDiffs().getDiffReport(treeContext(), treeContext())).contains(twoWayDiffContextStr());
    }

    @Test
    public void getDiffReport_emptyElementContext() {
        CompilationUnitTree modifiersPresent = MoreTrees.parseLinesToTree("package test;", "final class TestClass {", "   TestClass() {}", "}");
        CompilationUnitTree modifiersAbsent = MoreTrees.parseLinesToTree("package test;", "class TestClass {", "   TestClass() {}", "}");
        TreeDifference diff = TreeDiffer.diffCompilationUnits(modifiersPresent, modifiersAbsent);
        assertThat(diff.getDiffReport(treeContext(modifiersPresent), treeContext(modifiersAbsent)).isEmpty()).isFalse();
    }

    @Test
    public void getDiffReport_emptyElementContext_1() {
        CompilationUnitTree modifiersPresent = MoreTrees.parseLinesToTree("package test;", "final class TestClass {", "   TestClass() {}", "}");
        CompilationUnitTree modifiersAbsent = MoreTrees.parseLinesToTree("package test;", "class TestClass {", "   TestClass() {}", "}");
        TreeDifference diff = TreeDiffer.diffCompilationUnits(modifiersPresent, modifiersAbsent);
        /*[Transform from] assertThat(diff.getDiffReport(treeContext(modifiersPresent), treeContext(modifiersAbsent)).isEmpty()).isFalse();[NONE Params]*/
        ;
        diff = TreeDiffer.diffCompilationUnits(modifiersAbsent, modifiersPresent);
        assertThat(diff.getDiffReport(treeContext(modifiersAbsent), treeContext(modifiersPresent)).isEmpty()).isFalse();
    }
}

