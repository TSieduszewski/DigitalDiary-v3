import java.util.*;

public class PersonalList<T extends Person> {

	private ArrayList<T> personList;
	
	public PersonalList() {
		this.personList = new ArrayList<>();
	}
	
	public void addPerson(T personData) {
		personList.add(personData);
	}
	
	public T findPerson(String findSomething) {
		for(T thatPerson : personList) {
			if (findSomething.equals(thatPerson.getItID())) {
				return thatPerson;
			}
			
			if (findSomething.equals(thatPerson.getItClass())) {
				return thatPerson;
			}
			if (findSomething.equals(thatPerson.getItClass().substring(0, 1))) {
				return thatPerson;
			}
			
		}
		return null;
	}
	
	
}
