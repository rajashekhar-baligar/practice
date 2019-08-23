package com.java;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindTheDupCharInString {

	public static void findTheDuplicateCharInString(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int num=1;
		for (int i = 0; i < str.length(); i++) {
              if(map.get(str.charAt(i))==null) {
            	  map.put(str.charAt(i), num);
              }
              else {
            	  map.put(str.charAt(i),map.get(str.charAt(i))+1);
              }
		}
		//System.out.println(map);
		for(Entry<Character, Integer> ch:map.entrySet()) {
			
			System.out.println("The character "+ch.getKey() +" is "+ch.getValue()+" number of times repeated ");
		}
	}

	public static void main(String[] args) {
		FindTheDupCharInString.findTheDuplicateCharInString("rajashekhar");

	}

}
