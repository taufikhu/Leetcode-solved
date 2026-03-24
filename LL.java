public class LL{

 class Node{

    int data;

    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

}
  Node head;
  public void add(int data){

  Node newNode = new Node(data);
     if(head == null){

        
        head = newNode;    
    }

    else {

        Node curr = head;

        while (curr.next != null) {

            curr = curr.next;

            
        }
        curr.next = newNode;
    }

}

public void printList(){
    Node curr = head;

    while (curr !=null) {
        System.out.print(curr.data+" -> ");
        curr = curr.next;
        
    }
    System.out.print("Null");
}

    public static void main(String[] args) {
        LL nums = new LL();

        nums.add(7);
        nums.add(4);
        nums.add(9);
        nums.add(102);

        nums.printList();
    }
}