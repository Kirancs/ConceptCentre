package com.kk.learning.collection;

public class DataNode<T> {

	private DataNode<T> next;
	private DataNode<T> prev;
	private T data;

	public DataNode(T data, DataNode<T> next, DataNode<T> prev) {
		this.next = next;
		this.prev = prev;
		this.data = data;
	}

	public DataNode<T> getNext() {
		return next;
	}

	public void setNext(DataNode<T> next) {
		this.next = next;
	}

	public DataNode<T> getPrev() {
		return prev;
	}

	public void setPrev(DataNode<T> prev) {
		this.prev = prev;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}