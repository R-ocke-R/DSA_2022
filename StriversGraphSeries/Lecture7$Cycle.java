import java.util.*;

class Graph{
    ArrayList<ArrayList<Integer>> adjacencyList= new ArrayList<ArrayList<Integer>>();
    int n;
    int m;
    Graph(){
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("Enter n and m \n n is the number of nodes \n m is the number of edges \n then enter u and v for each edge");
            n= sc.nextInt();
            m= sc.nextInt();
            for (int i = 0; i <= n; i++) {
                adjacencyList.add(new ArrayList<Integer>());
            }
            int u, v;
            for (int i = 0; i < m; i++) {
                u= sc.nextInt();
                v= sc.nextInt();
                adjacencyList.get(u).add(v);
                adjacencyList.get(v).add(u);
            }
        }
    
    }
    
    public void dfsRecursiveCycleInComponent(int last, int index, int[] va){
        System.out.print(index+" -> ");
        va[index]=1;
        for (Integer nod : adjacencyList.get(index)) {
            // System.out.println(index+"here");
            if(va[nod]==1 && nod!=last){
                System.out.println("CYCLE FOUND IN THIS COMPONENT");
            }
            if(va[nod]==0){
                dfsRecursiveCycleInComponent(index, nod, va);
            }
        }
    }
    public void bfsforCycle(int index, int[] vA){
        Queue<Integer> q= new LinkedList<Integer>();
        q.add(index);
        vA[index]=index;
        while (q.size()!=0){
            index=q.remove();
            System.out.print(index+" -> ");
            for (Integer node : adjacencyList.get(index)) {
                if (vA[node]==0){
                    q.add(node);
                    vA[node]=index;
                }// if not 0 then va can be -1 for initial 
                else if(vA[index]==node){
                    // parent as node wala case
                    continue;
                }
                else{
                System.out.println("Cycle found connecting "+node+" -> "+index);
                return;
                }
            }
        }
    }
}

public class Lecture7$Cycle {
    
    public static void main(String[] args) {
        Graph g= new Graph();
        System.out.println(g.adjacencyList);
        int[] visitedArray= new int[g.n+1];
        // System.out.println(g.m+" "+g.n);
        for (int i = 1; i <= g.n; i++) {
            if (visitedArray[i]==0){
                g.dfsRecursiveCycleInComponent(-1, i, visitedArray);
                System.out.println("________");
                // System.out.println(g.adjacencyList.get(4));
            }
        }
    }
}
// gfg question Q1.