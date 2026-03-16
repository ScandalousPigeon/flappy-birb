package com.example.flappybird;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.layout.Pane;

import javafx.scene.shape.Rectangle;
import java.io.IOException;

public class FlappyApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Flappy Birb");
        Rectangle bird = new Rectangle(50, 50);
        bird.setX(200);
        bird.setY(200);

        Pane root = new Pane(bird);
        Scene scene = new Scene(root, 800, 600);

        stage.setScene(scene);
        stage.show();


    }
}
