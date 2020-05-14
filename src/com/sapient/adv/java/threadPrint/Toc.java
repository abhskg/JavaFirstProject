package com.sapient.adv.java.threadPrint;

public class Toc implements Runnable{

	private TicTocRunner runner;

	public Toc() {

	}
	
	public Toc(TicTocRunner runner) {
		super();
		this.runner = runner;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			runner.printToc();
		}
		
	}
}
