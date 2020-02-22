
public class Calculator_Test {

	public static void main(String[] args) {
		
	   Calculator cal = new Calculator();
	    
	   int result = cal.sum(10,9);
	   System.out.println(result);
	   
	   int result1 = cal.sub(10,9);
	   System.out.println(result1);
	   
			  Tax t = new Tax();
			  
			  double totaltax = t.taxcal(200000.00);
			  System.out.println("My total Tax " +totaltax);
	}

}
