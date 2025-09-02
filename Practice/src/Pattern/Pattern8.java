package Pattern;

public class Pattern8 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			char a = 'A';
			for (int j = 1; j <= 5; j++) {
				System.out.print(a + " ");
				// System.out.print((char) (i + 64) + " ");
				a++;
			}
			System.out.println();
		}
	}
}
