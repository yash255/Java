package JAVA;

class MyTh extends Thread{
	public MyTh(String name) {
		super(name);
	}
	public void run() {
		int i = 5;
		while(true) {
			System.out.println("I am "+this.getName());
			i++;
		}
	}
}

public class thread_priorities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTh t1 = new MyTh("yash");
		MyTh t2 = new MyTh("lucifer");
		MyTh t3 = new MyTh("professor");
		MyTh t4 = new MyTh("Tokyo");
		MyTh t5 = new MyTh("nairobi");
		
		t2.setPriority(Thread.MAX_PRIORITY);
		t5.setPriority(Thread.MIN_PRIORITY);
		t4.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
	

	}

}
