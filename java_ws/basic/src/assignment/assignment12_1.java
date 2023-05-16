package assignment;

import java.util.Random;
import java.util.Scanner;

public class assignment12_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("배열의 개수를 입력하세요. (짝수로)");
			int n = sc.nextInt();
			sc.nextLine(); 
			int half = n / 2; 
			int[] arr = new int[half];

			Random random = new Random();
			for (int i = 0; i < half; i++) {
				int num = random.nextInt(half);
				int count = 0;
				if (count >= 2) { 
					for (int j = 0; j < i; j++) {
						if (arr[j] == num) {
							count++;
						}
					}
				} else if (count < 2) {
					arr[i] = num;
				} else {
					num = random.nextInt(half);
				}
			}

			for (int i = 0; i < half; i++) {
				System.out.print(arr[i] + " ");
				}
				System.out.println();
		}      
	}
}