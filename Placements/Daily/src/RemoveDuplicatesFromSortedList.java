public class RemoveDuplicatesFromSortedList {

    static class ListNode {

        int val;
        ListNode next;
        ListNode(int data) {
            this.val = data;
            next = null;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp = head;
        while (temp!=null){
            ListNode link = temp;
            int data = temp.val;
            while (temp.next!=null&&temp.next.val==data){
                temp = temp.next;
            }
            link.next = temp.next;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head1 = null;
        ListNode n1 = new ListNode(2);
        head1 = n1;
        ListNode n2 = new ListNode(2);
        n1.next = n2;
        ListNode n3 = new ListNode(2);
        n2.next = n3;
        ListNode n4 = new ListNode(2);
        n3.next = n4;
        ListNode n5 = new ListNode(2);
        n4.next = n5;
        ListNode n6 = new ListNode(2);
        n5.next = n6;
        RemoveDuplicatesFromSortedList obj = new RemoveDuplicatesFromSortedList();
        ListNode head = obj.deleteDuplicates(head1);
        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
    }
}
