package javabridge.week2;

public class CarGame {
	public static void main(String[] args) {
		CarClass c1 = new CarClass();
		c1.setColor("RED");
		c1.setModel("Hyundai Sonata");
		c1.setPower(180);
		
		CarClass c2 = new CarClass("BLUE","BMW 520",210);
		c1.go();
		c2.go();
	}
}
