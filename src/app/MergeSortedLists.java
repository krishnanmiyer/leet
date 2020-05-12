package app;

public class MergeSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode r = new ListNode(-1);
        ListNode h = r;
        
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                r.next = l1;
                l1 = l1.next;
            }
            else {
                r.next = l2;
                l2 = l2.next;
            }
            r = r.next;
        }

        if (l1 != null) {
            r.next = l1;
        }

        if (l2 != null) {
            r.next = l2;
        }

        return h.next;
    }
}