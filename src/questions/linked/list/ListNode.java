package questions.linked.list;

public class ListNode {
    int val;
    public ListNode next;
    ListNode() {}
    public ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public void printList(){
        ListNode head = this;
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
 }
