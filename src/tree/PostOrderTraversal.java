package tree;
class PostOrder{
    int data;
    PostOrder left;
    PostOrder right;
    PostOrder(int data){
        this.data=data;
    }
}

public class PostOrderTraversal {
    private static void postOrder(PostOrder node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data);
        }
    }
    public static void main(String[] args) {
        PostOrder node = new PostOrder(10);
        node.left = new PostOrder(20);
        node.right = new PostOrder(30);
        node.right.left = new PostOrder(40);
        node.right.right = new PostOrder(50);

        postOrder(node);
    }
}
