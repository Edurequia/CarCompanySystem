package entities;

public class utilityCar extends Car{
	
	private Double capacity;

	public utilityCar(String model, String brand, int yearManufacture, String plate, Driver driver, Double capacity) {
		super(model, brand, yearManufacture, plate, driver);
		this.capacity = capacity;
	}

	public Double getCapacity() {
		return capacity;
	}

	public void setCapacity(Double capacity) {
		this.capacity = capacity;
	}
	
	
}
