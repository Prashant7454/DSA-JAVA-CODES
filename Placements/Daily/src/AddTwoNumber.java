public class AddTwoNumber {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public Node addTwoNumbers(Node l1, Node l2) {
        int carry = 0;
        Node temp1 = l1;
        Node temp2 = l2;
        Node head = null;
        int sum = temp1.data+temp2.data + carry;
        Node n1 = new Node(sum%10);
        carry = sum/10;
        temp1 = temp1.next;
        temp2 = temp2.next;
        head = n1;
        Node temp = head;
        while(temp2!=null || temp1!=null){
            if(temp1==null){
                sum = temp2.data + carry;
                Node n = new Node(sum%10);
                carry = sum/10;
                temp2 = temp2.next;
                temp.next = n;
                temp = temp.next;
            }
            else if(temp2==null){
                sum = temp1.data + carry;
                Node n = new Node(sum%10);
                carry = sum/10;
                temp1 = temp1.next;
                temp.next = n;
                temp = temp.next;
            }
            else {
                sum = temp1.data + temp2.data + carry;
                Node n = new Node(sum % 10);
                carry = sum / 10;
                temp1 = temp1.next;
                temp2 = temp2.next;
                temp.next = n;
                temp = temp.next;
            }
        }
        if(carry!=0){
            Node n = new Node(carry);
            temp.next = n;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head1 = null;
        Node n1 = new Node(2);
        head1 = n1;
        Node n2 = new Node(4);
        n1.next = n2;
        Node n3 = new Node(3);
        n2.next = n3;
        Node head2 = null;
        Node n4 = new Node(5);
        head2 = n4;
        Node n5 = new Node(6);
        n4.next = n5;
        Node n6 = new Node(4);
        n5.next = n6;

        AddTwoNumber obj = new AddTwoNumber();
        Node head3 = obj.addTwoNumbers(head1,head2);
        Node temp = head3;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
}
