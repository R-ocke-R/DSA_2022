import java.util.*;
class Nodethree{
    int u;
    int v;
    int w;
    Nodethree(int u_, int v_, int w_){
        u=u_;
        v=v_;
        w=w_;
    }
}

class SortHelper implements Comparator<Nodethree> {
    @Override
    public int compare(Nodethree n1, Nodethree n2){
        return n1.w-n2.w;
    }
}

public class Lecture23$Kruskals_Algo {
    public static void Kruskal(ArrayList<Nodethree> adj){
        Collections.sort(adj, new SortHelper());

        Disjoint set = new Disjoint(6);

        int totalCost=0;
        ArrayList<Nodethree> mst= new ArrayList<>();

        for (Nodethree t : adj) {
            // just check if t.u and t.v belong to the same component or not
            if(set.findParentOptimal(t.u)!=set.findParentOptimal(t.v)){
                mst.add(t);
                set.union(t.u, t.v);
                totalCost+=t.w;
            }
            
        }
        System.out.println("Total Cost of the mst formed out the the given Graph is" +totalCost);


    }
    public static void main(String[] args) {
        // storing the graph in an Arraylist< Node> 
        ArrayList<Nodethree>ad= new ArrayList<>() ;
        ad.add(new Nodethree(0 , 1, 2));
        ad.add(new Nodethree(0 , 3, 6));
        ad.add(new Nodethree(1 , 3, 8));
        ad.add(new Nodethree(1 , 2, 3));
        ad.add(new Nodethree(1 , 4, 5));
        ad.add(new Nodethree(2 , 4, 7));

        // Graph has been made, next is to make a Disjoint set
        Kruskal(ad);
        

        

    }
}
