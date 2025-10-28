package tree;

import java.util.LinkedList;
import java.util.Queue;

class LevelOrderTraversalPrint {
    int data;
    LevelOrderTraversalPrint left;
    LevelOrderTraversalPrint right;

    LevelOrderTraversalPrint(int data) {
        this.data = data;
    }
}

public class LevelOrderTraversalQueue {
    private static void print(LevelOrderTraversalPrint root) {
        if (root != null) {
            Queue<LevelOrderTraversalPrint> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                LevelOrderTraversalPrint currentNode = q.poll();
                System.out.println(currentNode.data);
                if (currentNode.left != null){
                    q.add(currentNode.left);
                }
                if(currentNode.right != null){
                    q.add(currentNode.right);
                }
            }
        }
    }


    private static void printNewLineAfterEveryLevel(LevelOrderTraversalPrint root) {
        if (root != null) {
            Queue<LevelOrderTraversalPrint> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (q.size() >1) {
                LevelOrderTraversalPrint currentNode = q.poll();
                if( currentNode == null){
                    System.out.println();
                    q.add(null);
                    continue;
                }
                System.out.print(currentNode.data+" ");
                if(currentNode.left != null){
                    q.add(currentNode.left);
                }
                if(currentNode.right != null){
                    q.add(currentNode.right);
                }
            }
        }
    }
    private static void printNewLineAfterEveryLevelOptimize(LevelOrderTraversalPrint root) {
        if (root != null) {
            Queue<LevelOrderTraversalPrint> q = new LinkedList<>();
            q.add(root);
            while ( !q.isEmpty()){
                int count = q.size();
                for(int i=0;i< count;i++){
                    LevelOrderTraversalPrint curr = q.poll();
                    System.out.print(curr.data+" ");
                    if(curr.left !=  null)
                        q.add(curr.left);
                    if(curr.right != null)
                        q.add(curr.right);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        LevelOrderTraversalPrint root = new LevelOrderTraversalPrint(1);
        root.left = new LevelOrderTraversalPrint(2);
        root.right = new LevelOrderTraversalPrint(3);
        root.left.left = new LevelOrderTraversalPrint(4);
        root.left.right = new LevelOrderTraversalPrint(5);
        root.right.left = new LevelOrderTraversalPrint(6);
        root.right.right = new LevelOrderTraversalPrint(7);

//        print(root);
//        printNewLineAfterEveryLevel(root);
        printNewLineAfterEveryLevelOptimize(root);

    }
}
