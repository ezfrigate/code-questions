package questions.linked.list;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current = new ListNode((l1.val + l2.val)%10);
        ListNode head = current;
        int carry = (l1.val + l2.val)/10;
        ListNode l1Current = l1;
        ListNode l2Current = l2;

        while (l1Current.next != null && l2Current.next != null){
            current.next = new ListNode((l1Current.next.val + l2Current.next.val + carry) % 10);
            carry = (l1Current.next.val + l2Current.next.val + carry)/10;
            current = current.next;
            l1Current = l1Current.next;
            l2Current = l2Current.next;
        }
        ListNode lRemainingCurrent = l1Current.next==null ? l2Current : l1Current;
        while (lRemainingCurrent.next != null) {
            current.next = new ListNode((lRemainingCurrent.next.val + carry) % 10);
            carry = (lRemainingCurrent.next.val + carry) / 10;
            current = current.next;
            lRemainingCurrent = lRemainingCurrent.next;
        }
        if(carry==1) current.next = new ListNode(1);
        return head;
    }
}
