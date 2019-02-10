package com.bahar.codility;

import java.util.ArrayList;
import java.util.List;

public class FactorsOfN {

	public static void main(String[] args) {
		
		int N = Integer.MAX_VALUE;
		System.out.println(findFactorsOfN(N));

	}
	
	public static int findFactorsOfN(int N) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=2; i<=N; i++) {
			if(N % i == 0)
				list.add(i);			
		}	
		
		return list.size()+1;
	}

}
