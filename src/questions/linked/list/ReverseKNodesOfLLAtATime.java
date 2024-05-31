package questions.linked.list;

/**
 * <div class="_1l1MA" data-track-load="qd_description_content"><p>Given the <code>head</code> of a linked list, reverse the nodes of the list <code>k</code> at a time, and return <em>the modified list</em>.</p>
 *
 * <p><code>k</code> is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of <code>k</code> then left-out nodes, in the end, should remain as it is.</p>
 *
 * <p>You may not alter the values in the list's nodes, only nodes themselves may be changed.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong class="example">Example 1:</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2020/10/03/reverse_ex1.jpg" style="width: 542px; height: 222px;">
 * <pre><strong>Input:</strong> head = [1,2,3,4,5], k = 2
 * <strong>Output:</strong> [2,1,4,3,5]
 * </pre>
 *
 * <p><strong class="example">Example 2:</strong></p>
 * <img alt="" src="https://assets.leetcode.com/uploads/2020/10/03/reverse_ex2.jpg" style="width: 542px; height: 222px;">
 * <pre><strong>Input:</strong> head = [1,2,3,4,5], k = 3
 * <strong>Output:</strong> [3,2,1,4,5]
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * 	<li>The number of nodes in the list is <code>n</code>.</li>
 * 	<li><code>1 &lt;= k &lt;= n &lt;= 5000</code></li>
 * 	<li><code>0 &lt;= Node.val &lt;= 1000</code></li>
 * </ul>
 *
 * <p>&nbsp;</p>
 * <p><strong>Follow-up:</strong> Can you solve the problem in <code>O(1)</code> extra memory space?</p>
 * </div>
 */
public class ReverseKNodesOfLLAtATime {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pointer = dummy;

        while (pointer != null) {
            ListNode node = pointer;
            for (int i = 0; i < k && node != null; i++) node = node.next;
            if (node == null) break;

            // reverse the k nodes
            ListNode prev = null, curr = pointer.next;
            for (int i = 0; i < k; i++) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            ListNode tail = pointer.next;
            tail.next = curr;
            pointer.next = prev;
            pointer = tail;
        }

        return dummy.next;
    }
}
