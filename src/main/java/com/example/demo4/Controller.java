package com.example.demo4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label a;

    @FXML
    private Label b;

    @FXML
    private Label sum;

    @FXML
    private TextField textFieldA;

    @FXML
    private TextField textFieldB;

    @FXML
    private TextField textFieldSum;

    @FXML
    private Button Calc;

    @FXML
    private Button Clear;

    @FXML
    public void clickCalc(ActionEvent actionEvent) {
        try{
            int a = Integer.parseInt(textFieldA.getText());
            int b = Integer.parseInt(textFieldB.getText());
            int sum = a + b;
            textFieldSum.setText(Integer.toString(sum));
        }
        catch (NumberFormatException ne){
            textFieldA.setText("");
            textFieldB.setText("");
            textFieldSum.setText("Error!");
        }
    }

    @FXML
    public void clickClear(ActionEvent actionEvent) {
        textFieldA.setText("");
        textFieldB.setText("");
        textFieldSum.setText("");
    }
}