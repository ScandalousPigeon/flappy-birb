package com.example.flappybird.view;

import javafx.scene.layout.Pane;

public class GameView {
    private final Pane root;

    public GameView(BirbView birdView) {
        root = new Pane();
        root.getChildren().add(birdView.getNode());
    }

    public Pane getRoot() {
        return root;
    }
}