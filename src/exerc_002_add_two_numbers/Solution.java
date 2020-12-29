package exerc_002_add_two_numbers;

public class Solution {
  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode actualIndex = new ListNode(0);
    ListNode head = actualIndex;
    int carry = 0;
    while (null != l1 || null != l2) {
      int l1Value = null != l1 ? l1.val : 0;
      int l2Value = null != l2 ? l2.val : 0;

      int sum = l1Value + l2Value + actualIndex.val;

      if (sum < 10) {
        actualIndex.val = sum;
        carry = 0;
      } else {
        actualIndex.val = sum - 10;
        carry = 1;
      }

      l1 = null != l1 ? l1.next : null;
      l2 = null != l2 ? l2.next : null;

      if (null != l1 || null != l2 || carry > 0) {
        ListNode next = new ListNode(carry);
        actualIndex.next = next;
        actualIndex = next;
      }

    }

    return head;
  }
}
