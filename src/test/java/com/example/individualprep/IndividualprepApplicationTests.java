package com.example.individualprep;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.individualprep.service.ArithmeticUtility;
import com.example.individualprep.service.VectorUtility;


@SpringBootTest
class IndividualprepApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testArithmeticUtilityBean() {
		ArithmeticUtility arithmeticUtility = new ArithmeticUtility();
		assert arithmeticUtility != null;
	}

	@Test
	void testVectorUtilityBean() {
		VectorUtility vectorUtility = new VectorUtility();
		assert vectorUtility != null;
	}

	@Test
	void testArithmeticSubtract() {
		ArithmeticUtility arithmeticUtility = new ArithmeticUtility();
		double result = arithmeticUtility.subtract(10.0, 4.0);
		assert result == 6.0;
	}

	@Test
	void testArithmeticSubstractNegativeResult() {
		ArithmeticUtility arithmeticUtility = new ArithmeticUtility();
		double result = arithmeticUtility.subtract(4.0, 10.0);
		assert result == -6.0;
	}

}
