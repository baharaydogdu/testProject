package com.bahar.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindUnpairedElement {

	public static void main(String[] args) {
		int A[] = {2, 4, 3, 3, 3, -1, 3, 3};
		int B[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		System.out.println(findUnpairedElement(B));

	}
	
	public static int findUnpairedElement(int[] A) {		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int x : A) {
			if(!map.containsKey(x))
				map.put(x, 1);
			else
				map.put(x, map.get(x)+1);
		}
		
		if(map.isEmpty())
			return -1;
		
		Set<Integer> keys = map.keySet();
		
		List<Integer> list = new ArrayList<>();
		list.addAll(keys);
		
		int value=0;
		System.out.println(list);
		System.out.println(map);
		for(int y=0; y<list.size(); y++) {
			if(map.get(list.get(y)) > A.length/2)
				value = list.get(y);
		}
		
		
		for(int j=0; j<A.length; j++) {
			if(A[j] == value)
				return j;
		}
		return -1;
		
	}
}
