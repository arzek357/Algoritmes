package HomeWork7;

public class HomeWorkTask {
    public static void main(String[] args) {
        Graph myGraph = new Graph();
        fillGraphTenVertex(myGraph);
        pullRandomEdgesForTenVertexGraph(myGraph,3);
        System.out.println(myGraph.breadthFirstSearch(new Vertex(Integer.toString(0))));
    }
    private static void fillGraphTenVertex(Graph graph){
        for (int i =0;i<10;i++){
            graph.addVertex(Integer.toString(i));
        }
    }
    private static void pullRandomEdgesForTenVertexGraph(Graph graph,int maxPossibleEdgesForOne){
        for (int i=0;i<10;i++){
            for (int j = 0;j<Math.random()*maxPossibleEdgesForOne;j++){
                graph.addEdge(Integer.toString(i),Integer.toString((int) (Math.random()*9)));
            }
        }
    }
}
