package ict.kosovo.growth.usertodoapplication;

import ict.kosovo.growth.usertodoapplication.models.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;

import java.time.LocalDate;

public class TodoCreateViewController {
    @FXML
    private TextField tfTodoName;

    @FXML
    private TextArea taDescription;

    @FXML
    private DatePicker dpDeadline;

    @FXML
    private CheckBox chIsFinished;

    @FXML
    private ColorPicker cpColor;

    public TodoItem getTodoItem() {

        String name = tfTodoName.getText();
        String desc = taDescription.getText();
        LocalDate deadLine = dpDeadline.getValue();
        Boolean isfinished = chIsFinished.isSelected();
        Color color = cpColor.getValue();

        return  new TodoItem(name,desc,deadLine,isfinished,color);
    }



}
