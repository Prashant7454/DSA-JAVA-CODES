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

    public void display(){
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
        obj.addNode(21);
        obj.addNode(24);
        obj.addNode(19);
        obj.addNode(18);
        obj.addNode(16);
        obj.addNode(14);
        obj.display();
        obj.addAtBeginning(40);
        obj.display();
    }
}
