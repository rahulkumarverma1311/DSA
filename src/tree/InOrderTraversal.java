package tree;
class InOrder{
    int data;
    InOrder left;
    InOrder right;
    InOrder (int data){
        this.data= data;
    }
}

public class InOrderTraversal {
    private static void inorder(InOrder node){
        if(node != null ){
            inorder(node.left);
            System.out.println(node.data);
            inorder(node.right);
        }
    }
    public static void main(String[] args) {
        InOrder node = new InOrder(10);
        node.left = new InOrder(20);
        node.right = new InOrder(30);
        node.right.left = new InOrder(40);
        node.right.right = new InOrder(50);

        inorder(node);
    }
}
