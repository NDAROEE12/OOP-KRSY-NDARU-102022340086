import java.time.LocalDate;

public class Task {
    // TODO: Add the attributes for the Task class based on the module specification
    private final LocalDate dueDate;
    private String status;
    private String title;
    private String priority;

    // TODO: create the constructor for the Task class 
    private Task(   String title, String priority,LocalDate dueDate, String status){
        this.dueDate = dueDate;
        this.status = status;
        this.title = title;
        this.priority = priority;
    }

    // TODO: create the getter for the title attribute
    public String getTitle() {
        return title;
    }

    // TODO: create the getter for the priority attribute
    public String getPriority() {
        return priority;
    }

    // TODO: create the getter for the dueDate attribute
    public LocalDate getDuedate() {
        return dueDate;
    }

    // TODO: create the getter for the status attribute
    public String getStatus() {
        return status;
    }
    
    // TODO: create the SETTER for the status attribute
    public void setStatus(String status) {
        this.status = status;
    }
    
}
