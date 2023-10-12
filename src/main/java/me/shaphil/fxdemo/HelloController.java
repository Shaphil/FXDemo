package me.shaphil.fxdemo;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private CheckBox checkBox;

    @FXML
    protected void onHelloButtonClick() {
        if (checkBox.isSelected()) {
            welcomeText.setText("All done");
        } else {
            welcomeText.setText("Welcome to JavaFX Application!");
        }
    }
}