package ru.pas;

public class TestClass {

    public static void main(String[] args){
        Board board = new SquareBoard(4);
        Game2048 game2048 = new Game2048(board);
        System.out.println(game2048.canMove());
    }
}