package ru.pas;

import com.sun.javafx.scene.traversal.Direction;

import java.util.Random;

public class Game2048 implements Game {
    GameHelper helper = new GameHelper();
    Board board;
    Random random = new Random();
    Game2048(SquareBoard squareBoard, int size){
        board = new SquareBoard(size);
    }

    public Game2048(Board board) {
    }

    @Override
    public void init() {
        
    }

    @Override
    public boolean canMove() {
        return false;
    }

    @Override
    public boolean move(Direction direction) {
        return false;
    }

    @Override
    public void addItem() {

    }

    @Override
    public Board getGameBoard() {
        return null;
    }

    @Override
    public boolean hasWin() {
        return false;
    }
}
