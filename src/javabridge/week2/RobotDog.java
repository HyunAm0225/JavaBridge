package javabridge.week2;

public class RobotDog extends Robot implements Pet {

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Woof Woof~~");

	}

	@Override
	void charging() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " go to charging station");
	}
	public static void main(String[] args) {
		RobotDog rd = new RobotDog();
		rd.setName("robo dog");
		rd.bark();
		rd.move();
		rd.charging();
	}
}
