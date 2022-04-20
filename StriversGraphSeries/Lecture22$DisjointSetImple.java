import java.util.*;
class Disjoint{
    int[] parent;
    int[] rank;
    Disjoint(int n){
        parent=new int [n];
        // everyone is its own parent
        for (int i = 0; i < parent.length; i++) {
            parent[i]=i;
            
        }
        System.out.println("This is the Parent array");
        System.out.println(Arrays.toString(parent));
        rank=new int[n];
        // rank is 0 for each element in the beginning

    }


    public int find(int index){
        if (parent[index]==index){
            return index;
        }
        return find(parent[index]);
    }


    public int findParentOptimal(int index){
        if (parent[index]==index){
            return index;
        }
        parent[index]=findParentOptimal(parent[index]);
        return parent[index];
    }


    // public int findParentOptimal(int index){
    //     if (parent[index]!=x){
    //         parent[x]=find(parent[x])
    //     }
    // }


    public void union(int u, int v){
        u=findParentOptimal(u);
        v=findParentOptimal(v);
        if (rank[u]>rank[v]){
            // u has more rank so we combine v's component with u
            parent[v]=u;
            // parent[v]=parent[u]; // isn't this more optimised?

        }
        else if (rank[u]<rank[v]){
            parent[u]=v;
        }
        else{
            parent[v]=u;
            // since I attached v to u when they were of equal ranks
            rank[u]++;
        }
    }
}

public class Lecture22$DisjointSetImple{
    public static void printMenu(){
        System.out.println("Enter 1 for union then enter two nodes to combine, \n Enter 2 to compare Components \n Enter 3 to exit");
    }

    public static void compareComponent(int u, int v, Disjoint Set){
        
            if (Set.findParentOptimal(u)==Set.findParentOptimal(v)){
            // if(Set.find(u)==Set.find(v)){
                System.out.println("Same Component");
            }
            else{
                System.out.println("Different Component");
            }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the size of the union set");
            Disjoint Set= new Disjoint(sc.nextInt());
            printMenu();
            int ch=sc.nextInt();
            while(true){
                switch(ch){
                    
                    case 1 -> Set.union(sc.nextInt(), sc.nextInt());
                    case 2 -> compareComponent(sc.nextInt(), sc.nextInt(), Set);  
                    default -> System.out.println("Wrong choice");                  
                }
                printMenu();
                ch= sc.nextInt();
                if (ch==3){
                    break;
                }
                
            }
            // compare two nodes components:
            
            
        }
    }
}