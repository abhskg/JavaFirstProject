package com.sapient.numbers;

import java.util.Arrays;
import java.util.Scanner;

public class KeyRead_Line2 {
	private int[] data;
	private int size;


	public KeyRead_Line2(int num) {
		this.data = new int[num];
		this.size = num;
	}

	public int[] getData() {
		return data;
	}

	public void setData(int[] data) {
		this.data = data;
	}

	public void displayData() {
		System.out.println(Arrays.toString(this.data));
	}

	public void readData() {
		Scanner Sc = new Scanner(System.in);
		int temp;
		for (int i = 0; i < this.size; i++) {
			temp = Sc.nextInt();
			this.data[i] = temp;
		}
		Sc.close();
	}

	public void sort() {
		Arrays.sort(this.data);
	}

	public void customSort() {
		this.quickSort(this.data, 0, size - 1);
	}

	public void quickSort(int arr[], int begin, int end) {
		if (begin < end) {
			int partitionIndex = partition(arr, begin, end);

			quickSort(arr, begin, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, end);
		}
	}

	private int partition(int arr[], int begin, int end) {
		int pivot = arr[end];
		int i = (begin - 1);

		for (int j = begin; j < end; j++) {
			if (arr[j] <= pivot) {
				i++;

				int swapTemp = arr[i];
				arr[i] = arr[j];
				arr[j] = swapTemp;
			}
		}

		int swapTemp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = swapTemp;

		return i + 1;
	}

	@SuppressWarnings("static-access")
	public void search(int key) {
		this.binarySearch(this.data, 0, this.size - 1, key);
	}

	public static void binarySearch(int arr[], int first, int last, int key) {
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("Element is found at index: " + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element is not found!");
		}
	}

}
