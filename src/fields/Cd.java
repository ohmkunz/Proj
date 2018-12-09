package fields;

public class Cd {
	private String name;
	private int remain;
	//private final String [] NAME_LIST = {"Cherprang","Faii","Fond","Jennis","June","Kaew",
	//		"Kaimook","Mobile","Munich","Music","Noey","Orn","Phukkhom","Pun","Natherine"};
	public Cd(String name,int remain) {
		this.name= name;
		this.remain = remain;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRemain() {
		return remain;
	}
	public void setRemain(int remain) {
		this.remain = remain;
	}
	
	public void addCd() {
		
	}
}

