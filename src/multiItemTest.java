//Tom Oppenheim. 9/21/2016, Assignment 2
import java.text.DecimalFormat;

public class multiItemTest {
	
	
	public static void main(String args[]){
		MultiItemSale saleItems = new MultiItemSale(100);
		saleItems.dataEntry();
		DecimalFormat decimal = new DecimalFormat("#.##");
		System.out.println("Your total bill is: " + decimal.format(saleItems.computeTotalBill()));
	}
}
