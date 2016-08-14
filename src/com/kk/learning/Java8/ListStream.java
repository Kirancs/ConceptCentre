package com.kk.learning.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ListStream {
	
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println();
		
		//Different ways to iterate and print the array
		System.out.println();
		list.forEach(new Consumer<Integer>(){
			public void accept(Integer value){
				System.out.print(value + " ");
			}
		});
		System.out.println();
		list.forEach((Integer value)->System.out.print(value + " "));
		System.out.println();
		list.forEach((value) -> System.out.print(value + " "));
		System.out.println();
		list.forEach(value -> System.out.print(value + " "));
		System.out.println();
		list.forEach(System.out::println);
		
		int total = list.stream()
						.reduce(0,(c,e) -> c+e);
		
		System.out.println("The total is : "+total);
		if(list.size()!=0)
		{
			System.out.println("The mean is : " +(total/list.size()));
		}
		
		
		
		
		
		
	}

}
