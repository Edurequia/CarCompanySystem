package entities;

public class rideCar extends Car{
	
	private int numberDoors;
	
	public rideCar() {
	}

	public rideCar(String model, String brand, int yearManufacture, String plate, Driver driver, int numberDoors) {
		super(model, brand, yearManufacture, plate, driver);
		this.numberDoors = numberDoors;
	}

	public int getNumberDoors() {
		return numberDoors;
	}

	public void setNumberDoors(int numberDoors) {
		this.numberDoors = numberDoors;
	}
	
	
}
