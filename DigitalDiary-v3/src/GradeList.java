import java.util.ArrayList;

public class GradeList<T extends Grade> {

	private final ArrayList<T> gradeList;

	public GradeList(ArrayList<T> gradeList) {
		this.gradeList = gradeList;
	}

}
