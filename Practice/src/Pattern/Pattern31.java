package Pattern;

public class Pattern31 {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			int x = i;
			for (int k = 1; k <= (i * 2) - 1; k++) {
				if (k < i) {
					System.out.print(x + " ");
					x--;
				} else {
					System.out.print(x + " ");
					x++;
				}

			}
			System.out.println();
		}
	}
}
