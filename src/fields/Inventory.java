package fields;

import java.util.Arrays;


import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import pages.RentPage;

public class Inventory {
	
	public static String DVDName[] = {"Lord of the ring","Harry potter","Game of throne",
			"Divergent", "Twilight", "Hungergame", "Percy jackson"};
	public static double DVDPrice[] = {400,300,250,600,450,300,150};
	private double DVDStock[] = {12,12,12,12,12,12,12};
	private Double price;
	private String name;
	private int stock ;
	private int day;
	private RentPage rentPage;
	
	private boolean reTurnable ;
	
	public Inventory(RentPage rentPage) {
		this.rentPage = rentPage;
		this.reTurnable = true;
	}
	/*public Inventory(String name,int stock,int day) {
		this.name=name;
		this.stock=stock;
		this.day=day;
	}*/
	
	public void LoanDVD(String name, int stock, int day) {
		name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		int i = Arrays.asList(DVDName).indexOf(name);
		/*if(i < 0) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setContentText("Don't have " + name + " in stock");
			alert.showAndWait();
		}else {*/
			this.DVDStock[i] -= stock;
			//LoanPage loanpage = new LoanPage();
			String card = this.rentPage.getDiscount();
			double discount = 1;
			if(card.equals("Gold card")) {
				discount = 0.9;
			}else if(card.equals("Silver card")) {
				discount = 0.8;
			}else if(card.equals("Copper card")) {
				discount = 0.7;
			}else {
				discount = 1;
			}
			price = (Double) (discount)*(this.DVDPrice[i] + day*5);
		}
		
	//}
	
	public void ReturnDVD(String name, int stock) {
		name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		int i = Arrays.asList(DVDName).indexOf(name);
		if(DVDStock[i]+stock>12) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setContentText("Number of DVD has reached the max number.\nNow we have "+(int)DVDStock[i]+" instock"
					+ "\nPlease input the right number of return DVD again.");
			alert.showAndWait();
			this.reTurnable = false;
			return;
		}else {
			this.DVDStock[i] += stock;
		}
	}
	
	public double getPrice(String name,int day,int stock) {
		name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		int i = Arrays.asList(DVDName).indexOf(name);
		if(DVDStock[i]-stock<0.0) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setContentText("Don't have enough " + name + " in stock ,we have "+(int)DVDStock[i]+" in stock");
			alert.showAndWait();
			price=-1.0;
		}else {
			this.DVDStock[i] -= stock;
			//oanPage loanpage = new LoanPage();
			String card = rentPage.getDiscount();
			double discount = 1;
			if(card.equals("Gold Card")) {
				discount = 0.9;
			}else if(card.equals("Silver Card")) {
				discount = 0.8;
			}else if(card.equals("Copper Card")) {
				discount = 0.7;
			}else {
				discount = 1;
			}
			price = (Double) (discount)*(this.DVDPrice[i] + day*5);
		}
		return price;
		
	}
	public int getRemain(String name) {
		name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		int i = Arrays.binarySearch(this.DVDName, name);
		return (int)this.DVDStock[i];
	}

	public boolean isReTurnable() {
		return reTurnable;
	}
	
	
	

}
