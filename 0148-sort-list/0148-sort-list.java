class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode mid = getMiddle(head);//method 
        ListNode left = sortList(head);//recursion
        ListNode right = sortList(mid);

        return merge(left, right);//method
    }

    private ListNode getMiddle(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (prev != null) prev.next = null;

        return slow;
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (left != null && right != null) {
            if (left.val < right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        // Attach remaining part
        if (left != null) current.next = left;
        if (right != null) current.next = right;

        return dummy.next;
    }
}
