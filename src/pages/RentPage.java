package pages;

import fields.ButtonField;
import fields.MakeHead;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class RentPage extends HBox {
	
	private MakeHead head;
	private ComboBox<String> DVDNameCombobox;
	private ComboBox<String> Discount;
	private ComboBox<String> theNumberToRent;
	private ComboBox<String> dayForRent;
	private Label chooseDvd;
	private Label card;
	private Label numberToRent;
	private Label day;
	private ButtonField back;
	private ButtonField calculate;
	private RentList rentList;
	public RentPage() {
		Font f = Font.loadFont(ClassLoader.getSystemResource("font/thaisanslite.ttf").toExternalForm(), 25);
		setAlignment(Pos.CENTER);
		setSpacing(30);
		setPadding(new Insets(15));
		
		VBox collector = new VBox();
		collector.setAlignment(Pos.CENTER);
		collector.setSpacing(10);
		collector.setPadding(new Insets(10));
		
		this.head = new MakeHead("cinema","Choose What You Want");
		//////////
		this.chooseDvd = new Label("Choose Your DVD");
		chooseDvd.setFont(f);
		chooseDvd.setStyle("-fx-text-fill:#B2B2B2;"
				+ "fx-font-size:25pt");
		
		DVDNameCombobox = new ComboBox<>();
		DVDNameCombobox.getItems().addAll("Lord of the ring","Harry potter","Game of throne",
				"Divergent", "Twilight", "Hungergame", "Percy jackson");
		
		DVDNameCombobox.setEditable(false);
		DVDNameCombobox.setStyle("-fx-font-family:thaisanslite;"
				+ "-fx-color:#B2B2B2;"
				+ "-fx-font-size : 15pt;"
				+"src:url(font/supermarket.tff);"
				+ "-fx-pref-height: 40px;"
				+ "-fx-pref-width: 300px;"
				+ "-fx-background-color:#FFFFFF;");
		
		///////////////
		this.card = new Label("Select Your Card");
		
		card.setFont(f);
		card.setStyle("-fx-text-fill:#B2B2B2;"
				+ "fx-font-size:25pt");
		
		Discount = new ComboBox<>();
		Discount.getItems().addAll("Gold Card", "Silver Card", "Copper Card", "No card");
		Discount.setEditable(false);
		Discount.setStyle("-fx-font-family:thaisanslite;"
				+ "-fx-color:#B2B2B2;"
				+ "-fx-font-size : 15pt;"
				+"src:url(font/supermarket.tff);"
				+ "-fx-pref-height: 40px;"
				+ "-fx-pref-width: 300px;"
				+ "-fx-background-color:#FFFFFF;");
		
		///////////
		this.numberToRent = new Label("NumBer You Want To Rent");
		numberToRent.setFont(f);
		numberToRent.setStyle("-fx-text-fill:#B2B2B2;"
				+ "fx-font-size:25pt");
		
		theNumberToRent = new  ComboBox<>();
		theNumberToRent.getItems().addAll("1","2","3");
		theNumberToRent.setEditable(true);
		theNumberToRent.setStyle("-fx-font-family:thaisanslite;"
				+ "-fx-color:#B2B2B2;"
				+ "-fx-font-size : 15pt;"
				+"src:url(font/supermarket.tff);"
				+ "-fx-pref-height: 40px;"
				+ "-fx-pref-width: 300px;"
				+ "-fx-background-color:#FFFFFF;");
		//////////
		
		this.day = new Label("Please Select The Day");
		day.setFont(f);
		day.setStyle("-fx-text-fill:#B2B2B2;"
				+ "fx-font-size:25pt");
		dayForRent = new ComboBox<>();
		dayForRent.getItems().addAll("3 days","7 days","14 day","30 day"); 
		dayForRent.setEditable(false);
		dayForRent.setStyle("-fx-font-family:thaisanslite;"
				+ "-fx-color:#B2B2B2;"
				+ "-fx-font-size : 15pt;"
				+"src:url(font/supermarket.tff);"
				+ "-fx-pref-height: 40px;"
				+ "-fx-pref-width: 300px;"
				+ "-fx-background-color:#FFFFFF;");
		
		///////
		HBox choice = new HBox();
		choice.setAlignment(Pos.CENTER);
		choice.setSpacing(30);
		choice.setPadding(new Insets(15));
		
		back = new ButtonField("Back", "#d05d34");
		calculate = new ButtonField("Calculation","#e27589");
		choice.getChildren().addAll(back,calculate);
		//////
		collector.getChildren().addAll(head,chooseDvd,DVDNameCombobox,card,Discount,numberToRent,theNumberToRent,day,dayForRent,choice);
		rentList = new RentList();
		rentList.setPrefWidth(500);
		
		getChildren().addAll(collector,rentList);
		
	}
	
	public String getDVDNameCombobox() {
		return DVDNameCombobox.getValue().toString();
	}
	
	public String getDiscount() {
		return Discount.getValue().toString().trim();
	}
	
	public String getDayForRent() {
		return dayForRent.getValue().toString();
	}
	
	public Button getBackBtn() {
		return back.getButton();
	}
	
	public Button getCalculationBtn() {
		return calculate.getButton();
	}
	
	public int getTheNumberToRent() {
		
		return Integer.parseInt(theNumberToRent.getValue().toString());
	}

	public RentList getRentList() {
		return rentList;
	}
	
	public int getDay() {
		
		int day = Integer.parseInt(dayForRent.getValue().toString().substring(0, 2).trim());
		return day;
	}
}
