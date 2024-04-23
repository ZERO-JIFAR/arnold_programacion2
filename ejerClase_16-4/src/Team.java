import java.util.Iterator;

public class Team implements Iterable<Player>{
    private int index;
    private Player[] players;

    public Team(Player[] players, int index) {
        this.players = players;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
    @Override
    public Iterator<Player> iterator() {
        return new Iterator<Player>() {
            @Override
            public boolean hasNext() {
                return index < players.length;
            }

            @Override
            public Player next() {
                return players[index++];
            }
        };

    }
}
