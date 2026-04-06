package com.example.flappybird.view;

import javafx.scene.layout.Pane;

public class GameView {
    private final Pane root;

    public GameView(ChessBoardView chessBoardView, BirbView birdView) {
        root = new Pane();

        root.getChildren().addAll(
                chessBoardView.getNode(),
                birdView.getNode()
        );
    }

    public Pane getRoot() {
        return root;
    }
}