package binarytree;

public class levelOfTarget {
    
    static int levelTarget(Node r,int target){
        if(r==null){
            return -1;
        }
        if(r.val==target){
            return 0;
        }
        int x=levelTarget(r.left, target);
        if(x!=-1){
            return x+1;
        }
        int y=levelTarget(r.right, target);
        if(y!=-1){
            return y+1;
        }
        else{
            return -1;
        }

    }

    public static void main(String[] args) {
        Node r=new Node(9);
        r.left=new Node(6);
        r.right=new Node(15);
        r.left.left=new Node(13);
        r.left.left.left=new Node(17);
        r.left.right=new Node(65);
        r.right.left=new Node(54);
        System.out.println(levelTarget(r, 17));
        
    }
    
}
