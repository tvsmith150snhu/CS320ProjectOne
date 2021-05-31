package TaskTest;
import static org.junit.Assert.*;
import Task.Task;
import org.junit.Test;

	public class TaskTest {
		Task task = new Task ("123456789","Writing", "Write Code For Project");
		//Test TaskID
		//Tested 10 chars received pass, tested 11 received fail
		//Tested null, received fail
		
		@Test
		public void testTaskId() {
			String validTaskId = "123456789";
			task.setTaskID(validTaskId);
			assertEquals(validTaskId, task.getTaskID());
		}
		//Test Illegal Exception For Task Id
		
		@Test
		public void testTaskId2() {
			try {
				String validTaskId = "12345678912345";
				task.setTaskID(validTaskId);
			} catch (IllegalArgumentException message) {
				assertEquals("Invalid", message.getMessage());
			}
		}
		//Test Name
		//Tested 20 chars received pass, tested 11 received fail
		//Tested null, received fail
		
		@Test
		public void testName() {
			String validName = "Writing";
			task.setTaskName(validName);
			assertEquals(validName, task.getTaskName());
		}
		//Test Illegal Exception For name
		
		@Test
		public void testName2() {
			try {
				String validName =
						"Writinggggggggggggggggggggggggggggggggggggggggggg";
				task.setTaskName(validName);
			} catch (IllegalArgumentException message) {
				assertEquals("Invalid", message.getMessage());
			}
		}
		//Test Description
		//Tested 50 chars received pass, tested 11 received fail
		//Tested null, received fail
		
		@Test
		public void testDescription() {
			String validDescription = "Write Code For Project";
			task.setTaskDesc(validDescription);
			assertEquals(validDescription, task.getTaskDesc());
		}
		//Test Illegal Exception For Description
		@Test
		public void testDescription2() {
			try {
				String validDescription = "Write Code ForProjecttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt";
						
						task.setTaskDesc(validDescription);
			} catch (IllegalArgumentException message) {
				assertEquals("Invalid", message.getMessage());
			}
		}
}