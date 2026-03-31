package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainSceneController {

    @FXML
    void onClickAboutButton(ActionEvent event) {
        System.out.println("Névjegy");
        App.setRoot("aboutScene");
    }

    @FXML
    void onClickSearchButton(ActionEvent event) {
        System.out.println("Keresés");
        App.setRoot("nameScene");
    }
}
