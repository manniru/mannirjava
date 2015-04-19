package com.mannir;

import org.junit.Test;

import junit.framework.TestCase;

public class Test1 extends TestCase {
	double[] NUMBERS = {1, 24, 45, 62, 85, 8, 91, 3, 5, 56, 9};

	@Test
	public void calculate_average_of_array_apache () {
	    
	    Mean mean = new Mean();
	    double average = mean.evaluate(NUMBERS);
	    
	    assertEquals(35.36363636363637, average, 0);
	}


}
