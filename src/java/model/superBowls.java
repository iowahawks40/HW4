
package model;

public class superBowls {
    
    private int SBNUMBER;
    private String WINNING_TEAM;
    private String LOSING_TEAM;
    private int WINNING_SCORE;
    private int LOSING_SCORE;
    
    public superBowls() {
        this.SBNUMBER = 0;
        this.WINNING_TEAM = "";
        this.LOSING_TEAM = "";
        this.WINNING_SCORE = 0;
        this.LOSING_SCORE = 0;
    }
    
    

    public superBowls(int SBNUMBER, String WINNING_TEAM, String LOSING_TEAM, int WINNING_SCORE, int LOSING_SCORE) {
        this.SBNUMBER = SBNUMBER;
        this.WINNING_TEAM = WINNING_TEAM;
        this.LOSING_TEAM = LOSING_TEAM;
        this.WINNING_SCORE = WINNING_SCORE;
        this.LOSING_SCORE = LOSING_SCORE;
    }

    public int getSBNUMBER() {
        return SBNUMBER;
    }

    public void setSBNUMBER(int SBNUMBER) {
        this.SBNUMBER = SBNUMBER;
    }

    public String getWINNING_TEAM() {
        return WINNING_TEAM;
    }

    public void setWINNING_TEAM(String WINNING_TEAM) {
        this.WINNING_TEAM = WINNING_TEAM;
    }

    public String getLOSING_TEAM() {
        return LOSING_TEAM;
    }

    public void setLOSING_TEAM(String LOSING_TEAM) {
        this.LOSING_TEAM = LOSING_TEAM;
    }

    public int getWINNING_SCORE() {
        return WINNING_SCORE;
    }

    public void setWINNING_SCORE(int WINNING_SCORE) {
        this.WINNING_SCORE = WINNING_SCORE;
    }

    public int getLOSING_SCORE() {
        return LOSING_SCORE;
    }

    public void setLOSING_SCORE(int LOSING_SCORE) {
        this.LOSING_SCORE = LOSING_SCORE;
    }

    @Override
    public String toString() {
        return "superBowls{" + "SBNUMBER=" + SBNUMBER + ", WINNING_TEAM=" + WINNING_TEAM + ", LOSING_TEAM=" + LOSING_TEAM + ", WINNING_SCORE=" + WINNING_SCORE + ", LOSING_SCORE=" + LOSING_SCORE + '}';
    }
    
    
    
    
    
    
}
