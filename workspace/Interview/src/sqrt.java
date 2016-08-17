import java.util.Scanner;

//function to get the sqrt

public class sqrt 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("enter a number");
		int myInt = sc.nextInt();
		
		System.out.println("enter second number to added");
		int sInt = sc.nextInt();
		
		int Answer = myInt + sInt;
		System.out.println("your answer is " + Answer);*/
		
		System.out.println("Enter a number");
		double n = sc.nextDouble();
		
		if(n<0)
		{
			System.out.println("no negative sqrts");
		}
		
		double y = sqrt(n);
		
		System.out.println("square root is" + y)
		
	}

	private static double sqrt(double n) {
		// TODO Auto-generated method stub
		
		if(n == 0 || n == 1) 
			return n;
		
		double low = 0; 
		double high = n;
		double mid = (low+high)/2;
		
		while(Math.abs(mid*mid-n) > 0.00001)
		{
			
		}
	}
	
}
