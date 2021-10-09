package com.tictactoe;

public class GameBoard {
    public char[][] gameBoard() {
        char[][] chars = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-', '+'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-', '+'},
                {' ', '|', ' ', '|', ' '}};
        return chars;
    }
    public void printGameBord(char[][] gameBoard) {
        for (char[] element : gameBoard) {
            for (char element1 : element) {
                System.out.print(element1);
            }
            System.out.println();
        }
    }
    public void fillGameBoard(int user , char symbol,char[][] gameBoard) {
        switch (user) {
            case 1 -> gameBoard[0][0] = symbol;
            case 2 -> gameBoard[0][2] = symbol;
            case 3 -> gameBoard[0][4] = symbol;
            case 4 -> gameBoard[2][0] = symbol;
            case 5 -> gameBoard[2][2] = symbol;
            case 6 -> gameBoard[2][4] = symbol;
            case 7 -> gameBoard[4][0] = symbol;
            case 8 -> gameBoard[4][2] = symbol;
            case 9 -> gameBoard[4][4] = symbol;
        }
    }

}
