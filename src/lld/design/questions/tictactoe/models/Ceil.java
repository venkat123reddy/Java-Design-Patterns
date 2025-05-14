package lld.design.questions.tictactoe.models;

public class Ceil {

    PlayerSymbol player;

    CeilStatus ceilStatus;

    Ceil() {
        this.ceilStatus = CeilStatus.EMPTY;
    }

    public void setPlayer(PlayerSymbol player) {
        this.player = player;
        this.ceilStatus = CeilStatus.OCCUPIED;
    }

    public boolean getStatus() {
        return false;
    }
}
