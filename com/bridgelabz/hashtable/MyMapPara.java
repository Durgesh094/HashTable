package com.bridgelabz.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
 * Sentence:- “Paranoids are not
paranoid because they are paranoid but
because they keep putting themselves
deliberately into paranoid avoidable
situations”
 */

public class MyMapPara {
	Scanner sc = new Scanner(System.in);
	HashMap<String, Integer> map = new HashMap<>();
	
	public void MyHashMap() {
		
		System.out.println("Enter Paragraph ");
		String splitString = sc.nextLine();
		String[] paragraph = splitString.split(" ");
		
		
		for (String paragraph1 : paragraph) {
			String word = paragraph1.toLowerCase();
			if (map.containsKey(word)) {
				int count = map.get(word);
				map.put(word, count + 1);
			} else {
				map.put(word, 1);
			}
		}

		for (Map.Entry<String, Integer> en : map.entrySet()) {
			String printString = en.getKey() + ":" + en.getValue();
			System.out.println(printString);
		}
	}

	public static void main(String[] args) {
		MyMapPara obj = new MyMapPara();
		obj.MyHashMap();
	}
}
