package io.datajek.springmvc.UnitTest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class ArrayMethodsTest {

	ArrayMethods arrayMethods = null;
	
	@BeforeAll
	static void beforeAllTests() {
	    System.out.println("Run this code before all tests");
	}
	
	@AfterAll
	static void afterAllTests() {
	    System.out.println("Run this code after all tests");
	}
	
	@BeforeEach
	void init(){
	    //Initialize the object here
	    System.out.println("Initializing before test"); 
	    arrayMethods = new ArrayMethods();
	}
	
	@AfterEach
	void afterEachTest(){
	    System.out.println("Clean up after test");
	}
	@Test
	public void test_findIndex() {
		int result = arrayMethods.findIndex(new int[] {8,4,6}, 4);
		assertEquals(result, 1);
	}
	
	@Test
	public void testfindIndex_numberNotInArray() {
		ArrayMethods arrayMethods = new ArrayMethods();
	    assertEquals(-1, arrayMethods.findIndex(new int[]{8,4,5}, 1),"The findIndex method finds the index of a given number");
	}
	
	
	@Test
	public void testfindIndex_emptyArray() {
	    ArrayMethods arrayMethods = new ArrayMethods();
	    assertEquals(-1, arrayMethods.findIndex(new int[]{}, 1));
	}
	
	@Test
	public void testArraySort() {
		int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
		ArrayMethods arrayMethods = new ArrayMethods();
		assertArrayEquals(new int[] {-42, -2, 5, 7, 23, 87, 509 }, arrayMethods.sotrArray(arr));
	}

	@Test
	public void checkTrue() {
		ArrayMethods arrayMethods = new ArrayMethods();
		assertTrue(arrayMethods.getTrue());
	}
	
	@Test
	public void checkFalse() {
		ArrayMethods arrayMethods = new ArrayMethods();
		assertFalse(arrayMethods.getFalse());
	}
	
	@Test
	public void checkNull() {
		ArrayMethods arrayMethods = new ArrayMethods();
		assertNull(arrayMethods.getnull());
	}
	
	@Test
	public void checkNotNull() {
		ArrayMethods am = new ArrayMethods();
		int result = am.findIndex(new int[] {8,4,6}, 4);
		assertNotNull(result);
	} 
	
	@Test
	@Disabled  // Used to skip test case
	public void testSortArray() {
		// Used to fail a test
	    fail("unimplemented method");
	}
	
	@Test
	public void testfindIndex_indexOutOfBound() {
	    ArrayMethods arrayMethods = new ArrayMethods();
	    assertThrows(ArrayIndexOutOfBoundsException.class, ()->arrayMethods.printArray(
	                                                               new int[] {1,8,5}, 3));
	}
	
	@Test	
	public void testfindIndex() {
		// Testing multiple scenario at once
	    ArrayMethods arrayMethods = new ArrayMethods();
	    assertAll(
	    () -> assertEquals(1, arrayMethods.findIndex(new int[]{8,4,5}, 4)),
	    () -> assertEquals(-1, arrayMethods.findIndex(new int[]{8,4,5}, 1)),
	    () -> assertEquals(-1, arrayMethods.findIndex(new int[]{}, 1))
	    );
	}
}
