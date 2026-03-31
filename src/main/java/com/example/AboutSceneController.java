package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AboutSceneController {

    @FXML
    public void onClickBackButton(ActionEvent event) {
        App.setRoot("mainScene");
    }

}
