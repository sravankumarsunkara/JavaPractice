package Codinginterview;

public class Nfibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(16));

	}
    public static int fib(int n) {
    	
    	if(n<=1) {
    		return n;
    	}
    	else {
		return fib(n-1)+fib(n-2);
    	}
    	
    }
}
