package Workshop;

public class Doctor extends Person{
	String doctorID;
	String department;
	public Doctor(String personID, String name, int age, String gender, String address, int contactDetails, String doctorID, String department) {
		super(personID, name, age, gender, address, contactDetails);
		this.doctorID = doctorID;
		this.department = department;
	}
	public void seePatientDetails(Patient patient) {
		System.out.println("Dr. "+ name +" viewing patient: "+ patient.name);
	}
	public void prescribeTreatment(Patient patient, String medicine) {
		System.out.println("Dr. "+ name +" prescribed "+ medicine + " to "+ patient.name);
	}
	
}
