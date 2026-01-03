package Workshop;

/**
 * The patient class represents a patient in the hospital management system.
 * It extends the Person class and adds patient-specific functionality.
 * Patients can book appointments
 */
public class Patient extends Person{
	String patientID;
	/**
	 * Constructor to create a Patient object
	 * @param personID Inherited from Person class
	 * @param name Inherited from Person class
	 * @param age Inherited from Person class
	 * @param gender Inherited from Person class
	 * @param address Inherited from Person class
	 * @param contactDetails  Inherited from Person class
	 * @param patientID  Unique Identifier for the patient
	 */
	public Patient(String personID, String name, int age, String gender, String address, int contactDetails, String patientID) {
		super(personID, name, age, gender, address, contactDetails);
		this.patientID = patientID;
	}
	/**
	 * books a new appointment with a doctor
	 * @param doctor The doctor to book appointment with
	 * @param date The date of the appointment
	 * @return the created appointment object 
	 */
	public void bookAppointment(Doctor doctor, String date) {
		System.out.println(name +" booked appointment with Dr. "+doctor.name+" on "+date);
	}
}
