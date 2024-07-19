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
public class targetFind {
    static boolean findTarget(Node r,int target){
        if(r==null){
            return false;
        }
        if(r.val==target){
            return true;
        }

        boolean x=findTarget(r.left, target);
        if(x){
            return true;
        }
        boolean y=findTarget(r.right, target);
        return x||y;

    }

    public static void main(String[] args) {
        Node r=new Node(9);
        r.left=new Node(6);
        r.right=new Node(15);
        r.left.left=new Node(13);
        r.left.right=new Node(65);
        r.right.left=new Node(54);
        System.out.println(findTarget(r, 9));
        
    }

    
}
