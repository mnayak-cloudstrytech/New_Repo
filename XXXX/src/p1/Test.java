package p1;

import java.io.*;
import java.lang.*;
import java.util.Scanner;
 
class Test {
 
  static int maxSumUniqueSubarray(int[] arr, int n)
  {
    int[] preSum = new int[n+1];
 
    //ArrayList<Integer> preSum = new ArrayList<Integer>(n+1); 
    preSum[0] = 0;
 
    for (int i = 1; i <= n; i++)
    {
      preSum[i] = preSum[i-1]+arr[i-1];
    }
 
    // Create an hashset containing the index of last occurrence of an element
    int[] lastSeen = new int[10001];
 
    // Initialize the resultant global maximum sum with 0.
    int res = 0;
 
    // Initialize two pointers i and j at index 0
    // Traverse the array with the pointer i.
    int j = 0;
    for (int i = 0; i < n; i++)
    {
      int num = arr[i];
 
      // If the current element has occurred before,
      // reinitialize j with the maximum value between j and
      // the last occurrence of the current element.
      if (lastSeen[num] > 0)
      {
        j = Math.max(j, lastSeen[num]);
      }
 
      // Update the resultant global maximum sum
      res = Math.max(res, (preSum[i] + num - preSum[j]));
 
      // Update the last occurrence of current element to index i+1.
      lastSeen[num] = i+1;
    }
 
    return res;
  }
  public static void main(String[] args)
  {
 
   Scanner sc = new Scanner(System.in);
   System.out.println("number");
   int n = sc.nextInt();
 int[] arr = new int[n];
 System.out.println("elements");
 for (int i = 0; i < n; i++) {
	arr[i] = sc.nextInt();
}
    // Function Call
    int ans = maxSumUniqueSubarray(arr, 5);
 
    // Print the maximum sum
    System.out.println(ans);
  }
 
}
 
// This code is contributed by aditya942003patil
