package Bicycle;

public class MountainBike extends Bicycle{
	
	
	 public  int seatheheight;
	 
	 

	public MountainBike() {
		super();
		// TODO Auto-generated constructor stub
	}



	public MountainBike(int gear, int speed) {
		super(gear, speed);
		// TODO Auto-generated constructor stub
	}



	public MountainBike(int gear, int speed, int seatheheight) {
		super(gear, speed);
		this.seatheheight = seatheheight;
	}



	@Override
	public String toString() {
		return "MountainBike [seatheheight=" + seatheheight + ", gear=" + gear + ", speed=" + speed + "]";
	}



	public void showbike() {
		
		System.out.println("I am a mountain bike");
	}



	
	

}
   