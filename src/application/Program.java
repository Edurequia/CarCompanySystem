package application;

import entities.Car;
import entities.Driver;
import entities.rideCar;
import entities.utilityCar;

public class Program {

	public static void main(String[] args) {
		
		
		Driver driver1 = new Driver("João", 30, "123456");
		Driver driver2 = new Driver("Maria", 25, "654321");
		
		Car car1 = new rideCar("Celta", "Chevrolet", 2010, "ABC-1234", driver1, 4);
		Car car2 = new utilityCar("Kangoo", "Renault", 2015, "DEF-5678", driver2, 1000.0);
		
		
		System.out.println(car1);
		System.out.println(car2);
		
		
		
		if (car1 instanceof rideCar) {
			rideCar ridecar = (rideCar)car1;
			System.out.println("Número de portas do carro 1: " + ridecar.getNumberDoors());
		}
		
		if (car2 instanceof rideCar) {
			rideCar ridecar = (rideCar)car2;
			System.out.println("Número de portas do carro 2: " + ridecar.getNumberDoors());
		}
		
		if (car1 instanceof utilityCar) {
			utilityCar utilitycar = (utilityCar)car1;
			System.out.println("Capacidade carro 1: " + utilitycar.getCapacity());
		}
		
		if (car2 instanceof utilityCar) {
			utilityCar utilitycar = (utilityCar)car2;
			System.out.println("Capacidade carro 2: " + utilitycar.getCapacity());
		}
		
	}

}
