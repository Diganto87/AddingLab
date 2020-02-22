package Bicycle;

public class Car extends Vehicle {
	
	int noofseat;
	
	
	

	public Car(String licensePlate, int noofseat) {
		super(licensePlate);
		this.noofseat = noofseat;
	}




	@Override
	public String toString() {
		return "Car [noofseat=" + noofseat + ", licensePlate=" + licensePlate + "]";
	}
	
	
	public void Speedup() {
		System.out.println("i am from car");
	}
	
	
	
	

}
