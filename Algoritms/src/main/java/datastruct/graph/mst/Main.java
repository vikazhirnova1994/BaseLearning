package datastruct.graph.mst;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A'); //0
        graph.addVertex('B'); //1
        graph.addVertex('C'); //2
        graph.addVertex('D'); //3
        graph.addVertex('E'); //4
        graph.addEdge(0, 1); //AB
        graph.addEdge(0, 2); //AC
        graph.addEdge(0, 3); //AD
        graph.addEdge(0, 4); //AE
        graph.addEdge(1, 2); //BC
        graph.addEdge(1, 3); //BD
        graph.addEdge(1, 4); //BE
        graph.addEdge(2, 3); //CD
        graph.addEdge(2, 4); //CE
        graph.addEdge(3, 4); //DE
        System.out.print("Minimum spanning tree: ");
        graph.mst();
        System.out.println();
    }
}
