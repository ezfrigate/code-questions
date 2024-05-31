package questions.linked.list;

public class LRUCache {

    static class ListNode{
        int key;
        int val;
        public ListNode next;

        public ListNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
        public ListNode(int key, int val, ListNode next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }
    int capacity;

    int currentSize;
    ListNode cache;

    public LRUCache(int capacity) {
        this.capacity=capacity;
    }

    public int get(int key) {
        if(capacity==0 || currentSize==0) return -1;
        int i = currentSize;
        ListNode listNode = cache;
        ListNode prev = null;
        while (i > 0){
            if(listNode.key == key){
                if(prev != null) {
                    prev.next = listNode.next;
                    listNode.next = cache;
                }
                return listNode.val;
            }
            prev = listNode;
            listNode = listNode.next;
            i--;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(capacity==0) {
            return;
        }
        if(currentSize==0 && capacity>0) {
            cache = new ListNode(key, value);
            currentSize++;
            return;
        }
        if(this.get(key) == -1) {
            if(currentSize == capacity){
                int i = capacity;
                ListNode listNode = cache;
                while(i > 1){
                    listNode = listNode.next;
                    i--;
                }
                listNode.next = null;
                cache = new ListNode(key,value,cache);
            } else {
                cache = new ListNode(key,value,cache);
                currentSize++;
            }
        } else {
            cache.val = value;
        }
    }
}
