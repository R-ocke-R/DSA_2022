/*
by removing all the superfluous edges you can make a spanning tree from a graph


19/4

Graph Traversal techniques
There are two Graph Traversal techniques, BFS, DFS.

BFS-> Queue
DFS-> Stack.

Single Source Shortest Path


BFS, 
Bellman Ford Algorithm
Dijkstra's Algorithm



*/
import java.util.*;
public class Graph {
    Map<Integer, LinkedList<Integer>> map ;

    public Graph() {
        map=new HashMap<>();
    }
    public void addEdge(int v1,int v2,boolean isBidirectional){
         LinkedList<Integer> v1Neighbour=map.getOrDefault(v1,new LinkedList<>()) ;
         v1Neighbour.add(v2) ;
         map.put(v1,v1Neighbour) ;
         if(isBidirectional==true){
             LinkedList<Integer> v2Neighbour=map.getOrDefault(v2,new LinkedList<>()) ;
             v2Neighbour.add(v1) ;
         }
    }
    public void BFS(int source){
        Queue<Integer> bfs= new LinkedList<>();
        bfs.add(source);
        Set<Integer> vis= new HashSet<>();
        vis.add(source);
        while(!bfs.isEmpty()){
            int front=bfs.poll();
            vis.add(front);
            System.out.println(front);
            for(Integer res: map.get(front)){
                if( !vis.contains(res)){
                    bfs.add(res);
                }
            }
        }
        
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n= sc.nextInt();
            
        }
    }
    
}

    
