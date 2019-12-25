package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/*******************************************************************************
 * Třída {@code Start} je hlavní třídou projektu,
 * který ...
 *
 * @author    jméno autora
 * @version   0.00.000
 */
public class Start extends Application
{


    public static Stage getSingleInstance() {
        return singleInstance;
    }

    /***************************************************************************
     * Metoda, prostřednictvím níž se spouští celá aplikace.
     *
     * @param args Parametry příkazového řádku
     */
    private static Stage singleInstance = null;
    public static void main(String[] args)
    {

        launch(args);
    }



    @Override
    public void start(Stage primaryStage) throws Exception {
        singleInstance = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("/uvod.fxml"));
        singleInstance.setTitle("Úvod");

        singleInstance.setScene(new Scene(root));
        singleInstance.show();



    }

}

