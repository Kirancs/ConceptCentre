package com.kk.learning.collection;

public class ListEmptyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ListEmptyException(){
		super();
	}
	
	public ListEmptyException(String message)
	{
		super(message);
	}

}
