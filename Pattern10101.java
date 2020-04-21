package solutions;

import java.util.*;

public class Pattern10101 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				int x;
				if((i+j)%2==0)
					x=1;
				else
					x=0;
				System.out.print(x);
				
			}System.out.println();
		}
		
	}

}
