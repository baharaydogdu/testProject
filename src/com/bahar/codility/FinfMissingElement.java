package com.bahar.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinfMissingElement {

	public static void main(String[] args) {
		int[] A = {-1000000};
		System.out.println(findMissingElement(A));

	}
	
	public static int findMissingElement(int[] A) {
		
		Arrays.sort(A);
		int n = A.length;
		System.out.println(Arrays.toString(A));
		
		if(A[0] > 1 || A[n-1] < 0)
			return 1;
		if(A[0] == 1 && A.length ==1 )
			return 2;
		
		
		for(int i=0; i<n-1; i++) {
			if(A[i] != A[i+1] && A[i] > 0) {
				if(A[i+1] != A[i]+1)
					return A[i]+1;
			}
		}
				
			//search whole
		return A[n-1]+1;
		
	}
		

}
