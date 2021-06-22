package ru.pas;

import com.sun.javafx.scene.traversal.Direction;

public interface Game {
    void init();
    boolean canMove();
    boolean move(Direction direction);
    void addItem();
    Board getGameBoard();
    boolean hasWin();
}
