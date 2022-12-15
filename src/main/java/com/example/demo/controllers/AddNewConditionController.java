package com.example.demo.controllers;

import com.example.demo.Application;
import com.example.demo.Model.Service;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AddNewConditionController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addNewCondition;

    @FXML
    private Button back;

    @FXML
    private TextField textField;

    @FXML
    void onAddNewCondition(ActionEvent event) {
        String newCondition = textField.getText();
        if(newCondition.equals(""))
        {
            textField.setText("ВИ ПОМИЛИЛИСЯ В ЖИТТІ");
            return;
        }
        Service service = Service.getInstance();
        service.insertCondition(newCondition);
        ShowingOptionController.getInstance().initConditionBox();
        textField.setText("");
    }


    @FXML
    void onBack(ActionEvent event) {
        Application.setScene(Application.getDisplayMenu());
    }

    @FXML
    void initialize() {
    }
}
