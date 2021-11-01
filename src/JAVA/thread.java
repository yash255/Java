package JAVA;
class MyThread extends Thread{
	@Override
	public void run() {
		int i=0;
		 while (i<10) {
			 System.out.println("My thread is running");
			 System.out.println("I am Happy");
			 i++;
			
		}
		
	}
}
class MyThread2 extends Thread{
	@Override
	public void run() {
	int	i=0;
		 while (i<10) {
			 System.out.println("thread2 is running");
			 System.out.println("I am Sad");
			 i++;
			
		}
		
	}
}

public class thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread();
		MyThread2 t2 = new MyThread2();
		
		t1.start();
		t2.start();

	}

}
