import java.util.Scanner;

 public class temp{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temp in celcious");
		float temp = sc.nextFloat();
		
		float fah=(temp * 9/5)+32;
		 System.out.println("temp in fah is " + fah);
		
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter temp in fah");
		float temp1=s.nextFloat();
		
	    float cel =(temp1-32)*5/9;
		System.out.println(" temp in cel is " + cel);
		
		
		
	
		
		
		
		
		
		
	}
	
	
}