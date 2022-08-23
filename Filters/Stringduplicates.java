package Filters;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stringduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str = "Welcome to the world of software developer welcome world";
     List<String> list = Arrays.asList(str.split(" "));
     Map<String,Long> str1 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	 System.out.println(str1);
	}

}
