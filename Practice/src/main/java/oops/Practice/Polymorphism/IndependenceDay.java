package oops.Practice.Polymorphism;

public class IndependenceDay extends Movie {

	public IndependenceDay() {
		super("IndependenceDay");
	}

	@Override
	public String plot() {
		return "Aliens tend to take over earth";
	}

}
