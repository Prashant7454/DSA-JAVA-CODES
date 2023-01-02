public class MergeKSortedList {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            next=null;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newNode;
        ListNode head;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        if(list1!=null && list2!=null){
            if(list1.val<list2.val){
                newNode = new ListNode(list1.val);
                temp1 = temp1.next;
            }
            else{
                newNode = new ListNode(list2.val);
                temp2 = temp2.next;
            }
            head = newNode;
        }
        else if(list1!=null){
            head = list1;
            return head;
        }
        else if(list2!=null){
            head = list2;
            return head;
        }
        else{
            return null;
        }
        ListNode temp = head;

        while (temp1!=null||temp2!=null){
            ListNode n;
            if(temp1==null){
                temp.next = temp2;
                return head;
            }
            else if(temp2==null){
                temp.next = temp1;
                return head;
            }
            else{
                if(temp1.val<temp2.val){
                    n = new ListNode(temp1.val);
                    temp.next = n;
                    temp = temp.next;
                    temp1 = temp1.next;
                }
                else{
                    n = new ListNode(temp2.val);
                    temp.next = n;
                    temp = temp.next;
                    temp2 = temp2.next;
                }
            }
        }
        return head;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        int l = lists.length;
        if(l==0){
            return null;
        }
        ListNode head = lists[0];
        for(int i = 1;i<l;i++){
            ListNode n = mergeTwoLists(head,lists[i]);
            head = n;
        }
        return head;
    }
    public static void main(String[] args) {

    }
}
