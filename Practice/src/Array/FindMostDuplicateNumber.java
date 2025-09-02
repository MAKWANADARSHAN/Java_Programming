package Array;

public class FindMostDuplicateNumber {

	public static void main(String[] args) {
		int a[] = { 10, 20, 10, 30, 20, 10 };
		boolean b[] = new boolean[a.length];

		int maxCount = 0;
		int mostRepited = a[0];

		for (int i = 0; i < a.length; i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
						b[j] = true;
					}
				}
				if (count > maxCount) {
					maxCount = count;
					mostRepited = a[i];
				}
			}
		}

		System.out.println(mostRepited);
	}
}
