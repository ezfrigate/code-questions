package questions.linked.list;

import questions.random.MergeSort;

import javax.xml.bind.Unmarshaller;

/**
 * <div class="px-5 pt-4"><div class="_1l1MA"><p>You are given the head of a singly linked-list. The list can be represented as:</p>
 *
 * <pre>L<sub>0</sub> → L<sub>1</sub> → … → L<sub>n - 1</sub> → L<sub>n</sub>
 * </pre>
 *
 * <p><em>Reorder the list to be on the following form:</em></p>
 *
 * <pre>L<sub>0</sub> → L<sub>n</sub> → L<sub>1</sub> → L<sub>n - 1</sub> → L<sub>2</sub> → L<sub>n - 2</sub> → …
 * </pre>
 *
 * <p>You may not modify the values in the list's nodes. Only nodes themselves may be changed.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong class="example">Example 1:</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2021/03/04/reorder1linked-list.jpg" style="width: 422px; height: 222px;">
 * <pre><strong>Input:</strong> head = [1,2,3,4]
 * <strong>Output:</strong> [1,4,2,3]
 * </pre>
 *
 * <p><strong class="example">Example 2:</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2021/03/09/reorder2-linked-list.jpg" style="width: 542px; height: 222px;">
 * <pre><strong>Input:</strong> head = [1,2,3,4,5]
 * <strong>Output:</strong> [1,5,2,4,3]
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * 	<li>The number of nodes in the list is in the range <code>[1, 5 * 10<sup>4</sup>]</code>.</li>
 * 	<li><code>1 &lt;= Node.val &lt;= 1000</code></li>
 * </ul>
 * </div></div>
 */
public class ReorderList {
    //identify the middle with slow and fast pointer
    private static ListNode identifyMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //reverse the next half of the list
    private static ListNode reverseLinkedList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    //merge 2 lists alternatively
    private static void merge2Lists(ListNode list1, ListNode list2){
        while(!(list1.next == null || list2.next == null)){
            ListNode nextList2 = list1.next;
            list1.next = list2;
            list1 = list2;
            list2 = nextList2;
        }
    }

    public static void reorderList(ListNode head) {
        ListNode middle = identifyMiddle(head);
        ListNode reversedNextHalf = reverseLinkedList(middle);
        merge2Lists(head, reversedNextHalf);
    }
}
