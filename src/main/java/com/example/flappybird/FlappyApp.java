package com.example.flappybird;

import javafx.application.Application;
import javafx.scene.input.KeyCode;
import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.layout.Pane;

import javafx.scene.shape.Rectangle;
import java.io.IOException;

public class FlappyApp extends Application {

    double velocityY = 0;

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

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {

                velocityY += 0.0005;        // gravity
                bird.setY(bird.getY() + velocityY);

            }
        };

        timer.start();

        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.SPACE) {
                velocityY = -0.5; // jump upward
            }
        });


    }
}
