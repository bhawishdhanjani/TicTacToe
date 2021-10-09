package com.tictactoe;

public class Algorithm {

    public   boolean isWin(char alpha , char [][] gameBoard) {
        boolean isWin;
        if(gameBoard[0][0]==gameBoard[0][2] && gameBoard[0][0]==gameBoard[0][4] && gameBoard[0][0]== alpha)
            isWin = true;
        else if(gameBoard[2][0]==gameBoard[2][2] && gameBoard[2][0]==gameBoard[2][4] && gameBoard[2][0]== alpha)
            isWin = true;
        else if (gameBoard[4][0]==gameBoard[4][2] && gameBoard[4][0]==gameBoard[4][4] && gameBoard[4][0]== alpha)
            isWin = true;
        else if(gameBoard[0][0]==gameBoard[2][0] && gameBoard[0][0]==gameBoard[4][0] && gameBoard[0][0]== alpha)
            isWin = true;
        else if(gameBoard[0][2]==gameBoard[2][2] && gameBoard[0][2]==gameBoard[4][2] && gameBoard[0][2]== alpha)
            isWin = true;
        else if (gameBoard[0][4]==gameBoard[2][4] && gameBoard[0][4]==gameBoard[4][4] && gameBoard[0][4]== alpha)
            isWin = true;
        else if(gameBoard[0][0]==gameBoard[2][2] && gameBoard[0][0]==gameBoard[4][4] && gameBoard[0][0]== alpha)
            isWin = true;
        else if (gameBoard[0][4]==gameBoard[2][2] && gameBoard[0][4]==gameBoard[4][0] && gameBoard[0][4]== alpha)
            isWin = true;
        else isWin = false;
        return isWin;
    }
}
