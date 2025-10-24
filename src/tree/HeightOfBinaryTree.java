package tree;
class HeightBt{
    int data;
    HeightBt left;
    HeightBt right;
    HeightBt(int date){
        this.data = date;
    }
}
public class HeightOfBinaryTree {
    private static int heightOfBt(HeightBt heightBt){
        if(heightBt == null){
            return 0;
        }
        return Math.max(heightOfBt(heightBt.left),heightOfBt(heightBt.right) )+ 1;
    }
    public static void main(String[] args) {
        HeightBt node = new HeightBt(10);
        node.left= new HeightBt(8);
        node.right= new HeightBt(30);
        node.right.left= new HeightBt(40);
        node.right.right= new HeightBt(50);
        System.out.println("The Height of Binary Tree is : "+ heightOfBt(node));
    }
}
