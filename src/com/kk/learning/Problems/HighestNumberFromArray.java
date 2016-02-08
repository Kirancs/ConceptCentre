package com.kk.learning.Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HighestNumberFromArray {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		list.add(01);
		list.add(21);
		list.add(21);
		list.add(2);
		
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer num1, Integer num2) {
				String str1 = Integer.toString(num1)+Integer.toString(num2);
				String str2 =Integer.toString(num2)+Integer.toString(num1);
				System.out.println("--"+str1+"--"+str2);
				//System.out.println("--"+num1.toString());
				return str2.compareTo(str1);
				
			}
			
		});
		String finalNumber="";
		
		for(Integer i:list)
		{
			System.out.println(i);
			finalNumber+=Integer.toString(i);
		}
		
		System.out.println("The highest number possible is ="+finalNumber);
		
		
	}

}
