package com.kk.learning.collection;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CustomLinkedListTest {

	CustomLinkedList<Integer> list;

	@Before
	public void setUp() {
		list = new CustomLinkedList<>();
		assertEquals(list.getSize(), 0);
		list.add(1);
		list.add(2);
		list.add(3);
		assertEquals(list.getSize(), 3);
	}

	@After
	public void cleanUp() {
		list = null;
	}

	@Test
	public void testListAdd() {
		assertEquals(list.getHead().getData().intValue(), 1);
		assertTrue(list.getHead().getNext().getData() == 2);
		assertTrue(list.getHead().getNext().getNext().getData() == 3);
	}

	@Test
	public void testListRemoveFirst() throws ListEmptyException {
		list.removeFirst();
		assertEquals(list.getHead().getData().intValue(), 2);
		list.removeFirst();
		assertEquals(list.getHead().getData().intValue(), 3);

	}

	@Test(expected = ListEmptyException.class)
	public void testListRemoveFirstWithException() throws ListEmptyException {
		int size = list.getSize();
		for (int i = 0; i <= size; i++) {
			list.removeFirst();
		}
	}

	@Test
	public void testListRemoveFirstWithExceptionTry() {
		try {
			int size = list.getSize();
			for (int i = 0; i <= size; i++) {
				list.removeFirst();
			}

		} catch (Exception e) {
			assertTrue(e instanceof ListEmptyException);
			return;
		}

		fail("should have thrown ListEmptyException");
	}

}
