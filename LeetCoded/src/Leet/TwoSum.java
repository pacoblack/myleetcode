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
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        
        ListNode result = new ListNode(0);
        ListNode tail = result;
        int carry = 0, sum = 0;
        
        while(l1 != null || l2 !=null || carry > 0){
        	int val1 = 0, val2 = 0;
        	if(l1 != null){
        		val1 = l1.val;
        		l1 = l1.next;
        	}
        	
        	if(l2 != null){
        		val2 = l2.val;
        		l2 = l2.next;
        	}
        	
        	sum = val1 + val2 + carry;
        	carry = sum / 10;
        	tail.val = sum % 10;
        	
        	if(l1 != null || l2 != null || carry > 0){
        		tail.next = new ListNode(0);
        		tail = tail.next;
        	}
        }
        System.out.println(result);
        return result;
    }
}
