package com.kk.learning.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id+" : "+name;
	}
	
	

}

public class CollectionComparator {

	

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<>();
		
		list.add(new Person(1, "Kiran"));
		list.add(new Person(3, "Ravi"));
		list.add(new Person(5, "Sugandharaju"));
		list.add(new Person(2, "Geetha"));
		
		Collections.sort(list,new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				if(p1.getId()>p2.getId())
				{
					return 1;
				}
				else if(p1.getId()<p2.getId())
				{
					return -1;
				}
				
				return 0;
				
				//return p1.getName().compareTo(p2.getName());
			}
			
			
			
		});
		
		for(Person person :list)
		{
			System.out.println(person);
		}


	}

}
