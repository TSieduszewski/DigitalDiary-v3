import java.util.ArrayList;

public class SubjectList<T extends Subject> {

	private final ArrayList<T> subjectList;
	private final ArrayList<Teacher> teacherList;
	private final ArrayList<Grade> gradeList;
	private final String onlyYear;

	public SubjectList(ArrayList<T> testList, String onlyYear, ArrayList<Teacher> teacherList,
			ArrayList<Grade> gradeList) {
		// TODO Auto-generated constructor stub
		this.subjectList = testList;
		this.onlyYear = onlyYear;
		this.teacherList = teacherList;
		this.gradeList = gradeList;
	}

	public String getOnlyYear() {
		return onlyYear;
	}

	public void getList() {
		switch (getOnlyYear()) {
		case "1":
			for (T shortList : subjectList) {
				if (shortList.getFirstYear().equals("1")) {
					System.out.printf("%-30s", shortList.getNameSubject());
					for (Teacher teachList : teacherList) {
						if (teachList.getSubject().equals(shortList.getNameSubject())) {
							System.out.printf("%-30s", teachList.getName());
							for (Grade grades : gradeList) {
								if (grades.getSubjectName().equals(shortList.getNameSubject())) {
									System.out.printf(grades.getAllGrade() + "\n");
								}

							}
						}
					}
				}
			}
			break;
		case "2":
			for (T shortList : subjectList) {
				if (shortList.getSecondYear().equals("1")) {
					System.out.printf("%-30s", shortList.getNameSubject());
					for (Teacher teachList : teacherList) {
						if (teachList.getSubject().equals(shortList.getNameSubject())) {
							System.out.printf("%-30s", teachList.getName());
							for (Grade grades : gradeList) {
								if (grades.getSubjectName().equals(shortList.getNameSubject())) {
									System.out.printf(grades.getAllGrade() + "\n");
								}

							}
						}
					}
				}
			}
			break;
		case "3":
			for (T shortList : subjectList) {
				if (shortList.getThirdYear().equals("1")) {
					System.out.printf("%-30s", shortList.getNameSubject());
					for (Teacher teachList : teacherList) {
						if (teachList.getSubject().equals(shortList.getNameSubject())) {
							System.out.printf("%-30s", teachList.getName());
							for (Grade grades : gradeList) {
								if (grades.getSubjectName().equals(shortList.getNameSubject())) {
									System.out.printf(grades.getAllGrade() + "\n");
								}

							}
						}
					}
				}
			}
			break;
		case "4":
			for (T shortList : subjectList) {
				if (shortList.getFourthYear().equals("1")) {
					System.out.printf("%-30s", shortList.getNameSubject());
					for (Teacher teachList : teacherList) {
						if (teachList.getSubject().equals(shortList.getNameSubject())) {
							System.out.printf("%-30s", teachList.getName());
							for (Grade grades : gradeList) {
								if (grades.getSubjectName().equals(shortList.getNameSubject())) {
									System.out.printf(grades.getAllGrade() + "\n");
								}

							}
						}
					}
				}
			}
			break;
		default:
			System.out.println("ups...coœ posz³o nie tak");

		}
	}

}
