package datastruct.graph.bfs;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class Vertex {
    public char label;
    public boolean wasVisited;

    public Vertex(char label) {
        this.label = label;
        wasVisited = false;
    }
}
