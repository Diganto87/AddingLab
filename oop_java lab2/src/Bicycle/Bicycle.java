package Bicycle;

public class Bicycle {
	
	public int gear ; 
	public int speed ;
	
	
	
	public Bicycle(int gear, int speed) {
		super();
		this.gear = gear;
		this.speed = speed;
	}



	public Bicycle() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}



	
	public void show()
	{
		
		System.out.println("i am a bicycle");
	}
	
	
	
	
	
	

}
