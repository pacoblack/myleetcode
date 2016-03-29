package Leet;

public class LongSubChar {
	public static int lengthOfLongestSubstring(String s) {
		if(s == null || s.length() == 0) return -1;
		if(s.length() == 1) return 1;
		
		int[] size = new int[s.length()];
		for(int i =0 ;i < size.length; i++)
			size[i] = size.length;
		
		// find the edge of same char
		for(int i = 0; i < size.length - 1; i++){
			for(int j = i + 1; j < size.length; j++){
				if(s.charAt(i) == s.charAt(j)){
					size[i] = j;
					break;
				}
			}
		}
		
		// contain sub set or not
		for(int i = 0; i< size.length; i++){
			findSetWithOutSubs(s,i,size[i],size);
		}
		
		int max = 1;
		for(int i = 0; i < size.length; i++){
			int t = size[i] - i;
			if(t > max) max = t;
		}
		
		ArrayUtil.print(size);
		System.out.println(max);
		
        return max;
    }
	
	private static void findSetWithOutSubs(String s, int start, int end, int[] size){
		int min = end;
		for(int i = start + 1; i < end; i++){
			if(size[i] < min){
				min = size[i];
			}
		}
		size[start] = min;
	}
	
	public int[] KMP(String src, String des){
		if(src == null || src.length() == 0) return null;
	
		int j = 0, i = 0;
		int[] next = this.getNext(des);
		
		while( j < src.length()){
			if(i == -1 || src.charAt(j) == des.charAt(i)){
				i++;
				j++;
			}else{
				i = next[i];
			}
		}
		
		return next;
	}
	
	private int[] getNext(String s){
		int j = -1, i = 0;
		int[] next = new int[s.length()];
		
		while(i < s.length()){
			if(j == -1 || s.charAt(i) == s.charAt(j)){
				next[i] = j;
				i++;
				j++;
			}else{
				j = next[i];
			}
		}
		
		return next;
	}
}
