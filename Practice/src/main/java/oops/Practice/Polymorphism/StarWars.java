package oops.Practice.Polymorphism;

public class StarWars extends Movie{

	public StarWars() {
		super("StarWars");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return "Imperial Forces tries to take over the world";
	}

}
