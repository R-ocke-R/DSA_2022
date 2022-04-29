import java.util.*;
public class Lecture6$DFS {
    ArrayList<ArrayList<Integer>> adjacencyList= new ArrayList<ArrayList<Integer>>();
    Lecture6$DFS(int n){
        for (int i = 0; i <= n; i++) {
            adjacencyList.add(new ArrayList<Integer>());
        }
    }

    public void makeGraph(Scanner sc, int m){
        int u, v;
        for (int i = 0; i < m; i++) {
            u=sc.nextInt();
            v=sc.nextInt();
            adjacencyList.get(u).add(v);
            adjacencyList.get(v).add(u);
        }
    }
    
    public void dfs(int index, int[] vA){
        Stack<Integer> s= new Stack<Integer>();
        s.push(index);
        vA[index]=1;
        while(s.size()!=0){
            System.out.print(s.peek()+" -> ");
            for (Integer node : adjacencyList.get(s.pop())) {
                if (vA[node]==0){
                    s.push(node);
                    vA[node]=1;
                }
                
            }

        }
        
    }
    
    public void dfsRecursive(int index, int[] va){
        System.out.print(index+" -> ");
        va[index]=1;
        for (Integer nod : adjacencyList.get(index)) {
            if(va[nod]==0){
                dfsRecursive(nod, va);
            }
        }
    }

    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){        
            int n= sc.nextInt();
            int m= sc.nextInt();
            Lecture6$DFS obj= new Lecture6$DFS(n);
            obj.makeGraph(sc, m);
            int[] visitedArray= new int[n+1];
            for (int i = 1; i <= n; i++) {
                if (visitedArray[i]==0){
                    obj.dfsRecursive(i, visitedArray);
                    // obj.dfs(i, visitedArray);
                }
            }
        }
    }
}
// no of nodes, edges.
// 9 10 
// edges 
// 1 2 1 4 1 9 2 1 2 8 3 4 3 6 3 
// 8 4 1 4 3 4 5 5 4 5 9 6 3 6 7 
// 7 6 8 2 8 3 9 1 9 5  these are not the edges, these are neighbours for all. i.e. full adj

// DFS=1 -> 2 -> 8 -> 3 -> 6 -> 7 -> 4 -> 5 -> 9 ->
// DFS=0 1 7 2 5 6 3 4 8

