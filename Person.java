package Workshop;

/**
 * THE Person class represents a generic person in the hospital management system.
 * This is the parent class for patient and Doctor classes.
 * It contains the basic personal information common to all individuals.
 * 
 */
public class Person {
	String personID;
	String name;
	int age;
	String gender;
	String address;
	int contactDetails;
	/**
	 * Constructor to create a Person object with all details
	 * 
	 * @param personID Unique identifier for the person
	 * @param name Full name of the person
	 * @param age Age of the person
	 * @param gender Gender of the person
	 * @param address Residential address
	 * @param contactDetails
	 */
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
