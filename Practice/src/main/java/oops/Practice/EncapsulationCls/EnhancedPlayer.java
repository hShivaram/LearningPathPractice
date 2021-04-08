package oops.Practice.EncapsulationCls;

public class EnhancedPlayer {

	private String name;
	private int hitPoints;
	private String weapon;
	 static int data=3;
	public EnhancedPlayer(String name, int hitPoints, String weapon) {
		super();
		this.name = name;
		if(hitPoints>0 && hitPoints<100) {
		this.hitPoints = hitPoints;
		}
		this.weapon = weapon;
	}
	
	public void loseHealth(int damage) {
		this.hitPoints=this.hitPoints-damage;
		
		if(this.hitPoints<0) {
			System.out.println("Player is knocked out");
		}
	}
	public String getName() {
		return name;
	}
	public int getHealth() {
		return hitPoints;
	}
	public String getWeapon() {
		return weapon;
	}
	
	
}
