package Workshop;

public class Person {
	String personID;
	String name;
	int age;
	public Person(String personID, String name, int age) {
		this.personID=personID;
		this.name=name;
		this.age=age;
	}
	public void viewPersonalDetails() {
		System.out.println("ID: "+ personID +" Name: "+ name +" Age: "+age);
	}
}
