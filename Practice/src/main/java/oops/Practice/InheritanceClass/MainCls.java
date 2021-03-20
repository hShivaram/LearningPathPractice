package oops.Practice.InheritanceClass;

public class MainCls {

	public static void main(String[] args) {
		
		Animal animal = new Animal("Animal", 1, 1, 5, 5);
		
		Cat cat = new Cat("Lil", 2, 10, 2, 4, 1, 23, "Short cotton");
		
		cat.eat();
		//cat.walk();
		
		cat.run();

	}

}
