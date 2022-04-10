import java.util.*;
class BinaryNode<T> {
    T data;
    BinaryNode<T> left;
    BinaryNode<T> right;
    int flag=0;

    BinaryNode (T d){
        this.data=d;
    }
}

public class TreeTraversal<T> {
    BinaryNode<T> root;
    public void create(int[] arr, BinaryNode<T> r){
        // converts the arr to a tree.
        // makes a new tree and attach to instance variable root
        if(arr.length==0){
            return;
        }
        if(r==null){
            return;
        }
        else{
            // r=
        }
        
    }
    public void insert(BinaryNode<T> r){


    }
    public void preorder(BinaryNode<T> r){
        if (r==null){
            return;
        }
        System.out.println(r.data);
        preorder(r.left);
        preorder(r.right);
    }
    public void inorder(BinaryNode<T> r){
        if (r==null){
            return;
        }
        inorder(r.left);
        System.out.println(r.data);
        inorder(r.right);
    }
    public void postorder(BinaryNode<T> r){
        if (r==null){
            return;
        }
        postorder(r.left);
        postorder(r.right);
        System.out.println(r.data);
    }
    public static void main(String[] args){
        TreeTraversal<Integer> tr= new TreeTraversal<>();
        int ch;
        try(Scanner sc = new Scanner(System.in)){
            ch=sc.nextInt();
            while(ch!=0){
                if (ch<0){
                    
                }
                tr.insert(tr.root);


            }
        }
        
    }
}


/*
29 March
There are two tree traversal techniques:

depth first search
breath first search


In depth first search there are three traversal techniques 
1) preorder - DLR
2) inorder  - LDR
3) postorder -LRD

Whereas in breath first search there is only one
level order traversal


15, 8, 7, 10, 19, 16, 3, 5 convert to BST OR BT.



Question
input from user, (in while loop) Or (N element size based)
postive then insert else for negative we leave its spot(child) empty
user tells where to insert the value


*/

/* 
30/3
BINARY TREE

Representation - Two ways - by using array, by using LinkedlList.

negative element based creation of binary tree. **

operations:

insertion
deletion(replace with last leaf node)



if you are going to represent a biary tree by using an array
we will not utilize the zero index of the array
reason- to remove the mathematical complexity

rules:

for left child = 2*x 
for right child = 2*x+1    where x is the index for the given root element

*/
class BinaryTreeByArray{
    int arr[];
    int lastusedIndex;
    public BinaryTreeByArray(int size){
        arr= new int[size+1];
        lastusedIndex=0;
    }
    public void insert(int value){
        if (arr.length-1==lastusedIndex){
            System.out.println("Array is Full");
        }
        else{
            arr[lastusedIndex+1]=value;
            lastusedIndex++;
        }
    }
    public void traverse(int index){
        if (index>lastusedIndex){
            return;
        }
            System.out.println(arr[index]);//preorder
            traverse(index*2);
            traverse(index*2+1);

        
    }
    public int search(int value){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]==value){
                return i;
            }            
        }
        return -1;
    }
    public void delete(int value){
        arr[search(value)]=arr[lastusedIndex];
        lastusedIndex--;
        
    }
    public static void main(String[] args) {
        BinaryTreeByArray Tree= new BinaryTreeByArray(8);
        Tree.insert(10);
        Tree.insert(5);
        Tree.insert(7);
        Tree.insert(4);
        Tree.insert(6);
        Tree.insert(8);
        Tree.insert(9);
        Tree.insert(11);
        Tree.traverse(1);
        Tree.delete(7);
        Tree.traverse(1);
        // System.out.println(Arrays.toString(Tree.arr));
    }

}
// implementation of the Binary Tree
// choice for linked list or BT
// Traversal menu for all three traversals.


