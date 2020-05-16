import java.util.*;

public class SubjectList<T extends Subject>{
	
	
	private ArrayList<T> subjectList;
	private ArrayList<Teacher> teacherList;
	private String onlyYear;
	
	
	public SubjectList(ArrayList<T> testList, String onlyYear, ArrayList<Teacher> teacherList) {
		// TODO Auto-generated constructor stub
		this.subjectList = testList;
		this.onlyYear = onlyYear;
		this.teacherList = teacherList;
	}
	
	public String getOnlyYear() {
		return onlyYear;
	}
	
	public void getList() {
		switch (getOnlyYear()) {
        case "1":
        	for(T shortList : subjectList) {
    			if(shortList.getFirstYear().equals("1")) {
    				System.out.printf("%-30s", shortList.getNameSubject());
    				for(Teacher teachList : teacherList) {
    					if(teachList.getSubject().equals(shortList.getNameSubject())) {
    						System.out.printf("%-30s\n",teachList.getName());
    					}
    				}
    			} 
        	}
            break;
        case "2":
        	for(T shortList : subjectList) {
    			if(shortList.getSecondYear().equals("1")) {
    				System.out.printf("%-30s", shortList.getNameSubject());
    				for(Teacher teachList : teacherList) {
    					if(teachList.getSubject().equals(shortList.getNameSubject())) {
    						System.out.printf("%-30s\n",teachList.getName());
    					}
    				}
    			}
        	}
            break;
        case "3":
        	for(T shortList : subjectList) {
    			if(shortList.getThirdYear().equals("1")) {
    				System.out.printf("%-30s", shortList.getNameSubject());
    				for(Teacher teachList : teacherList) {
    					if(teachList.getSubject().equals(shortList.getNameSubject())) {
    						System.out.printf("%-30s\n",teachList.getName());
    					}
    				}
    			}
        	}
            break;
        case "4":
        	for(T shortList : subjectList) {
    			if(shortList.getFourthYear().equals("1")) {
    				System.out.printf("%-30s", shortList.getNameSubject());
    				for(Teacher teachList : teacherList) {
    					if(teachList.getSubject().equals(shortList.getNameSubject())) {
    						System.out.printf("%-30s\n",teachList.getName());
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

