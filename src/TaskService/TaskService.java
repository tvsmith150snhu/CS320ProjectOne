package TaskService;

import Task.Task;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskService {
	private final List<Task> taskList = new ArrayList<>();
	
	private String newUniqueID() {
		return UUID.randomUUID().toString().substring(0, Math.min(toString().length(), 10));
	}
	
	private Task searchTask(String TaskID) throws Exception {
		int index = 0;
		while (index < taskList.size()) {
			if (TaskID.equals(taskList.get(index).getTaskID())) {
				return taskList.get(index);
			}
			index++;
		}
		throw new Exception("Task doesn't exist!");
	}
	public void newTask() {
		Task task = new Task(newUniqueID(), null, null);
		taskList.add(task);
	}
	public void newTask(String name) {
		Task task = new Task(newUniqueID(), name, null);
		taskList.add(task);
	}
	public void newTask(String name, String description) {
		Task task = new Task(newUniqueID(), name, description);
		taskList.add(task);
	}
	public void deleteTask(String id) throws Exception {
		taskList.remove(searchTask(id));
	}
	public void updateName(String id, String name) throws Exception {
		searchTask(id).setTaskName(name);
	}
	public void updateDescription(String id, String description)
		throws Exception {
		searchTask(id).setTaskDesc(description);
	}
	public List<Task> getTaskList() { 
		return taskList; }	
}
