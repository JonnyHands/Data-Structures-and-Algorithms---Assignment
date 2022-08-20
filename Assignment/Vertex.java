
import java.util.ArrayList;

/**
 *
 * @author Jonny
 */
public class Vertex {


    public ArrayList<String> vertices;
    public String name;

    /**
     * creates a vertex with the name of n
     * @param name
     */
    public Vertex(String name){
        this.name = name;
        
    }
    
    /**
     * getter method for the vertices
     * @return vertices
     */
    public ArrayList<String> getVertices() {
        return vertices;
    }

    /**
     * setter method for the vertices
     * @param vertices
     */
    public void setVertices(ArrayList<String> vertices) {
        this.vertices = vertices;
    }

    /**
     * getter method for the name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setter method for the name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    
}
