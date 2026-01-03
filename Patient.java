package Workshop;

public class Patient extends Person{
	String patientID;
	public Patient(String personID, String name, int age, String gender, String address, int contactDetails, String patientID) {
		super(personID, name, age, gender, address, contactDetails);
		this.patientID = patientID;
	}
	public void bookAppointment(Doctor doctor, String date) {
		System.out.println(name +" booked appointment with Dr. "+doctor.name+" on "+date);
	}
}
