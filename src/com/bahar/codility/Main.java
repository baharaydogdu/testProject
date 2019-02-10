package com.bahar.codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	
	public static int index;

	public static void main(String[] args) {
		
		
		int[] A = {1,5,6,6,8,3,2};
		System.out.println(solution1(A));
		
		String[] words = {"aabb", "aaaa", "bbab"};
		solution(words);
		
		
	     List<Integer> S = new ArrayList<>();
	        int n=1;
	        
	        while(n > 1){
	            S.add(n % 2);
	            n = (int) Math.floor(n/2);
	        }
	        
	        S.add(1);
	        Collections.reverse(S);
	        
	        System.out.println(S);
	        System.out.println(S.size());
	        
//	        int w=1;
//	        int count = 0;
//	        while(S.get(w) == 0) {
//	        	count++;
//	        	w++;
//	        }
	        
	  
	        
	        
	        index = 1;
	        int count = getZeroCount(S);
	        
	        while(index != S.size()) {
	        	int count2 = getZeroCount(S);
	        	if(count < count2)
	        		count = count2;
	        }
	        
	        System.out.println("count: " + count);
	        
	        
	       
	}
	
	private static int getZeroCount(List<Integer> list) {
        int count = 0;
        
        while(list.get(index) == 1) {
        	index++;
        	if(index == list.size())
        		return 0;
        }
        
        while(list.get(index) == 0) {
        	count++;
        	index++;
        	if(index == list.size())
        		return 0;
        }
        
        return count;
	}
	
	
	
	public static int solution(String[] words) {
        // write your code in Java SE 8
        int n = words.length;
        char[] chars;
        Map<Character,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        sb.append(words[0]);
        
        
        for(int i=0; i<n; i++){
            chars = (words[i].toCharArray());          	
            	
            for(Character ch : chars){
                if(map.containsKey(ch))
                    map.put(ch,map.get(ch)+1);
                else
                    map.put(ch,1);
            }
        }
        
        System.out.println(map);
        //ArrayList<Integer> A = new ArrayList<Integer>();
        
        int b=9;
        int c = (int) Math.floor(b/2);
        System.out.println("c: " + c);
        int k = 0;
        boolean l = k % 2 == 0 ? false : true;
        
        
        int a = Collections.max(map.values());
        
        System.out.println(a);
        
        
        return a;
        
	}


    public static int solution1(int[] A) {
        // write your code in Java SE 8
        int num=1;
        
        List<Integer> hset = new ArrayList<Integer>();
        
        for(int i=0; i<A.length; i++){
            hset.add(A[i]);
        }
        
        while(hset.contains(num)){
            num++;
        }
        
        return num;        
    }

}
