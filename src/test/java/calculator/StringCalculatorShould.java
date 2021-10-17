package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    StringCalculator stringCalculator = new StringCalculator();



	   @Test
	    void empty_string_should_return_0() {
	        assertEquals(0, stringCalculator.add(""));
	    }

	    @Test
	    void string_with_single_number_should_return_number_as_int() {
	        assertEquals(1, stringCalculator.add("1"));
	    }
	    
	    @Test
	    void string_with_two_numbers_should_return_number_as_int() {
	        assertEquals(3, stringCalculator.add("1,2"));
	    }
	    
	    @Test
	    void string_with_multiple_numbers_should_return_number_as_int() {
	        assertEquals(55, stringCalculator.add("1,2,3,4,5,6,7,8,9,10"));
	    }
	    
	    @Test
	    void string_with_new_line_and_numbers_should_return_number_as_int() {
	       assertEquals(55, stringCalculator.add("1\n2,3,4,5,6,7,8,9,10"));
	    }
	    
	    @Test
	    void string_with_different_delimiters_should_return_number_as_int() {
	       assertEquals(6, stringCalculator.add("//;\n1;2;3"));
	    }
	    
	   @Test
	    void string_with_negative_input_throw_Exception() {
	      assertEquals(stringCalculator.add("-1,9,-8"),"Negatives not allowed");
	    }
}
