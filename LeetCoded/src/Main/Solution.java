package Main;

import Leet.ListNode;
import Leet.TwoSum;

public class Solution {
	public static void main(String[] args){
		int[] list1 = {2, 4, 3};
		int[] list2 = {5, 6};
		ListNode l1 = ListNode.init(list1);
		ListNode l2 = ListNode.init(list2);
		TwoSum.addTwoNumbers(l1, l2);
	}
}
