package com.stackroute.PE_3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest {
private static App a;

	@BeforeClass
	public static void setup() {
		 a = new App();

	}

	@AfterClass
	public static void teardown() {
		a = null;

	}
	
	
	@Test
	public void testChess() {
		String[][] exp =new String[][] {
			   {"WW|","BB|","WW|","BB|","WW|","BB|"},
	           {"BB|","WW|","BB|","WW|","BB|","WW|"},
	           {"WW|","BB|","WW|","BB|","WW|","BB|"},
	           {"BB|","WW|","BB|","WW|","BB|","WW|"},
	           {"WW|","BB|","WW|","BB|","WW|","BB|"},
	           {"BB|","WW|","BB|","WW|","BB|","WW|"}
	          };


		//int len=expected.length;
		String[][] ab=a.isChess();
		assertEquals(exp,ab);
   }
   @Test
   public void testChess1() {
	
	String[][] expected = {{"WW|","BB|","WW|","BB|","WW|","BB|"},
           {"BB|","BB|","WW|","BB|","WW|","BB|"},
           {"WW|","BB|","WW|","BB|","WW|","BB|"},
           {"BB|","BB|","WW|","BB|","WW|","BB|"},
           {"WW|","BB|","WW|","BB|","WW|","BB|"},
           {"BB|","BB|","WW|","BB|","WW|","BB|"},
           {"WW|","BB|","WW|","BB|","WW|","BB|"},
           {"WBB|","BB|","WW|","BB|","WW|","BB|"}};


	int len=expected.length;
	assertNotEquals(true,len);
	
}
   @Test
	public void testCons() {
	   //String expected="91,92,93,94,95,96,97";
	   //String accpt=;
	 assertEquals(true,a.isCons("91,92,93,94,95,96,97"));
		
		
	}
   
	@Test
	public void testConsFailure() {
		String expected="91,92,93,94,95,96,97";
		int explen=expected.length();		
		assertNotEquals(true,explen);
	}
	
	@Test
	public void testSizeNegative() {
		int x=-2;
		String accpt=a.sizeNegative(x);
		assertEquals("NegativeArraySizeException",accpt);}
	
	@Test 
	public void testNullPointer() {
		String accpt=a.nullPointer(null, 0);
		assertEquals("NullPointerException",accpt);
		
	}
	
	@Test
	public void testOutOfBound() {
		int[] arr= {1,2,3,4,5};
		String accpt=a.outofbound(arr, 7);
		assertEquals("IndexOutOfBoundsException",accpt);
	}
}
