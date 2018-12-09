package fields;

public class User {
	private String name="";
	private String surname="";
	private String username;
	private String password;
	private String question;
	private String answer;
	public User(String name,String surname,String username,String password,String question,String answer) {
		
		this.name=name;
		this.surname =surname;
		this.username = username;
		this.password = password;
		this.question = question;
		this.answer = answer;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getQuestion() {
		return question;
	}
	public String getAnswer() {
		return answer;
	}
	
	
}
