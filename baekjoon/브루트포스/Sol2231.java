package baekjoon.브루트포스;

import java.util.Scanner;

public class Sol2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 0 ; i < 1000000; i++) {
			
			sum = i;
			
			while(true) {
				if(i / 10 == 0) {
					sum += i % 10;
					break;
				}
				
				sum += i % 10;
				i /= 10;
			}
			
			if(sum == n) {
				System.out.println(sum);
				break;
			}
		}
		
		if(sum != n) {
			System.out.println(0);			
		}
		
		sc.close();
	}
}
