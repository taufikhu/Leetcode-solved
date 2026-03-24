

 class Node{
    int data;
    Node next;

   Node(int data){

        this.data = data;
        this.next = null;

    }
}

class LinkedList{
    Node head  = null;

    public void add(int data){

        Node newNode = new Node(data);

        if(head==null){

        head = newNode;
        return;
        }
        else{

        Node curr = head;
       
        while(curr.next!=null){

            curr = curr.next;

        }
        curr.next = newNode;
    
    }
}

public void printList(){

        if(head==null){

        System.out.println(" List is empty");

        return;
        }
        else{

        Node curr = head;
       
        while(curr!=null){
        System.out.print(curr.data+ " -> ");
        curr = curr.next;

        }
        System.out.print("Null");
    
    }

}


}


public class lee {
    public static void main(String args[]){

        LinkedList list = new LinkedList();

        list.add(8);
        list.add(7);
        list.add(5);
        list.printList();
      

    }
    
}
