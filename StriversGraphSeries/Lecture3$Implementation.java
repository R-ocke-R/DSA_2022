import java.util.Arrays;
import java.util.Scanner;

public class Lecture3$Implementation {
    
    public static void adjacencyMatrix(Scanner sc, int n, int m){
        int adj[][]=new int[n+1][n+1];
        int u, v;
        for(int i=0;i<n;i++){
            u=sc.nextInt();
            v=sc.nextInt();
            adj[u][v]=1;
            adj[v][u]=1;
        }
        for (int i = 0; i < adj.length; i++) {
            System.out.println(Arrays.toString(adj[i]));
        }
        
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner (System.in)){
            adjacencyMatrix(sc, sc.nextInt(), sc.nextInt());
        }
        
    }
}
