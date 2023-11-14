package ads;

import java.util.Scanner;

public class Reursion {
	//1
	static int square(int n) {
    	if(n==0) {
    		return 0;
    	}
    	return square(n-1)+(2*n)-1;
    }
    
	
//    2
	static int tailFact(int n, int a)
    {
        if (n <= 0)
            return a;
 
        return tailFact(n - 1, n * a);
    }
    static int fact(int n) { 
    	return tailFact(n, 1); }
 
    //3
    static int rev(int n, int m)
    {
       
        if (n == 0)
            return m;
     
       
        m = (m * 10) + (n % 10);
     
        return rev(n / 10, m);
    }
     
    
    
    static public void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter number: ");
    	int num=sc.nextInt();
    	
        System.out.println(tailFact(num,1));
        
    	System.out.println(square(num));
    	
    	if(num == rev(num,0)) 
    		{
    			System.out.println("Palindrome");
    		}
    	else
    		System.out.println("Not Palindrome");
    	}
    	
    	
    }

 

