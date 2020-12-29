package exerc_002_add_two_numbers;

public class Main {
  //https://leetcode.com/problems/add-two-numbers/
  public static void main(String[] args) {

    test(1, new int[]{2, 3, 1}, new int[]{1, 0, 2}, new int[]{3, 3, 3});
    test(2, new int[]{2, 3, 4}, new int[]{5, 3, 1}, new int[]{7, 6, 5});
    test(3, new int[]{2}, new int[]{5, 3, 1}, new int[]{7, 3, 1});
    test(4, new int[]{7}, new int[]{5, 3, 1}, new int[]{2, 4, 1});
    test(5, new int[]{0}, new int[]{0}, new int[]{0});
    test(6, new int[]{9, 9, 9, 9, 9, 9, 9}, new int[]{9, 9, 9, 9}, new int[]{8, 9, 9, 9, 0, 0, 0, 1});
    test(7, new int[]{2, 4, 3}, new int[]{5, 6, 4}, new int[]{7, 0, 8});

  }

  private static void test(int i, int[] intsA, int[] intsB, int[] answer) {

    ListNode l1 = arrayToListNode(intsA);
//    System.out.println(l1.toString());
    ListNode l2 = arrayToListNode(intsB);
//    System.out.println(l2.toString());

    if (arrayToListNode(answer).equals(Solution.addTwoNumbers(l1, l2))) {
      System.out.println("Correct " + i);
    } else {
      System.out.println("Error " + i);
    }
  }

  private static ListNode arrayToListNode(int[] intsArray) {
    ListNode list = new ListNode(intsArray[intsArray.length - 1]);
//    System.out.println(list);
    if (intsArray.length == 1) {
      return list;
    } else {
      ListNode nextNode = null;
      for (int i = intsArray.length - 2; i >= 0; i--) {
        nextNode = new ListNode(intsArray[i], list);
        list = nextNode;
      }
    }
    return list;
  }

}
