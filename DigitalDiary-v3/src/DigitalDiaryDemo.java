import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DigitalDiaryDemo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean test = true;
		int input = 0;
		String findID;
		
		String[][] studentsTable = {{"Abacki Grzegorz", "1A", "10001"}, 
				{"Adacki Marian", "1A", "10002"}, 
				{"Anicki Bartosz", "1A", "10003"}
				,
				{"Babacki Grzegorz", "1B", "10004"}, 
				{"Badacki Marian", "1B", "10005"}, 
				{"Balucki Tomasz", "1B", "10006"}
				,
				{"Cabacki Grzegorz", "1C", "10007"}, 
				{"Cawacka Ma³gorzata", "1C", "10008"},  
				{"Cabedzki Micha³", "1C", "10009"}
				,
				{"Dabacki Grzegorz", "1D", "10010"}, 
				{"Dadacki Marian", "1D", "10011"}, 
				{"Dabedzki Micha³", "1D", "10012"}
				,
				{"Fabacki Grzegorz", "2A", "10013"}, 
				{"Fadacki Marian", "2A", "10014"}, 
				{"Fabedzki Micha³", "2A", "10015"}
				,
				{"Gabacki Grzegorz", "2B", "10016"},  
				{"Gakacki Julian", "2B", "10017"}, 
				{"Gabedzki Micha³", "2B", "10018"}
				,
				{"Habacki Grzegorz", "2C", "10019"},  
				{"Hatocka Julia", "2C", "10020"},
				{"Habedzki Micha³", "2C", "10021"}
				,
				{"Jabacki Grzegorz", "2D", "10022"}, 
				{"Jajecka Barbara", "2D", "10023"}, 
				{"Jabedzki Micha³", "2D", "10024"}
				,
				{"Kabacki Grzegorz", "3A", "10025"},  
				{"Kanicki Bartosz", "3A", "10026"}, 
				{"Kajencka Katarzyna", "3A", "10027"}
				,
				{"Labacki Grzegorz", "3B", "10028"},  
				{"Lalucki Tomasz", "3B", "10029"}, 
				{"Lanicki Bartosz", "3B", "10030"} 
				,
				{"£abacki Grzegorz", "3C", "10031"}, 
				{"£adacki Marian", "3C", "10032"},  
				{"£abedzki Micha³", "3C", "10033"}
				,
				{"Mabacki Grzegorz", "3D", "10034"}, 
				{"Madacki Marian", "3D", "10035"}, 
				{"Mabedzki Micha³", "3D", "10036"}
				,
				{"Nabacki Grzegorz", "4A", "10037"}, 
				{"Nadacki Marian", "4A", "10038"},  
				{"Nabedzki Micha³", "4A", "10039"}
				,
				{"Pabacki Grzegorz", "4B", "10040"}, 
				{"Padacki Marian", "4B", "10041"},  
				{"Pabedzki Micha³", "4B", "10042"}
				,
				{"Rabacki Grzegorz", "4C", "10043"}, 
				{"Ratacki Pawe³", "4C", "10044"}, 
				{"Rabedzki Micha³", "4C", "10045"}
				,
				{"Sabacki Grzegorz", "4D", "10046"},  
				{"Satacki Pawe³", "4D", "10047"}, 
				{"Sabedzki Micha³", "4D", "10048"}
				};
		
		String[][] teachersTable = {{"Matematyczny Jan", "Matematyka", "1A", "00001"}, 
				{"Poloniska Anna", "Jêzyk Polski", "2B", "00002"}, 
				{"Anglo Jan", "Jêzyk Angielski", "3C", "00003"}, 
				{"Biolicka Zofia", "Biologia", "1D", "00004"},
				{"Histor Tomasz", "Historia", "Brak", "00005"}, 
				{"Wosowski Bartosz", "WOS", "Brak", "00006"}, 
				{"Chemika Katarzyna", "Chemia", "4C", "00007"},
				{"Fizocki Piotr", "Fizyka", "Brak", "00008"}, 
				{"Pobo¿na Barbara", "Religia", "Brak", "00009"}, 
				{"Sportowy Micha³", "WF", "2A", "00010"}
				};
		
		String[][] subjectsTable = {{"Matematyka", "1", "1", "1", "1"},
				{"Jêzyk Polski", "1", "1", "1", "1"},
				{"Jêzyk Angielski", "0", "1", "1", "1"},
				{"Biologia", "0", "1", "1", "0"},
				{"Historia", "0", "1", "1", "0"},
				{"WOS", "0", "1", "1", "0"},
				{"Chemia", "1", "1", "0", "0"},
				{"Fizyka", "1", "1", "1", "0"},
				{"Religia", "0", "1", "0", "0"},
				{"WF", "1", "1", "1", "1"},			
				};
		
		while(test) {
			
			System.out.println("Podaj ID ucznia (od 10001 do 10048): ");
						Scanner keyboard = new Scanner(System.in);
			try {
				input = keyboard.nextInt();	
			} catch (InputMismatchException e) {
				System.out.println("To nawet nie s¹ liczby");
				test = true;
			}	
			if(input>10000 && input<10049) {
				test = false;
				
			} else {
				System.out.println("B³êdny numer");
				test = true;
				}
			
		}
		findID = Integer.toString(input);
		
		
		PersonalList<Student> listOfStudents = new PersonalList<>();
		for (int j=0; j<studentsTable.length;j++) {
		listOfStudents.addPerson(new Student(studentsTable[j][0], studentsTable[j][1], studentsTable[j][2]));
		}
		
		
		PersonalList<Teacher> listOfLeaders = new PersonalList<>();
		for (int i=0; i<teachersTable.length;i++) {
		listOfLeaders.addPerson(new Teacher(teachersTable[i][0], teachersTable[i][2]));
		}
		
		
		Student students = listOfStudents.findPerson(findID);		
		Teacher leaders = listOfLeaders.findPerson(students.getItClass());
		
		System.out.printf("%-30s", "Nazwisko i imiê");
		System.out.printf("%-30s", "Klasa");
		System.out.printf("%-30s\n", "Wychowawca");
		System.out.printf("%-30s", "---------------");
		System.out.printf("%-30s", "---------------");
		System.out.printf("%-30s\n", "--------------");
		System.out.printf("%-30s", students.getName());
		System.out.printf("%-30s", students.getItClass());
		try {
		System.out.println(leaders.getName());
		}
		catch(NullPointerException e) {
			System.out.println("Brak");
		}
		
		ArrayList<Subject> subjectList = new ArrayList<>();
		for (int k=0; k<subjectsTable.length; k++) {
			subjectList.add(new Subject(subjectsTable[k][0], subjectsTable[k][1], subjectsTable[k][2], subjectsTable[k][3], subjectsTable[k][4]));
		}
		
		ArrayList<Teacher> teacherList = new ArrayList<>();
		for (int h=0; h<teachersTable.length;h++) {
			teacherList.add(new Teacher(teachersTable[h][0], teachersTable[h][1], teachersTable[h][2], teachersTable[h][3]));
			}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Zestawienie ocen ucznia");
		System.out.println("");
		System.out.printf("%-30s", "Nazwa przedmiotu");
		System.out.printf("%-30s", "Nauczyciel przedmiotu");
		System.out.printf("%-30s\n", "Oceny ucznia(jeszcze nie dzia³a)");
		System.out.printf("%-30s", "----------------");
		System.out.printf("%-30s", "---------------------");
		System.out.printf("%-30s\n", "-----------------");
		@SuppressWarnings("unchecked")
		SubjectList subjects = new SubjectList(subjectList, students.getOnlyYear(), teacherList);
		
		subjects.getList();

	
	}

}
