package exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchElementSmallerThanArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//Given array to compare the input number
		int[] data = {4, 6, 5, 11, 12, 14, 14, 16, 18};

		//take user input
		System.out.print("Please input any value for X: ");
		int X = scanner.nextInt();

		//sorting the array first
		Arrays.sort(data);

		//perform binary search to find the index of the first element >= X. The index is where elements start being greater than or equal to X
		int index = binarySearch(data, X, 0, data.length - 1);

		//printing array list for reference
		System.out.println("Sorted array: " + Arrays.toString(data));

		//output elements smaller than X
		System.out.println("The elements smaller than " + X + " in the array are: ");
		for (int i = 0; i < index; i++) {
			System.out.print(data[i] + " ");
		}

		scanner.close();
	}

	//binary search method as per lecture notes, using int instead of boolean because we need to find specific values, not just to check if a value is present or not
	public static int binarySearch(int[] data, int target, int low, int high) {
		if (low > high) {
			return low;  //This is where elements start being greater than or equal to the target
		} else {
			int mid = (low + high) / 2;
			if (target <= data[mid]) {
				return binarySearch(data, target, low, mid - 1);  //recur left of the middle
			} else {
				return binarySearch(data, target, mid + 1, high);  //recur right of the middle
			}
		}
	}

	/*
	 * Running time is O(nlogn) as with each recursive call, the size of the search space is halved due to binary search and due to array sorting (nlogn).
	 * */
	 

}
