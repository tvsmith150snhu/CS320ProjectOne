package AppointmentService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Appointment.Appointment;

	public class AppointmentService {

		public static List <Appointment> appointmentList;

		public AppointmentService (String apptId, Date date, String description){
			appointmentList = new ArrayList<Appointment>();
		}

		public static boolean addAppt(String apptId, Date date, String
				description) {
			for (Appointment appointment : appointmentList) {
				if (appointment.getAppointmentId().equals(apptId)){
					return false;
				}
			}
			appointmentList.add(new Appointment(apptId, date, description));
			return true;
		}

		public Appointment deleteAppt(String apptId) {
			for (int i = 0; i < appointmentList.size(); i++) {
				if (appointmentList.get(i).getAppointmentId().equals(apptId)) {
					Appointment appointment = appointmentList.get(i);
					appointmentList.remove(i);
					return appointment;
				}
			}
			return null;
		}
}
