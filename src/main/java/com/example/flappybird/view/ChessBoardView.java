package com.example.flappybird.view;

import com.github.bhlangonijr.chesslib.Board;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

public class ChessBoardView {
    private final GridPane root = new GridPane();

    public ChessBoardView() {
        int tileSize = 100;

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Rectangle tile = new Rectangle(tileSize, tileSize);
                tile.setFill((row + col) % 2 == 0
                        ? Color.web("#f0d9b5")
                        : Color.web("#b58863"));
                root.add(new StackPane(tile), col, row);
            }
        }
    }

    public GridPane getNode() {
        return root;
    }

    public void render(Board board) {
        // clear piece overlays, then redraw pieces from board state
    }
}