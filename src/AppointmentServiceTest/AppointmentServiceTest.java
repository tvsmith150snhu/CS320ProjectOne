package AppointmentServiceTest;

import static org.junit.Assert.*;
import java.util.Calendar;
import java.util.Date;
import org.junit.Test;

import Appointment.Appointment;
import AppointmentService.AppointmentService;;

	public class AppointmentServiceTest {
		@SuppressWarnings("deprecation")
		Date date = new Date(2021, Calendar.FEBRUARY, 19);

		@Test
		public void addApptTest() {
			AppointmentService appointmentService = new AppointmentService
					("123456789", date, "Scheduled");
			assertEquals(true,AppointmentService.addAppt("123456789",date,
					"Scheduled"));
		}

		@Test
		public void addApptTest2() {
			AppointmentService appointmentService = new AppointmentService
					("123456789", date, "Scheduled");
			boolean result = appointmentService.addAppt("123456789", date,
					"Scheduled");
			assertTrue(result);
		}

		@Test
		public void deleteApptTest() {
			AppointmentService appointmentService = new AppointmentService
					("123456789", date, "Scheduled");
			Appointment a = appointmentService.deleteAppt("123456789");
			assertTrue(a == null);
		}
 
		@Test
		public void deleteApptTest2() {
			AppointmentService appointmentService = new AppointmentService
					("123456789", date, "Scheduled");
			boolean result = appointmentService.addAppt("123456789", date,
					"Scheduled");
			Appointment a = appointmentService.deleteAppt("123456789");
			assertTrue(a != null);
		}
}
