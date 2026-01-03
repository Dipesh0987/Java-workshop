package Workshop;
/***
 * The Appointment class represents a medical appointment in the hospital management system.
 * It connects patients with doctors at a specific date and time.
 * 
 */
public class Appointment {
	String appointmentID;
	String date;
	String time;
	/**
	 * Constructor to create an appointment object.
	 * 
	 * @param appointmentID Unique identifier for the appointment
	 * @param date Date of appointment
	 * @param time Time of appointment
	 * 
	 */
	public Appointment(String appointmentID, String date, String time) {
		this.appointmentID=appointmentID;
		this.date=date;
		this.time=time;
	}
	/**
	 * Reschedules the appointment to a new date
	 * 
	 * @param newDate The new date
	 */
	public void rescheduleAppointment(String newDate) {
		this.date=newDate;
		System.out.println("Appointment rescheduled to: "+newDate);
	}
	/**
	 * Cancels the appointment
	 * Changes status to "Canceled"
	 * 
	 */
	public void cancelAppointment() {
		System.out.println("Appointment cancelled");
	}
	/**
	 * Displays detailed information about the appointment
	 * Shows appointment ID, date, time.
	 */
	public void viewAppointmentDetails() {
		System.out.println("Appointment: "+appointmentID+" on "+date+" at "+time);
	}
}
