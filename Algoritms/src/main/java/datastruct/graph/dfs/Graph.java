package datastruct.graph.dfs;

public class Graph {
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private StackX theStack;

    public Graph(){
        vertexList = new Vertex[MAX_VERTS];
        adjMat= new int[MAX_VERTS][MAX_VERTS];
        nVerts  = 0;
        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j] = 0;
            }
        }
        theStack = new StackX();
    }

    public void addVertex(char lab){
        vertexList[nVerts++] = new Vertex(lab);
    }
    public void addEdge(int start, int end){
        adjMat[start][end]=1;
        adjMat[end][start]=1;
    }
    public void displayVertex(int v){
        System.out.print(vertexList[v].label);
    }

    public void dfs(){ //обход в глубину
        vertexList[0].wasVisited = true;//начинаем с вершины 0, помечаем как прочитанную
        displayVertex(0); //вывод
        theStack.push(0); //заносим в стек прочитаннух вершин
        while (!theStack.isEmpty()){ //пока стек не опустеет
            int v = getUnvisitedVertex(theStack.peek()); //получение вершины
            if (v==-1){ //если такой вершины нет
                theStack.pop(); //элемент извлекаент из стека
            } else { //ечли вершина найдена
                vertexList[v].wasVisited = true;
                displayVertex(v);
                theStack.push(v); //добавляем стек
            }
        }
        for (int i = 0; i < nVerts; i++) { //сбррос флагов
            vertexList[i].wasVisited = false;
        }
    }
    public int getUnvisitedVertex(int v){ //поиск непосещенной вершины, межной по отношению к v
        for (int i = 0; i < nVerts; i++) {
            if (adjMat[v][i] ==1 &&
                    vertexList[i].wasVisited == false){
                return i; //возвращаем первую найденную вершину
            }
        }
        return -1;
    }
}
