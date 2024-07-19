package binarytree;

class Node{
    int val;
    Node left;
    Node right;
    Node(int data){
        this.left=null;
        this.right=null;
        this.val=data;
    }
}

public class leafNode {
    static void printLeafNode(Node r){
        if(r==null){
            return;
        }
        
        if(r.left== null && r.right ==null){
            System.out.println(r.val+" ");
        }
        if(r.left !=null){
            printLeafNode(r.left);}
        if(r.right != null){
            printLeafNode(r.right);
        }
    }

    public static void main(String[] args) {
        Node r=new Node(9);
        r.left=new Node(6);
        r.right=new Node(15);
        r.left.left=new Node(13);
        r.left.right=new Node(65);
        r.right.left=new Node(54);
        printLeafNode(r);
    }

    
}
