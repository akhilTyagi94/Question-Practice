import java.util.Arrays;


public class Main {
	private static int[] bubbleSort(int[] inputArray) {
		int numberOfPasses = 0;

		int swapCount = 1;

		while(swapCount > 0) {
			swapCount = 0;
			for(int j = 1; j < inputArray.length; j++) {
				if (inputArray[j] < inputArray[j - 1]) {

					// swap elements
					int temp = inputArray[j];
					inputArray[j] = inputArray[j - 1];
					inputArray[j - 1] = temp;
					swapCount += 1;
				}
			}			
			numberOfPasses += 1;
		}

		System.out.print("Number of passes to sort the inputArray = " + numberOfPasses + " ||| ");
		return inputArray;
	}

	private static int[] selectionSort(int[] inputArray) {
		for(int i = 0; i < inputArray.length - 1; i++) {

			Integer minimumElement = Integer.MAX_VALUE;
			int minimumElementIndex = -1;

			// find the lowest element in the rest of the array
			for(int j = i + 1; j < inputArray.length; j++) {
				if(inputArray[j] < minimumElement) {
					minimumElementIndex = j;
					minimumElement = inputArray[j];
				}
			}

			// swap the current element > lowest element in the rest of the array
			if(inputArray[i] > minimumElement) {
				inputArray[minimumElementIndex] = inputArray[i];
				inputArray[i] = minimumElement;
			}
		}

		return inputArray;
	}

	public static void main(String[] args) {
		int[] inputArray = {5, 1, 4, 2, 8, -1, 0, 3, 7, 6};
		System.out.print("inputArray = " + Arrays.toString(inputArray) + " ||| ");

		int[] sortedArray = selectionSort(inputArray);
		System.out.println(Arrays.toString(sortedArray));
	}
}
