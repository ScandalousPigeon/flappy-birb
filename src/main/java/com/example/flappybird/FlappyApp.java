package com.example.flappybird;

import javafx.application.Application;
import javafx.scene.input.KeyCode;
import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.layout.Pane;

import javafx.scene.shape.Rectangle;
import java.io.IOException;
import java.util.Objects;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


// Mix flappy bird and chess? When the bird hits the piece the piece has to move?
// Maybe let the user jump, then when he gets to a piece he press E to select it and then E to move it to a square?
public class FlappyApp extends Application {

    double velocityY = 0;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Flappy Birb");

        Image bgImage = new Image(
                Objects.requireNonNull(
                        getClass().getResource("/images/background.png")
                ).toExternalForm()
        );

        ImageView background = new ImageView(bgImage);

        background.setFitWidth(800);
        background.setFitHeight(600);

        Image birdImage = new Image(getClass().getResource("/images/bird.jpeg").toExternalForm());
        ImageView bird = new ImageView(birdImage);
        bird.setFitWidth(50);
        bird.setFitHeight(50);

        Pane root = new Pane(background, bird);
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
