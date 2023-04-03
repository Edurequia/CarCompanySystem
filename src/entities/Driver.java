package entities;

public class Driver extends Car{
	
	private String driverName;
	private int age;
	private String numberCNH;
	
	public Driver() {
	}

	public Driver(String driverName, int age, String numberCNH) {
		this.driverName = driverName;
		this.age = age;
		this.numberCNH = numberCNH;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNumberCNH() {
		return numberCNH;
	}

	public void setNumberCNH(String numberCNH) {
		this.numberCNH = numberCNH;
	}
	
	public void addDriver(Driver driver) {
		this.addDriver(driver);
	}
	
	public String toString() {
		return "Nome do motorista: " + getDriverName() + "\n"
				+ "Idade: " + getAge() + "\n"
				+ "Número da CNH: " + getNumberCNH() + "\n";
	}
	
	
}
