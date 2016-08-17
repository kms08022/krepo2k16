import java.util.HashMap;

//list of key value pairs
public class JavaHashMap {
public static void main(String[] args) {
	

	HashMap myHashMap = new HashMap();
	
	myHashMap.put("Lady", "Bonnie");
	//myHashMap.values();
	
	
	if(myHashMap.containsKey("Lady"))
	{
		System.out.println("Yes, " + myHashMap.get("Lady"));
	}
	//System.out.println("value" + myHashMap.get(1));
	System.out.println(myHashMap.values());
	}	
}
