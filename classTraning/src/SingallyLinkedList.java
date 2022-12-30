public class SingallyLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public void insertAfterValue(int data,int value){
        SingallyLinkedList.Node newNode = new Node(data);
        if(head==null){
            System.out.println("Value not found");
        }
        else{
            Node temp = head;
            while(temp.next!=null&&temp.data != value){
                temp = temp.next;
            }
            if(temp.data==data&&temp.next==null){
                temp.next = newNode;
            }
            else if(temp.data!=data&&temp.next==null){
                System.out.println("Value not found");
            }
            else{
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }

    }
    public void insertBeforeValue(int data,int value){
        SingallyLinkedList.Node newNode = new Node(data);
        if(head==null){
            System.out.println("Value not found");
        }
        else if(head.data==value){
            newNode.next = head;
            head = newNode;
        }
        else{
            Node temp = head;
            while( temp.next!=null && temp.next.data != value ){
                temp = temp.next;
            }
            if(temp.data==data&&temp.next==null){
                temp.next = newNode;
            }
            else if(temp.data!=data&&temp.next==null){
                System.out.println("Value not found");
            }
            else{
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }

    }

    public void deleteNodeOfValue(int value){
        if(head == null){
            System.out.println("Value not found");
        }
        else if(head.data==value){
            head = head.next;
        }
        else{
            Node temp = head;
            Node prev = head;
            while(prev.next.data != value){
                prev = prev.next;
            }
            while(temp.data != value){
                temp = temp.next;
            }

            prev.next = temp.next;
            temp.next = null;

        }
    }

    public void setNode(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
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

    public void deleteNode(){
        if(head==null){
            System.out.println("under flow");
        }
        else if(head.next==null){
            head = null;
        }
        else{
            Node temp = head;
            while(temp.next.next !=null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void deleteAtLocation(int loc){
        if(head==null){
            System.out.println("Under Flow");
        }
        else if(head.next==null){
            head = null;
            return;
        }
        else if(loc == 0){
            head = head.next;
        }
        else{
            Node prev = head;
            Node temp = head;
            Node next = head;
            int i = 1;
            while(i<loc) {
                prev = prev.next;
                temp = temp.next;
                i++;
            }
            temp = temp.next;
            next = temp.next;
            prev.next = next;
        }
    }

    public static void main(String[] args) {
        SingallyLinkedList obj = new SingallyLinkedList();
        obj.setNode(13);
        obj.setNode(15);
        obj.setNode(17);
        obj.setNode(10);
        obj.setNode(14);
        obj.setNode(11);
        obj.display();

        obj.insertBeforeValue(28,14);
        obj.display();
        obj.insertAfterValue(29,14);
        obj.display();

        obj.deleteNodeOfValue(13);
        obj.display();
    }
}
