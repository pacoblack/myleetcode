package Leet;

public class ArrayUtil {
	public static void print(int[] arr){
		System.out.print("arr [");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
			if(i +1 != arr.length){
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
}
