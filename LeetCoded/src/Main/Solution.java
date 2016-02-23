package Main;

import Leet.TwoSum;

public class Solution {
	public static void main(String[] args){
		int[] nums = {2, 7, 11, 15};
		int[] result = TwoSum.twoSum(nums, 9);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}
}
