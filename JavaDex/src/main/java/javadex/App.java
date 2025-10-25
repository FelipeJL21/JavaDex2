package javadex;

import classes.Pokemon;
import database.database;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();
        database bd = new database();
        bd.inicialize();
        Pokemon pikachu = bd.buscaPokemon(25);

        Label label = new Label("Pokemon " + pikachu.getNome() + " capturado.");
        Label labe2 = new Label("Hellow Word");
        StackPane pilha = new StackPane(label);
       
       // pilha.getChildren().add(labe2);
        var scene = new Scene(pilha, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}