package com.java.class17;

import java.util.Scanner;
//    A
//   AA
//  AAA
// AAAA
//AAAAA

public class NestedForLoopExample7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			for (int s = 1; s <= num - i; s++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("A");
			}

			System.out.println();
		}

	}
}
