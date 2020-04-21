package solutions;

import java.util.*;

public class palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tc = n;
		
		int temp=n;
		int count = 0;
		while(temp!=0) {
			temp/=10;
			count++;
		}
		
		int pow=(int)Math.pow(10, count-1);
		int rem=0;
		int result=0;
		
		while(n!=0) {
			
			rem = n%10;
			result= result + rem*pow;
			
			pow/=10;
			n/=10;
		}
		System.out.print(result);
		if(result==tc)
			System.out.print("\nNo. is a Palindrome no.");
		else
			System.out.print("\nNo. is not a Palindrome no.");

	}

}
