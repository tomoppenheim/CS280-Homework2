//Tom Oppenheim. 9/21/2016, Assignment 2

import java.util.*;
public class MultiItemSale {
	
	private Sale[] items;
	private int saleCount;
	private int totalSales;
			
	//Constructor
	public MultiItemSale(int totalSales){
		saleCount = 0;
		this.totalSales = totalSales;
		items = new Sale[totalSales];
	}
	
	//Mutators
	public void addSale(Sale newItem){
			items[saleCount] = newItem;
			saleCount++;
		}

	
	public void changeSale(int location, Sale item){
		items[location] = item;
	}
	
	//Accessors
	public Sale getItem(int itemLocation){
		return items[itemLocation];
	}
	
	public int getTotalSales(){
		return totalSales;
	}
	
	public double computeTotalBill(){
		double totalBill = 0;
		for (int i = 0; i < saleCount; i++){
			totalBill += items[i].bill();
		}
		return totalBill;
	}
	
	
	
	//Data entry
	public void dataEntry(){
		Scanner keyboard = new Scanner(System.in);
		
		for (int i=0; i < totalSales; i++)
		{
			
		System.out.print("Enter the name of the item");
		String nameCarry = keyboard.nextLine();
		
		if (nameCarry.equals("end")){
			break;
		}
		else{
		System.out.print("Enter the price of the item");
		double price = keyboard.nextDouble();
		
		System.out.print("Enter the discount of the item");
		double discount = keyboard.nextDouble();
		keyboard.nextLine();

		if (discount == 0){
			Sale item = new Sale(nameCarry, price);
			this.addSale(item);}
		else{
				DiscountSale discountItem = new DiscountSale(nameCarry, price, discount);
				this.addSale(discountItem);
			}
		}
		}
	}
}
