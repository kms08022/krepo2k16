import java.util.Scanner;

//get the largest int in an array
public class arraytest2 
{
	/*public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int[] A = new int[10];
		
		System.out.println("Enter 10 number");
		
		for(int i : A)
		{
			A[i] = s.nextInt();
		}
		
		int sum = 0;
		
		for(int a : A)
		{
			sum += a; 
		}
		
		System.out.println("sum is " + sum);
	}*/

	
	
	
	
	public static int largestArray(int[] A)
	{
		
		int largo = A[0];
		
	
		for(int i=0; i < A.length; i++)
		{
			
			
			if(A[i] > largo)
			{
				largo = A[i];
			}
			
		}
		
		return largo;
	}
	
	public static void main(String[] args) {
		//int[] arr = {8,3,5,7,12,11};
		
		Scanner sc = new Scanner(System.in);
		
		int [] A = new int[5];
		
		for(int i = 0; i < A.length; i++)
		{
			A[i] = sc.nextInt();
		}
	
		
		
		System.out.println(largestArray());
	}
}

