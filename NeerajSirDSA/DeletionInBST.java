public class DeletionInBST {
    
    public static int min(BinaryNode<Integer> root){
        if (root.left== null){
            return root.data;
        }
        return min(root.left);

    }
    public static int max(BinaryNode<Integer> root){
        if (root.right==null)
        {
            return root.data;
        }
        return max(root.right);
    }

    public static BinaryNode<Integer> Delete(BinaryNode<Integer> root, int val){
        if (root==null){
            return root;
        }
        else if (val<root.data){
            root.left=Delete(root.left, val);
        }
        else if (val>root.data){
            root.right=Delete(root.right, val);
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            else if(root.left== null && root.right !=null){
            // else if (root.left== null)
                return root.right;
            }
            else if (root.right== null && root.left!=null){
                return root.left;
            }
            else{
                // when both root.right and root.left have elements i.e. 2 child are present
                // for the node which needs to be deleted.
                
                int minimum= min(root.right);// take the minimum from the right subtree or the max of the left subtree.
                root.data=minimum;
                root.right=Delete(root.right, minimum);
            }

        }
        return root;
    }

    public static void main(String[] args) {
        
    }
    
}

/*

Deletion Concept + Constraints.

1: the node which you are going to delete is the lead node, 
2: the node which you are going to delete is having one child.
3: the node which you are going to delete is having two child.

values:

                6

        2               9

    1       4       8         13

           3      7        11   18

case 1 deletion of 3


                6
              /   \
            /       \
          /           \
        2               9
      /   \           /   \
    1       5       8       13
           /        /       / \
          4        7      11   18
        /
      3


case 2 deletion of 5


                6
        
        2               9

    1             8       15

                7      13   18

                     11

         
case 3 deletion of 15.


16, 19, 10, 6, 40, 2, 11, 12, 7, 70, 20, 15, 
Construct an AVL Tree, with complete steps, 




*/