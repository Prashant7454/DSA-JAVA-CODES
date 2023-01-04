import java.util.List;

public class RemoveNthNodeFromEndOfList {
    static class ListNode {
      int val;
      ListNode next;
      ListNode(int data) {
          this.val = data;
          next = null;
      }

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode temp = head;
        int count = 0;
        while (temp!=null){
            count++;
            temp = temp.next;
        }
        System.out.println(count);
        if(n==count){
            head = head.next;
            return head;
        }
        System.out.println(count);
        ListNode prev = head;
        ListNode curr = prev.next;
        ListNode next = curr.next;

        for(int i = 1;i<count-n;i++){
            next = next.next;
            prev = prev.next;
            curr = curr.next;
        }
        prev.next = next;
        return head;
    }
    public static void main(String[] args) {
        ListNode head1 = null;
        ListNode n1 = new ListNode(1);
        head1 = n1;
        ListNode n2 = new ListNode(2);
        n1.next = n2;
        ListNode n3 = new ListNode(3);
        n2.next = n3;
        ListNode n4 = new ListNode(4);
        n3.next = n4;
        ListNode n5 = new ListNode(5);
        n4.next = n5;
        ListNode n6 = new ListNode(6);
        n5.next = n6;

        RemoveNthNodeFromEndOfList obj = new RemoveNthNodeFromEndOfList();
        ListNode head = obj.removeNthFromEnd(head1,5);
        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
    }
}
