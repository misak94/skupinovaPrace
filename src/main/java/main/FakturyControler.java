package main;


import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FakturyControler extends GridPane {
    @FXML
    public TextField idFaktury ;
    @FXML
    public TextField datumSplatnosti;
    @FXML
    public TextField zpusobPlatby ;
    @FXML
    public TextField datumVystaveni;
    @FXML
    public TextField zbozi;
    @FXML
    public TextField mnozstvi;
    @FXML
    public TextField jednotkaMnozstvi;
    @FXML
    public TextField cenaZaJednotku;
    @FXML
    public TextField jmenoObchodnihoPartnera;
    @FXML
    public TextField ico;
    @FXML
    public TextField adresa;
    @FXML
    public TextField telefon;
    @FXML
    public TableView <Faktura> seznamFaktur;
    @FXML
    public TableColumn <Faktura,String>id;
    @FXML
    public TableColumn <Faktura,String>partner;
    ObservableList<Faktura> faktura = FXCollections.observableArrayList();
    @FXML
    public TextField vyhledat;

    TableView.TableViewSelectionModel tableModel = seznamFaktur.getSelectionModel();
    ObservableList<Faktura> selectedItems = tableModel.getSelectedItems();











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

    public void vlozitFakturu() throws IOException {
        JSONObject json = new JSONObject();
        if(validace()) {
            json.put("ID faktury", idFaktury.getText());
            json.put("Datum splatnosti", datumSplatnosti.getText());
            json.put("Způsob platby", zpusobPlatby.getText());
            json.put("Datum vystavení", datumVystaveni.getText());
            json.put("Zboží", zbozi.getText());
            json.put("Množství", mnozstvi.getText());
            json.put("Jednotka množství", jednotkaMnozstvi.getText());
            json.put("Cena za jdnotku", cenaZaJednotku.getText());
            json.put("Jméno partnera", jmenoObchodnihoPartnera.getText());
            json.put("ICO", ico.getText());
            json.put("Adresa", adresa.getText());
            json.put("Telefon", telefon.getText());

            Files.write(Paths.get("./src/main/resources/" + idFaktury.getText().toString() + ".json"), json.toJSONString().getBytes());

        }
    }

    public boolean validace(){
        boolean bool = true;
        if(idFaktury.getText().equals("")){
            idFaktury.setStyle("-fx-background-color: #FF0101;");
            bool = false;
        }
        if(datumSplatnosti.getText().equals("")){
            datumSplatnosti.setStyle("-fx-background-color: #FF0101;");
            bool = false;
        }
        if(zpusobPlatby.getText().equals("")){
            zpusobPlatby.setStyle("-fx-background-color: #FF0101;");
            bool = false;
        }
        if(datumVystaveni.getText().equals("")){
            datumVystaveni.setStyle("-fx-background-color: #FF0101;");
            bool = false;
        }
        if(zbozi.getText().equals("")){
            zbozi.setStyle("-fx-background-color: #FF0101;");
            bool = false;
        }
        if(mnozstvi.getText().equals("")){
            mnozstvi.setStyle("-fx-background-color: #FF0101;");
            bool = false;
        }
        if(jednotkaMnozstvi.getText().equals("")){
            jednotkaMnozstvi.setStyle("-fx-background-color: #FF0101;");
            bool = false;
        }
        if(cenaZaJednotku.getText().equals("")){
            cenaZaJednotku.setStyle("-fx-background-color: #FF0101;");
            bool = false;
        }
        if(jmenoObchodnihoPartnera.getText().equals("")){
            jmenoObchodnihoPartnera.setStyle("-fx-background-color: #FF0101;");
            bool = false;
        }
        if(ico.getText().equals("")){
            ico.setStyle("-fx-background-color: #FF0101;");
            bool = false;
        }
        if(adresa.getText().equals("")){
            adresa.setStyle("-fx-background-color: #FF0101;");
            bool = false;
        }
        if(telefon.getText().equals("")){
            telefon.setStyle("-fx-background-color: #FF0101;");
            bool = false;
        }

        return bool;
    }

    public void seznam(){
        seznamFaktur.getItems().clear();
         vypis("./src/main/resources",vyhledat.getText());
    }

    public void naplnSeznam(ObservableList<Faktura> list){
          seznamFaktur.setItems(list);
          id.setCellValueFactory(new PropertyValueFactory<Faktura, String>("id"));
          partner.setCellValueFactory(new PropertyValueFactory<Faktura, String>("partner"));
    }

    public JSONObject readJson(String path) {
        JSONParser parse = new JSONParser();
        JSONObject jsonObject = null;
        try(Reader reader = new FileReader(path)){
            JSONParser jsonParser = new JSONParser();
             jsonObject = (JSONObject) jsonParser.parse(reader);
            


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    public ObservableList<Faktura> getFaktura(JSONObject json){
        faktura.add(new Faktura(json.get("ID faktury").toString(),json.get("Jméno partnera").toString()));
        return faktura;
    }

    public void vypis(String path,String regex){
        try (Stream<Path> walk = Files.walk(Paths.get(path))) {

            List<String> result = walk.map(x -> x.toString())
                    .filter(f -> f.endsWith(".json")).collect(Collectors.toList());




           for(String json :result){
            if(Pattern.matches("\\w*"+regex+"\\w*",readJson(json).get("ID faktury").toString()) || Pattern.matches("\\w*"+regex+"\\w*",readJson(json).get("Jméno partnera").toString())) {
                naplnSeznam(getFaktura(readJson(json)));
            }
           }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void select(javafx.event.ActionEvent actionEvent){
        System.out.println("click");


    }



}
