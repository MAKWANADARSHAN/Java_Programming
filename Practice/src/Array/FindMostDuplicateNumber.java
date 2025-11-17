package Array;

public class FindMostDuplicateNumber {

//	public static void name(int[] a) {
//		Map<Integer, Integer> map = new HashMap<>();
//
//		for (int value : a) {
//			map.put(value, map.getOrDefault(value, 0) + 1);
//		}
//
//		int max = 0, mostRepeated = a[0];
//		for (var entry : map.entrySet()) {
//			if (entry.getValue() > max) {
//				max = entry.getValue();
//				mostRepeated = entry.getKey();
//			}
//		}
//
//		System.out.println(mostRepeated);
//
//	}

	public static void main(String[] args) {
		int a[] = { 10, 20, 10, 30, 20 };
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
