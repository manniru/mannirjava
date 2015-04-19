package com.mannir.examples;

public class Test1 {

	public static void main(String[] args) {
		Entry<String, String> grade = new Entry<String, String>("Mike", "A");
		Entry<String, Integer> mark = new Entry<String, Integer>("Mike", 100);
		System.out.println("grade: " + grade);
		System.out.println("mark: " + mark);
		 
		Entry<Integer, Boolean> prime = new Entry<Integer, Boolean>(13, true);
		if (prime.getValue()) System.out.println(prime.getKey() + " is prime.");
		else System.out.println(prime.getKey() + " is not prime.");
	}

}
