import java.util.List;

public class MergeTwoSortedList {

    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            next=null;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newNode;
        ListNode head;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        if(list1!=null && list2!=null){
            if(list1.data<list2.data){
                newNode = new ListNode(list1.data);
                temp1 = temp1.next;
            }
            else{
                newNode = new ListNode(list2.data);
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
                if(temp1.data<temp2.data){
                    n = new ListNode(temp1.data);
                    temp.next = n;
                    temp = temp.next;
                    temp1 = temp1.next;
                }
                else{
                    n = new ListNode(temp2.data);
                    temp.next = n;
                    temp = temp.next;
                    temp2 = temp2.next;
                }
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head1 = null;
        ListNode n1 = new ListNode(1);
//        head1 = n1;
        ListNode n2 = new ListNode(2);
        n1.next = n2;
        ListNode n3 = new ListNode(4);
        n2.next = n3;

        ListNode head2 = null;
        ListNode n4 = new ListNode(1);
        head2 = n4;
        ListNode n5 = new ListNode(3);
        n4.next = n5;
        ListNode n6 = new ListNode(4);
        n5.next = n6;
        MergeTwoSortedList obj = new MergeTwoSortedList();
        ListNode head = obj.mergeTwoLists(head1,head2);
        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
}
