package fhwien.BMI;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class BmiApplicationTests {


	@Autowired
	private BMIService bmiService;

	@Test
	public void testCalculateBMI() {
		double weight = 80;
		double height = 1.85;
		double expected = 23.37;
		double result = bmiService.calculateBMI(weight, height);
		assertEquals(expected, result, 0.01);
	}

}
