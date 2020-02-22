import java.util.Scanner;
public class Ex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Item =new Scanner(System.in);
		System.out.println("Take a height of rectangle : ");
		double height = Item.nextDouble();
		
		System.out.println("Take a weight of rectangle : ");
		double weight = Item.nextDouble();
		
		double area = height*weight ;
		
		System.out.println("Area of rectangle :" + area );

	}

}
