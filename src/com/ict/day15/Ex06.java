package com.ict.day15;

import java.util.HashSet;

public class Ex06 {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		// 1. for 문안에 if~else 문 사용해서 하는 방법
//		for (int i = 0; i < 6; i++) {
//			int su = (int)(Math.random()*10);
//			if(set1.add(su)) {
//				continue;
//			}else {
//				i--;
//				
//			}

//		System.out.println(set1);
		// 2 . if 문 사용해서 하는 방법
		for (int i = 0; i < 6; i++) {
			int su = (int) (Math.random() * 10);
			if (!set1.add(su)) {
					i--;
			}

		}
		System.out.println(set1);
	}
}
