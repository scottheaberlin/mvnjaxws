package com.scotth.mvnjaxws;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for SampleServiceImpl.
 */
public class SampleServiceTest extends TestCase {

	SampleService objUnderTest;

	@Before
	public void setUp() {
		objUnderTest = new SampleService();
	}

	@Test
	public void testSayHello() {
		assertEquals("Hello, junit", objUnderTest.sayHello("junit"));
	}
}
