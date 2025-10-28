package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node1 {
    int data;
    Node1 left, right;

    Node1(int item) {
        data = item;
        left = right = null;
    }
}
class Solution1 {
    public ArrayList<ArrayList<Integer>> levelOrder(Node1 root) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        if(root != null){
            ArrayList<Integer> currentNode =new ArrayList<>();
            Queue<Node1> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                Node1 curr = q.poll();
                currentNode.add(curr.data);
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
            res.add(currentNode);
        }
        return res;
    }
}
public class LevelOrderTraversalProb {

    public static void main(String[] args) {

    }
}
