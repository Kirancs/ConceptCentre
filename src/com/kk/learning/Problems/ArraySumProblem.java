package com.kk.learning.Problems;

import java.util.HashMap;

import org.junit.experimental.theories.Theories;

public class ArraySumProblem {

	public static void main(String[] args) {
		int[] numbers = new int[10000000];
		for(int i=0;i<10000000;i++) {
			numbers[i] = 20;
		}

		int sumRequired = 40;
		sumPairPrint(numbers, sumRequired);
		sumPairHashMap(numbers, sumRequired);
	}

	public static void sumPairPrint(int[] numbers, int sum) {
		long start = System.currentTimeMillis();
		int size = numbers.length;
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				if (numbers[i] + numbers[j] == sum && (i != j)) {
					//System.out.println("( " + numbers[i] + "," + numbers[j] + ")");
					System.out.println(numbers.length);
				}
			}
		}
		long endtime = System.currentTimeMillis();
		System.out.println("Time Taken was " + (endtime - start));
	}

	public static void sumPairHashMap(int[] numbers, int sum) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();

		//System.out.println(" Using hashMap");
		long start = System.currentTimeMillis();
		for (int i : numbers) {
			int numRequired = sum - i;
			if (hashMap.get(numRequired) == null) {
				hashMap.put(i, i);
			} else {
				//System.out.println("( " + i + "," + numRequired + ")");
			}
		}
		long endtime = System.currentTimeMillis();

		System.out.println("Hashmap Time Taken was " + (endtime - start));

	}

}
