package com.sapient.numbers;

import java.util.Arrays;

public class Command_Line1 {
	private int[] data;
	private int count = 0, sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
	private double avg;

	public Command_Line1(String[] args) {
		this.count = args.length;
		data = new int[this.count];
		for (int i = 0; i < this.count; i++) {
			this.data[i] = Integer.parseInt(args[i]);
		}
	}

	public int[] getData() {
		return data;
	}

	public void setData(int[] dataPass) {
		for (int i = 0; i < dataPass.length; i++) {
			this.data[i] = dataPass[i];
		}
	}

	public void displayData() {
		System.out.println(Arrays.toString(data));
	}

	public void calData() {
		for (int i = 0; i < count; i++) {
			int temp = data[i];
			this.sum = this.sum + temp;
			if (this.max < temp)
				this.max = temp;
			if (this.min > temp)
				this.min = temp;
		}
		this.avg = sum / count;
	}

	@Override
	public String toString() {
		return "Command_Line1 [data=" + Arrays.toString(data) + ", count=" + count + ", sum=" + sum + ", max=" + max
				+ ", min=" + min + ", avg=" + avg + "]";
	}
}
