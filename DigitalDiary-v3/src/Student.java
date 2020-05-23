import java.util.ArrayList;

public class Student extends Person {
	String onlyYear;

	public Student(String name, String itClass, String itID) {
		super(name, itClass, itID);
		// TODO Auto-generated constructor stub
	}

	public String getOnlyYear() {
		onlyYear = getItClass().substring(0, 1);
		return onlyYear;
	}

}
