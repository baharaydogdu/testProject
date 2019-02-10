package com.bahar.codility;

import java.util.Arrays;

public class Softtech3 {

	public static void main(String[] args) {
		
		int[] A = {1,2,3,3,1,3,1,2,2,2};
		System.out.println(solution(3, A));
		
//		int[] B = {0,0,0,0};
//		System.out.println(B[5]);

	}
	
	public static int solution(int M, int[] A) {
		
		int N = A.length;
        int[] count = new int[M + 1];
        for (int i = 0; i <= M; i++)
            count[i] = 0;
        System.out.println(Arrays.toString(count));
        
        int maxOccurence = 1;
        int index = -1;
        
        for (int i = 0; i < N; i++) {
            if (count[A[i]] > 0) {
                int tmp = count[A[i]];
                if (tmp > maxOccurence) {
                    maxOccurence = tmp;
                    count[A[i]] = tmp + 1;
                    maxOccurence = A[i];
                }
                count[A[i]] = tmp + 1;
            } else {
                count[A[i]] = 1;
            }
        }
        
        
        
        return A[index];
		
		
//        int N = A.length;
//        int[] count = new int[M + 1];
//        for (int i = 0; i <= M; i++)
//            count[i] = 0;
//        System.out.println(Arrays.toString(count));
//        
//        int maxOccurence = 1;
//        int index = -1;
//        for (int i = 0; i < N; i++) {
//            if (count[A[i]] > 0) {
//                int tmp = count[A[i]];
//                if (tmp > maxOccurence) {
//                    maxOccurence = tmp;
//                    index = i;
//                }
//                count[A[i]] = tmp + 1;
//            } else {
//                count[A[i]] = 1;
//            }
//        }
//        return A[index];
		
		
    }

}
