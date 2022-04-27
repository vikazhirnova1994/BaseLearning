package datastruct.graph.mst;

import datastruct.graph.bfs.Vertex;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class Graph {
    private final int MAX_VERTS = 20; //максимальное количество вершин
    private Vertex vertexList[]; //список вершин
    private int adjMat[][]; //матрица смежности
    private int nVerts; //текущее кол-во вершин
    private StackX theStack; //стек посещенных вершин

    public Graph() {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j] = 0;
            }
        }
        theStack = new StackX();
    }

    //добавление вершины
    public void addVertex(char lab){
        vertexList[nVerts++] = new Vertex(lab);
    }

       //добавление ребра
    public void addEdge(int start, int end){
        adjMat[start][end] =1;
        adjMat[end][start] =1;
    }

    public void displayVertex(int v){
        System.out.print(vertexList[v].label);
    }

    //построение отставного дерева
    public void mst(){
        vertexList[0].wasVisited =true; //получение первой вершины
        theStack.push(0); //поместить первую вершину в стек
        while (!theStack.isEmpty()){
            int currentVertex = theStack.peek();//читаем вершину стека
            int v = getUnvisitedVertex(currentVertex); //получаем непрочитанные вершины по отн к полученной вершине
            if (v== -1){
                theStack.pop();
            } else {
                vertexList[v].wasVisited = true;
                theStack.push(v); //кладем прочитанную вершину в стек
                System.out.print("");
            }
        }
        //снятие флажков прочитано
        for (int i = 0; i < nVerts; i++) {
            vertexList[i].wasVisited = false;
        }
    }

    //полечение непрочитанных вершин
    public int getUnvisitedVertex(int v){
        for (int i = 0; i < nVerts; i++) {
            if (adjMat[v][i] ==1 &&
                   vertexList[i].wasVisited == false) {
                return i;
            }
        }
        return  -1;
    }
}
