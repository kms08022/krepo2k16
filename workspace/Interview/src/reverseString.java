import java.util.Scanner;

public class reverseString 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String[] words = s.split("");
		
			for(int i = words.length-1; i >=0; i--)
			{
				System.out.print(words[i]);
			}
		
	}
}

	