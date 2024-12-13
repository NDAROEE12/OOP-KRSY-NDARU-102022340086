import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.sound.midi.InvalidMidiDataException;

public class MainAppController {

    @FXML
    private TableView<Task> taskTable; // Table for displaying tasks
    @FXML
    private TableColumn<Task, String> titleCol, priorityCol, statusCol; // Columns for task title, priority, and status
    @FXML
    private TableColumn<Task, LocalDate> dueDateCol; // Column for task due date
    @FXML
    private TextField titleField; // TextField for task title 
    @FXML
    private ComboBox<String> priorityBox; // ComboBox for task priority 
    @FXML
    private DatePicker dueDatePicker; // DatePicker for task due date 

    private ObservableList<Task> taskList; // List of tasks 

    @FXML
    public void initialize() {
        taskList = FXCollections.observableArrayList(TaskFileManager.loadTasks());

        // TODO: Set cell value factory for each column in order to display the correct attribute
        // hint: use setCellValueFactory and PropertyValueFactory method
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        priorityCol.setCellValueFactory(new PropertyValueFactory<>("priority"));
        dueDateCol.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        
        

        // TODO: Set the width of each column 
        // hint: use setPrefWidth
        titleCol.setPrefWidth(150);
        statusCol.setPrefWidth(150);
        priorityCol.setPrefWidth(150);
        dueDateCol.setPrefWidth(150);

        taskTable.setItems(taskList);

        // TODO: Add options to the priorityBox 
        priorityBox.getItems().addAll("High", "Medium", "Low");
    }

    @FXML
    private void addTask() {
        try {
        
            if (titleField.getText().isEmpty() || priorityBox.getValue() == null || dueDatePicker.getValue() == null) {
                // TODO: Throw new MissingFieldException with the appropriate message 
                throw new MissingFieldException("Maaf error :( )")
            }

            if (dueDatePicker.getValue().isBefore(LocalDate.now())) {
                // TODO: Throw new InvalidDateException with the appropriate message 
                throw new InvalidMidiDataException("T_T HUUUAAAAAAaaaaa")
            }

            // TODO: Create a new Task object with the values from the form 
            // hint: use getText() for TextField, getValue() for ComboBox, and DatePicker, also add "Incomplete" as the default status
            Task task = new Task(titleField.getText(),  priorityBox.getValue(),dueDatePicker.getValue(), "incomplete"
            );

            // TODO: Add the new task to the taskList
            // hint: use add method from ObservableList

            clearData();
            TaskFileManager.saveTasks(new ArrayList<>(taskList));
        }
        
        // example of the catch and throw error 
        catch (MissingFieldException | InvalidDateException e) {
            showError(e.getMessage());
        }

    }

    // TODO: clear the data in the form after adding a task
    // hint: use function getSelectionModel().clearSelection() for ComboBox dan getEditor().clear() for DatePicker
    private void clearData(){

    }

    @FXML
    private void deleteTask() {
        try {
    
            Task selected = taskTable.getSelectionModel().getSelectedItem();
            if (selected == null) {
                // TODO: Throw new TaskNotSelectedException with the appropriate message 
                
            }

            taskList.remove(selected);
            TaskFileManager.saveTasks(new ArrayList<>(taskList));
        }
        
        // TODO: Catch TaskNotSelectedException and call showError (Look up at the example in addTask)
        

    }

    @FXML
    private void markTaskComplete() {
        try {
            Task selected = taskTable.getSelectionModel().getSelectedItem();
            if (selected == null) {
                // TODO: Throw new TaskNotSelectedException with the appropriate message 

            }
            // TODO: Set the status of the selected task to "Complete"
            // hint: gunakan function setStatus dari kelas Task

            taskTable.refresh();
            TaskFileManager.saveTasks(new ArrayList<>(taskList));
        }

        // TODO: Catch TaskNotSelectedException and call showError once again 
        

    }

    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR, message, ButtonType.OK);
        alert.showAndWait();
    }

    // TODO: create MissingFieldException exception

    // TODO: create TaskNotSelectedException exception

    // TODO: create Buat kelas InvalidDateException exception 

    // TODO: createBuat kelas MissingDateException exception

}