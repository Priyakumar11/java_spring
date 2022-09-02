package pkg2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
@RunWith(JUnitPlatform.class)
class MathUtilTest {

	@Test
	  void test_Add() {
	    assertEquals(5, MathUtil.add(3, 2));
	  }
	  
	  @Test
	  void test_Multiply() {
	    assertEquals(15, MathUtil.multiple(3, 5));
	  }

	  @Test
	  void test_Devide() {
	    assertEquals(5, MathUtil.devide(25, 5));
	  }
	  
	  @Test
	  void testIs_Prime() {
	    assertTrue(MathUtil.isPrime(13));
	  }
}
