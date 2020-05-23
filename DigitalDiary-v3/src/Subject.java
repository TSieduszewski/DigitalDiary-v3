
public class Subject {

	private String subjectName;
	private String firstYear;
	private String secondYear;
	private String thirdYear;
	private String fourthYear;
	private Teacher SubjectTeacher;

	public Subject(String subjectName, String firstYear, String secondYear, String thirdYear, String fourthYear) {
		// TODO Auto-generated constructor stub
		this.subjectName = subjectName;
		this.firstYear = firstYear;
		this.secondYear = secondYear;
		this.thirdYear = thirdYear;
		this.fourthYear = fourthYear;

	}

	public String getNameSubject() {
		return subjectName;
	}

	public String getFirstYear() {
		return firstYear;
	}

	public String getSecondYear() {
		return secondYear;
	}

	public String getThirdYear() {
		return thirdYear;
	}

	public String getFourthYear() {
		return fourthYear;
	}

	public void setNameSubject() {
		this.subjectName = subjectName;
	}

	public void setFirstYear() {
		this.firstYear = firstYear;
	}

	public void setSecondYear() {
		this.secondYear = secondYear;
	}

	public void setThirdYear() {
		this.thirdYear = thirdYear;
	}

	public void setFourthear() {
		this.fourthYear = fourthYear;
	}

}
