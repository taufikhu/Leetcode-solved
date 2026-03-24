
public class Node{

    int data;
    Node next;

    public Node(int data){

        this.data = data;
        next = null;

    }

    
}

public class LinkedList {

    Node Head = null;

    public void add(int data){

        Node newNode = new Node(data);

        Head = newNode;

       




    }
}
