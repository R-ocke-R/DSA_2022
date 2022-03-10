import java.util.*;

class degreeva{
    int va;
    int indeg;
    degreeva(){
        va=0;
        indeg=0;
    }
}
public class Lecture13$TopoKahns {

    public static void indegree(ArrayList<ArrayList<Integer>> adj, degreeva[] va, int index){
        
        Queue<Integer> q= new LinkedList<Integer>();
        q.add(index);
        va[index].va=1;

        while (q.size()!=0){
            for (Integer node : adj.get(q.remove())) {
                va[node].indeg+=1;
                if (va[node].va==0){
                    q.add(node);
                    va[node].va=1;
                }              
            }
        }

    }
    
    public static int[] indegreeOp(ArrayList<ArrayList<Integer>> adj){
        // Optimized function to calculate the indegree of each node without using any traversal technical, using adj.
        int[] indeg= new int[adj.size()];
        for(int i=1; i<adj.size();i++){
            for (Integer ina : adj.get(i)) {
                indeg[ina]+=1;
                
            }
        }
        return indeg;

    }
    
    public static int[] Kahn(ArrayList<ArrayList<Integer>> adj, degreeva[] va){
        Queue<Integer> sq= new LinkedList<Integer>();
        int[] sort= new int[va.length];
        int j=0;
        for (int i = 0; i < va.length; i++) {
            // will search for nodes with 0 indegree
            // and add to start queue
            if (va[i].indeg==0){ 
                sq.add(i);
            }            
        }
        while (sq.size()!=0){
            int node=sq.poll();
            sort[j++]=node;
            for (Integer integer : adj.get(node)) {
                va[integer].indeg-=1;
                if (va[integer].indeg==0){
                    sq.add(integer);
                }
            }           
        }
        return sort;
    }
    
    public static void main(String[] args) {
        // First I need a Directed Graph
        dGraph g= new dGraph();
        degreeva[] va= new degreeva[g.n+1];
        // indegreeOp(g.adj);
        for (int i = 0; i < va.length; i++) {
            va[i]=new degreeva();
        }
        for (int i = 1; i < va.length; i++) {
            if(va[i].va==0){
                indegree(g.adj, va, i);
            }
        }
        // fill va with indegree
        
        System.out.println(Arrays.toString(Kahn(g.adj, va)));
    }       
}
