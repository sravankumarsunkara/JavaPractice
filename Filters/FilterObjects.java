package Filters;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lamadaexpressions.Developer;

public class FilterObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Developer> persons = Arrays.asList(
	    		 new Developer("sravan", new BigDecimal("70000"), 33),
	    		 new Developer("kumar", new BigDecimal("705000"), 99),
	    		 new Developer("Tarak", new BigDecimal("70000"), 39));
		List<String> output = persons.stream().map(name->name.getName()).collect(Collectors.toList());
		for(String res : output){
			System.out.println(res);
		}
		System.out.println(output);
	}

}
