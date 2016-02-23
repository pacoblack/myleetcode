package Leet;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target){
		int[] result = {-1, -1};
		
		if(nums.length <2) return result;
		
		for(int first = 0;first < nums.length -1; first++){
			for(int second = first + 1; second < nums.length; second++){
				if((nums[first] + nums[second]) == target){
					result[0] = first;
					result[1] = second;
					return result;
				}
			}
		}
		
		return result;
	}
}
