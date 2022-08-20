
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jonny
 */
public class Edge {

    private final Vertex v;
    private final Vertex w;
    private  String name;
    
    /**
     * creates an edge between two vertices 
     * @param v the first vertex
     * @param w the second vertex
     * @param n the name of the edge
     */
    public Edge(Vertex v, Vertex w, String n) {
        this.v = v;
        this.w = w;
        this.name = n;

    }

    /**
     * getter method for the vertex W
     * @return w
     */
    public Vertex getW() {
        return w;
    }

    /**
     * getter method for the vertex V
     * @return v
     */
    public Vertex getV() {
        return v;
    }

    /**
     * getter method for the name of the edge
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setter method for the edge name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

}
