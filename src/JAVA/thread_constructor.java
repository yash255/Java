package JAVA;

class MyT extends Thread{
	public MyT(String name) {
		super(name);
	}
	public void run() {
		int i = 0;
		while(i<5) {
			System.out.println("I am a thread");
			i++;
		}
	}
}

public class thread_constructor {
	public static void main(String[] args) {
		
		MyT t1 = new MyT("yash");
		MyT t2 = new MyT("lucifer");
		t1.start();
		t2.start();
		System.out.println("Thread id is "+t1.getId());
		System.out.println("Thread name is "+t1.getName());
		
		System.out.println("Thread id is "+t2.getId());
		System.out.println("Thread name is "+t2.getName());
		
	}

}
