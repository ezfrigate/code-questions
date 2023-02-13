package questions.linked.list;

public class Merge2Lists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode currentList1Node = list1;
        ListNode currentList2Node = list2;
        ListNode head = new ListNode(0);
        ListNode answer = head;

        while(currentList1Node != null && currentList2Node != null){
            if(currentList1Node.val < currentList2Node.val){
                head.next = currentList1Node;
                currentList1Node = currentList1Node.next;
            } else {
                head.next = currentList2Node;
                currentList2Node = currentList2Node.next;
            }
            head = head.next;
        }

        while(currentList1Node != null){
            head.next = currentList1Node;
            currentList1Node = currentList1Node.next;
            head = head.next;
        }

        while(currentList2Node != null){
            head.next = currentList2Node;
            currentList2Node = currentList2Node.next;
            head = head.next;
        }

        return answer;
    }
}
