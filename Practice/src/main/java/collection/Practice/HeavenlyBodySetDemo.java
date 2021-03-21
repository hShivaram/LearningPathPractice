package collection.Practice;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBodySetDemo {

	private  final String name;
	private final double orbitalPeriod;
	private final Set<HeavenlyBodySetDemo> Satellites;
	
	public HeavenlyBodySetDemo(String name, double orbitalPeriod) {
		this.name = name;
		this.orbitalPeriod = orbitalPeriod;
		this.Satellites = new HashSet<HeavenlyBodySetDemo>();
	}

	public String getName() {
		return name;
	}

	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public Set<HeavenlyBodySetDemo> getSatellites() {
		return Satellites;
	}
	
	public boolean addMoon(HeavenlyBodySetDemo moon) {
		return this.Satellites.add(moon);
	}
	
	public Set<HeavenlyBodySetDemo> addSatellite(){
		return new HashSet<>(this.Satellites);
	}
	
	

}
