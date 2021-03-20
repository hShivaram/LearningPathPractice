package oops.Practice.EncapsulationCls;

public class Mainclss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EnhancedPlayer player = new EnhancedPlayer("Stryker",99,"Arrow");
		
		player.loseHealth(27);
		
		System.out.println("Player health is "+ player.getHealth());

	}

}
