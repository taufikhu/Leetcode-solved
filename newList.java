public class newList {

    private int size;

    newList(){
        this.size = 0;
    }

    class Node{

        String data;
        Node next;

        public Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    Node head;

    public void addFirst(String data){

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;

    }

    public void addLast(String data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }

        else {

            Node curr = head;

            while (curr.next!=null) {
                curr = curr.next;
                
            }
            curr.next = newNode;
        }
    }
    //delete first

    public void deleteFirst(){

        if(head == null){
            System.out.println(" list is empty");
            return;
        }

        head = head.next;
        size--;
    }

    public void deleteLast(){
         if(head == null){
            System.out.println(" list is empty");
            return;
        }
        size--;
        
        if(head.next==null){
            head = null;
            return;
        }
        

            Node sLast = head;
            Node lastNode = head.next;

            while (lastNode.next!=null) {
                sLast = sLast.next;
                lastNode = lastNode.next;                
            }
           sLast.next = null;

    
    }

    public void printList(){
        
        if(head == null){
           System.out.println(" List is empty");
        }

        else {

            Node curr = head;

            while (curr!=null) {
                System.out.print(curr.data+ " -> ");
                curr = curr.next;
                
            }
          System.out.println(" null ");
        }
    }

    public int getSize(){

        return size;
    }

    public static void main(String args[]){


        newList list = new newList();


        list.addFirst("is");
        list.addFirst("Taufik");
        list.addLast("King");
        list.deleteLast();
        list.deleteLast();
        list.deleteLast();
        list.addFirst("Look");
        list.printList();
        
        System.out.println(list.getSize());
    }
    
}
