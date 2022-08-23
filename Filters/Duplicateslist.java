package Filters;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicateslist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> list = Arrays.asList(10,20,23,24,1,5,23,88,99,67,10,10);
     Set<Integer> unique =new HashSet<Integer>();
     list.stream().filter(x->!unique.add(x)).collect(Collectors.toSet()).forEach(x->System.out.println(x));
     
	}

}
