package com.sapient.adv.java.threadPrint;

public class Tic implements Runnable{

	private TicTocRunner runner;

	public Tic() {

	}
	
	public Tic(TicTocRunner runner) {
		super();
		this.runner = runner;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			runner.printTic();
		}
		
	}
}
