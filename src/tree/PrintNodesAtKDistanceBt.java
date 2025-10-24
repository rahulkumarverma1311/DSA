package tree;
class PrintNodeTillK{
    int data;
    PrintNodeTillK left;
    PrintNodeTillK right;
    PrintNodeTillK(int data){
        this.data = data;
    }
}
public class PrintNodesAtKDistanceBt {
    private static void print(PrintNodeTillK printNodeTillK,int k){
        if(printNodeTillK == null)
            return;
        if(k ==0)
            System.out.print(printNodeTillK.data + " ");
        else{
            print(printNodeTillK.left,k-1);
            print(printNodeTillK.right,k-1);
        }
    }
    public static void main(String[] args) {
        PrintNodeTillK root = new PrintNodeTillK(10);
        root.left = new PrintNodeTillK(20);
        root.left.left = new PrintNodeTillK(40);
        root.left.right = new PrintNodeTillK(50);
        root.right = new PrintNodeTillK(30);
        root.right.right = new PrintNodeTillK(70);
        root.right.right.right = new PrintNodeTillK(80);

        print(root,2);
    }
}
