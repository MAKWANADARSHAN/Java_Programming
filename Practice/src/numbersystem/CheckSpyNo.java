package numbersystem;

public class CheckSpyNo {
	static boolean checkSpyNo(int num) {
		int product = 1;
		int sum = 0;
		while (num > 0) {
			int tem = num % 10;
			product *= tem;
			sum += tem;
			num /= 10;
		}
		return sum == product;
	}

	public static void main(String[] args) {
		boolean check = checkSpyNo(1124);
		if (check) {
			System.out.println("this is a spy number ");
		} else {
			System.out.println("this is a not spy number ");
		}
	}
}
