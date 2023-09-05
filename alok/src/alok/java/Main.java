package alok.java;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int []arr= {2,3,4,5,2,7,8};
		for(int i=1;i<arr.length;i++) {
			for(int j=1;j<arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}

}
