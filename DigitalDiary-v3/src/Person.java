
public class Person {
	private String name;
	private String itClass;
	private String itID;
	private String itSubject;
	
	public Person(String name, String itClass, String itID) {
		this.name = name;
		this.itClass = itClass;
		this.itID = itID;
	}
	
	public Person(String name, String itClass) {
		this.name = name;
		this.itClass = itClass;
	}
	
	public Person(String name, String itSubject, String itClass, String itID) {
		this.name = name;
		this.itClass = itClass;
		this.itID = itID;
		this.itSubject = itSubject;
	}
	
	public String getName() {
		return name;
	}
	
	public String getItClass() {
		return itClass;
	}
	
	public String getItID() {
		return itID;
	}
	
	public String getSubject() {
		return itSubject;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setItClass(String itClass) {
		this.itClass = itClass;
	}
	
	public void setItID(String itID) {
		this.itID = itID;
	}
	
	public void setItSubject(String itSubject) {
		this.itSubject = itSubject;
	}
	
	public String nothing() {
		return "Brak";
	}
}
