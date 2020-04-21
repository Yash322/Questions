package solutions;

import java.util.*;

public class PerfectNo {

	public static void main(String[] args) {

		Scanner scn  = new Scanner(System.in);
		int n = scn.nextInt();
		
		int result = 0;
		
		for(int i=1; i<n; i++) {
			if(n%i==0)
			{
				result+= i;
			}
		}
		System.out.print(result);
		if(result==n) 
			System.out.print("\n Number is a Perfect no.");
		else
			System.out.print("\n Number is not a Perfect no.");
	}

}
