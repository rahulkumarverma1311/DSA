package tree;

import java.util.ArrayList;

class NodePreorderTraversal {
    int data;
    NodePreorderTraversal left;
    NodePreorderTraversal right;

    NodePreorderTraversal(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}


public class PreorderTraversal {
    private static ArrayList<Integer> preOrder(NodePreorderTraversal root) {
        //  code here
        ArrayList<Integer> res = new ArrayList<>();
        helper(root,res);
        return res;
    }
    private  static void helper(NodePreorderTraversal root,ArrayList<Integer>res){
        if(root == null){
            return ;
        }
        res.add(root.data);
        helper(root.left,res);
        helper(root.right,res);

    }

    public static void main(String[] args) {
        NodePreorderTraversal node = new NodePreorderTraversal(10);
        node.left = new NodePreorderTraversal(20);
        node.right = new NodePreorderTraversal(30);
        node.right.left = new NodePreorderTraversal(40);
        node.right.right = new NodePreorderTraversal(50);

        ArrayList<Integer> ans = preOrder(node);
        for(Integer n :  ans){
            System.out.println(n +" ");
        }
    }
}
