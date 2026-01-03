package Workshop;

/**
 * The HospitalManagementSystem class demonstrates the functionality of the hospital management system with a main method.
 * 
 */
public class HospitalManagementSystem {

	public static void main(String[] args) {
		Doctor d = new Doctor("D001", "Dipesh Chhetri", 21, "Male", "Kathmandu", 97494, "D334", "Neurology");
		Patient p = new Patient("P001", "Divyani Khatri", 19, "Female", "Kathmandu", 9874560, "D333");
		
		d.viewPersonalDetails();
		p.viewPersonalDetails();
		
		p.bookAppointment(d, "2026-01-10");
		d.seePatientDetails(p);
		d.prescribeTreatment(p, "Paracetamol");
		
		
	}

}
