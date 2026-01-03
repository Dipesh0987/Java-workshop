package Workshop;

public class Appointment {
	String appointmentID;
	String date;
	String time;
	public Appointment(String appointmentID, String date, String time) {
		this.appointmentID=appointmentID;
		this.date=date;
		this.time=time;
	}
	public void rescheduleAppointment(String newDate) {
		this.date=newDate;
		System.out.println("Appointment rescheduled to: "+newDate);
	}
	public void cancelAppointment() {
		System.out.println("Appointment cancelled");
	}
	public void viewAppointmentDetails() {
		System.out.println("Appointment: "+appointmentID+" on "+date+" at "+time);
	}
}
