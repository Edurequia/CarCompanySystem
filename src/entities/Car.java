package entities;

public class Car {
	
	private String model;
	private String brand;
	private int yearManufacture;
	private String plate;
	private Driver driver;
	
	public Car() {
	}

	public Car(String model, String brand, int yearManufacture, String plate, Driver driver) {
		this.model = model;
		this.brand = brand;
		this.yearManufacture = yearManufacture;
		this.plate = plate;
		this.driver = driver;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYearManufacture() {
		return yearManufacture;
	}

	public void setYearManufacture(int yearManufacture) {
		this.yearManufacture = yearManufacture;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	public String toString() {
		return 	"Modelo do carro: " + getModel() + "\n"
				+ "Marca : " + getBrand() + "\n"
				+ "Ano de fabricação: " + getYearManufacture() + "\n"
				+ "Placa: " + getPlate() + "\n";
				
	}
	
	
	
}
