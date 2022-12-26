package week1.day1;

public class Calculator{
	 
	public void subtwoNumbers() {
		int a=20;
		int b=10;
		System.out.println(a-b);
	}
	public  int multiply(int a,int b) {
		return a*b;
		
	}
	
	public static void main(String[] args) { 
      
	Calculator cl= new Calculator();
	
	cl.subtwoNumbers();
	
	int result=cl.multiply(50, 50);
	System.out.println(result);
	}
	
}