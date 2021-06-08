import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {

	//Successful Task creation

	@Test
	public void createTask() {
		Task task = new Task("1", "Mow lawn", "Mow the front yard and the back yard.");
		assertTrue(task.getTaskID().equals("1"));
		assertTrue(task.getName().equals("Mow lawn"));
		assertTrue(task.getDescription().equals("Mow the front yard and the back yard."));
	}
	
	@Test 
	public void createTaskValidParam() {
		Task task = new Task("1", "Mow lawn", "Mow the front yard and the back yard.");
		assertTrue(task.validateTask("1", "Mow lawn", "Mow the front yard and the back yard."));
	}
	
	// Tests to ensure task will not be created with invalid parameters
	
	// Invalid Name
	@Test public void invalidTaskNameTooLong() {	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task task = new Task("1", "This name is longer than twenty characters and then some", "Mow the front yard and the back yard.");
		});
	}
	
	@Test public void invalidTaskNameNull() {	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task task = new Task("1", null, "Mow the front yard and the back yard.");
		});
	}
	
	// Invalid ID
	@Test public void invalidTaskIDTooLong() {	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task task = new Task("123433345543345", "Name", "Mow the front yard and the back yard.");
		});
	}
	
	@Test public void invalidTaskIDNull() {	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task task = new Task(null, "Name", "Mow the front yard and the back yard.");
		});
	}
	
	// Invalid Description
	
	@Test public void invalidDescriptionTooLong() {	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task task = new Task(null, "Name", "Mow the front yard and the back yard. Make sure to apply proper priming before starting");
		});
	}
	
	@Test public void invalidTaskDescriptionNull() {	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Task task = new Task(null, "Name", null);
		});
	}
	
	

}
