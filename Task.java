
public class Task {

	private String taskID;
	private String name;
	private String description;
	
	private Task() {
		
	}
	
	public Task(String taskID, String name, String description) {
		if (validateTask(taskID, name, description)) {
		this.taskID = taskID;
		this.name = name;
		this.description = description;
		} else {
			throw new IllegalArgumentException("Invalid Input");
		}
	}
	
	public Boolean validateTask(String taskID, String name, String description) {
		if (taskID != null && taskID.length() <= 10 && name != null && name.length() <= 20 && description != null && description.length() <= 50) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getTaskID() {
		return this.taskID;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return (
		"Task ID: " + getTaskID() +
		", Name: " + getName() +
		", Description: " + getDescription() 
		);
	}
	
	
	
}
