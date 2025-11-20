//package Tree;
//import java.util.*;
//class TreeNode{
//    int value;
//    List<TreeNode> children = new ArrayList<>();
//
//    TreeNode(int value ){this.value=value;}
//}
//public class treeUsingArray {
//    public static TreeNode buildTree(int[]parent){
//        int n= parent.length;
//        TreeNode[]nodes = new TreeNode[n];
//        TreeNode root = null;
//
//        for(int i=0;i<n;i++){
//            nodes[i]=new TreeNode(i);
//        }
//        for(int i=0;i<n;i++){
//            int p= parent[i];
//            if(p== -1){
//                root = nodes[i];
//            }else{
//                nodes[p].children.add(nodes[i]);
//            }
//        }
//        return root;
//    }
//
//    public static void preorder(TreeNode node){
//        if(node == null)return;
//        System.out.println(node.value + " ");
//        for(TreeNode child : node.children)
//            preorder(child);
//    }
//
//    public static void main(String[]args){
//        int[] parent = { -1, 0, 0, 1, 1, 4 };
//        TreeNode root = buildTree(parent);
//        System.out.println("Preorder traversal");
//        preorder(root);
//    }
//}