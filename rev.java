public class rev{


    class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next = null; 

        }
    }
    Node head;

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){

        head = newNode;
        return;
        }
        else {

            Node curr = head;

            while (curr.next!=null) {

                curr= curr.next;
                
            }
            curr.next = newNode;
        }

    }


    public void reverse(){
    
        Node pre = null;
        Node curr = head;
        while(curr!=null){
            Node next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next; 
        }
        head = pre;
        
    }

    public void deletefirst(){

        Node newNode = new Node(0);

        if (head == null){
            System.out.println("empty");
            return;
        }
        head = head.next;

    }
     public void deleteLast(){

        

       if (head == null){
            System.out.println("empty");
            return;
        }

        if (head.next == null){
            head = null;
            return;
        }
       

            Node sNode = head;
            Node lNode = head.next;
            while (lNode.next!=null) {
                sNode = sNode.next;
                lNode = lNode.next;
                
            }
            sNode.next = null;
           
        
     }

    public void printList(){


        if(head == null){
            System.out.println("List is empty");

        }

        else{
            Node curr = head;
            while (curr!=null) {
                System.out.print(curr.data+" -> ");
                curr = curr.next;
            }
            System.out.print("Null");
        }
    }
    public static void main(String[] args) {

        rev list = new rev();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

list.deleteLast();
        list.printList();


        
    }
}