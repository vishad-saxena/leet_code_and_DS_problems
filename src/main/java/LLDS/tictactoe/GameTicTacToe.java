package LLDS.tictactoe;

import javafx.util.Pair;
import LLDS.tictactoe.boards.Boardtictactoe;
import LLDS.tictactoe.models.PieceO;
import LLDS.tictactoe.models.PieceX;
import LLDS.tictactoe.players.Player;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GameTicTacToe {
    Deque<Player> list;
    Boardtictactoe gameBoard;

    GameTicTacToe(){
        initGame();
    }

    private void initGame() {
        list=new LinkedList<>();
        Player player1=new Player("vishad",new PieceO());
        Player player2=new Player("saxena",new PieceX());
        list.add(player1);
        list.add(player2);
        gameBoard=new Boardtictactoe(3);
    }
    public String startGame(){
        boolean noWinner=true;
        while (noWinner){
//            remove first player whose turn is on
            Player playerTurn=list.removeFirst();

//            print board to see the empty and filled spaces on board
            gameBoard.printBoard();
//            get freeCells
            List<Pair<Integer,Integer>> freeCells=gameBoard.geFreeCells();
            if (freeCells.isEmpty()){
                noWinner=false;
                continue;
            }
//            take input from user and add piece to board
            System.out.println("Enter the position Mr."+playerTurn.getUsername());
            Scanner scanner=new Scanner(System.in);
            String []s=scanner.nextLine().split(",");
            int inputRow =Integer.parseInt(s[0]);
            int inputCol =Integer.parseInt(s[1]);
//            check if the prefilled space is refilled
            boolean fillPosition=gameBoard.fillPosition(inputRow, inputCol,playerTurn.getPiece());
            if (!fillPosition){
                System.out.println("place already filled. Please retry Mr."+playerTurn.getUsername());
                list.addFirst(playerTurn);
                continue;
            }
//            add player at the end of the list
            list.addLast(playerTurn);

//            check is there is a winner
            boolean winnerExists=gameBoard.checkIfWinnerExists(inputRow,inputCol,playerTurn.getPiece().type);
            if (winnerExists){
                return playerTurn.getUsername();
            }

        }
        return "tie";
    }
}
