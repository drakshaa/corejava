package corejava;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		int[] oddnums = getOdd();
		System.out.println("Odd numbers:");
		System.out.println(Arrays.toString(oddnums));
		
		int[] divisibleBy5 = getDivisibleBy5();
		System.out.println("Numbers divisible by 5:");
		System.out.println(Arrays.toString(divisibleBy5));
	}

	static int[] getOdd() {
		int[] oddnums = new int[50];
		int j = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				oddnums[j] = i;
				j++;
			}
		}
		return oddnums;	
	}
	
	static int[] getDivisibleBy5() {
		int[] divisibleBy5 = new int[21];
		int j = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 5 == 0) {
				divisibleBy5[j] = i;
				j++;
			}
		}
		return divisibleBy5;
	}
}
