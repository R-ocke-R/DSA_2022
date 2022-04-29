import java.util.*;

// 15 April

// Fully/Complete Graph is a graph where all nodes are connected *directly* with each and every node
// Connected Graph is a graph where all nodes are connected but each node is not directly connected with every node.
// Disconnected Graph is a graph where all nodes are not connnected.

// Graph Directed & Undirected, both types can be weighted and unweighted. weighted can be of two types positive and negative.
// Thus 6 types.

// Application
// Networking, Friend Suggestion, Shortest Path Map.

// Degree, Path, Adjacent Vertex

// How to represent Graph Datastructure, 1) Adjacency Matrix, 2) Adjacency List.

// Difference between tree and graph, CYCLE !!!

// Tree is a special representation of acycle graph.

// If graph is nearly or completely connected Graph, then we use Adjacency Matrix(Space Complexity is High) else use always use adjacency list.

// Array of Array is known as Jacked array,

// better space complexity will be provided by Array of LinkedList (every V is stored as an element of the list.)

// import linked list as package, then use it to create a Graph' Adjacency List.

/*
18 April

Implementation of Graph 
By Adjacency List.

List, Set, Map.
list and set are part of collection framework unlike map.
List.
Map -> Interface.

*/
public class GraphDemo {
    public static void main(String[] args) {
        Map<Integer, Integer> obj= new HashMap<>();
        obj.put(20, 200);
        obj.put(30, 300);
        obj.put(40, 400);
        obj.getOrDefault(20, -1);                 //if key present then return the value, else return the default value.
        for (Map.Entry <Integer, Integer> res : obj.entrySet()) {
            System.out.println(res.getKey()+"  "+res.getValue());

            
        }



    }
}
// Spanning Tree.
