package javabridge.week2;

public class CarClass {
	
	private String color;
	private String model;
	private int power;
	private int curSpeed;
	
	public CarClass() {
		curSpeed = 0;
	}
	
	public CarClass(String color, String model, int power) {
		this.color = color;
		this.model = model;
		this.power = power;
		
	}
	
	public void go() {
		if(power < 200) {
			curSpeed += 10;
		}
		else if(power >=200) {
			curSpeed += 20;
		}
		System.out.printf("Accelerate %s, Current Speed %d\n", model, curSpeed);
		
	}
	
	public void stop() {
		curSpeed = 0;
		System.out.println("stop");
	}
	
	// getter setter라는 것이 필요하다 

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getCurSpeed() {
		return curSpeed;
	}

	public void setCurSpeed(int curSpeed) {
		this.curSpeed = curSpeed;
	}
	



}
