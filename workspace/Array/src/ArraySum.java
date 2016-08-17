import java.util.Scanner;

public class ArraySum 
{
	
//public static int ArraySum(int[] A)
//{
//	int sum = 0;
//	
//	for(int i = 0; i < A.length; i++)
//	{
//		sum += i; 
//				
//				
//	}
//	
//	return sum;
//}
		
	public static int ArraySumm(int[] arr)
	{
		 
		int largest = arr[0];
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > largest)
			{
				largest = arr[i];
			}
		}
		return largest;
	}
		
	
		
		
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		int sum = 0;
		
		
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		
		
		
		System.out.println("Answer is " + ArraySumm(arr));
	}
	
}


/*public class arr2 
{
	 public static void main(String[] args){

		    int[] arr={8,5,6,7,3,102, 4,9};

		    int tempValue=arr[0];

		    for(int i=0;i<arr.length;i++){
		        if(arr[i]>tempValue){
		            tempValue=arr[i];
		        }

		    }
		    System.out.println("\n Maximum Value in the Given Array = "+tempValue);

		 }
}
*/