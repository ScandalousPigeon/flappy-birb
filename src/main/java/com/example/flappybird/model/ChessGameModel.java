package com.example.flappybird.model;

import com.github.bhlangonijr.chesslib.Board;
import com.github.bhlangonijr.chesslib.move.Move;

import java.util.List;

public class ChessGameModel {
    private final Board board = new Board();

    public Board getBoard() {
        return board;
    }

    public List<Move> getLegalMoves() {
        return board.legalMoves();
    }

    public boolean tryMove(Move move) {
        if (board.isMoveLegal(move, true)) {
            board.doMove(move);
            return true;
        }
        return false;
    }

    public void undo() {
        board.undoMove();
    }
}