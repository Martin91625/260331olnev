package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainSceneController {

    @FXML
    private Button closeButton;

    @FXML
    public void onClickExitButton(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
        // System.exit(0);
    }

    @FXML
    public void onClickAboutButton(ActionEvent event) {
        System.out.println("Névjegy");
        App.setRoot("aboutScene");
    }

    @FXML
    public void onClickSearchButton(ActionEvent event) {
        System.out.println("Keresés");
        App.setRoot("nameScene");
    }
}
