package questions.linked.list;

public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast == null) return slow;
        else return slow.next;
    }
}
