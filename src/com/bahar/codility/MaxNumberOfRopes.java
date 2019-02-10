package com.bahar.codility;


public class MaxNumberOfRopes {

	public static void main(String[] args) {
		
		int[] A = {1,1,1,1,3,1,2,2,1,1,1,1,1,1,1,7};
		System.out.println(getMaxNumberOfRopes(7, A));

	}
	
	public static int getMaxNumberOfRopes(int K, int[] A) {
		
		int n = A.length;
		int bufferCount = 1;
		int sumOfRopes = 0;
		int bufferMax = 0;
		int index = 0;
		
		for(int j=0; j<n; j++) {
			sumOfRopes = A[j];
		for(int i=1; i<n-1; i++) {
			if(sumOfRopes < K) {
				sumOfRopes += A[i];
				bufferCount += 1;
			}
			else {
				if(bufferMax < bufferCount +1) {
					bufferMax = bufferCount +1;
				}
				bufferCount = 0;
				sumOfRopes = 0;
				
			}
				
		}
		
		bufferCount = 0;
		sumOfRopes = 0;	
	}
		
		return bufferMax;
	}

}
