package com.kk.learning.collection;

public class CustomStack<T> {
	
	private CustomLinkedList<T> list;
	
	public CustomStack() {
		super();
		list = new CustomLinkedList<>();
	}

	/**
	 * 
	 * @param data
	 * @return
	 */
	public boolean push(T data){
		list.add(data);
		return true;
	}
	
	public int size()
	{
		return list.getSize();
	}
	
	/**
	 * 
	 * @return
	 */
	public T pop()
	{
		T data=list.getLast().getData();
		try {
			list.removeLast();
		} catch (ListEmptyException e) {
			throw new RuntimeException("Empty Stack - Cannot pop");
		}
		return data;
	}
	
	
	public T peak()
	{
		return list.getLast().getData();
	}
	
	public static void main(String[] args)
	{
		CustomStack<Integer> stack = new CustomStack<>();
		stack.push(0);
		stack.push(1);
		System.out.println(stack.peak());
		stack.pop();
		System.out.println(stack.peak());
		stack.pop();
		//stack.pop();
		
	}

}
