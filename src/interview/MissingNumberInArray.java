package interview;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumberInArray {

	public static void main(String[] args) {
		printMissingNumberInArray(new int[]{1,3,5,6}, 6);
		printMissingNumberInArray(new int[]{1,3,5,6,11,24}, 24);
		printMissingNumberInArray(new int[]{2,3}, 3);
	}

	private static void printMissingNumberInArray(int[] numbers, int count) {
		
		BitSet bitSet = new BitSet(count);
		
		for (int number : numbers) {
			bitSet.set(number - 1);
		}
		
		int missingNumber = count - numbers.length;
		int lastMissingIndex = 0;
		
		System.out.println("-------------------------------------");
		System.out.println("Array Contents : " + Arrays.toString(numbers));
		
		for (int i = 0; i < missingNumber; i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			System.out.println("	Missing Number : " + ++lastMissingIndex);
		}
	}

}
