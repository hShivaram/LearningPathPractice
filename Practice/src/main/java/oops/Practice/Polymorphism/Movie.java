package oops.Practice.Polymorphism;

public class Movie {
	
	private String name;
	
	public Movie(String name) {
		super();
		this.name = name;
	}

	
	public String plot() {
		return " No plot";
	}


	public String getName() {
		return name;
	}


}
