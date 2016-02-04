package com.kk.learning.collection;

public class CustomLinkedList<T> {

	// linked list

	private DataNode<T> head;
	private DataNode<T> last;
	private int size;
	
	public DataNode<T> getHead() {
		return head;
	}

	public void setHead(DataNode<T> head) {
		this.head = head;
	}

	public DataNode<T> getLast() {
		return last;
	}

	public void setLast(DataNode<T> last) {
		this.last = last;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void add(T inputData) {
		if (head == null) {
			DataNode<T> tempNode = new DataNode<T>(inputData, null, null);
			setHead(tempNode);
			setLast(tempNode);
		} else {
			if (getLast() != null) {
				DataNode<T> tempNode = new DataNode<T>(inputData, null, getLast());
				getLast().setNext(tempNode);
				last=tempNode;
			}
		}
		setSize(getSize() + 1);
	}

	public void addFirst(T inputData) {
		if (head == null) {
			add(inputData);
		} else {
			DataNode<T> tempNode = new DataNode<T>(inputData, getHead(), null);
			getHead().setPrev(tempNode);
			setHead(tempNode);
			setSize(getSize() + 1);
		}
	}

	public void printList() {
		if (getHead() == null) {
			System.out.println("The list is empty");
		} else {
			DataNode<T> itrNode = this.getHead();
			do {
				System.out.print(itrNode.getData() + "\t");
				itrNode = itrNode.getNext();

			} while (itrNode != null);
		}
		System.out.println();
	}
	
	public boolean removeFirst() throws ListEmptyException
	{
		if(head==null)
		{
			throw new ListEmptyException("Tried to delete from an empty list");
		}
		DataNode<T> tempNode;
		if(head==last)
		{
			head=null;
			last=null;
			return true;
		}
		
		tempNode = head.getNext();
		tempNode.setPrev(null);
		head=tempNode;
		size--;
		return true;
	}
	
	public boolean removeLast() throws ListEmptyException
	{
		
		if(last==null||head==null)
		{
			throw new ListEmptyException("Tried to delete from an empty list");
		}
		
		DataNode<T> tempNode;
		if(head==last)
		{
			tempNode=head;
			head=null;
		}else{
			tempNode = last.getPrev();
		}
		
		tempNode.setNext(null);;
		last=tempNode;
		//System.out.println(tempNode.getData());
		size--;
		return true;
	}

	public static void main(String[] args) throws ListEmptyException {
		CustomLinkedList<Integer> list = new CustomLinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.addFirst(0);
		list.printList();
		list.removeLast();
		list.removeLast();
		list.removeLast();
		//list.removeLast();
		//list.removeFirst();
		//list.removeFirst();
		list.removeLast();
		list.printList();
	}
}