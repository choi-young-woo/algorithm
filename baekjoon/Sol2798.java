package baekjoon;

import java.util.Scanner;

public class Sol2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int max = 0;
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < n-2; i++) {
			for(int j = i+1; j < n-1; j++) {
				for(int k = j+1 ; k < n; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					if(sum <= m) {
						max = Math.max(max, sum);
					}
					
					if(max == m) {
						System.out.println(max);
						return;
					}
				}
			}
		}
		
		System.out.println(max);
		
		sc.close();
	}
}
