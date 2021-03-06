package net.mooctest;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;
import org.junit.contrib.java.lang.system.SystemErrRule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import org.junit.rules.ExpectedException;
import org.junit.runners.MethodSorters;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertTrue;
import static net.mooctest.Graph.*;
import static org.junit.Assert.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AStarTest {
    @org.junit.Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @org.junit.Rule
    public final TextFromStandardInputStream systemInMock
            = emptyStandardInputStream();
    @org.junit.Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @org.junit.Rule
    public final SystemErrRule systemErrRule = new SystemErrRule().enableLog();

    @org.junit.Rule
    public final ExpectedException thrown = ExpectedException.none();

    class CauseMatcher extends TypeSafeMatcher {
        private Class<?> expectedType;
        private String expectedCause;

        public CauseMatcher(Class<?> clazz, String str) {
            this.expectedType = clazz;
            this.expectedCause = str;
        }

        protected boolean matchesSafely(Object item) {
            Throwable throwable = (Throwable) item;
            return throwable.getClass().isAssignableFrom(this.expectedType) && throwable.getMessage().contains(this.expectedCause);
        }

        public void describeTo(Description description) {
            description.appendText("expects type ");
        }
    }

    private Method getMethod(Class clazz, String name, Class... parameters) throws Throwable {
        Method method = clazz.getDeclaredMethod(name, parameters);
        method.setAccessible(true);
        return method;
    }

    private Field getField(Class clazz, String fieldName) throws Throwable {
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        return field;
    }

    private Field getFinalField(Class clazz, String fieldName) throws Throwable {
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
        return field;
    }

    private void el(String out) {
        assertEquals(out, (systemOutRule.getLog()));
    }

    @Before
    public void handleBefore() {
        systemErrRule.clearLog();
        systemOutRule.clearLog();
    }

    @Test(timeout = 2000)
    public void test() {
        Graph<Integer> graph = new Graph<>();

    }

    private static class UndirectedGraph { // 静态无向图
        final List<Vertex<Integer>> verticies = new ArrayList<Vertex<Integer>>();
        final Graph.Vertex<Integer> v1 = new Graph.Vertex<Integer>(1);
        final Graph.Vertex<Integer> v2 = new Graph.Vertex<Integer>(2);
        final Graph.Vertex<Integer> v3 = new Graph.Vertex<Integer>(3);
        final Graph.Vertex<Integer> v4 = new Graph.Vertex<Integer>(4);
        final Graph.Vertex<Integer> v5 = new Graph.Vertex<Integer>(5);
        final Graph.Vertex<Integer> v6 = new Graph.Vertex<Integer>(6);
        final Graph.Vertex<Integer> v7 = new Graph.Vertex<Integer>(7);
        final Graph.Vertex<Integer> v8 = new Graph.Vertex<Integer>(8);

        {
            verticies.add(v1);
            verticies.add(v2);
            verticies.add(v3);
            verticies.add(v4);
            verticies.add(v5);
            verticies.add(v6);
            verticies.add(v7);
            verticies.add(v8);
        }

        final List<Edge<Integer>> edges = new ArrayList<Edge<Integer>>();
        final Graph.Edge<Integer> e1_2 = new Graph.Edge<Integer>(7, v1, v2);
        final Graph.Edge<Integer> e1_3 = new Graph.Edge<Integer>(9, v1, v3);
        final Graph.Edge<Integer> e1_6 = new Graph.Edge<Integer>(14, v1, v6);
        final Graph.Edge<Integer> e2_3 = new Graph.Edge<Integer>(10, v2, v3);
        final Graph.Edge<Integer> e2_4 = new Graph.Edge<Integer>(15, v2, v4);
        final Graph.Edge<Integer> e3_4 = new Graph.Edge<Integer>(11, v3, v4);
        final Graph.Edge<Integer> e3_6 = new Graph.Edge<Integer>(2, v3, v6);
        final Graph.Edge<Integer> e5_6 = new Graph.Edge<Integer>(9, v5, v6);
        final Graph.Edge<Integer> e4_5 = new Graph.Edge<Integer>(6, v4, v5);
        final Graph.Edge<Integer> e1_7 = new Graph.Edge<Integer>(1, v1, v7);
        final Graph.Edge<Integer> e1_8 = new Graph.Edge<Integer>(1, v1, v8);

        {
            edges.add(e1_2);
            edges.add(e1_3);
            edges.add(e1_6);
            edges.add(e2_3);
            edges.add(e2_4);
            edges.add(e3_4);
            edges.add(e3_6);
            edges.add(e5_6);
            edges.add(e4_5);
            edges.add(e1_7);
            edges.add(e1_8);
        }

        final Graph<Integer> graph = new Graph<Integer>(verticies, edges);
    }

    // Directed
    private static class DirectedGraph { // 静态有向图
        final List<Vertex<Integer>> verticies = new ArrayList<Vertex<Integer>>();
        final Graph.Vertex<Integer> v1 = new Graph.Vertex<Integer>(1);
        final Graph.Vertex<Integer> v2 = new Graph.Vertex<Integer>(2);
        final Graph.Vertex<Integer> v3 = new Graph.Vertex<Integer>(3);
        final Graph.Vertex<Integer> v4 = new Graph.Vertex<Integer>(4);
        final Graph.Vertex<Integer> v5 = new Graph.Vertex<Integer>(5);
        final Graph.Vertex<Integer> v6 = new Graph.Vertex<Integer>(6);
        final Graph.Vertex<Integer> v7 = new Graph.Vertex<Integer>(7);
        final Graph.Vertex<Integer> v8 = new Graph.Vertex<Integer>(8);

        {
            verticies.add(v1);
            verticies.add(v2);
            verticies.add(v3);
            verticies.add(v4);
            verticies.add(v5);
            verticies.add(v6);
            verticies.add(v7);
            verticies.add(v8);
        }

        final List<Edge<Integer>> edges = new ArrayList<Edge<Integer>>();
        final Graph.Edge<Integer> e1_2 = new Graph.Edge<Integer>(7, v1, v2);
        final Graph.Edge<Integer> e1_3 = new Graph.Edge<Integer>(9, v1, v3);
        final Graph.Edge<Integer> e1_6 = new Graph.Edge<Integer>(14, v1, v6);
        final Graph.Edge<Integer> e2_3 = new Graph.Edge<Integer>(10, v2, v3);
        final Graph.Edge<Integer> e2_4 = new Graph.Edge<Integer>(15, v2, v4);
        final Graph.Edge<Integer> e3_4 = new Graph.Edge<Integer>(11, v3, v4);
        final Graph.Edge<Integer> e3_6 = new Graph.Edge<Integer>(2, v3, v6);
        final Graph.Edge<Integer> e6_5 = new Graph.Edge<Integer>(9, v6, v5);
        final Graph.Edge<Integer> e6_8 = new Graph.Edge<Integer>(14, v6, v8);
        final Graph.Edge<Integer> e4_5 = new Graph.Edge<Integer>(6, v4, v5);
        final Graph.Edge<Integer> e4_7 = new Graph.Edge<Integer>(16, v4, v7);
        final Graph.Edge<Integer> e1_8 = new Graph.Edge<Integer>(30, v1, v8);

        {
            edges.add(e1_2);
            edges.add(e1_3);
            edges.add(e1_6);
            edges.add(e2_3);
            edges.add(e2_4);
            edges.add(e3_4);
            edges.add(e3_6);
            edges.add(e6_5);
            edges.add(e6_8);
            edges.add(e4_5);
            edges.add(e4_7);
            edges.add(e1_8);
        }

        final Graph<Integer> graph = new Graph<Integer>(Graph.TYPE.DIRECTED, verticies, edges);
    }

    // Directed with negative weights
    private static class DirectedWithNegativeWeights {
        final List<Vertex<Integer>> verticies = new ArrayList<Vertex<Integer>>();
        final Graph.Vertex<Integer> v1 = new Graph.Vertex<Integer>(1);
        final Graph.Vertex<Integer> v2 = new Graph.Vertex<Integer>(2);
        final Graph.Vertex<Integer> v3 = new Graph.Vertex<Integer>(3);
        final Graph.Vertex<Integer> v4 = new Graph.Vertex<Integer>(4);

        {
            verticies.add(v1);
            verticies.add(v2);
            verticies.add(v3);
            verticies.add(v4);
        }

        final List<Edge<Integer>> edges = new ArrayList<Edge<Integer>>();
        final Graph.Edge<Integer> e1_4 = new Graph.Edge<Integer>(2, v1, v4);  // w->z
        final Graph.Edge<Integer> e2_1 = new Graph.Edge<Integer>(6, v2, v1);  // x->w
        final Graph.Edge<Integer> e2_3 = new Graph.Edge<Integer>(3, v2, v3);  // x->y
        final Graph.Edge<Integer> e3_1 = new Graph.Edge<Integer>(4, v3, v1);  // y->w
        final Graph.Edge<Integer> e3_4 = new Graph.Edge<Integer>(5, v3, v4);  // y->z
        final Graph.Edge<Integer> e4_2 = new Graph.Edge<Integer>(-7, v4, v2); // z->x
        final Graph.Edge<Integer> e4_3 = new Graph.Edge<Integer>(-3, v4, v3); // z->y

        {
            edges.add(e1_4);
            edges.add(e2_1);
            edges.add(e2_3);
            edges.add(e3_1);
            edges.add(e3_4);
            edges.add(e4_2);
            edges.add(e4_3);
        }

        final Graph<Integer> graph = new Graph<Integer>(Graph.TYPE.DIRECTED, verticies, edges);
    }

    // Ideal undirected path
    private Map<Vertex<Integer>, CostPathPair<Integer>> getIdealUndirectedPath(UndirectedGraph undirected) {
        final HashMap<Vertex<Integer>, CostPathPair<Integer>> idealUndirectedPath = new HashMap<Graph.Vertex<Integer>, Graph.CostPathPair<Integer>>();
        {
            final int cost = 11;
            final List<Graph.Edge<Integer>> list = new ArrayList<Edge<Integer>>();
            list.add(undirected.e1_3);
            list.add(undirected.e3_6);
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<Integer>(cost, list);
            idealUndirectedPath.put(undirected.v6, path);
        }
        {
            final int cost = 20;
            final List<Graph.Edge<Integer>> list = new ArrayList<Graph.Edge<Integer>>();
            list.add(undirected.e1_3);
            list.add(undirected.e3_6);
            list.add(new Graph.Edge<Integer>(9, undirected.v6, undirected.v5));
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<Integer>(cost, list);
            idealUndirectedPath.put(undirected.v5, path);
        }
        {
            final int cost = 9;
            final List<Graph.Edge<Integer>> list = new ArrayList<Graph.Edge<Integer>>();
            list.add(undirected.e1_3);
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<Integer>(cost, list);
            idealUndirectedPath.put(undirected.v3, path);
        }
        {
            final int cost = 20;
            final List<Graph.Edge<Integer>> list = new ArrayList<Graph.Edge<Integer>>();
            list.add(undirected.e1_3);
            list.add(undirected.e3_4);
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<Integer>(cost, list);
            idealUndirectedPath.put(undirected.v4, path);
        }
        {
            final int cost = 7;
            final List<Graph.Edge<Integer>> list = new ArrayList<Graph.Edge<Integer>>();
            list.add(undirected.e1_2);
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<Integer>(cost, list);
            idealUndirectedPath.put(undirected.v2, path);
        }
        {
            final int cost = 0;
            final List<Graph.Edge<Integer>> list = new ArrayList<Graph.Edge<Integer>>();
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<Integer>(cost, list);
            idealUndirectedPath.put(undirected.v1, path);
        }
        {
            final int cost = 1;
            final List<Graph.Edge<Integer>> list = new ArrayList<Graph.Edge<Integer>>();
            list.add(undirected.e1_7);
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<Integer>(cost, list);
            idealUndirectedPath.put(undirected.v7, path);
        }
        {
            final int cost = 1;
            final List<Graph.Edge<Integer>> list = new ArrayList<Graph.Edge<Integer>>();
            list.add(undirected.e1_8);
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<Integer>(cost, list);
            idealUndirectedPath.put(undirected.v8, path);
        }
        return idealUndirectedPath;
    }

    // Ideal undirected PathPair
    private Graph.CostPathPair<Integer> getIdealUndirectedPathPair(UndirectedGraph undirected) {
        final int cost = 20;
        final List<Graph.Edge<Integer>> list = new ArrayList<Graph.Edge<Integer>>();
        list.add(undirected.e1_3);
        list.add(undirected.e3_6);
        list.add(new Graph.Edge<Integer>(9, undirected.v6, undirected.v5));
        return (new Graph.CostPathPair<Integer>(cost, list));
    }

    // Ideal directed path
    private Map<Graph.Vertex<Integer>, Graph.CostPathPair<Integer>> getIdealDirectedPath(DirectedGraph directed) {
        final Map<Graph.Vertex<Integer>, Graph.CostPathPair<Integer>> idealDirectedPath = new HashMap<Graph.Vertex<Integer>, Graph.CostPathPair<Integer>>();
        {
            final int cost = 11;
            final List<Graph.Edge<Integer>> list = new ArrayList<Graph.Edge<Integer>>();
            list.add(directed.e1_3);
            list.add(directed.e3_6);
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<Integer>(cost, list);
            idealDirectedPath.put(directed.v6, path);
        }
        {
            final int cost = 20;
            final List<Graph.Edge<Integer>> list = new ArrayList<Graph.Edge<Integer>>();
            list.add(directed.e1_3);
            list.add(directed.e3_6);
            list.add(new Graph.Edge<Integer>(9, directed.v6, directed.v5));
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<Integer>(cost, list);
            idealDirectedPath.put(directed.v5, path);
        }
        {
            final int cost = 36;
            final List<Graph.Edge<Integer>> list = new ArrayList<Graph.Edge<Integer>>();
            list.add(directed.e1_3);
            list.add(directed.e3_4);
            list.add(directed.e4_7);
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<Integer>(cost, list);
            idealDirectedPath.put(directed.v7, path);
        }
        {
            final int cost = 9;
            final List<Graph.Edge<Integer>> list = new ArrayList<Graph.Edge<Integer>>();
            list.add(directed.e1_3);
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<Integer>(cost, list);
            idealDirectedPath.put(directed.v3, path);
        }
        {
            final int cost = 20;
            final List<Graph.Edge<Integer>> list = new ArrayList<Graph.Edge<Integer>>();
            list.add(directed.e1_3);
            list.add(directed.e3_4);
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<Integer>(cost, list);
            idealDirectedPath.put(directed.v4, path);
        }
        {
            final int cost = 7;
            final List<Graph.Edge<Integer>> list = new ArrayList<Graph.Edge<Integer>>();
            list.add(directed.e1_2);
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<Integer>(cost, list);
            idealDirectedPath.put(directed.v2, path);
        }
        {
            final int cost = 0;
            final List<Graph.Edge<Integer>> list = new ArrayList<Graph.Edge<Integer>>();
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<Integer>(cost, list);
            idealDirectedPath.put(directed.v1, path);
        }
        {
            final int cost = 25;
            final List<Graph.Edge<Integer>> list = new ArrayList<Graph.Edge<Integer>>();
            list.add(directed.e1_3);
            list.add(directed.e3_6);
            list.add(directed.e6_8);
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<Integer>(cost, list);
            idealDirectedPath.put(directed.v8, path);
        }
        return idealDirectedPath;
    }

    // Ideal directed Path Pair
    private Graph.CostPathPair<Integer> getIdealPathPair(DirectedGraph directed) {
        final int cost = 20;
        final List<Graph.Edge<Integer>> list = new ArrayList<Graph.Edge<Integer>>();
        list.add(directed.e1_3);
        list.add(directed.e3_6);
        list.add(new Graph.Edge<Integer>(9, directed.v6, directed.v5));
        return (new Graph.CostPathPair<Integer>(cost, list));
    }

    // Ideal directed with negative weight path
    private Map<Graph.Vertex<Integer>, Graph.CostPathPair<Integer>> getIdealDirectedNegWeight(DirectedWithNegativeWeights directedWithNegWeights) {
        final Map<Graph.Vertex<Integer>, Graph.CostPathPair<Integer>> idealDirectedNegWeight = new HashMap<Graph.Vertex<Integer>, Graph.CostPathPair<Integer>>();
        {
            final int cost = -2;
            final List<Graph.Edge<Integer>> list = new ArrayList<Graph.Edge<Integer>>();
            list.add(directedWithNegWeights.e1_4);
            list.add(directedWithNegWeights.e4_2);
            list.add(directedWithNegWeights.e2_3);
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<Integer>(cost, list);
            idealDirectedNegWeight.put(directedWithNegWeights.v3, path);
        }
        {
            final int cost = 2;
            final List<Graph.Edge<Integer>> list = new ArrayList<Graph.Edge<Integer>>();
            list.add(directedWithNegWeights.e1_4);
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<Integer>(cost, list);
            idealDirectedNegWeight.put(directedWithNegWeights.v4, path);
        }
        {
            final int cost = -5;
            final List<Graph.Edge<Integer>> list = new ArrayList<Graph.Edge<Integer>>();
            list.add(directedWithNegWeights.e1_4);
            list.add(directedWithNegWeights.e4_2);
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<Integer>(cost, list);
            idealDirectedNegWeight.put(directedWithNegWeights.v2, path);
        }
        {
            final int cost = 0;
            final List<Graph.Edge<Integer>> list = new ArrayList<Graph.Edge<Integer>>();
            final Graph.CostPathPair<Integer> path = new Graph.CostPathPair<Integer>(cost, list);
            idealDirectedNegWeight.put(directedWithNegWeights.v1, path);
        }
        return idealDirectedNegWeight;
    }

    // Ideal pair
    private Graph.CostPathPair<Integer> getIdealDirectedWithNegWeightsPathPair(DirectedWithNegativeWeights directedWithNegWeights) {
        final int cost = -2;
        final List<Graph.Edge<Integer>> list = new ArrayList<Graph.Edge<Integer>>();
        list.add(directedWithNegWeights.e1_4);
        list.add(directedWithNegWeights.e4_2);
        list.add(directedWithNegWeights.e2_3);
        return (new Graph.CostPathPair<Integer>(cost, list));
    }


    @Test
    public void testAStarUndirected() {
        final UndirectedGraph undirected = new UndirectedGraph();
        final Graph.Vertex<Integer> start = undirected.v1;
        final Graph.Vertex<Integer> end = undirected.v8;
        final AStar<Integer> aStar = new AStar<Integer>();
        final List<Graph.Edge<Integer>> path = aStar.aStar(undirected.graph, start, end);
        final List<Graph.Edge<Integer>> ideal = getIdealUndirectedPath(undirected).get(end).getPath();
        assertTrue("A* path error. path=" + path + " idealPathPair=" + ideal, path.equals(ideal));
    }

    @Test
    public void testAStarDirected() {
        final DirectedGraph directed = new DirectedGraph();
        final Graph.Vertex<Integer> start = directed.v1;
        final Graph.Vertex<Integer> end = directed.v8;
        final AStar<Integer> aStar = new AStar<Integer>();
        final List<Graph.Edge<Integer>> path = aStar.aStar(directed.graph, start, end);
        final List<Graph.Edge<Integer>> ideal = getIdealDirectedPath(directed).get(end).getPath();
        assertTrue("A* path error. path=" + path + " idealPathPair=" + ideal, path.equals(ideal));
    }

    /*
     * Makes a zero weighted directed graph, so that there is an edge between two vertices if the difference between the
     * vertices values is >= K
     */
    @SuppressWarnings("unused")
    private static final Graph<Integer> makeDirectedGraph(int N, int K, int[] values) {
        final List<Graph.Vertex<Integer>> vertices = new ArrayList<Vertex<Integer>>(values.length);
        for (int i = 0; i < values.length; i++)
            vertices.add(new Vertex<Integer>(values[i], 0));

        final List<Edge<Integer>> edges = new ArrayList<Edge<Integer>>(values.length);
        for (int i = 0; i < values.length; i++) {
            final Vertex<Integer> vi = vertices.get(i);
            for (int j = i + 1; j < values.length; j++) {
                final Vertex<Integer> vj = vertices.get(j);
                final int diff = Math.abs(vi.getValue() - vj.getValue());
                if (diff >= K) {
                    final Edge<Integer> eij = new Edge<Integer>(diff, vi, vj);
                    edges.add(eij);
                }
            }
        }

        final Graph<Integer> g = new Graph<Integer>(TYPE.DIRECTED, vertices, edges);
        return g;
    }

    @Test(timeout = 2000)
    public void testDirected() throws Throwable {
        DirectedGraph directedGraph = new DirectedGraph();
        Graph<Integer> graph = directedGraph.graph;
        assertEquals(0, graph.hashCode());
        assertTrue(graph.equals(graph));
        assertEquals("Value=1 weight=0\n" +
                "\t[ 1(0) ] -> [ 2(0) ] = 7\n" +
                "\t[ 1(0) ] -> [ 3(0) ] = 9\n" +
                "\t[ 1(0) ] -> [ 6(0) ] = 14\n" +
                "\t[ 1(0) ] -> [ 8(0) ] = 30\n" +
                "Value=2 weight=0\n" +
                "\t[ 2(0) ] -> [ 3(0) ] = 10\n" +
                "\t[ 2(0) ] -> [ 4(0) ] = 15\n" +
                "Value=3 weight=0\n" +
                "\t[ 3(0) ] -> [ 4(0) ] = 11\n" +
                "\t[ 3(0) ] -> [ 6(0) ] = 2\n" +
                "Value=4 weight=0\n" +
                "\t[ 4(0) ] -> [ 5(0) ] = 6\n" +
                "\t[ 4(0) ] -> [ 7(0) ] = 16\n" +
                "Value=5 weight=0\n" +
                "Value=6 weight=0\n" +
                "\t[ 6(0) ] -> [ 5(0) ] = 9\n" +
                "\t[ 6(0) ] -> [ 8(0) ] = 14\n" +
                "Value=7 weight=0\n" +
                "Value=8 weight=0\n", graph.toString());
        Graph<Integer> graph2 = new Graph<Integer>(graph);
        graph2.getVertices().add(new Vertex<>(2333));
        assertFalse(graph2.equals(graph));
        graph2 = new Graph<>(graph);
        graph2.getEdges().add(new Edge<Integer>(233, new Vertex<Integer>(1), new Vertex<Integer>(2)));
        assertFalse(graph2.equals(graph));
        graph2 = new Graph<Integer>(graph);
        graph2.getVertices().remove(0);
        graph2.getVertices().add(new Vertex<>(2333));
        assertFalse(graph2.equals(graph));
        graph2 = new Graph<>(graph);
        graph2.getEdges().remove(0);
        graph2.getEdges().add(new Edge<Integer>(233, new Vertex<Integer>(1), new Vertex<Integer>(2)));
        assertFalse(graph2.equals(graph));
        ArrayList<Edge<Integer>> edges = new ArrayList<>(graph.getEdges());
        for (int i = 0; i < graph.getEdges().size(); i++)
            edges.add(graph.getEdges().get(i));
        graph2 = new Graph<>(TYPE.DIRECTED, graph.getVertices(), edges);
        assertEquals(24, graph2.getEdges().size());
        Vertex<Integer> vertex = new Vertex<>(12);
        Vertex<Integer> vertex1 = new Vertex<>(12);
        Edge<Integer> edge = new Edge<>(1, vertex1, vertex);
        vertex.getEdges().add(edge);
        vertex1.getEdges().add(new Edge<>(2, vertex1, vertex));
        assertEquals(-1, vertex.compareTo(vertex1));
        assertEquals(1, vertex1.compareTo(vertex));
        vertex = new Vertex<>(12);
        vertex1 = new Vertex<>(13);
        assertTrue(edge.equals(edge));
        assertTrue(!edge.equals(null));
        assertTrue(edge.equals(edge));
        Edge<Integer> edge2 = new Edge<>(1, vertex1, vertex);
        assertFalse(edge2.equals(edge));
        edge2 = new Edge<>(1, vertex, vertex1);
        edge = new Edge<>(1, vertex1, vertex);
        assertFalse(edge2.equals(edge));
        edge2 = new Edge<>(1, vertex, vertex1);
        edge = new Edge<>(1, vertex, vertex);
        assertFalse(edge2.equals(edge));
        edge2 = new Edge<>(1, vertex, vertex1);
        edge = new Edge<>(1, vertex, vertex);
        assertEquals(1, edge2.compareTo(edge));
        vertex = new Vertex<>(12);
        vertex1 = new Vertex<>(12);
        edge = new Edge<>(1, vertex1, vertex);
        vertex.getEdges().add(edge);
        vertex1.getEdges().add(new Edge<>(2, vertex1, vertex));
        assertFalse(vertex.equals(vertex1));
        CostPathPair<Integer> pathpair = getIdealPathPair(directedGraph);
        assertEquals(100440, pathpair.hashCode());
        assertTrue(pathpair.equals(pathpair));
        assertEquals("Cost = 20\n" +
                "\t[ 1(0) ] -> [ 3(0) ] = 9\n" +
                "\t[ 3(0) ] -> [ 6(0) ] = 2\n" +
                "\t[ 6(0) ] -> [ 5(0) ] = 9\n", pathpair.toString());
        CostPathPair<Integer> pathpair1 = getIdealPathPair(directedGraph);
        pathpair1.setCost(-10000);
        assertTrue(!pathpair1.equals(pathpair));
        pathpair1 = getIdealPathPair(directedGraph);
        ArrayList<Edge<Integer>> path = new ArrayList<Edge<Integer>>();
        path.add(new Edge<Integer>(1, vertex, vertex));
        ArrayList<Edge<Integer>> path1 = new ArrayList<Edge<Integer>>();
        path1.add(new Edge<Integer>(2, vertex, vertex));
        CostPathPair<Integer> costPair = new CostPathPair<Integer>(123, path);
        CostPathPair<Integer> costPair1 = new CostPathPair<Integer>(123, path1);
        assertFalse(costPair.equals(costPair1));
        CostVertexPair<Integer> costVert = new CostVertexPair<Integer>(2, new Vertex<Integer>(2));
        assertFalse(costVert.equals(null));
        assertFalse(costVert.equals(new CostVertexPair<Integer>(3, new Vertex<Integer>(3))));
        assertFalse(costVert.equals(new CostVertexPair<Integer>(2, new Vertex<Integer>(3))));
        assertTrue(costVert.equals(costVert));
        assertEquals(3844, costVert.hashCode());
        try {
            costVert = new CostVertexPair<Integer>(2, null);
            assertFalse(costVert.equals(null));
            assertEquals(3844, costVert.hashCode());
            fail();
        } catch (Exception e) {
            assertEquals("vertex cannot be NULL.", e.getMessage());
        }
        Field vertexField = getField(CostVertexPair.class, "vertex");
        costVert = new CostVertexPair<Integer>(2, new Vertex<Integer>(3));
        vertexField.set(costVert, null);
        assertEquals(62, costVert.hashCode());
        graph = new Graph<>(TYPE.UNDIRECTED, new ArrayList<>(), directedGraph.edges);
        assertEquals(12, graph.getEdges().size());
        graph = new Graph<>(TYPE.UNDIRECTED, new UndirectedGraph().verticies, new UndirectedGraph().edges);
        assertEquals(14, graph.getEdges().size());
        AStar<Integer> astar = new AStar<Integer>();
        edges = (ArrayList<Edge<Integer>>) astar.aStar(new UndirectedGraph().graph, new UndirectedGraph().v3, new UndirectedGraph().v5);
        assertEquals(2, edges.size());
        assertEquals(2, edges.get(0).getCost());
        edges = (ArrayList<Edge<Integer>>) astar.aStar(new DirectedGraph().graph, new DirectedGraph().v3, new DirectedGraph().v5);
        assertEquals(2, edges.size());
        assertEquals(2, edges.get(0).getCost());
        edges = (ArrayList<Edge<Integer>>) astar.aStar(new DirectedGraph().graph, new DirectedGraph().v1, new DirectedGraph().v7);
        assertEquals(3, edges.size());
        assertEquals(9, edges.get(0).getCost());
        graph = new Graph<>();
        graph.getEdges().add(new Edge<Integer>(3, new Vertex<Integer>(1), new Vertex<Integer>(2)));
        graph.getEdges().add(new Edge<Integer>(4, new Vertex<Integer>(1), new Vertex<Integer>(2)));
        graph.getVertices().add(new Vertex<Integer>(3));
        graph.getVertices().add(new Vertex<Integer>(4));
        vertex = new Vertex<Integer>(2, 3);
        vertex.addEdge(new Edge<Integer>(4, vertex, vertex));
        assertEquals(186, vertex.hashCode());
        edges = (ArrayList<Edge<Integer>>) astar.aStar(new DirectedGraph().graph, new DirectedGraph().v5, new DirectedGraph().v8);
        assertNull(edges);
        edges = (ArrayList<Edge<Integer>>) astar.aStar(new DirectedGraph().graph, new DirectedGraph().v2, new DirectedGraph().v6);
        assertEquals(2, edges.size());
        assertEquals(10, edges.get(0).getCost());
        edge = new Edge<Integer>(3, new Vertex<Integer>(4), new Vertex<>(5));
        assertEquals(1787460, edge.hashCode());
        graph = new Graph<>();
        graph.getEdges().add(new Edge<Integer>(3, new Vertex<Integer>(1), new Vertex<Integer>(2)));
        graph.getVertices().add(new Vertex<Integer>(4));
        assertEquals(0, graph.getEdges().get(0).hashCode() * graph.getVertices().get(0).hashCode() * (graph.getVertices().size() + graph.getEdges().size() + graph.getType().hashCode()) * 31 - graph.hashCode());
        astar = new AStar<Integer>();
        edges = (ArrayList<Edge<Integer>>) astar.aStar(new DirectedGraph().graph, new DirectedGraph().v3, new UndirectedGraph().v5);
        assertNull(edges);
        astar = new AStar<Integer>();
        edges = (ArrayList<Edge<Integer>>) astar.aStar(new UndirectedGraph().graph, new UndirectedGraph().v7, new UndirectedGraph().v5);
        assertEquals(4, edges.size());
        assertEquals(1, edges.get(0).getCost());
        astar = new AStar<Integer>();
        edges = (ArrayList<Edge<Integer>>) astar.aStar(new UndirectedGraph().graph, new UndirectedGraph().v7, new UndirectedGraph().v1);
        assertEquals(1, edges.size());
        assertEquals(1, edges.get(0).getCost());
        astar = new AStar<Integer>();
        edges = (ArrayList<Edge<Integer>>) astar.aStar(new UndirectedGraph().graph, new UndirectedGraph().v3, new UndirectedGraph().v5);
        assertEquals(2, edges.size());
        assertEquals(2, edges.get(0).getCost());
        astar = new AStar<Integer>();
        edges = (ArrayList<Edge<Integer>>) astar.aStar(new UndirectedGraph().graph, new UndirectedGraph().v3, new UndirectedGraph().v7);
        assertEquals(2, edges.size());
        assertEquals(9, edges.get(0).getCost());
        astar = new AStar<Integer>();
        edges = (ArrayList<Edge<Integer>>) astar.aStar(new UndirectedGraph().graph, new UndirectedGraph().v3, new UndirectedGraph().v3);
        assertEquals(0, edges.size());
        astar = new AStar<Integer>();
        edges = (ArrayList<Edge<Integer>>) astar.aStar(new DirectedGraph().graph, new UndirectedGraph().v3, new UndirectedGraph().v3);
        assertEquals(0, edges.size());
    }
}
