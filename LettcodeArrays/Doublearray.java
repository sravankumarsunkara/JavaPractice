package LettcodeArrays;

import java.util.HashSet;
import java.util.Set;

public class Doublearray {

	    public boolean checkIfExist(int[] arr) {
	        Set<Double> set = new HashSet<>();
	        for (int x : arr) {
	            if (set.contains((double)x / 2) || set.contains((double)x * 2))
	                return true;
	            set.add((double)x);
	        }
	        return false;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,7,9,2,4};
		Doublearray da =new Doublearray();
		boolean bol = da.checkIfExist(arr);
		System.out.println(bol);
	}

}
