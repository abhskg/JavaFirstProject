package com.sapient.adv.java.threadPrint;

import java.util.concurrent.Semaphore;

public class TicTocRunner{
	
	private Semaphore tic = new Semaphore(1);
	private Semaphore toc = new Semaphore(0);
	
	void printTic() {
		try {
			tic.acquire();	
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
		System.out.print("Tic - ");
		toc.release();
	}
	
	void printToc() {
		try {
			toc.acquire();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
		System.out.print("Toc !");
		System.out.println();
		tic.release();
	}

}