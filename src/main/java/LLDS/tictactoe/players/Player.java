package LLDS.tictactoe.players;

import LLDS.tictactoe.models.PlayingPiece;


public class Player {
    String username;
    PlayingPiece piece;
    public PlayingPiece getPiece() {
        return piece;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPiece(PlayingPiece piece) {
        this.piece = piece;
    }

    public Player(String username, PlayingPiece piece){
        this.username=username;
        this.piece=piece;
    }
}
