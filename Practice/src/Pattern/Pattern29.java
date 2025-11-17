package Pattern;

//         1 
//       1 2 1 
//     1 2 3 2 1 
//   1 2 3 4 3 2 1 
// 1 2 3 4 5 4 3 2 1 

public class Pattern29 {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			int x = 1;
			for (int k = 1; k <= (i * 2) - 1; k++) {
				if (k < i) {
					System.out.print(x + " ");
					++x;
				} else {
					System.out.print(x + " ");
					--x;
				}

			}
			System.out.println();
		}
	}
}
