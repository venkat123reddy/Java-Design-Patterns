package lld.design.questions.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private Integer boardSize;
    private List<List<Ceil>> board;

    Board(int boardSize) {
        this.boardSize = boardSize;
        this.board = new ArrayList<>(boardSize);
    }

    public void move(Player player,Position position) {

        this.board.get(position.getColumn())
                .get(position.getColumn());
    }
}


