package Appointment;

import java.util.Date;

	public class Appointment {
		final private byte APPOINTMENT_ID_LENGTH;
		final private byte APPOINTMENT_DESCRIPTION_LENGTH;
		final private String INITIALIZER;
		private String appointmentId;
		private Date appointmentDate;
		private String description;
		{
			APPOINTMENT_ID_LENGTH = 10;
			APPOINTMENT_DESCRIPTION_LENGTH = 50;
			INITIALIZER = "INITIAL";
		}
		Appointment() {
			Date today = new Date();
			appointmentId = INITIALIZER;
			appointmentDate = today;
			description = INITIALIZER;
		}
		Appointment(String id) {
			Date today = new Date();
			updateAppointmentId(id);
			appointmentDate = today;
			description = INITIALIZER;
		}
		Appointment(String id, Date date) {
			updateAppointmentId(id);
			updateDate(date);
			description = INITIALIZER;
		}
		Appointment(String id, Date date, String description) {
			updateAppointmentId(id);
			updateDate(date);
			updateDescription(description);
		}
		public void updateAppointmentId(String id) {
			if (id == null) {
				throw new IllegalArgumentException("Appointment ID cannot be null.");
			} else if (id.length() > APPOINTMENT_ID_LENGTH) {
				throw new IllegalArgumentException("Appointment ID cannot exceed " +
						APPOINTMENT_ID_LENGTH +
						" characters.");
			} else {
				this.appointmentId = id;
			}
		}
		public String getAppointmentId() { return appointmentId; }
		public void updateDate(Date date) {
			if (date == null) {
				throw new IllegalArgumentException("Appointment date cannot be null.");
			} else if (date.before(new Date())) {
				throw new IllegalArgumentException(
						"Cannot make appointment in the past.");
			} else {
			}	
		}
	}
