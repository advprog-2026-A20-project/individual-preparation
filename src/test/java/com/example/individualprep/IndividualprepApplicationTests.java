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
	void testVectordotProduct() {
		VectorUtility vectorUtility = new VectorUtility();
		double[] v1 = {1.0, 2.0, 3.0};
		double[] v2 = {4.0, 5.0, 6.0};
		double result = vectorUtility.dotProduct(v1, v2);
		assert result == 32.0; 
	}
	

}
