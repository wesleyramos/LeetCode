package exerc_002_add_two_numbers;

import java.util.Objects;

//  Definition for singly-linked list.
public class ListNode {
  int val;

  ListNode next;

  ListNode() {
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListNode listNode = (ListNode) o;
    return val == listNode.val && Objects.equals(next, listNode.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(val, next);
  }

  @Override
  public String toString() {
    return "ListNode{" +
            "val=" + val +
            ", next=" + next +
            '}';
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}
