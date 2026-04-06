package com.example.flappybird.controller;

import com.example.flappybird.model.ChessGameModel;
import com.example.flappybird.view.ChessBoardView;

public class ChessController {
    private final ChessGameModel model;
    private final ChessBoardView view;

    public ChessController() {
        this.model = new ChessGameModel();
        this.view = new ChessBoardView();
        this.view.render(model.getBoard());
    }

    public void refresh() {
        view.render(model.getBoard());
    }
}