import java.util.*;


// class Gnode{
//     Gnode(){
//         int level;
//         int data;

//     }
// }
public class LevelBFS{
    ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>();

    LevelBFS(int n){
        for (int i = 0; i < n+1; i++) {
            adjacencyList.add(new ArrayList<Integer>());
        }
    }
    
    public void makeGraph(Scanner sc, int m){
        int u,v;
        for (int i = 0; i < m; i++) {
            u= sc.nextInt();
            v= sc.nextInt();
            // undirected manner me add karenge 
            adjacencyList.get(u).add(v);
            adjacencyList.get(v).add(u);
        }
    }
    
    public void bfs(int index, int[] vA){
        Queue<Integer> q= new LinkedList<Integer>();
        q.add(index);
        vA[index]=1;
        // int counter=1;
        // System.out.println("here");
        while (q.size()!=0){
            System.out.print(q.peek()+" -> ");
            // System.out.println(counter);
            int ddd=q.remove();
            for (Integer node : adjacencyList.get(ddd)) {
                if (vA[node]==0){
                    q.add(node);
                    vA[node]=vA[ddd]+1;
                }              
            }
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n= sc.nextInt();
            int m= sc.nextInt();
            LevelBFS obj= new LevelBFS(n);
            System.out.println(obj.adjacencyList);   
            System.out.println("Empty list has been made");
            System.out.println("Now calling makeGraph function so enter "+m+" pair of edges");
            obj.makeGraph(sc, m);
            System.out.println(obj.adjacencyList);
            int[] visitedArray= new int[n+1];
            System.out.println("  >>>  BREADTH FIRST SEARCH OF THE FOLLOWING GRAPH IS   >>>");

            for (int i = 1; i <= n; i++) {
                if (visitedArray[i]==0){
                    
                    obj.bfs(i, visitedArray);
                }
            }
            System.out.println(Arrays.toString(visitedArray));
        }        
    }
}
