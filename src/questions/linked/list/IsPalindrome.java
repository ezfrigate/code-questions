package questions.linked.list;

import java.util.List;
import java.util.Stack;

public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(head == null || head.next == null) return true;

        Stack<Integer> stack = new Stack<>();
        while(fast!=null && fast.next!=null){
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast == null);
        else slow = slow.next.next;
        while(slow!=null){
            if(stack.pop()!=slow.val) return false;
            slow = slow.next;
        }
        return true;
    }
}
