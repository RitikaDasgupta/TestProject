package Demo;
import java.util.Scanner;


public class Electricity_Bill {

	public static void main(String[] args) 
	{
		double count;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Unit:");
		int x=sc.nextInt();
		if(x<100)
		{
			count=1.20;

		}
		else if(x>=100 && x<=300)
		{
			count=2;
		}
		else
		{
			count=3;
		}
		
		
		System.out.println("The charge of your unit:" + (x*count));
	}

}

