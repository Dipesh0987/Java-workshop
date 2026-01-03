package Workshop;

public class Treatment {
	String treatmentID;
	String type;
	String description;
	public Treatment(String treatmentID, String type, String description) {
		this.treatmentID = treatmentID;
		this.type = type;
		this.description=description;
	}
	public void updateDescription(String newDescription) {
		this.description = newDescription;
		System.out.println("Treatment description updated");
	}
	public void viewTreatmentDetails() {
		System.out.println("Treatment "+treatmentID+": "+type+" - "+description);
	}
}
