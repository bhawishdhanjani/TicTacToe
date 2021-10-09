package com.tictactoe;
public class Main{
    public static void main(String[] args) {
        GameBoard board = new GameBoard();
        Algorithm algorithm = new Algorithm();
        Console console = new Console();
        char[][] gameBoard = board.gameBoard();

        //Printing Game Board
        board.printGameBord(gameBoard);
        //Taking Input From User
        for (int i = 1; i <= 9; i++) {
            if (i % 2 != 0) {
                System.out.println("Enter your Position between 1 - 9");
                int user = console.getUser();
                board.fillGameBoard(user, 'X' , gameBoard);
            }
            if (i % 2 == 0) {
                int machine = console.getMachine();
                board.fillGameBoard(machine, '0' , gameBoard);
                board.printGameBord(gameBoard);
            }
            if (algorithm.isWin('0',gameBoard)|| algorithm.isWin('X',gameBoard))
                break;
        }
        //Printing Game Board
        board.printGameBord(gameBoard);

        //Checking Who Wins
        if(algorithm.isWin('0',gameBoard)){
            System.out.println("Machine Win");

        }
        if (algorithm.isWin('X',gameBoard)){
            System.out.println("User Win");
        }

    }
}
