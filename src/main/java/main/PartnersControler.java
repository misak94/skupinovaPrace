package main;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PartnersControler extends GridPane {



    public void pridatZboziScena(javafx.event.ActionEvent actionEvent) throws Exception {
        Stage stage = Start.getSingleInstance();
        Parent root = FXMLLoader.load(getClass().getResource("/vlozeniZbozi.fxml"));
        stage.setTitle("Přidat Zboží");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void odebratZboziScena(javafx.event.ActionEvent actionEvent) throws Exception {
        Stage stage = Start.getSingleInstance();
        Parent root = FXMLLoader.load(getClass().getResource("/vlozeniZbozi.fxml"));
        stage.setTitle("odebrat Zboží");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void seznamZboziScena(javafx.event.ActionEvent actionEvent) throws Exception {
        Stage stage = Start.getSingleInstance();
        Parent root = FXMLLoader.load(getClass().getResource("/seznamZbozi.fxml"));
        stage.setTitle("seznam Zboží");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void pridatFakturScena(javafx.event.ActionEvent actionEvent) throws Exception {
        Stage stage = Start.getSingleInstance();
        Parent root = FXMLLoader.load(getClass().getResource("/vlozeniFaktury.fxml"));
        stage.setTitle("Přidat Fakturu");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void odebratFakturuScena(javafx.event.ActionEvent actionEvent) throws Exception {
        Stage stage = Start.getSingleInstance();
        Parent root = FXMLLoader.load(getClass().getResource("/vlozeniZbozi.fxml"));
        stage.setTitle("odebrat Fakturu");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void seznamFakturScena(javafx.event.ActionEvent actionEvent) throws Exception {
        Stage stage = Start.getSingleInstance();
        Parent root = FXMLLoader.load(getClass().getResource("/seznamFaktur.fxml"));
        stage.setTitle("seznam Faktur");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void pridatPartneraScena(javafx.event.ActionEvent actionEvent) throws Exception {
        Stage stage = Start.getSingleInstance();
        Parent root = FXMLLoader.load(getClass().getResource("/vlozeniFaktury.fxml"));
        stage.setTitle("Přidat Partnera");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void odebratPartneraScena(javafx.event.ActionEvent actionEvent) throws Exception {
        Stage stage = Start.getSingleInstance();
        Parent root = FXMLLoader.load(getClass().getResource("/vlozeniZbozi.fxml"));
        stage.setTitle("odebrat Partnera");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void seznamPartneruScena(javafx.event.ActionEvent actionEvent) throws Exception {
        Stage stage = Start.getSingleInstance();
        Parent root = FXMLLoader.load(getClass().getResource("/seznamFaktur.fxml"));
        stage.setTitle("seznam Partnerů");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
