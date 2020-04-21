package solutions;

import java.util.*;

public class prime {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int cout=0;
		
		for(int i=2; i*i<=n; i++) {
			if(n%i==0) 
			{
				cout++;
				break;
			}
		}
		if(cout<=0)
			System.out.print("No. is Prime");
		else
			System.out.print("No. is not Prime");

	}

}
