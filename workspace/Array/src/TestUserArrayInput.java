import java.util.Scanner;

public class TestUserArrayInput 
{
	
	
	public static int[] Arr()
	{
		
		int[] Arr = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your ints");
		
		for(int i = 0; i < Arr.length; i++)
		{
			Arr[i] = sc.nextInt();
		}
		
		return Arr;
		
	}
	
	public static int largestArray(int[] A)
	{
		
		int largo = A[0];
		
	System.out.println("Your largest int is:");
		for(int i=0; i < A.length; i++)
		{
			
			
			if(A[i] > largo)
			{
				largo = A[i];
			}
			
		}
		
		return largo;
	}
	
	public static void Answer()
	{
		System.out.println(largestArray(Arr()));
	}
	
	
	public static void main(String[] args) 
	{
		

//		System.out.println(largestArray(Arr()));
		
		Answer();
		
		
		
	}
		
		
}	
