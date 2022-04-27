package datastruct.graph.path;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class Vertex {
    public char label;
    public boolean isInTree;

    public Vertex(char label) {
        this.label = label;
        isInTree =false;
    }
}
