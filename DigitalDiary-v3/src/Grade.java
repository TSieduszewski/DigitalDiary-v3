
public class Grade {

	private String subjectName;
	private int grade1;
	private int grade2;
	private int grade3;
	private int grade4;
	private int grade5;
	private int grade6;

	Grade(String subjectName, int grade1, int grade2, int grade3, int grade4, int grade5, int grade6) {
		this.subjectName = subjectName;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
		this.grade4 = grade4;
		this.grade5 = grade5;
		this.grade6 = grade6;

	}

	public void setSubjectName() {
		this.subjectName = subjectName;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setGrade1() {
		this.grade1 = grade1;
	}

	public int getGrade1() {
		return grade1;
	}

	public void setGrade2() {
		this.grade2 = grade2;
	}

	public int getGrade2() {
		return grade2;
	}

	public void setGrade3() {
		this.grade3 = grade3;
	}

	public int getGrade3() {
		return grade3;
	}

	public void setGrade4() {
		this.grade4 = grade4;
	}

	public int getGrade4() {
		return grade4;
	}

	public void setGrade5() {
		this.grade5 = grade5;
	}

	public int getGrade5() {
		return grade5;
	}

	public void setGrade6() {
		this.grade6 = grade6;
	}

	public int getGrade6() {
		return grade6;
	}

	public String getAllGrade1() {
		int c = getGrade1();
		String one = "";
		if (c > 0) {
			while (c > 0) {
				one = one.concat("1 ");
				c--;
			}
			return one;
		} else {
			return "Bez oceny NDST ";
		}

	}

	public String getAllGrade2() {
		int c = getGrade2();
		String one = "";
		if (c > 0) {
			while (c > 0) {
				one = one.concat("2 ");
				c--;
			}
			return one;
		} else {
			return "Bez oceny DOP ";
		}

	}

	public String getAllGrade3() {
		int c = getGrade3();
		String one = "";
		if (c > 0) {
			while (c > 0) {
				one = one.concat("3 ");
				c--;
			}
			return one;
		} else {
			return "Bez oceny DST ";
		}

	}

	public String getAllGrade4() {
		int c = getGrade4();
		String one = "";
		if (c > 0) {
			while (c > 0) {
				one = one.concat("4 ");
				c--;
			}
			return one;
		} else {
			return "Bez oceny DB ";
		}

	}

	public String getAllGrade5() {
		int c = getGrade5();
		String one = "";
		if (c > 0) {
			while (c > 0) {
				one = one.concat("5 ");
				c--;
			}
			return one;
		} else {
			return "Bez oceny BDB ";
		}

	}

	public String getAllGrade6() {
		int c = getGrade6();
		String one = "";
		if (c > 0) {
			while (c > 0) {
				one = one.concat("6 ");
				c--;
			}
			return one;
		} else {
			return "Bez oceny CEL ";
		}

	}

	public String getAllGrade() {
		return getAllGrade1() + getAllGrade2() + getAllGrade3() + getAllGrade4() + getAllGrade5() + getAllGrade6();
	}
}
