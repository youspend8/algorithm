public class ListNode {
    int val;
    ListNode next;
    ListNode () {}
    ListNode (int val) { this.val = val; }
    ListNode (int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode of(int... nums) {
        ListNode node = new ListNode(nums[nums.length - 1]);
        for (int i = nums.length - 2; i >= 0; i--) {
            node = new ListNode(nums[i], node);
        }
        return node;
    }

    public static ListNode reverseOf(int... nums) {
        ListNode node = new ListNode(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            node = new ListNode(nums[i], node);
        }
        return node;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
