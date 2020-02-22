package Bicycle;

public class Vehicle {
		
	
	String licensePlate;

	public Vehicle(String licensePlate) {
		super();
		this.licensePlate = licensePlate;
	}

	
	
	public  Vehicle() {
	}



	public String getLicensePlate() {
		return licensePlate;
	}



	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}



	@Override
	public String toString() {
		return "Vehicle [licensePlate=" + licensePlate + "]";
	}
	
	
	
	
	
	public void Speedup() {
		System.out.println("i am from car");
	}
	
	
	
	
	
	
	
}
