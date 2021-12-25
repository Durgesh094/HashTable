package com.bridgelabz.hashtable;

import java.io.ObjectInputStream.GetField;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.stream.StreamFilter;
/*
 * Sentence:- to be or not to be 
 */

public class MyMapNode {
	Scanner sc = new Scanner(System.in);
	HashMap<String, Integer> map = new HashMap<>();
	

	
	public void MyHashMap() {

		System.out.println("Enter the sentence ");
		String splitString = sc.nextLine();
		String[] sentence = splitString.split(" ");

		
		for (String sentence1 : sentence) {
			String word = sentence1.toLowerCase();
			if (map.containsKey(word)) {
				int count = map.get(word);
				map.put(word, count + 1);
			} else {
				map.put(word, 1);
			}
		}
		
		for (Map.Entry<String, Integer> en : map.entrySet()) {
			String result = en.getKey() + ":" + en.getValue();
			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		MyMapNode obj = new MyMapNode();
		obj.MyHashMap();
		}  
}