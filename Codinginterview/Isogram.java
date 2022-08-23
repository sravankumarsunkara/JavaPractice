package Codinginterview;

import java.util.HashSet;
import java.util.Set;

public class Isogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isIsogram("pen"));

	}
   static boolean isIsogram(String s)
   {
	   boolean isogram =true;
	   char[] ch = s.toCharArray();
	   Set<Character> chs =new HashSet<Character>();
	   for(Character c : ch)
	   {
		   if(chs.contains(c)) {
			   isogram=false;
		   }
		   else {
			   chs.add(c);
		   }			   
	   }
	   return isogram;
	   
   }
}
