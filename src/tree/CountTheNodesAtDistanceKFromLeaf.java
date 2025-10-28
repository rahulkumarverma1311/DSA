package tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class CountTheNodeAtDistanceFromLeafNode {
    int data;
    CountTheNodeAtDistanceFromLeafNode left;
    CountTheNodeAtDistanceFromLeafNode right;

    CountTheNodeAtDistanceFromLeafNode(int data) {
        this.data = data;
    }

}

 class Solution {

     Set<CountTheNodeAtDistanceFromLeafNode> specialNode = new HashSet<>();

     int kthFromLeaf(CountTheNodeAtDistanceFromLeafNode root, int k) {
         List<CountTheNodeAtDistanceFromLeafNode> path = new ArrayList<>();
         solve(root, k, path);
         return specialNode.size();
     }

     private  void solve(CountTheNodeAtDistanceFromLeafNode root, int k, List<CountTheNodeAtDistanceFromLeafNode> path) {
         if (root == null)
             return;
         path.add(root);
         if (root.left == null && root.right == null) {
             int index = path.size() - k - 1;
             if (index >= 0) {
                 specialNode.add(path.get(index));
             }
         } else {
             solve(root.left, k, path);
             solve(root.right, k, path);
         }
         path.remove(path.size() - 1);
     }
 }
    public class CountTheNodesAtDistanceKFromLeaf {
        public static void main(String[] args) {
            Solution solution = new Solution();
            CountTheNodeAtDistanceFromLeafNode root = new CountTheNodeAtDistanceFromLeafNode(2);
            root.left = new CountTheNodeAtDistanceFromLeafNode(2);
            root.right = new CountTheNodeAtDistanceFromLeafNode(3);

            root.left.left = new CountTheNodeAtDistanceFromLeafNode(4);
            root.left.right = new CountTheNodeAtDistanceFromLeafNode(5);

            root.right.left = new CountTheNodeAtDistanceFromLeafNode(6);
            root.right.right = new CountTheNodeAtDistanceFromLeafNode(7);

            root.right.left.right = new CountTheNodeAtDistanceFromLeafNode(8);


            int k = 2;
            int count = solution.kthFromLeaf(root, k);

            System.out.println(count);
        }


    }

