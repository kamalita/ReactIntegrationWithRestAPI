package RegularProgramming;

public class LinkedList {
    public static void main(String[] args) {
        //List<Node> list=new LinkedList<>();
        Node node=new Node(23);

        System.out.println(node.data+"->");

    }

}

class Node{
    public static Node next;
    public int data;

    Node( int data){
        this.data=data;
        next=null;
    }
}
