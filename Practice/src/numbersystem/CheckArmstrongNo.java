package numbersystem;

public class CheckArmstrongNo {

	static int Digit(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n /= 10;
		}
		return count;
	}

	static int findPowar(int p, int q) {
		int power = 1;
		for (int i = 1; i <= q; i++) {
			power *= p;

		}
		return power;
	}

	static boolean isArmstrong(int num) {
		int org = num;
		int digit = Digit(num);
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum += findPowar(rem, digit);
			num /= 10;

		}
		return sum == org;
	}

	public static void main(String[] args) {
		System.out.println(isArmstrong(407));
	}
}
