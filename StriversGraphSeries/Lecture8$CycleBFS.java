public class Lecture8$CycleBFS {
    public static void main(String[] args) {
        Graph g= new Graph();
        
        // using Graph class form lecture7$Cycle.

        int[] visitedArray= new int[g.n+1];
        
        // here visited array is going to store the parent index and not 1 for visited
        
        for (int i = 1; i < g.n+1; i++) { 
            if (visitedArray[i]==0)  
            {g.bfsforCycle(i, visitedArray);}
            
            // just one thing not covered is that after control is returned some of the nodes can be left unvisited and then bfs is called for them.
            // can control that with any boolean flag.
        
        }
    }
}
