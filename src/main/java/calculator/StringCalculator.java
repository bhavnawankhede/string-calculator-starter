package calculator;

class StringCalculator {
	public int add(String input) {
    	String numbers[]=getSplit(input);
    	if (input.isEmpty()) {
            return 0;
        } 
    	else if(numbers.length>1) {
    		return getSum(numbers);
    	}
    	 return stringToInt(input);
    }

	
	private int getSum(String[] numbers) {
		 int sum = 0;
	        for (String currentNumber:numbers) {
	           // if (stringToInt(currentNumber) > 1000) {
	                //continue;
	           // }
	            sum += stringToInt(currentNumber) ;
	        }
	 return sum;
	}
	
	private String[] getSplit(String string) {
		if(string.startsWith("//")) {
			Matcher matcher=Pattern.compile("//(.)\n(.*)").matcher(string);
			Matcher matcher1=Pattern.compile("//(...)\n(...*)").matcher(string);
			if(matcher.matches()) {
				String delimiter=matcher.group(1);
				String toSplit=matcher.group(2);
				return toSplit.split(delimiter);
			}
			
			if(matcher1.matches()) {
				String delimiter=matcher1.group(1);
				String toSplit=matcher1.group(2);
				return toSplit.split(delimiter);
			}
		}
		return string.split(",|\n");
	}
	
	private int stringToInt(String input) {
		int num = Integer.parseInt(input);
        if (num < 0) {
           throw new IllegalArgumentException("Negatives not allowed");
        	
        } else {
            return num;
        }
	}

}