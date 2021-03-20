package oops.Practice.CompositionExample;

public class PC {
	
	private Case thecase;
	private Monitor monitor;
	private Motherboard motherboard;
	
	public PC(Case thecase, Monitor monitor, Motherboard motherboard) {
		super();
		this.thecase = thecase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	
	public void powerUP() {
		
		thecase.pressPowerButton();
		getLogo();
	}
	
	private void getLogo() {
		monitor.drawPixelAt(240,123,"red");
		
	}

	

}
