package entities;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
	
	List<Car> cars = new ArrayList<>();
	List<Driver> drivers = new ArrayList<>();
	
	public Fleet() {
		this.cars = new ArrayList<Car>();
		this.drivers = new ArrayList<Driver>();
	}
	
	public void addCar(Car car) {
		cars.add(car);
	}
	
	public void removeCar(Car car) {
		cars.remove(car);
	}
	
	public void addDriver(Driver driver) {
		drivers.add(driver);
	}
	
	public void removeDriver(Driver driver) {
		drivers.remove(driver);
	}
	
	public void listCars() {
		for (Car c : cars) {
			System.out.println(c.toString());
		}
	}
	
	public void listDrivers() {
		for (Driver d : drivers) {
			System.out.println(d.toString());
		}
	}
	
}
