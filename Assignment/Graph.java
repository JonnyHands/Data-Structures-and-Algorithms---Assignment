
import java.util.ArrayList;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jonny
 */
public class Graph implements GraphADT {

    ArrayList<Vertex> vertices;
    ArrayList<Edge> edges;
    ArrayList<Vertex> visitedVertices;

    /**
     * creates a graph with the paramaters given
     *
     * @param vertices
     * @param edges
     */
    public Graph(ArrayList<Vertex> vertices, ArrayList<Edge> edges) {
        this.vertices = vertices;
        this.edges = edges;
    }

    /**
     * creates an empty graph
     */
    public Graph() {
        vertices = new ArrayList<Vertex>();
        edges = new ArrayList<Edge>();
    }

    /**
     * Insert a new vertex with name n into the graph.
     *
     * @param n String
     * @return the new Vertex
     */
    public Vertex insertVertex(String n) {
        Vertex vertex = new Vertex(n);
        vertices.add(vertex);
        return vertex;
    }

    /**
     * Remove the given vertex from the graph. The name of the vertex is
     * returned, or null if the graph does not contain the vertex.
     *
     * @param v Vertex
     * @return the name of the vertex or null.
     */
    public String removeVertex(Vertex v) {
        if (vertices.contains(v)) {
            vertices.remove(v);
            return v.name;
        }
        return null;
    }

    /**
     * Builds a new edge with end vertices v and w and name n and inserts it
     * into the graph.
     *
     * @param v Vertex
     * @param w Vertex
     * @param n String
     * @return the new Edge
     */
    public Edge insertEdge(Vertex v, Vertex w, String n) {
        Edge edge = new Edge(v, w, n);
        edges.add(edge);
        return edge;

    }

    /**
     * Removes the edge e from the graph.
     *
     * @param e the edge to be removed
     * @return the name or null if e does not exist
     */
    public String removeEdge(Edge e) {
        //checks if the edges contain edge e to be removed if so, removes e
        if (edges.contains(e)) {
            edges.remove(e);
            return e.getName();
        }
        return null;
    }

    /**
     * Returns the endpoint vertex of edge e that is 'opposite' to its other
     * endpoint vertex v.
     *
     * @param e Edge
     * @param v Vertex
     * @return a vertex or null
     */
    public Vertex opposite(Edge e, Vertex v) {
        //checks v = v if so returns w (the opposite)
        if (e.getV() == v) {
            return e.getW();
        }
        // checks w = w if so returns v (the opposite)
        if (e.getW() == e.getW()) {
            return e.getV();
        }
        return null;
    }

    /**
     * Returns a collection containing all of the vertices in the graph.
     *
     * @return an ArrayList list of vertices
     */
    public ArrayList<Vertex> vertices() {
        return vertices;
    }

    /**
     * Returns a collection all of the edges in the graph.
     *
     * @return an ArrayList of edges
     */
    public ArrayList<Edge> edges() {
        return edges;
    }

    /**
     * Checks whether two vertices are connected to one another
     *
     * @param v a vertex
     * @param w a vertex
     * @return true if v and we are adjacent and false otherwise.
     *
     */
    public boolean areAdjacent(Vertex v, Vertex w) {
        // iterates through edges checking v = v and w = w if so they are connected
        for (Edge edge : edges) {
            if (edge.getV() == v && edge.getW() == w) {
                return true;
            }
        }
        return false;
    }

    /**
     * Finds and returns the set of edges that are incident to a given vertex.
     *
     * @param v the vertex
     * @return a list of edges
     */
    public ArrayList<Edge> incidentEdges(Vertex v) {
        ArrayList<Edge> result = new ArrayList<Edge>();
        // iterates through all the edges and checks if vertices are equal to v
        for (Edge edge : edges) {
            if (edge.getV() == v || edge.getW() == v) {
                result.add(edge);
            }
        }
        return result;
    }

    /**
     * Renames vertex v as n
     *
     * @param v a vertex
     * @param n the new name
     * @return the old edge name
     */
    public String rename(Vertex v, String n) {
        //stores the old name, gets the old names index, replaces the old name(v) with n
        String oldname = v.name;
        Vertex vertex = vertices.get(vertices.indexOf(v));
        vertex.setName(n);
        return oldname;
    }

    /**
     * Renames edge e as n
     *
     * @param e an edge
     * @param n the new name
     * @return the old edge name
     */
    public String rename(Edge e, String n) {
        //stores the old name, gets the old names index, replaces the old name(e) with n
        String oldname = e.getName();
        Edge edge = edges.get(edges.indexOf(e));
        edge.setName(n);
        return oldname;
    }

    /*perform a breadth-first traversal of the rail network, starting from a given station.
     * public void bftraverse(Vertex v) {
        // get edges for given vertex -
        // add vertex to visited list -
        // add edges to list -
        // while edges in list remove first item -
        // get vertices for current edge -
        // add vertices to visited list -
        // get edges for that vertex add to edge list -
        // repeat
        incidentEdges(v);
        visitedVertices.add(v);
        Queue<Edge> listToSearch = (Queue<Edge>) incidentEdges(v);
        while (listToSearch.size() > 0) {
            Vertex v1 = listToSearch.poll().getV();
            Vertex v2 = listToSearch.poll().getW();
            visitedVertices.add(v1);
            visitedVertices.add(v2);
            for (int i = 0; i < incidentEdges(v1).size(); i++) {
                listToSearch.add(incidentEdges(v1).get(i));

                for (int j = 0; j < incidentEdges(v2).size(); i++) {
                    listToSearch.add(incidentEdges(v2).get(i));
                }
            }
        }
    }

    public ArrayList<Vertex> getTraversedVertices() {
        return visitedVertices;
    }
        */
}
