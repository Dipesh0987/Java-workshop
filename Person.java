package Workshop;

public class Person {
	String personID;
	String name;
	int age;
	String gender;
	String address;
	int contactDetails;
	public Person(String personID, String name, int age, String gender, String address, int contactDetails) {
		this.personID=personID;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.address=address;
		this.contactDetails=contactDetails;
	}
	public void viewPersonalDetails() {
		System.out.println("ID: "+ personID +" Name: "+ name +" Age: "+ age +" Gender: "+ gender +" Address: "+ address +" Contact Details: "+ contactDetails);
	}
}
