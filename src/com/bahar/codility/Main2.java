package com.bahar.codility;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {

//		int[] A = { 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1 };
		int[] A = { 1 , 1, 1,1,1,1,1,1,1,1};
		System.out.println(method(A));
		System.out.println(method2(A));

	}

	public static int method2(int[] A) {
		
		int count = 0;
		List<Integer> zeroIndex = new ArrayList<>();

		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				zeroIndex.add(i);
			}
		}

		int index = 0;
		if(zeroIndex.isEmpty())
			return 0;
		for (int j = zeroIndex.get(index) + 1; j < A.length; j++) {
			if (A[j] == 1) {
				count++;
			}
		}

		System.out.println("count: " + count);
		
		int bufferCount = count;
		
		for (int k = 1; k < zeroIndex.size(); k++) {
			
			bufferCount = bufferCount - (zeroIndex.get(k) - zeroIndex.get(k - 1) - 1);
			
			count = count + bufferCount;
			
			if (count > 1000000000)
				return -1;
			
		}
		
		
		return count;

	}

	public static int method(int[] A) {
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				for (int j = i + 1; j < A.length; j++) {
					if (A[j] == 1) {
						if (count > 1000000000)
							return -1;
						count++;
					}
				}
			}
		}

		return count;

	}

}
