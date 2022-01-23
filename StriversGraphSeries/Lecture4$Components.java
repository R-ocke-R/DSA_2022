import java.util.*;

public class Lecture4$Components{
    //  making a instance (or a class variable )
    ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>();

    Lecture4$Components(int n){
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
    
    public void sumComponent(int index, int[] vA) {
        // calculates the sum of component whose node is at index.
        // output tells all the nodes in the given component and the total sum of that component
        // ArrayList<Integer> queue= new ArrayList<Integer>();
        Queue<Integer> queue= new LinkedList<Integer>();

        // queue is used to keep the current and next nodes in the given component.
        // adjacencyList.get(index);
        int sum=0;
        System.out.println("\n----\n");
        System.out.println("Nodes of this Component are -> ");
        queue.add(index);
        while(queue.size()!=0){
            if (vA[queue.peek()]==0){
                sum+=queue.peek();
                System.out.print(queue.peek()+" ");
                vA[queue.peek()]=1;
                // added the element and printed its value and vA=1
                // adjacencyList.get(queue.remove());
                // System.out.println("here");
                for (Integer node : adjacencyList.get(queue.remove())) {
                    queue.add(node);
                }
            }
            else{
                queue.remove();
            }
        }
        System.out.println();
        System.out.println("Component complete, Its sum is "+sum);
        System.out.println("\n----\n");
        
        
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n= sc.nextInt();
            int m= sc.nextInt();
            Lecture4$Components obj= new Lecture4$Components(n);
            System.out.println(obj.adjacencyList);   
            System.out.println("Empty list has been made");
            System.out.println("Now calling makeGraph function so enter "+m+" pair of edges");
            obj.makeGraph(sc, m);
            System.out.println(obj.adjacencyList);
            int[] visitedArray= new int[n+1];
            for (int i = 1; i <= n; i++) {
                if (visitedArray[i]==0){
                    obj.sumComponent(i, visitedArray);
                }
            }
        }        
    }
}