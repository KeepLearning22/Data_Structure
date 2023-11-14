package ads;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDups {
	
	static void solution1(int nums[]){
		HashSet<Integer> hs = new HashSet<>();
		for(int i:nums) {
			if(hs.contains(i)) {
				System.out.println("true");
				return;
			}
			hs.add(i);
		}
		System.out.println("false");
		return;
	}
//	sol by sorting an array
//	public static boolean solution2(int arr[]) {
//		Arrays.sort(arr);
//		for(int i=0;i<arr.length-1;i++) {
//			if(arr[i]==arr[i+1])
//				return true;
//		}
//		return false;
//	}
	public static void main(String args[]) {
		int list[]= {1,2,4,6,1};
		solution1(list);
	}
}
