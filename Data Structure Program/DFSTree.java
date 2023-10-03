import java.util.*;
public class DFSTree{


    static Map<Integer,List<Integer>> adjList=new HashMap<>();
    static Map<Integer,Boolean> visited=new HashMap<>();

static void addEdges(int u,int v,boolean direction){
    if(!adjList.containsKey(u)){
        adjList.put(u,new ArrayList<>());
    }
    adjList.get(u).add(v);

    if(!direction){
        if(!adjList.containsKey(v)){
            adjList.put(v,new ArrayList<>());
        }
        adjList.get(v).add(u);
    }w
}
    static void dfs(int start){
    
        visited.put(start,true);
        System.out.println(start+",");
    

            for (int neighbor : adjList.getOrDefault(start, new ArrayList<>())) {
                if (!visited.getOrDefault(neighbor, false)) {
                   dfs(neighbor);
                }
            }
        


    }
    public static void main(String[] args) {
        addEdges(0,1,false);
        addEdges(1,6,false);
        addEdges(1, 4,false);
        addEdges(4, 5,false);
        addEdges(4, 3,false);
        addEdges(3, 2,false);
        addEdges(3, 7,false);

        System.out.println("Breadth-First Traversal (starting from vertex 0):");
        dfs(0);

    
    
    }
}

