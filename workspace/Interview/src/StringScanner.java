import java.util.Scanner;

//takes in a number and a string and outputs it that many times
public class StringScanner 
{
	public static void main(String[] args) 
	{
		int start = 0;
		
		System.out.println("enter int");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println("enter word");
		Scanner sc2 = new Scanner(System.in);
		String word = sc2.nextLine();
		
		while(start < number)
		{
			System.out.println(word);
			start++;
		}
		
	}
}
