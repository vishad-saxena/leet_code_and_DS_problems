package LLDS.tictactoe;

public class MainMethodClass {
    public static void main(String[] args) {
        GameTicTacToe game=new GameTicTacToe();
        System.out.println("winner of this round is Mr."+game.startGame());
    }
}
