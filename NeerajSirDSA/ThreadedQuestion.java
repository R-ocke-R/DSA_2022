import java.util.*;
class MyNode{
    private String phone;
    private MyNode left ;
    private MyNode right;
    private boolean rightThread;
    MyNode(String phone){
        this.phone=phone;
    }
    public String getPhone(){
        return phone;
    }
    public MyNode getLeft(){
        return left;
    }
    public MyNode getRight(){
        return right;
    }
    public boolean getRightThread(){
        return rightThread;
    }
    public void setLeft(MyNode left){
        this.left=left;
    }
    public void setRight(MyNode right){
        this.right=right;
    }
    public void setThread(boolean thread){
        this.rightThread=thread;
    }
}

public class ThreadedQuestion {
    
    public static void main(String[] args) {

        try(Scanner sc= new Scanner(System.in)){
            // int n= sc.nextInt();
            // for (int i = 0; i < n; i++) {                
            // }
            String s= new String();
            s=sc.next();
            

        }
    }
    
}

class solution
{
static class Node
{
     Node left, right;
    int info;
   
    // False if left pointer points to predecessor
    // in Inorder Traversal
    boolean lthread;
   
    // False if right pointer points to successor
    // in Inorder Traversal
    boolean rthread;
};
   
// Insert a Node in Binary Threaded Tree
static Node insert( Node root, int ikey)
{
    // Searching for a Node with given value
    Node ptr = root;
    Node par = null; // Parent of key to be inserted
    while (ptr != null)
    {
        // If key already exists, return
        if (ikey == (ptr.info))
        {
            System.out.printf("Duplicate Key !\n");
            return root;
        }
   
        par = ptr; // Update parent pointer
   
        // Moving on left subtree.
        if (ikey < ptr.info)
        {
            if (ptr . lthread == false)
                ptr = ptr . left;
            else
                break;
        }
   
        // Moving on right subtree.
        else
        {
            if (ptr.rthread == false)
                ptr = ptr . right;
            else
                break;
        }
    }
   
    // Create a new node
    Node tmp = new Node();
    tmp . info = ikey;
    tmp . lthread = true;
    tmp . rthread = true;
     
    if (par == null)
    {
        root = tmp;
        tmp . left = null;
        tmp . right = null;
    }
    else if (ikey < (par . info))
    {
        tmp . left = par . left;
        tmp . right = par;
        par . lthread = false;
        par . left = tmp;
    }
    else
    {
        tmp . left = par;
        tmp . right = par . right;
        par . rthread = false;
        par . right = tmp;
    }
   
    return root;
}
   
// Returns inorder successor using rthread
static  Node inorderSuccessor( Node ptr)
{
    // If rthread is set, we can quickly find
    if (ptr . rthread == true)
        return ptr.right;
   
    // Else return leftmost child of right subtree
    ptr = ptr . right;
    while (ptr . lthread == false)
        ptr = ptr . left;
    return ptr;
}
   
// Printing the threaded tree
static void inorder( Node root)
{
    if (root == null)
        System.out.printf("Tree is empty");
   
    // Reach leftmost node
     Node ptr = root;
    while (ptr . lthread == false)
        ptr = ptr . left;
   
    // One by one print successors
    while (ptr != null)
    {
        System.out.printf("%d ",ptr . info);
        ptr = inorderSuccessor(ptr);
    }
}
   
// Driver Program
public static void main(String[] args)
{
     Node root = null;
   
    root = insert(root, 20);
    root = insert(root, 10);
    root = insert(root, 30);
    root = insert(root, 5);
    root = insert(root, 16);
    root = insert(root, 14);
    root = insert(root, 17);
    root = insert(root, 13);
   
    inorder(root);
} 
}
/*
13/4
Class MyNode{
    private String Phone
    Private Node Left 
    private Node Right
    private boolean rightthread;
    constructor, getter, setter
}

//  get input from the user, specfically for the data;

inorderal traversal  ke baad convert karo to integer, then check if validate, else dont print and end.

"one two triple three penta five" as a string, now add this as a tree, then convert (with traveral ) to integer number. then validate.

*/


/* 

M WAY BINARY SEARCH TREE   ONLY INTRODUCTION IN SYLLABUS.
example if 3 way bst then each node has 3 refrences of child nodes, and two data fields, 
the Binary search conditions are specified accordingly.

employee duration:
print the description
through threaded binary tree, 
fields are name, salary, duration, department.





*/

class EMP{
    String name;
    int salary;
    int duration;
    String department;
    EMP(String name, int salary, int duration, String department){
        this.name= name;
        this.salary=salary;
        this.duration=duration;
        this.department=department;
    }
}



class employeeNode{
    
    EMP data;

    employeeNode left;
    employeeNode right;

    boolean rightThread;
    
    employeeNode(String name,int salary,int duration, String department){
        EMP data= new EMP(name, salary, duration, department);
    }
}


