package datastruct.graph.bfs;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class Graph {
    private final  int MAX_VERTS = 20;
     private Vertex vertexList[];
     private int adjMat[][];
     private int nVerts;
     private Queue theQueue;

    public Graph() {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j] = 1;
            }
        }
        theQueue = new Queue();
    }

    public void addVertex(char lab){
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end){
        adjMat[start][end] =1;
        adjMat[end][start] =1;
    }

    public void displayVertex(int v){
        System.out.print(vertexList[v].label);
    }

    public void bfs(){
        vertexList[0].wasVisited = true;//начинаем с вершины 0, помечаем как прочитанную
        displayVertex(0);
        theQueue.insert(0); //заносим в конец очереди
        int v2;
        while (!theQueue.isEmpty()){ //пока очередь не опустеет
            int v1 = theQueue.remove(); //извлечить врешину в начале очереди
            while ((v2 = getUnvisitedVertex(v1))!=-1){ //получение вершины непосещенной, смежной с v1
                vertexList[v2].wasVisited =true;
                displayVertex(v2);
                theQueue.insert(v2);
            }
        }
        for (int i = 0; i < nVerts; i++) {
            vertexList[i].wasVisited = false;
        }
    }

    public int getUnvisitedVertex(int v){  //поиск непосещенной вершины, межной по отношению к v
        for (int i = 0; i < nVerts; i++)
            if ( adjMat[v][i] == 1 &&
                  vertexList[i].wasVisited == false)
                return i;//возвращаем первую найденную вершину
        return -1;
    }
}
