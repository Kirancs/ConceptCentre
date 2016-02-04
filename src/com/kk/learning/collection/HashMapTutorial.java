package com.kk.learning.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

class Employee{
	private int id;
	private String name;
	
	
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}

public class HashMapTutorial {
	
	
	public static void main(String[] args)
	{
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Kiran");
		hashMap.put(2, "Ravi");
		hashMap.put(3, "CPS");
		hashMap.put(4, "CSG");
		hashMap.put(1, "KK");
		
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.values());
		
		if(hashMap.containsValue("Kiran"))
		{
			System.out.println("The hashmap contains the value Kiran");
		}
		
		System.out.println(hashMap.get(5));
		
		
		
		//Using Custom classes in HashMap
		
		Map<Employee,Integer> userDefinedObjectMap = new HashMap<>();
		
		Employee emp1=new Employee(1, "KK");
		Employee emp2 = new Employee(2,"RK");
		Employee emp3 = new Employee(3, "CPS");
		Employee emp4 =new Employee(1, "KK");
		
		userDefinedObjectMap.put(emp1, 1);
		userDefinedObjectMap.put(emp2, 2);
		userDefinedObjectMap.put(emp3, 3);
		userDefinedObjectMap.put(emp4, 4);
		
		for(Map.Entry<Employee, Integer> entry : userDefinedObjectMap.entrySet())
		{
			System.out.println(entry);
		}
		
		
		
	}
	
	

}
