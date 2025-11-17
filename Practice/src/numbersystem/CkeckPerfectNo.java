package numbersystem;

public class CkeckPerfectNo {
	public static boolean isPerfect(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum == num;
	}

	public static void main(String[] args) {
		int num = 28;

		if (isPerfect(num)) {
			System.out.println(num + " is perfect number");
		} else {
			System.out.println(num + " is not perfect number");
		}
	}

}
