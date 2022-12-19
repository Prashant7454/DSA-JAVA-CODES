public class DoubleLinkedList {
    Node head;
    Node tail;
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
            prev = null;
            next = null;
        }
    }

    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = tail.next;
        }
    }

    public void addAtBeginning(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void deleteFromBeginning(){
        if(head==null){
            System.out.println("under flow");
        }
        else if(head.next==null){
            head = null;
            tail = null;
        }
        else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteFromEnd(){
        if(head==null){
            System.out.println("Under flow");
        }
        else if(head.next==null){
            head=null;
            tail=null;
        }
        else{
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void display(){
        if(head==null){
            System.out.println("Under flow");
        }
        else{
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public void reverseDisplay(){
        if(tail==null){
            System.out.println("under flow");
        }
        else{
            Node temp = tail;
            while(temp!=null){
                System.out.print(temp.data + "->");
                temp = temp.prev;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList obj = new DoubleLinkedList();
        obj.addNode(13);
        obj.addNode(16);
        obj.addNode(12);
        obj.addNode(19);
        obj.addNode(11);
        obj.addNode(18);
        obj.display();
        obj.addAtBeginning(53);
        obj.addAtBeginning(23);
        obj.display();
        obj.deleteFromBeginning();
        obj.display();
        obj.deleteFromEnd();
        obj.display();
    }

}
