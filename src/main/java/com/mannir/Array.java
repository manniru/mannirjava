package com.mannir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		/**
		List<String> strs = null;
		strs.add("37");
		strs.add("36");
		String[] arr = new String[strs.size()];
		strs.toArray(arr);
		
		System.out.println(arr);
		*/
		
		//Convert from collection to array
		String[] arr2 = {"37","36","37'35"};
		List<String> lst = Arrays.asList(arr2);
		lst = Arrays.asList("38", "36", "35");
		
		//System.out.println(arr2.);
		
		//List<Element> list = Arrays.asList(array);
		
		Integer[] temp = new Integer[] { 37, 35, 37, 39, 38};
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(temp));
		
		System.out.println(list);

		
		//Arrays.asList(temp);
		for(int tm: temp) {
			System.out.println(tm);
		}
	}

}
