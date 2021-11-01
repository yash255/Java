package JAVA;
interface camera {
	void takesnap();

	void video();
	private void greet() {
		System.out.println("hello");
	}

	default void record4K() {
		greet();
		System.out.println("Recording in 4k");
	}
	
}

interface wifi {
	String[] getNetwork();

	void connect(String network);
}


class cellPhone {
	void callNumber(int phoneNumber) {
		System.out.println("calling " + phoneNumber);
	}

	void pickcall() {
		System.out.println("Connecting");
	}
}

class MySmart extends cellPhone implements camera, wifi {
	public void takesnap() {
		System.out.println("taking snap");
	}

	public void video() {
		System.out.println("taking video");
	}

//	public void record4K() {
//		System.out.println("Its 4K");
//	}
	public String[] getNetwork() {
		System.out.println("setting list of network");
		String[] networkList = { "yash", "shruti", "aayush" };
		return networkList;
	}

	public void connect(String network) {
		System.out.println("Connect to " + network);
	}
}

public class default_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySmart ms = new MySmart();
		String[] ar = ms.getNetwork();
		for (String item : ar) {
			System.out.println(item);

		}
		ms.record4K();

	}

}
