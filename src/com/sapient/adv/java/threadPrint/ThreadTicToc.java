package com.sapient.adv.java.threadPrint;

public class ThreadTicToc {
		
	public static void main(String[] args) {
		
		TicTocRunner runner = new TicTocRunner();
		
		Tic runnertic = new Tic(runner);
		Thread tic = new Thread(runnertic);
		
		Toc runnerToc= new Toc(runner);
		Thread toc = new Thread(runnerToc);
			
		
		tic.start();
		toc.start();
	}
	
}