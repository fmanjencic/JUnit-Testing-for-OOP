import java.util.ArrayList;


public class TaskService {

ArrayList<Task> tasks = new ArrayList<>();

public void addNewTask(String ID, String name, String description) {
	if (validateUniqueID(ID)) {
	Task task = new Task(ID, name, description);
	tasks.add(task);
	} else {
		throw new IllegalArgumentException("ID already in use, please assign another ID.");
	}
}

public int getTaskSize() {
	return tasks.size();
}

public void printInfo() {
	
	for (int i = 0; i < tasks.size(); ++i) {
		System.out.println(tasks.get(i).toString());
	}
			
}

public Boolean validateUniqueID(String ID) {
	for (int i = 0; i < tasks.size(); ++i) {
		if (ID.equals(tasks.get(i).getTaskID())) {
			return false;
		} 
	}
	return true;
}

public void deleteTask(String ID) {
for (int i = 0; i < tasks.size(); ++i) {
	if (ID.equals(tasks.get(i).getTaskID())) {
		tasks.remove(i);
	}
}
}

public void updateName(String ID, String name) {
	for (int i = 0; i < tasks.size(); ++i) {
		if (ID.equals(tasks.get(i).getTaskID())) {
			tasks.get(i).setName(name);
		}
	}
}

public String getTaskName(String ID) {
	String name = null;
	for (int i = 0; i < tasks.size(); ++i) {
		if (ID.equals(tasks.get(i).getTaskID())) {
			name = tasks.get(i).getName();
			return name;
		}}
	return name;
}

public String getTaskDescription(String ID) {
	String Description = null;
	for (int i = 0; i < tasks.size(); ++i) {
		if (ID.equals(tasks.get(i).getTaskID())) {
			Description = tasks.get(i).getDescription();
			return Description;
		}}
	return Description;
}


public void updateDescription(String ID, String description) {
	for (int i = 0; i < tasks.size(); ++i) {
		if (ID.equals(tasks.get(i).getTaskID())) {
			tasks.get(i).setDescription(description);
		}
	}
}

}

