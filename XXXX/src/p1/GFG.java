package p1;

// Java program for the above approach

import java.io.*;
import java.lang.Math;
import java.util.*;

public class GFG {
	public static int maxSumSubarray(int[] arr) {

		int i = 0, j = 1;
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(arr[0]);
		int sum = arr[0];

		int maxsum = sum;

		while (i < arr.length - 1 && j < arr.length) {

			if (!set.contains(arr[j])) {

				sum = sum + arr[j];
				maxsum = Math.max(sum, maxsum);

				set.add(arr[j++]);
			}

			else {

				sum -= arr[i];

				set.remove(arr[i++]);
			}
		}

		return maxsum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("number");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int ans = maxSumSubarray(arr);

		System.out.println(ans);
	}
}