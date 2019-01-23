package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[][] testDatas = new int[][] {
			{1,2,3,4,1,2,5,7,1,2,8,6},
			{10,11,9,8,9,8,10,12,14,13,13,9,10}
		};
		
		for (int[] testData : testDatas ) {
			
			int[] result = removeDuplicates(testData);
			
			System.out.println("Array with Duplicates       : " + Arrays.toString(testData));
            System.out.println("After removing duplicates   : " + Arrays.toString(removeDuplicates(result)));
			
		}

	}
	
	public static int[] removeDuplicates(int[] numberWithDuplicates) {
		
		Arrays.sort(numberWithDuplicates);
		
		List<Integer> list = new ArrayList<>();
		for (int num : numberWithDuplicates) {
			if (!list.contains(num)) {
				list.add(num);
			}
		}
		
		int[] result = new int[list.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = list.get(i);
		}
		return result;
	}

}
