package com.kk.learning.collection;

public class CustomQueue<T> {
	
	private CustomLinkedList<T> list;

	public CustomQueue() {
		super();
		list = new CustomLinkedList<>();
	}
	
	public boolean add(T data)
	{
		list.add(data);
		return true;
	}
	
	public T remove()
	{
		T data = list.getHead().getData();
		try {
			list.removeFirst();
		} catch (ListEmptyException e) {
			throw new RuntimeException("Empty Queue - Cannot Remove");
		}
		return data;
	}
	
	

}
