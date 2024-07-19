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
public class mirrorTreeNodes {
    static void mirrorTree(Node r){
        if(r==null){
            return;
        }
        Node temp=r.left;
        r.left=r.right;
        r.right=temp;
        mirrorTree(r.left);
        mirrorTree(r.right);

    }
    static void printInorder(Node r) {
        if (r.left != null) {
            printInorder(r.left);
        }
        System.out.print(r.val + " ");
        if (r.right != null) {
            printInorder(r.right);
        }
    }

    public static void main(String[] args) {
        Node r=new Node(9);
        r.left=new Node(6);
        r.right=new Node(15);
        r.left.left=new Node(13);
        r.left.right=new Node(65);
        r.right.left=new Node(54);
        mirrorTree(r);
        printInorder(r);
        
    }


    

    
}
