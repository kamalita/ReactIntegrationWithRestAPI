package RegularProgramming;

public class LinkedList {
     Node head;
    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        list=list.add(list,12);
        list=list.add(list,22);
        list=list.add(list,32);
        list=list.add(list,42);
        list=list.add(list,52);

        printList(list);

    }


    public static void printList(LinkedList list){
        Node currNode=list.head;
        while(currNode.next!=null){
            System.out.println(currNode.data);
            currNode=currNode.next;
        }
    }

    LinkedList add(LinkedList list,int data){
        Node newNode=new Node(data);
        if(list.head==null){
            list.head=newNode;
        }
        else{
            Node last=list.head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=newNode;
        }
        return list;
    }



    class Node{
         Node next;
         int data;

        Node( int data){
            this.data=data;
            next=null;
        }
    }



}

