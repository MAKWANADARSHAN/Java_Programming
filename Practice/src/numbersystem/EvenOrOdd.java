package numbersystem;

public class EvenOrOdd {
	public static boolean isOdd(int n) {
		return (n & 1) == 1;
	}

	public static void main(String[] args) {
		int n = 66;
		if (isOdd(n)) {
			System.out.println("odd number");
		} else {
			System.out.println("even number");
		}
	}
}
