package it.ipzs;

public class Hello {

	public static void main(String[] args) throws InterruptedException {
		while(true) {
			Thread.sleep(10000);
			System.out.println("Hello docker!");
		}
	}

}
