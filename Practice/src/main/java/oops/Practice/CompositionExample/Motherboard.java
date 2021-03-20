package oops.Practice.CompositionExample;

public class Motherboard {

	private String model;
	private String manufacturer;
	private int ramSlot;
	private int cardSlots;
	private String bios;
	public Motherboard(String model, String manufacturer, int ramSlot, int cardSlots, String bios) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlot = ramSlot;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public int getRamSlot() {
		return ramSlot;
	}
	public int getCardSlots() {
		return cardSlots;
	}
	public String getBios() {
		return bios;
	}
	
	public void loadProgram(String programname) {
		System.out.println("Program "+programname+" is now loading....");
	}
	
	
}
