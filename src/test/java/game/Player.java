package game;

public class Player {

    private int score;
    private int ballGroup;

    public Player() {
        this.setScore(0);
        this.setBallGroup(0);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getBallGroup() {
        return ballGroup;
    }

    public void setBallGroup(int ballGroup) {
        this.ballGroup = ballGroup;
    }
}
