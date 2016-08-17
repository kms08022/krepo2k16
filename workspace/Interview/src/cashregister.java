public class cashregister {




public static void main(String[] args) {
		
//Declarations for the fields that 	
float AmtTendered;
private fAmtTendered;
private float ItemPrice 
private float fItemPrice;
private float Total;
private float fTotal;

System.out.print("Please enter the item price>");
		ItemPrice = Keyboard.in.readFloat();
		fItemPrice = ItemPrice.floatValue()*1.05;
		
		System.out.print("Please enter the amount tendered>");
		AmtTendered = Keyboard.in.readFloat();
		fAmtTendered = AmtTendered.floatValue();
		
                Total = fAmtTendered - fItemPrice;
		fTotal = Math.round(Total.floatValue()*100f)/100f;
		System.out.print("Total" +fTotal);
	}
}