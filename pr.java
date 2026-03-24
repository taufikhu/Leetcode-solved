public class pr {


    class Node{

        String data;
        Node next ;

        public Node(String data){
            this.data = data;
            this.next =  null;
        }
    }


    Node head;

    public void addFirst(String data){

        Node newNode = new Node(data);

       newNode.next = head;         // 5, 2

       head = newNode;
    }

    public void addLast(String data){
     Node newNode = new Node(data);
     if(head == null){

            head = newNode;
     } 
     
     else{
        Node curr = head;

        while (curr.next != null) {

            curr = curr.next;
            
        }
        curr.next = newNode;
     }

    }
    public void printList(){

        if(head == null){
            System.out.println(" List is empty");
        }

         Node curr = head;

        while (curr!= null) {

            System.out.print(curr.data+ " -> ");

            curr = curr.next;
            
        }
        System.out.print(" Null ");
        
     }


        
   

    
    public static void main(String args[]){
        pr List = new pr();
        
        List.addFirst("is");
        List.addFirst("Taufik");
       

        List.addLast("good boy");
        List.printList();
    } 
}
