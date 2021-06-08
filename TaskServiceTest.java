import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TaskServiceTest {

	// Creation of task service and loading of tasks into memory
	
		TaskService TM = new TaskService();
	
	@Test
	public void createTask() {
		// TaskTest.java ensured only tasks with valid parameters could be instantiated
		TM.addNewTask("1", "Buy Milk", "Go to store and buy milk.");
		assertEquals(1, TM.getTaskSize());
	}

	// Cannot instantiate task with an existing ID	
	
	@Test
	public void FailedTaskAddition() {
		// TaskTest.java ensured only tasks with valid parameters could be instantiated
		TM.addNewTask("1", "Buy Milk", "Go to store and buy milk.");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		TM.addNewTask("1", "Buy Milk", "Go to store and buy milk.");
		});
	}
	
	// Deleting tasks functionality test
	
	@Test 
	public void deleteTaskTest() {
		TM.addNewTask("1", "Buy Milk", "Go to store and buy milk.");
		TM.addNewTask("2", "Buy Eggs", "Go to store and buy eggs.");
		TM.deleteTask("2");
		assertEquals(1, TM.getTaskSize());
	}
	
	// Updating tasks functionality tests
	
	@Test 
	public void updateTaskName() { 
		TM.addNewTask("1", "Buy Milk", "Go to store and buy milk.");
		TM.updateName("1", "Buy potatos");
		assertTrue(TM.getTaskName("1").equals("Buy potatos"));
	}
	
	@Test 
	public void updateTaskDescription() {
		TM.addNewTask("1", "Buy Milk", "Go to store and buy milk.");
		TM.updateDescription("1", "Buy 2% lowfat milk");
		assertTrue(TM.getTaskDescription("1").equals("Buy 2% lowfat milk"));
	}
	
}
