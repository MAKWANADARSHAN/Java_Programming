package numbersystem;

import java.util.Scanner;

public class FactorOrDiviser {

	public static void main(String[] args) {

		System.out.println("Enter The Number");
		int num = new Scanner(System.in).nextInt();
//		for (int i = 1; i <= num; i++) 
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}

		}
		System.out.println(num);
	}
}
