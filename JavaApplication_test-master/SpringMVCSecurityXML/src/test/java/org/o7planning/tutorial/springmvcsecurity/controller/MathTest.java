package org.o7planning.tutorial.springmvcsecurity.controller;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathTest {

	private int value1;
	private int value2;
	private static Calculation cal = null;
	
	/*It is used to write code that we want to run before all test cases.
	 * 
	 * */
	@BeforeClass
	public static void initialise(){
		cal = new Calculation();
	}
	
	/*To Initialize the variables by setUp() method.
	 * @Before will be executed before every test case.
	 * */
	@Before
	public void setUp() throws Exception {
		value1 = 3;
		value2 = 5;
	}

	/*To Clean-Up the variables after a test by cleanUp() method.
	 * will be executed after every test case.
	 * */
	@After
	public void cleanUp() throws Exception {
		value1 = 0;
		value2 = 0;
	}

	@Test
	public void testAdd() {
		int total = 8;
		int sum = cal.add(value1, value2);
		Assert.assertEquals(sum, total);
	}

	@Test
	public void testFailedAdd() {
		int total = 9;
		int sum = cal.add(value1, value2);
		Assert.assertNotSame(sum, total);
	}
	
	@Test
	public void testSub() {
		int total = 0;
		int sub = cal.sub(4, 4);
		Assert.assertEquals(sub, total);
	}

}
