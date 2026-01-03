package Workshop;
/**
 * The Treatment class represents a medical treatment prescribed by a doctor.
 * It contains details about the treatment type, description, and prescribed medication.
 * 
 * 
 */
public class Treatment {
	String treatmentID;
	String type;
	String description;
	/**
	 * Constructor to create  a treatment object
	 * 
	 * @param treatmentID unique identifier for the treatment
	 * @param type type of treatment
	 * @param description Detailed description of treatment
	 */
	public Treatment(String treatmentID, String type, String description) {
		this.treatmentID = treatmentID;
		this.type = type;
		this.description=description;
	}
	/**
	 * Updated the description of the treatment
	 * @param newDescription the new description
	 */
	public void updateDescription(String newDescription) {
		this.description = newDescription;
		System.out.println("Treatment description updated");
	}
	/**
	 * Displays the detailed information about the treatment.
	 * shows treatment ID, type, description, 
	 */
	public void viewTreatmentDetails() {
		System.out.println("Treatment "+treatmentID+": "+type+" - "+description);
	}
}
