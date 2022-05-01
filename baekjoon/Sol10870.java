package baekjoon;

import java.util.Scanner;

public class Sol10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result = fivo(sc.nextInt());
		
		System.out.println(result);
		
		sc.close();
	}
	
	public static int fivo(int n) {
		
		if(n >= 2) {
			return fivo(n-1) + fivo(n-2);
		}
		else if(n == 1) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
