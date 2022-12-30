public class CurcularLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addAtBeginning(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            newNode.next = head;
        }
        else if(head.next==head){
            newNode.next = head;
            head.next = newNode;
            head = newNode;
        }
        else{
            Node temp = head.next;

            while(temp.next!=head){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
            head = temp.next;
        }

    }
    public void addNode(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            newNode.next = head;
        }
        else if(head.next==head){
            head.next = newNode;
            newNode.next = head;
        }
        else{
            Node temp = head.next;

            while(temp.next!=head){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public void deleteFromBeginning(){
        if(head == null){
            System.out.println("under flow");
        }
        else if(head.next == head){
            head = null;
        }
        else{
            Node temp = head.next;
            while(temp.next != head){
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
        }
    }

    public void deleteFromEnd(){
        if(head == null){
            System.out.println("under flow");
        }
        else if(head.next == head){
            head = null;
        }
        else{
            Node temp = head.next;
            while(temp.next.next!=head){
                temp = temp.next;
            }
            temp.next = head;
        }
    }

    public void display(){
        if(head == null){
            System.out.println("under Flow");
            return;
        }
        Node temp = head.next;
        System.out.print(head.data + "->");
        while(temp!=head){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CurcularLinkedList obj = new CurcularLinkedList();
        obj.addNode(13);
        obj.display();
        obj.deleteFromBeginning();
        obj.display();
    }
}
