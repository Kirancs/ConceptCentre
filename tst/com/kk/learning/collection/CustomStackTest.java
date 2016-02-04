package com.kk.learning.collection;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CustomStackTest {

	CustomStack<Integer> stack;

	@Before
	public void setUp() throws Exception {
		stack = new CustomStack<>();
		stack.push(0);
		stack.push(1);
		stack.push(2);
	}

	@Test
	public void testStackPushPeak() {

		stack.push(3);
		assertTrue(stack.peak() == 3);
		stack.push(4);
		assertTrue(stack.peak() == 4);

	}

	@Test
	public void testStackPop() {
		assertTrue(stack.pop() == 2);
		assertTrue(stack.peak() == 1);
		assertTrue(stack.pop() == 1);
		assertTrue(stack.pop() == 0);
	}

	@Test
	public void testStackPopException() {
		try {

			int size = stack.size();
			for (int i = 0; i <=size; i++) {
				stack.pop();
			}
		} catch (Exception e) {
			assertTrue(e instanceof RuntimeException);
			return;
		}
		fail("Stack Pop Exception test failed");
	}

}
