package numbersystem;

public class DecToHexadec {
	public static void main(String[] args) {
		int n = 910;
		System.out.println(decToHexa(n));
	}

	public static String decToHexa(int n) {
		String hexa = "";
		while (n > 0) {
			int rem = n % 16;
			if (rem > 9) {
				hexa = (char) (rem + 55) + hexa;
			} else {
				hexa = rem + hexa;
			}
			n /= 16;
		}
		return hexa;
	}
}
