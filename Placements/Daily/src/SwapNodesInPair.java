public class SwapNodesInPair {

    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            next=null;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        int count = 0;
        ListNode check = head;
        while(check!=null){
            count++;
            check = check.next;
        }
        int pairs = count/2;
        ListNode tempHead;
        ListNode Prev;
        ListNode Temp;
        ListNode Next = head;
        ListNode prevTemp = head;
        int i = 1;
        while(i<=pairs){
            tempHead = Next;
            Prev = tempHead;
            Temp = Prev.next;
            Next = Temp.next;
            Temp.next = Prev;
            if(i==1){
                head = Temp;
            }
            else{
                prevTemp.next = Temp;
                prevTemp = tempHead;
            }
            i++;
        }
        prevTemp.next = Next;
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
        ListNode n7 = new ListNode(7);
        n6.next = n7;
        ListNode n8 = new ListNode(8);
        n7.next = n8;
        ListNode c = head1;
        while(c!=null){
            System.out.print(c.val+"->");
            c =c.next;
        }
        System.out.println();
        SwapNodesInPair obj = new SwapNodesInPair();
        ListNode s = obj.swapPairs(head1);
        ListNode p =s;
        while(p!=null){
            System.out.print(p.val+"->");
            p =p.next;
        }
    }
}
