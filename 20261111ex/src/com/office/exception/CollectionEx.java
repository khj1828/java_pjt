package com.office.exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class CollectionEx {
	
	public static void main(String[] args) {
		
		/*
		 * ArrayList: 배열을 업그레이드
		 */
		
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		
		nums.remove(4);
		nums.remove(3);
		
		nums.add(2, 100);
		
		nums.clear();  //[] 객체는 살려두되 안에는 몽땅 지우는것
		//String -> stringBuffer -> StringBuilder
		//Array  -> Vector       -> ArrayList      
		//Vector단점 StringBuffer 단점과 같다 동기화시켜서 한번에 두가지 세가지 일을 못한다. 
		//작업중이니 중간에 못하게 기다리라고 한다. 빨리 안되니 탄생한게 ArrayList
		
		List<Integer> nums2 = new Vector<Integer>();
		nums2.add(10);
		nums2.add(20);
		nums2.add(30);
		nums2.add(40);
		nums2.add(50);
		
		nums2.remove(4);
		nums2.remove(3);
		
		nums2.add(2, 100);
		
		nums2.clear();
		
		Map<String, String> hashMap = new HashMap<String, String>();
	}

}
