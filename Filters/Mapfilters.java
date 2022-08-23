package Filters;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapfilters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> alpha = Arrays.asList("a", "b", "c", "d");
		List<String> upstream = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upstream);
		
		List<Integer> num = Arrays.asList(1,2,3,4,5);
	    List<Integer> multiplyoiutput = num.stream().map(n -> n * 2).collect(Collectors.toList());
	    System.out.println(multiplyoiutput);
	}

}
