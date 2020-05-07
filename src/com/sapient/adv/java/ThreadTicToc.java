package com.sapient.adv.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task1 extends Thread {
	public Task1() {
		System.out.println("Tic");
	}
}

class Task2 extends Thread {
	public Task2() {
		System.out.println("Toc");
	}
}

public class ThreadTicToc {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		for (int i = 0; i < 10; i++) {
			executorService.execute(new Task1());
			executorService.execute(new Task2());
		}
		executorService.shutdown();

//		for (int i = 0; i < 10; i++) {
//			Task1 tsk1 = new Task1();
//			tsk1.join();
//			Task2 tsk2 = new Task2();
//			tsk2.join();	
//		}
	}
}
