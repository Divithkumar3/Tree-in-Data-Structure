
class TreeNode{
    int value;
    TreeNode right;
    TreeNode left;

    public TreeNode(int value){
       this.value=value;
       left = null;
       right=null;
    }
}

public class tree1 {
   public static void main(String[] args) {
       TreeNode root = new TreeNode(4);
       root.left=new TreeNode(2);
       root.right=new TreeNode(5);
       root.left.left=new TreeNode(3);
       root.right.left=new TreeNode(7);
       root.right.right=new TreeNode(6);
       root.right.right.left=new TreeNode(8);
       root.left.left.right=new TreeNode(9);
       root.left.left.right.left=new TreeNode(1);
       

       System.out.println("In-Order Traversal:");
       inOrderTraversal(root); 

       System.out.println("Pre-Order Traversal:");
       preOrderTraversal(root);

       System.out.println("Post-Order Traversal");
       postOrderTraversal(root);
   }

   public static void inOrderTraversal(TreeNode node){
       if (node != null){
           inOrderTraversal(node.left);
           System.out.print(node.value+" ");
           inOrderTraversal(node.right);
       }
   }

   public static void preOrderTraversal(TreeNode node){
       if(node != null){
           System.out.print(node.value+" ");
           preOrderTraversal(node.left);
           preOrderTraversal(node.right);
       }
   }

   public static void postOrderTraversal(TreeNode node){
       if(node != null){
           postOrderTraversal(node.left);
           postOrderTraversal(node.right);
           System.out.print(node.value+" ");
       }
   }
}


// class TreeNode{
//     int value;
//     TreeNode left, right;
//     public TreeNode(int value){
//         this.value = value;
//         left=right=null;
//     }
// }

// class tree1 {

//     public static void inorder(TreeNode key){
//         if(key!=null){
            
//         inorder(key.left);
//         System.out.print(key.value+" ");
//         inorder(key.right);

//         }
//     }
//     public static void preorder(TreeNode key){
//         if(key!=null){
//         System.out.print(key.value+" ");
//         preorder(key.left);
//         preorder(key.right);
//         }

//     }

//     public static void postorder(TreeNode key){
//         if(key!=null){ 
//         postorder(key.left);
//         postorder(key.right);
//         System.out.print(key.value+" ");
//     }
// }

//     public static void main(String[] args){
//         TreeNode root = new TreeNode(1);
//             root.left=new TreeNode(2);
//             root.right=new TreeNode(3);
//             root.left.left=new TreeNode(4);
//             root.left.right=new TreeNode(5);
//             root.right.left=new TreeNode(6);
//             root.right.right=new TreeNode(7);
//             root.left.right.left=new TreeNode(8);
//             root.right.right.left=new TreeNode(9);
//             root.right.right.right=new TreeNode(10);
        
       
//         System.out.println("Inorder: ");
//         inorder(root);

//         System.out.println("Preorder: ");
//         preorder(root);

//         System.out.println("Postorder: ");
//         postorder(root);
//     }
// }
