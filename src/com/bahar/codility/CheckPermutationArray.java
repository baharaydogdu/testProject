package com.bahar.codility;

import java.util.Arrays;

public class CheckPermutationArray {

	public static void main(String[] args) {
		
		

	}
	
	public static int isPermutationArray(int[] A) {
		
		Arrays.sort(A);
		int n = A.length;
		
		if(A[0] == 1 && A[n-1] == n)
			for(int i=0; i<n; i++) {
				if(A[i+1] != A[i]+1)
					return 0;
				else 
					return 1;
			}
		
		return 0;
		
	
	}
}
