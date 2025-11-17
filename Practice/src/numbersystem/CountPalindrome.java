package numbersystem;

public class CountPalindrome {

	public static boolean isPalindrom(int num) {
		int orinum = num;
		int revnum = 0;
		while (num > 0) {
			int tem = num % 10;
			revnum = revnum * 10 + tem;
			num /= 10;

		}
		return revnum == orinum;
	}

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i <= 1000; i++) {

			if (isPalindrom(i)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
