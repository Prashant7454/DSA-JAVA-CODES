/*not done*/


public class ReverseInNodesInKGroup {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            next=null;
        }
    }
    public ListNode reverse(ListNode head){
        ListNode prev = head.next;
        ListNode temp = prev.next;
        if(temp==null){
            prev.next=head;
            head = head.next;
            prev.next.next=null;
            return head;
        }
        prev.next = head;
        head.next = null;
        head = prev;
        prev = temp;
        temp = temp.next;
        while(temp!=null){
            prev.next = head;
            head = prev;
            prev = temp;
            temp = temp.next;
        }
        prev.next = head;
        head = prev;
        return head;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||head.next==null||k==1){
            return head;
        }
        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        temp = head;
        int pairs = count/k;
        ListNode tempHead = null;
        ListNode tempVal = head;
        int i = 0;
        int j = 0;
        while(i<=pairs){
            j = 1;
            ListNode n1 = new ListNode(tempVal.val);
            tempHead = n1;
            ListNode t = tempHead;
            tempVal = tempVal.next;
            while(j<=k){
                ListNode n = new ListNode(tempVal.val);
                t.next = n;
                t = t.next;
                j++;
            }
            reverse(tempHead);
            i++;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head1 = null;
        ListNode n1 = new ListNode(1);
        head1 = n1;
        ListNode n2 = new ListNode(2);
        n1.next = n2;
        ListNode n3 = new ListNode(4);
        n2.next = n3;
        ListNode c = head1;
        while(c!=null){
            System.out.print(c.val+"->");
            c =c.next;
        }
        ReverseInNodesInKGroup obj = new ReverseInNodesInKGroup();
        ListNode head = obj.reverse(head1);
        ListNode temp = head;
        System.out.println();
        while(temp!=null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
    }
}
