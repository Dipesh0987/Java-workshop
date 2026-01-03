package Workshop;
/**
 * The doctor class represents a medical doctor in the hospital management system.
 * It extends the person class and adds doctor-specific functionality.
 * Doctors can see patient details and prescribe treatments.
 * 
 */
public class Doctor extends Person{
	String doctorID;
	String department;
	/**
	 * Constructor to create a doctor object.
	 * 
	 * @param personID Inherited from Person class
	 * @param name Inherited from Person class
	 * @param age Inherited form Person class
	 * @param gender Inherited from Person class
	 * @param address Inherited from Person class
	 * @param contactDetails Inherited from Person class
	 * @param doctorID Unique identifier for the doctor
	 * @param department Department where doctor works
	 * 
	 */
	public Doctor(String personID, String name, int age, String gender, String address, int contactDetails, String doctorID, String department) {
		super(personID, name, age, gender, address, contactDetails);
		this.doctorID = doctorID;
		this.department = department;
	}
	/**
	 * Displays detailed information about a patient
	 * @param patient The patient whose details to view
	 */
	public void seePatientDetails(Patient patient) {
		System.out.println("Dr. "+ name +" viewing patient: "+ patient.name);
	}
	/**
	 * Prescribes a treatment for a patient during an appointment
	 * @param patient 
	 * @param medicine Prescribed medicine
	 */
	public void prescribeTreatment(Patient patient, String medicine) {
		System.out.println("Dr. "+ name +" prescribed "+ medicine + " to "+ patient.name);
	}
	
}
