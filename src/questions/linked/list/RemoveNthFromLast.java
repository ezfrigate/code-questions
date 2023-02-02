package questions.linked.list;

public class RemoveNthFromLast {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return null;
        ListNode startPointer = head;
        ListNode endPointer = head;
        int i=0;
        while(i<n){
            endPointer = endPointer.next;
            i++;
        }
        if (endPointer == null) return head.next;
        while(endPointer.next!=null){
            startPointer = startPointer.next;
            endPointer = endPointer.next;
        }
        startPointer.next = startPointer.next.next;
        return head;
    }


}
