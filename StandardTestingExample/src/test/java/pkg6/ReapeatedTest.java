package pkg6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
@RunWith(JUnitPlatform.class)
class ReapeatedTest {

	 @Test
	    @DisplayName("Add operation test")
	    @RepeatedTest(5)
	    void addNumber() {
	        Calculator calculator = new Calculator();
	        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	        System.out.println("===addNumber testcase executed===");
	    }

}
