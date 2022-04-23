import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lecture3$Implementation {
    
    public static void adjacencyMatrix(Scanner sc, int n, int m){
        //  this matrix is for undirected graph
        //  in directed graph only u v is a connection this adj[v][u] != 1;
        int adj[][]=new int[n+1][n+1];
        int u, v;
        for(int i=0;i<m;i++){
            u=sc.nextInt();
            v=sc.nextInt();
            adj[u][v]=1;
            adj[v][u]=1;
        }
        for (int i = 0; i < adj.length; i++) {
            System.out.println(Arrays.toString(adj[i]));
        }
        
    }
    
    public static void adjacencyList(Scanner sc, int n, int m){
        // for undirected we add to both u and v index 
        ArrayList<ArrayList<Integer>> adj= new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            // adj.add(i, adj.get(i), );.get(i)
            // adj.add(new ArrayList<Integer>={sc.nextInt()});
            // new ArrayList<>(Arrays.asList(1,2,3));
            adj.add(new ArrayList<Integer>());
            // for arrayList we first need to add empty Nested Lists at each index.
        }
        int u,v;
        for (int index = 0; index < m; index++) {
            u=sc.nextInt();v=sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        System.out.println(adj);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)){
            adjacencyList(sc, sc.nextInt(), sc.nextInt());
            // example of input 3 3(m,n) 1 2 2 3 1 3 (for each u, v)
        }
        
    }
}
