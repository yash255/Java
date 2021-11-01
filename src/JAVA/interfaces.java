package JAVA;

interface Bicycle {
	int a = 25;

	public void applyBreak(int decrement);

	public void speedUp(int increment);
}

interface Horn {
	void blowHorn69();

	void dhoom();
}

class Hero implements Bicycle, Horn {
	void blowHorn() {
		System.out.println("Horn Ok");
	}

	public void applyBreak(int decrement) {
		System.out.println("Applying Break");
	}

	public void speedUp(int increment) {
		System.out.println("Applying SpeedUp");
	}

	public void blowHorn69() {
		System.out.println("jhbgcd");
	}

	public void dhoom() {
		System.out.println("hdbsbgc");
	}
}

public class interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hero cycle = new Hero();
		cycle.applyBreak(5);
		System.out.println(cycle.a);
		cycle.blowHorn69();

	}

}
