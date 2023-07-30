package LLDS.tictactoe.boards;

import LLDS.tictactoe.models.PieceType;
import LLDS.tictactoe.models.PlayingPiece;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;


public class Boardtictactoe {
    PlayingPiece[][]board;
    public Boardtictactoe(int size){
        board=new PlayingPiece[size][size];
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]!=null){
                    System.out.print(board[i][j].type.name()+"  ");
                }
                else {
                    System.out.print("   ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public boolean fillPosition(int i, int j, PlayingPiece piece) {
        if(board[i][j]!=null){
            return false;
        }else {
            board[i][j]=piece;
            return true;
        }
    }


    public boolean checkIfWinnerExists(int inputRow, int inputCol, PieceType type) {
        boolean winByRow=true;
        boolean winByCol=true;
        boolean winByDiagonal=true;
        boolean winByAntiDiagonal=true;
//        check for row
        for (int i = 0; i < board.length; i++) {
            if (board[inputRow][i]==null||board[inputRow][i].type!=type){
                winByRow=false;
            }
        }
//        check for columns
        for (int  i=0;i< board.length;i++){
            if (board[i][inputCol]==null|| board[i][inputCol].type!=(type)){
                winByCol=false;
            }
        }
        for (int i=0 ,j= 0; i < board.length; i++,j++) {
            if (board[i][j]==null|| board[i][j].type!=type){
                winByDiagonal=false;
            }
        }
        for (int i=0 ,j= board.length-1; i < board.length; i++,j--) {
            if (board[i][j]==null|| board[i][j].type!=type){
                winByAntiDiagonal=false;
            }
        }
        return winByRow||winByCol||winByDiagonal||winByAntiDiagonal;
    }

    public List<Pair<Integer, Integer>> geFreeCells() {
        List<Pair<Integer,Integer>> freeCells=new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]==null){
                    freeCells.add(new Pair<>(i,j));
                }
            }

        }
        return freeCells;
    }
}
