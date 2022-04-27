package datastruct.graph.path;

/**
 * @author Victoria Zhirnova
 * @project LearnAlgoritms
 */

public class DistPar {
    public int distance; //расстояние до  текущего от начального \
    public int parentVert; //текущий родитель

    public DistPar(int parent, int distance) {
        this.distance = distance;
        this.parentVert = parent;
    }
}
