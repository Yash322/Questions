package solutions;

import java.io.*;
import java.util.*;

public class arrayBarChart {

	public static void main(String[] args) {

	    try(Scanner scn = new Scanner(System.in)) {
	    
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	    
	    for(int i=0; i<arr.length; i++){
	        arr[i]= scn.nextInt();
	    }
	    
	    int max=arr[0];
	    for(int i=0; i<arr.length; i++){
	        if(arr[i]> max)
	            max= arr[i];
	    }
	    
	    for(int i = 1; i<=max; i++){
	        for(int j=0; j<arr.length; j++){
	            int x = max-arr[j];
	            if(i>x)
	                System.out.print("*\t");
	            else
	                System.out.print("\t");
	        }
	        System.out.println();
		}
	    }
	    
	}
}
