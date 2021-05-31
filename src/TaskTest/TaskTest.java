package TaskTest;
import static org.junit.Assert.*;
import Task.Task;
import org.junit.Test;

	public class TaskTest {
		Task task = new Task ("0123456789","Coding", "Prep Code in Project");
		//TaskID Test
		//Pass test with 10 chars, tested 11 received fail
		//Tested null, received fail
		@Test
		public void testTaskId() {
			String validTaskId = "123456789";
			task.setTaskID(validTaskId);
			assertEquals(validTaskId, task.getTaskID());
		}
		
		//Test Illegal Exception For Task Id
		@Test
		public void testTaskIdBAD() {
			try {
				String validTaskId = "01234567890123456789";
				task.setTaskID(validTaskId);
			} catch (IllegalArgumentException message) {
				assertEquals("Invalid ID", message.getMessage());
			}
		}
		//Test Name
		
		@Test
		public void testName() {
			String validName = "Coding";
			task.setTaskName(validName);
			assertEquals(validName, task.getTaskName());
		}
		
		//Test illegal exception for name
		@Test
		public void testNameBAD() {
			try {
				String validName =
						"Codinggggggggggggggggggggggggggggggggggggggggggg";
				task.setTaskName(validName);
			} catch (IllegalArgumentException message) {
				assertEquals("Invalid", message.getMessage());
			}
		}
		
		//Test Description		
		@Test
		public void testDescription() {
			String validDescription = "Prep Code in Project";
			task.setTaskDesc(validDescription);
			assertEquals(validDescription, task.getTaskDesc());
		}
		//Test Illegal Exception For Description
		@Test
		public void testDescriptionBAD() {
			try {
				String validDescription = "Prep Code in Projecttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt";		
						task.setTaskDesc(validDescription);
			} catch (IllegalArgumentException message) {
				assertEquals("Invalid", message.getMessage());
			}
		}
}