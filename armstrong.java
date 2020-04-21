package solutions;
import java.util.*;
public class armstrong {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int t = n;
		int rem = 0;
		int result = 0;
		
		while(n!=0) {
			rem = n%10;
			rem = (int)Math.pow(rem, 3);
			
			result+=rem;
			
			n/=10;
		}
		System.out.print(result);
		if(result==t)
			System.out.print("\n Number is an Armstrong no.");
		else
			System.out.print("\n Number is not an Armstrong no.");
			
	}

}
