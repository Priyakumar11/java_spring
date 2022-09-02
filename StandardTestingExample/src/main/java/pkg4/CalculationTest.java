package pkg4;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
@RunWith(JUnitPlatform.class)
public class CalculationTest {

	@Test
	void test() {
		Calculaton obj=new Calculaton();
		assertEquals(11, obj.addition(5,6));
	}

}
