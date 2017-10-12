package game;

public class Match {

    private Player player1;
    private Player player2;

    private static final int SOLID_BALLS_GROUP = 1;
    private static final int STRIPED_BALLS_GROUP = 2;

    public Match() {
        this.setPlayer1(new Player());
        this.setPlayer1(new Player());
    }

    public void makePoint(Player player, int ballID) {
        if (player.getBallGroup() == 0) {
            if (ballID > 8) {
                player.setBallGroup(this.STRIPED_BALLS_GROUP);
            } else {
                player.setBallGroup(this.SOLID_BALLS_GROUP);
            }
        }

        player.setScore((player.getScore() > 8) ? player.getScore() + 1 : player.getScore());
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }
}
