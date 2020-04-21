package solutions;

import java.util.*;

public class Pattern1234 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				
				int x= i+j-1;
				if(x<=n)
				System.out.print(x);
				else if(x>n)
				System.out.print(x-n);
			}System.out.println();
		}
		
	}

}
