package binarytree;
import java.util.*;
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
public class bin9 {
    static Node createSampleTree(){
        Node r=new Node(10);
        r.left=new Node(8);
        r.left.left=new Node(2);
        r.left.right=new Node(9);
        r.right=new Node(20);
        r.right.left=new Node(16);
        r.right.right=new Node(18);
        r.right.left.right=new Node(40);
        return r;
    }
    static int evenCount(Node r,int cnt){
    
        if(r==null){
            return 0;
        }
        if(r.val % 2==0){
            cnt=cnt+1;
            return 1+evenCount(r.left,cnt)+evenCount(r.right,cnt);
        }
        else{
        return evenCount(r.left,cnt)+evenCount(r.right,cnt);
        }
        
    }
    static int oddCount(Node r,int oddcnt){
    
        if(r==null){
            return 0;
        }
        if(r.val % 2!=0){
            oddcnt=oddcnt+1;
            return 1+oddCount(r.left,oddcnt)+oddCount(r.right,oddcnt);
        }
        else{
        return oddCount(r.left,oddcnt)+oddCount(r.right,oddcnt);
        }
        
    } 
    
    
    public static void main(String[] args) {
        Node r=createSampleTree();
        System.out.println("the even number is : "+evenCount(r, 0));
        System.out.println("the odd number is : "+oddCount(r, 0));
        
        
    }

    
}
