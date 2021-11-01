package JAVA;

class MyThreadRunnable1 implements Runnable{
	public void run() {
		int i=0;
		
		while(i<100) {
			System.out.println("I am a Rider");
			i++;
		}
	}
}

class MyThreadRunnable2 implements Runnable{
	public void run() {
		int i=0;
		while (i<100) {
			System.out.println("I am a Provider");
			i++;
			
		}
	}
}



public class thread_runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadRunnable1 t1 = new MyThreadRunnable1();
		Thread a1 = new Thread(t1);
		
		
		MyThreadRunnable2 t2 = new MyThreadRunnable2();
		Thread b1 = new Thread(t2);
		
		a1.start();
		b1.start();

	}

}
