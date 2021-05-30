package Task;

public class Task {
	private String TaskID;
	private String TaskName;
	private String TaskDesc;
	
//	public Task (String TaskID, String TaskName, String TaskDesc) {
		if(TaskID == null || TaskID.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if(TaskName == null || TaskName.length()>20) {
			throw new IllegalArgumentException("Invalid Name");
		}
		if(TaskDesc == null || TaskDesc.length()>20) {
			throw new IllegalArgumentException("Invalid Description");
		}
	}
	

}