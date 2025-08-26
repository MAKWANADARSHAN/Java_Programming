package com.Array;

public class FindMaxSumOfSubArray {

//	static int print(int a[], int start, int end) {
//		int sum = 0;
//		for (int i = start; i <= end; i++) {
//			sum += a[i];
//		}
//		return sum;
//	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 1 };
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i; j < a.length; j++) {
//				if (sum < print(a, i, j))
//					sum = print(a, i, j);
//			}
//
//		}
//		System.out.println(sum);
//	}
		int maxSum = 0;
		for (int i = 0; i < a.length; i++) {
			int currenSum = 0;
			for (int j = i; j < a.length; j++) {
				currenSum += a[j];

				if (currenSum > maxSum)
					maxSum = currenSum;
			}
		}
		System.out.println(maxSum);
	}
}
