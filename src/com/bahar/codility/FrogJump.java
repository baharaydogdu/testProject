package com.bahar.codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class FrogJump {

	public static void main(String[] args) {
		
		int[] A = {1,3,1,4,2,3,5,4};
		
		int[] C = {2,2,2,2,2,2,2,2,2,1};
		System.out.println(getFrogEarliestJumpInSeconds(2, C));
		

	}
	
	public static int getFrogEarliestJumpInSeconds(int x, int[] A) {
		
		int n = A.length;
		boolean isContainX = false;
//		LinkedList<Integer> set = new LinkedHashSet<>();
//		
//		for(int i=0; i<n; i++) {
//			set.add(A[i]);
//			if(A[i] == x)
//				isContainX = true;
//			
//		}
//		
//		if (isContainX == false)
//			return -1;
//		
//		
//		System.out.println(isContainX);
//		
//		int[] lastElement = set.
//		System.out.println("last: "+ lastElement);
//		System.out.println(set);
//		
//		if(set.size() == x) {
//			for(int i=0; i<n; i++) {
//				if(lastElement == A[i]) {
//					return i;
//				}
//			}
//		}
//			
//		return -1;
		
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			list.add(A[i]);
		}
		
		for(int j=1; j<=x; j++) {
			if(list.contains(j))
				map.put(j, list.indexOf(j));
			else
				return -1;
		}
		
		System.out.println(map);
		

		int maxValue;
		maxValue = Collections.max(map.values());
		
		return maxValue;
	}

}
