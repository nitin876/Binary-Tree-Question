package binarytree;

public class heightOfTree {
    static int heightTree(Node r){
        if(r==null){
            return 0;
        }
        int x=heightTree(r.left);
        int y=heightTree(r.right);
        return Math.max(x, y)+1;
    } 
    public static void main(String[] args) {
        Node r=new Node(9);
        r.left=new Node(6);
        r.right=new Node(15);
        r.left.left=new Node(13);
        r.left.right=new Node(65);
        r.right.left=new Node(54);
        System.out.println(heightTree(r));
    }
    
}
