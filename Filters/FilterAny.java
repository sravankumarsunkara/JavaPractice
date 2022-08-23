package Filters;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import lamadaexpressions.Developer;

public class FilterAny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Developer> persons = Arrays.asList(
    		 new Developer("sravan", new BigDecimal("70000"), 33),
    		 new Developer("kumar", new BigDecimal("705000"), 99),
    		 new Developer("Tarak", new BigDecimal("70000"), 39));
     Developer result = persons.stream().filter(x->"sravan".equals(x.getName())).findAny().orElse(null);
     System.out.println(result);
     Developer result1 = persons.stream().filter(x->"sam".equals(x.getName())).findAny().orElse(null);
     System.out.println(result1);
	}

}
