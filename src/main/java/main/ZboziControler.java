package main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import jdk.nashorn.internal.ir.debug.JSONWriter;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ZboziControler extends GridPane {
    @FXML
    public TextField nazevZbozi;
    @FXML
    public TextField jednotkaZbozi;
    @FXML
    public TextField cenaZaJednotkuZbozi;
    @FXML
    public TextField mnozstviZbozi;


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

    public void vlozitZbozi() throws IOException {
        System.out.println("Nazev" + nazevZbozi.getText() + "\n");
        System.out.println("Jednotka" + jednotkaZbozi.getText() + "\n");
        System.out.println("Cena za jednotku" + cenaZaJednotkuZbozi.getText() + "\n");
        System.out.println("mnozstvi" + mnozstviZbozi.getText() + "\n" );
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("jmeno",nazevZbozi.getText());
        jsonObject.put("jednotka",jednotkaZbozi.getText());
        jsonObject.put("cenaZaJednotku",cenaZaJednotkuZbozi.getText());
        jsonObject.put("mnozstvi",mnozstviZbozi.getText());
        Files.write(Paths.get("./src/main/resources/test.json"),jsonObject.toJSONString().getBytes());
        System.out.println("json zapsan");
    }

    public void readJson(String path) {
        JSONParser parse = new JSONParser();
        try(Reader reader = new FileReader(path)){
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
            System.out.println(jsonObject.get("mnozstvi"));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
