package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NameSceneController {

    @FXML
    private Label countNameLabel;

    @FXML
    private TextField huNameField;

    @FXML
    private TextField itNameField;

    @FXML
    public void onClickBackButton(ActionEvent event) {
        App.setRoot("mainScene");
    }
    @FXML
    public void initialize() {
        System.out.println("Tölt...");
        Integer size = App.nameDictList.size();
        countNameLabel.setText(size.toString());
    }

    @FXML
    public void onClickSearchButton(ActionEvent event) {
        String searchedName = huNameField.getText().toLowerCase();
        //System.out.println(searchedName);
        boolean exists = false;
        for (NameDict nameDict : App.nameDictList) {
            //System.out.println(nameDict.getHuName());
            //System.out.println(nameDict.getItName());
            if(nameDict.getHuName().toLowerCase().equals(searchedName.toLowerCase()) && !nameDict.getItName().equals("-") ) {
                System.out.println("Találat");
                itNameField.setText(nameDict.getItName());
                exists = true;
            }
        }
        if(exists == false) {
            itNameField.setText("Nincs olasz megfelelő");
        }
    }
}
