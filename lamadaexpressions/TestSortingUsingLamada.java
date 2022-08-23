package lamadaexpressions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestSortingUsingLamada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			List<Developer> listDevs = getDevelopers();
			
			System.out.println("Before Sort");
			for (Developer developer : listDevs) {
				System.out.println(developer);
			}
			
			System.out.println("After Sort");
			
			//lambda here!
			listDevs.sort((Developer o1, Developer o2)->o1.getAge()-o2.getAge());
		
			//java 8 only, lambda also, to print the List
			listDevs.forEach((developer)->System.out.println(developer));
			
			System.out.println("SORTING BY SALRY");
			listDevs.sort((Developer o1, Developer o2)->o1.getSalary().compareTo(o2.getSalary()));
			
			listDevs.forEach((developer)->System.out.println(developer));
		}

		private static List<Developer> getDevelopers() {

			List<Developer> result = new ArrayList<Developer>();

			result.add(new Developer("sravan", new BigDecimal("70000"), 33));
			result.add(new Developer("kumar", new BigDecimal("80000"), 20));
			result.add(new Developer("siva", new BigDecimal("100000"), 10));
			result.add(new Developer("iris", new BigDecimal("170000"), 55));
			
			return result;

		}

}
