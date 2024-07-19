package binarytree;
class Node{
    int val;
    Node right;
    Node left;
    Node(int data){
        this.val=data;
        this.right =null;
        this.left = null;
    }
}
public class sumOfAllNodes {
    static int sumAllNodes(Node r){
        if(r==null){
            return 0;
        }
        int x=sumAllNodes(r.left);
        int y=sumAllNodes(r.right);
        return x+y+r.val;
    }

    public static void main(String[] args) {
        Node r=new Node(9);
        r.left=new Node(6);
        r.right=new Node(15);
        r.left.left=new Node(13);
        r.left.right=new Node(65);
        r.right.left=new Node(54);
        System.out.println(sumAllNodes(r));

    }
    
}
