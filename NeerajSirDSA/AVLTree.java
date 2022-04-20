import java.util.*;
import java.lang.Math;


/* 
height = max(height(root.left)-height(root.right))
balancing factor= height(root.left) - height(root.right)
*/

class AVLNode{
    int data;
    AVLNode left;
    AVLNode right;
    int heigth;
    int balance;
    AVLNode(int data){
        this.data=data;
        this.heigth=-1;
        this.balance=0;        
    }
}

public class AVLTree {

    public static void heigth(AVLNode r){
        heigth(r.left);
        heigth(r.right)
        r.heigth= Math.max(r.left.heigth, r.right.heigth);
        return;
    }
    
    public static void balaningFactor(AVLNode r){
        r.balance= r.left.heigth - r.right.heigth;

    }

    public static AVLNode RightRotation(AVLNode r){
        AVLNode temp= new AVLNode(r.left.data);
        // have to consider the cases where apart from the three nodes into consideration, there are more nodes attached.




        return r;


    }
    
    public static AVLNode LeftRotation(AVLNode r){
        return r;
    }

    public static AVLNode LeftRightRotation(AVLNode r){
        return r;
    }

    public static AVLNode RightLeftRotation(AVLNode r){
        return r;
    }
    
    public static void main(String[] args){
        
    }
    
}


/*

It is a self balancing binary search tree, 
where the difference between heights of left subtree and right subtree
cannot be more than 1, or all nodes, this difference is called balanced factor,
a tree is said to be AVL tree,if balancing factor is 0, 1 or -1

it contains all binary search tree properties 

to Calculate balancing factor, 
height of left subtree - height of right subtree.


pure advantage- minimum height of BST. which improves the complexity of search operation.

AVL comes from three scientists, ADELSON, VELSKY, LANDIS.

depending on the input data, a binary search tree, can be get skewed( left or right skewed)
and hence its performance starts going down, instead of BIG  O (log n ) for insertion, searching and deleting
it can go upto BIG O (N), AVL TREE attempts to solvee this problem, of skewing by introducing the concept of 
rotation, there are two types of rotations, 1) single rotation 2) double rotation.


1) single rotation
there are two categories of single rotation, left rotation and right rotation

2) double rotation
there are two categories left right and right left rotation.


--LEFT ROTATION
(right skewed tree is shifted by one)
TO make a balance we use LL rotation, (or L rotation) which moves one node one position towards left. 

        1
            2   
                3


                changed to



            2
        1       3



-- RIGHT ROTATION

in right rotation every node moves one position to right from the current position





            3
        2
    1

    changed to 


        2
    1       3


    here each is shifted to the right




--LEFT RIGHT ROTATION

IT IS A SEQUENCE OF SINGLE LEFT ROTATION, FOLLOWED BY A SINGLE RIGHT ROTATION

        3
    1
        2

    converted to 

            3
        2
    1

    then 

        2
    1       3



-- RIGHT LEFT ROTATION:


IT IS A SEQUENCE OF SINGLE RIGHT ROTATION, FOLLOWED BY A SINGLE LEFT ROTATION.

        1
            3
        2

    CONVERTED TO 

        1
            2
                3

    
    THEN

            2
        1       3



NOTE- THE RULES OF BST SHOULD NOT BE VIOLATED.


CONSTRCT THE AVL TREE FOR THE FOLLOWING VALUES


30 20 40 10 5 3 4 50 60 70 65




                                30
                            20      40




ENTER 3 NODES, CALCULATE BALANCING FACTOR, ROTATE ACCORDING, NOW ADD THE NEXT ELEMENT, 


IN THE END CHECK THE RULES OF BST.( NOT NEEDED, ROTATION WILL NEVER VIOLATE THE BST RULES.)


*/