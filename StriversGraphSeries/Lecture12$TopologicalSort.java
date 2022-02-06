import java.util.*;
public class Lecture12$TopologicalSort {
    static LinkedList<Integer> Topo = new LinkedList<>();
    
    public static void sortTopological(ArrayList<ArrayList<Integer>> adj, int index, int[] va){
        // for brute algorigthm I am using a stack DFS and at will make a dfs order and add that in front of topo.
        // Stack<Integer> s= new Stack<Integer>();
        // s.add(index);
        
        // while(s.size()!=0){
        //     int node= s.pop();
        //     for (int integer : adj.get(node)) {

            
        // }}

        // since I need to add the whole dfs for a component from end to front will go for recursive algo of dfs
        va[index]=1;
        System.out.println(index+" -> ");
        for (int node : adj.get(index)) {
            if (va[node]==0){
                sortTopological(adj, node, va);
            }
        }
        Topo.addFirst(index);//since addto first is the only operation that I use, we can also make use of stack lifo.
        System.out.println(index+"added");
    }

    public static void main(String[] args) throws InterruptedException {
        dGraph dg= new dGraph();

        Thread ob= new Thread();
        ob.sleep(2000);

        int[] va= new int[dg.n+1];
        for (int i = 1; i <= dg.n; i++) {
            if(va[i]==0){
                sortTopological(dg.adj, i, va);
            }
        }
        System.out.println(va);
        System.out.println(Arrays.toString(Topo.toArray()));

    }
}



// Question4 TopoSort GFG
//   https://practice.geeksforgeeks.org/problems/topological-sort/1#