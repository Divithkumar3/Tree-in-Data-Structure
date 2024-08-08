class TreeNode {
    int value;
    TreeNode left,right;

    public TreeNode(int value){
        this.value=value;
        left=null;
        right=null;
    }
}
public class treetraversal{

    public void postOrderTraversal(TreeNode node){
        if(node != null){
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.println(node.value + " ");
        }
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.left.left=new TreeNode(40);
        root.left.right=new TreeNode(50);
        root.right.left=new TreeNode(60);
        root.right.right=new TreeNode(70);
        treetraversal tree=new treetraversal();
        System.out.print("Post-Order Traversal:");
        tree.postOrderTraversal(root);

    }
}
// class TreeNode {
//     int value;
//     TreeNode left,right;

//     public TreeNode(int value){
//         this.value=value;
//         left=null;
//         right=null;
//     }
// }
// public class treetraversal{

//     public void inOrderTraversal(TreeNode node){
//         if(node != null){
//             inOrderTraversal(node.left);
//             System.out.println(node.value + " ");
//             inOrderTraversal(node.right);
//         }
//     }
//     public static void main(String[] args) {
//         TreeNode root=new TreeNode(10);
//         root.left=new TreeNode(20);
//         root.right=new TreeNode(30);
//         root.left.left=new TreeNode(40);
//         root.left.right=new TreeNode(50);
//         root.right.left=new TreeNode(60);
//         root.right.right=new TreeNode(70);
//         treetraversal tree=new treetraversal();
//         System.out.print("In-Order Traversal:");
//         tree.inOrderTraversal(root);

//     }
// }
// public class treetraversal{

//     public void preorder(TreeNode node){
//         if(node != null){
//             System.out.print(node.value+" ");
//             preorder(node.left);
//             preorder(node.right);
//         }
//     }

//     public static void main(String[] args){
//         TreeNode root=new TreeNode(50);
//         root.left = new TreeNode(30);  
//         root.right = new TreeNode(70);  
//         root.left.left = new TreeNode(20);  
//         root.left.right = new TreeNode(40);  
//         root.right.left = new TreeNode(60);  
//         root.right.right = new TreeNode(80);
//         treetraversal tree=new treetraversal(); 
//         System.out.print("Pre Order Traversal:");
//         tree.preorder(root);

//     }
// }

        