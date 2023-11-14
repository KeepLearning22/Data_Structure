package ads;

import java.util.Scanner;

public class Inc_subarr {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of test cases");
		int t = sc.nextInt();
		
		
		while(t-->0) {
			System.out.println("Enter size of an array");
			int size=sc.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter "+size+" array elements");
			for(int i=0;i<size;i++) {
				arr[i]= sc.nextInt();
			}
			int dp[]= new int[size];
			dp[0]=1;
			for(int i=1;i<size;i++) {
				if(arr[i]>arr[i-1]) {
					dp[i]=1+dp[i-1];
				}
				else
					dp[i]=1;
			}
			int sum=0;
			for(int i:dp)
				sum+=i;
			System.out.println(sum);
		}
	}
}
