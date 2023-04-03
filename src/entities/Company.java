package entities;

public class Company {
	
	private Fleet fleet;
	
	public Company() {
		this.fleet = new Fleet();
	}
	
	public void hireDriver(Driver driver) {
		fleet.addCar(driver);
	}
	
	public void listCars() {
		fleet.listCars();
	}
	
	public void listDrivers() {
		fleet.listDrivers();
	}
	
}
