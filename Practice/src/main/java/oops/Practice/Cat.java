package oops.Practice;

public class Cat extends Animal{
	
	private int eyes;
	private int legs;
	private int tails;
	private int teeth;
	private String coats;

	public Cat(String name, int size, int weight,int eyes,int legs,int tails,int teeth,String coats) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tails = tails;
		this.teeth = teeth;
		this.coats = coats;
	}
	
	private void chew() {
		System.out.println("Cat.chew() is called");
	}

	@Override
	public void eat() {
		System.out.println("Cat.eat() is called");
		chew();
		super.eat();
	}
	
	public void walk() {
		System.out.println("Cat.walk() is called");
		super.move(3);
	}
	
	public void run() {
		
		System.out.println("Cat.run() is called");
		move(9);
	}
	

	@Override
	public void move(int speed) {
		// TODO Auto-generated method stub
		System.out.println("Cat.move() is called");
		moveLegs(speed);
		super.move(speed);
	}

	private void moveLegs(int speed) {
		// TODO Auto-generated method stub
		System.out.println("Cat.moveLegs() is called");
	}

	public int getEyes() {
		return eyes;
	}


	public int getLegs() {
		return legs;
	}



	public int getTails() {
		return tails;
	}


	public int getTeeth() {
		return teeth;
	}



	public String getCoats() {
		return coats;
	}


}
