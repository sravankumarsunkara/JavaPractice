package Filters;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamsfiler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> lines =Arrays.asList("sravan", "kumar", "ram");
		List<String> result = lines.stream().filter(line->!"kumar".equals(line)).collect(Collectors.toList());
		
		result.forEach(System.out :: println);

	}

}
