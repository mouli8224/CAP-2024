import java.util.*;

public class board {
    int board_size;
    Queue<Player> players;
    Dice dyc;
    HashMap<Integer, Integer> snkldr;

    board(int board_size, Queue<Player> players, Dice dyc, HashMap<Integer, Integer> snkldr) {
        this.board_size = board_size;
        this.players = players;
        this.dyc = dyc;
        this.snkldr = snkldr;
    }

    public Player getplayers() {
        return players.poll();
    }

    public void setplayers(Player plyr) {
        players.offer(plyr);
    }
}
