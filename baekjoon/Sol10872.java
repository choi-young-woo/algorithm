package baekjoon;

import java.util.Scanner;

public class Sol10872 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int result = factorial(sc.nextInt());
		
		System.out.println(result);
		
		sc.close();
	}
	
	public static int factorial(int n) {
		
		if(n == 0) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
		
	}
}
