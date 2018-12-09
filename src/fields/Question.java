package fields;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Question extends VBox {
	private ComboBox question;
	private Label questionLabel;
	private InputField answer;
	
	public Question(){
		
		HBox hbox1 = new HBox();
		
		hbox1.setAlignment(Pos.CENTER);
		setPadding(new Insets(5));
		setSpacing(10);
		
		Font f = Font.loadFont(ClassLoader.getSystemResource("font/thaisanslite.ttf").toExternalForm(), 25);
		
		this.questionLabel = new Label("Choose Your Question :  ");
		questionLabel.setStyle("-fx-text-fill:#B2B2B2;"
				+ "fx-font-size:25px");
		questionLabel.setFont(f);
		
		this.question = new ComboBox(); 
		question.setPrefWidth(250);
		
		question.getItems().addAll("What is your father's name?","What is your mother's name?",
				"What is your high-scool's name?");
		question.setStyle("-fx-font-family:thaisanslite;"
				+ "-fx-color:#B2B2B2;"
				+ "-fx-font-size : 15pt;"
				+"src:url(font/supermarket.tff);"
				+ "-fx-pref-height: 40px;"
				+ "-fx-pref-width: 300px;"
				+ "-fx-background-color:#FFFFFF;");
		
		//question.setPromptText("Please Choose a question");
		question.setEditable(false);
		hbox1.getChildren().addAll(questionLabel,question);
		getChildren().add(hbox1);
		
		this.answer = new InputField("Your Answer :", "", "");
		getChildren().add(answer);
		
		
		
		
	}

	public ComboBox getQuestion() {
		return question;
	}

	public Label getQuestionLabel() {
		return questionLabel;
	}

	public InputField getAnswer() {
		return answer;
	}
	
	public String getQuestionText() {
		//String text = question.getSelectionModel().getSelectedItem().toString().trim() == null ? "":question.getSelectionModel().getSelectedItem().toString().trim();
		//return text;
		return question.getEditor().getText().trim();
		//return question.getEditor().toString().trim();
		/*String text = question.getSelectionModel().getSelectedItem().toString();
		text = text.replace("l", "o");
		return question.getTypeSelector();*/
		//return question.getSelectionModel().getSelectedItem().toString();
	}
	
	public String getAnswerText() {
		return answer.getText().trim();
	}
	public void clear() {
		answer.clear();
		question.getSelectionModel().clearSelection(1);
		
	}

}
