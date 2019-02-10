package com.bahar.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Softtech2 {

	public static void main(String[] args) {		
		
		System.out.println(solution(10000));

	}
	
	public static int solution(int A) {
		
		List<Integer> digitList = new ArrayList<>();
		digitList = getDigitListFromInt(A);
		
		System.out.println(digitList);
		
		int n = digitList.size();
		int[] shuffledA = new int[n];
		int k;
		
		if(n % 2 == 1) {
			shuffledA[n-1] = digitList.get(n/2);
		}
		
//		for(int i=0; i<n-1; i+=2) {
//			shuffledA[i] = digitList.get(i);
//			shuffledA[i+1] = digitList.get(n-1-i);			
//		}
		
		k = 0;
		for(int i=0; i<n-1; i+=2) {
			shuffledA[i] = digitList.get(k);
			k++;
		}
		
		k=0;	
		for(int j=1; j<n; j+=2) {
			shuffledA[j] = digitList.get(n-1-k);
			k++;
		}
		
		return getIntFromDigitList(shuffledA);
			
	}
	
	
	public static List<Integer> getDigitListFromInt(int A){
		
		List<Integer> digitList = new ArrayList<>();
		int bufferA = A;
		
		while(bufferA > 0) {
			digitList.add(bufferA % 10);
			bufferA /= 10;
		}
		
		Collections.reverse(digitList);
		
		return digitList;
	}
	
	public static int getIntFromDigitList(int[] A) {
		
		int n = A.length;
		int number = 0;
		
		for(int i=0; i<n; i++) {
			number += A[i] * Math.pow(10, n-i-1);
		}
		return number;
	}

}
