package AppointmentService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Appointment.Appointment;
public class AppointmentService {
//Storage for Appointment list
public static List <Appointment> appointmentList;
//Constructor
public AppointmentService (String apptId, Date date, String description){
 appointmentList = new ArrayList<Appointment>();
 }
//Method for adding an appt
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
//Method for deleting appt
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
