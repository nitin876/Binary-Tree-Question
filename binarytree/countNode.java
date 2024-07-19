package binarytree;

public class countNode{
    static int countN(Node r){
        if(r==null){
            return 0;
        }
        int x=countN(r.left);
        int y=countN(r.right);
        return x+y+1;

    }

    public static void main(String[] args) {
        Node r=new Node(9);
        r.left=new Node(6);
        r.right=new Node(15);
        r.left.left=new Node(13);
        r.left.right=new Node(65);
        r.right.left=new Node(54);
        System.out.print(countN(r));
    }
}