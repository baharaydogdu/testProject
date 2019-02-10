package com.bahar.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountNonDivisors {

	public static void main(String[] args) {
		int[] A = {1,2,5,3};
		System.out.println(Arrays.toString(findCountOfNonDivisors(A)));

	}
 	
	public static int[] findCountOfNonDivisors(int[] A) {
		
		int n = A.length;
		int[] B = new int[n];
	
		for(int i=0; i<n; i++) {
			int bufferCount = 0;
			for(int j=0; j<n; j++) {
				if(A[i] % A[j] != 0)
					bufferCount += 1;					
			}
			B[i] = bufferCount;
		}		
		return B;
		
		
		
	}

}
