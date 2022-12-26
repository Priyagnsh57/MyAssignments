package week1.day1;

public class Mobile {

	public void sendSms() {
		System.out.println("sms is working");
	}

	public void takeSnapShot() {
		System.out.println("snap shot is working");
	}


public static void main(String[]args) {
	Mobile obj = new Mobile();
	obj.sendSms();
	obj.takeSnapShot();
}
}
