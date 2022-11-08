package com.java.class17;
// AAAAA
// AAAA
// AAA
// AA
// A

public class NestedForLoopExample5 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 6 - i; j++) {
				System.out.print("A");
			}

			System.out.println();
		}

	}
}
