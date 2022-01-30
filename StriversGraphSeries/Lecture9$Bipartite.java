import java.util.*;

public class Lecture9$Bipartite {

    public static boolean bipartite(Graph g, int index, char[] va){
        char ch='\u0000';
//      will be using BFS for this 
        Queue<Integer> q = new LinkedList<>();
        q.add(index);

        // starting: I have been provided with a new component of a graph so will start colouring it with a 
        va[index]='a';
        // now all the adjacent nodes of a will be coloured b inside foreach loop.
        while (q.size()!=0){
            int node= q.remove();
            char currentColor= va[node];
            char otherColor=(currentColor=='a') ?'b':'a';
            for (Integer integer : g.adjacencyList.get(node)) {
                if (va[integer]==currentColor){
                    // the adjacent has been coloured same as the current color 
                    // error
                    return false;
                }
                // else has either the other color(no queue adding) or no color(add to queue)
                else if (va[integer]==ch){
                    q.add(integer);
                    va[integer]=otherColor;
                }
                else if (va[integer]==otherColor){
                    continue;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Graph g= new Graph();
        char[] va= new char[g.n+1];
        char ch='\u0000';
        for (int i = 1; i <= g.n; i++) {
            if (va[i]==ch){
                if (bipartite(g, i, va)==false){
                    System.out.println("Not bipartite");
                }
            }          
        }
        System.out.println(Arrays.toString(va));
    }
}



// Question2_gfg_BipartiteGraph
// copied above code, just changed Graph parameter to adj.

//     https://practice.geeksforgeeks.org/problems/bipartite-graph/1#