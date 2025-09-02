package numbersystem;

public class CheckUniqueNo {

	public static boolean isUnique(int num) {
		boolean b[] = new boolean[9];
		while (num > 0) {
			int rem = num % 10;
			if (b[rem] == true) {
				return false;
			}
			b[rem] = true;
			num /= 10;
		}
		return true;
	}

	public static void main(String[] args) {
		int num = 123452;
		System.out.println(isUnique(num));
	}

}
