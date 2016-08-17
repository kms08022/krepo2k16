import java.util.ArrayList;

public class arrayList {
	
	public static void main(String[] args) 
	{
		//array list will hold objects type string = create new objects of arraylist that holds string
		
		ArrayList<String> myArrayList = new ArrayList<String>();
		//remove, get fom list or add
		myArrayList.add("Arraylists are great");
		myArrayList.add("hello there");
		
		//create new array list object
		int[] A = new int[10];

		for(int i = 0; i < myArrayList.size(); i++)
		{
			//System.out.println(myArrayList.get(i));
		}
		
for(String items: myArrayList)
{
	System.out.println(items);
}
		
		
		
		
	}

}
