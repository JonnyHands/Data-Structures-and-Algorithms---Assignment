/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonny
 */
public class GraphTest {

    public GraphTest() {
    }

    @Test
    public void testInsertVertex() {
        Graph graph = new Graph();
        graph.insertVertex("test1");
        assertEquals("test1", graph.vertices.get(0).name);
    }

    @Test
    public void testRemoveVertex() {
        Graph graph = new Graph();
        graph.insertVertex("test1");
        String result = graph.removeVertex(graph.vertices.get(0));
        assertEquals(0, graph.vertices.size());
        assertEquals("test1", result);
    }

    @Test
    public void testRemoveNullVertex() {
        Graph graph = new Graph();
        Vertex vertex = new Vertex("test");
        String result = graph.removeVertex(vertex);
        assertEquals(0, graph.vertices.size());
        assertEquals(null, result);
    }

    @Test
    public void testInsertEdge() {
        Graph graph = new Graph();
        Vertex v = new Vertex("1");
        Vertex w = new Vertex("2");
        graph.insertEdge(v, w, "edge1");
        assertEquals("edge1", graph.edges.get(0).getName());
    }

    @Test
    public void testRemoveEdge() {
        Graph graph = new Graph();
        Vertex v = new Vertex("1");
        Vertex w = new Vertex("2");
        graph.insertEdge(v, w, "edge2");
        String result = graph.removeEdge(graph.edges.get(0));
        assertEquals(0, graph.edges.size());
        assertEquals("edge2", result);
    }

    @Test
    public void testRemoveNullEdge() {
        Graph graph = new Graph();
        Vertex v = new Vertex("1");
        Vertex w = new Vertex("2");
        Edge edge = new Edge(v, w, "test");
        String result = graph.removeEdge(edge);
        assertEquals(0, graph.edges.size());
        assertEquals(null, result);
    }

    @Test
    public void testOpposite() {
        Graph graph = new Graph();
        Vertex v = graph.insertVertex("1");
        Vertex w = graph.insertVertex("2");
        Edge e = graph.insertEdge(v, w, "e");
        graph.opposite(e, v);
        assertEquals(w, graph.opposite(e, v));
        assertEquals(v, graph.opposite(e, w));

    }

    @Test
    public void testAreAdjacent() {
        Graph graph = new Graph();
        Vertex v = graph.insertVertex("1");
        Vertex w = graph.insertVertex("2");
        Edge e = graph.insertEdge(v, w, "e");
        assertEquals(true, graph.areAdjacent(v, w));
    }

    @Test
    public void testIncidentEdges() {
        Graph graph = new Graph();
        Vertex v = graph.insertVertex("King's Cross");
        Vertex w = graph.insertVertex("2");
        Vertex v1 = graph.insertVertex("3");
        Vertex w1 = graph.insertVertex("4");
        Edge e = graph.insertEdge(v, w, "e1");
        Edge e1 = graph.insertEdge(v, w1, "e2");
        Edge e2 = graph.insertEdge(v, v1, "e3");
        assertEquals(3, graph.incidentEdges(v).size());
    }

    @Test
    public void testRenameVertex() {
        Graph graph = new Graph();
        Vertex v = graph.insertVertex("oldname");
        assertEquals("oldname", graph.rename(v, "newname"));
        assertEquals("newname", graph.vertices.get(0).name);
    }

    @Test
    public void testRenameEdge() {
        Graph graph = new Graph();
        Vertex v = graph.insertVertex("1");
        Vertex w = graph.insertVertex("2");
        Edge e = graph.insertEdge(v, w, "oldname");
        assertEquals("oldname", graph.rename(e, "newname"));
        assertEquals("newname", graph.edges.get(0).getName());
    }

    /*@Test
    public void testBFTraverse() {
        Graph graph = new Graph();
        Vertex v1 = graph.insertVertex("1");
        Vertex v2 = graph.insertVertex("2");
        Vertex v3 = graph.insertVertex("3");
        Vertex v4 = graph.insertVertex("4");
        Edge e1 = graph.insertEdge(v1, v2, "line1");
        Edge e2 = graph.insertEdge(v1, v3, "line2");
        Edge e3 = graph.insertEdge(v2, v4, "line3");
        graph.bftraverse(v1);
        assertEquals(new ArrayList<Vertex>(Arrays.asList(v1, v2, v3, v4)), graph.getTraversedVertices());
        
    }
*/
    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }


}
