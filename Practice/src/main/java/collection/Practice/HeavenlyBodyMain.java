package collection.Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HeavenlyBodyMain {
	
	public static Map<String,HeavenlyBodySetDemo> solarSystem = new HashMap<>();
	public static Set<HeavenlyBodySetDemo> planets = new HashSet<>();
	

	public static void main(String[] args) {
		HeavenlyBodySetDemo temp = new HeavenlyBodySetDemo("Mercury",88);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp = new HeavenlyBodySetDemo("Venus",223);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp = new HeavenlyBodySetDemo("Earth",365);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		HeavenlyBodySetDemo tempMoon = new HeavenlyBodySetDemo("Moon",105);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);
		//planets.add(tempMoon);
		
		System.out.println("Planets");
		
		for(HeavenlyBodySetDemo planet:planets) {
			System.out.println("\t"+planet.getName());
		}
		
		
	}

}
