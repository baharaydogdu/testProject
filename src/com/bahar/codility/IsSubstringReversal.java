package com.bahar.codility;

public class IsSubstringReversal {

	public static void main(String[] args) {
		
		String str = "a";
		System.out.println(getMiddleIndexIfReversal(str));

	}
	
	public static int getMiddleIndexIfReversal(String str) {
		
		char[] A = str.toCharArray();
		int n = A.length;
		
		if(n % 2 == 0 || n == 1) {
			return -1;
		}
		
		if(n == 0) {
			return 0;
		}
		
		int middleIndex = (n - 1) / 2;
		
		if(isReversalLeftAndRight(middleIndex, A) == true)
			return middleIndex;
			
		return -1;
		
	}
	
	public static boolean isReversalLeftAndRight(int middleIndex, char[] str) {
		
		int n = str.length;
		
		for(int i=0; i<middleIndex; i++) {
			if(str[i] != str[n-1-i])
				return false;
		}
		
		return true;	
	}
	
}
