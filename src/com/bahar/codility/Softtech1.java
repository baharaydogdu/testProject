package com.bahar.codility;

public class Softtech1 {

	public static void main(String[] args) {

		
		System.out.println(solution(0, 9));
		
	}
	
	public static int solution(int A, int B) {
		
		int count = 0;
		
		for(int i=A; i<=B; i++) {
			if(isWholeSquare(i))
				count += 1;
		}
		
		return count;
	}
	
	public static boolean isWholeSquare(int N) {
		
		if(Math.sqrt(N) % 1 == 0)
			return true;
		return false;
	}
	
	
}
