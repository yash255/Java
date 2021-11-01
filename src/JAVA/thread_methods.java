package JAVA;
class MyThr extends Thread{
//	public MyThr(String name) {
//		super(name);
//	}
	public void run() {
		int i = 0;
		while(i<100) {
			System.out.println("I am "+this.getName());
			i++;
		}
	}
}
class MyThr1 extends Thread{
//	public MyThr1(String name) {
//		super(name);
//	}
	public void run() {
		int i = 0;
		while(i<100) {
			System.out.println("Hello yash ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}
}

public class thread_methods {
	public static void main(String[] args) {
		MyThr t1 = new MyThr(); 
		MyThr1 t2 = new MyThr1();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
	}

}
