package ersoftware.com.droidcaddy;

/**
 * Created by Eric on 8/1/2016.
 */
public class Score {
    private String datePlayed;
    private String coursePlayed;
    private Tee teePlayed;
    private short grossScore;
    private short adjustedScore;
    private short courseHandicap;
    private float differential;
    private short[] scores;

    public Score(String course, Tee tee, short courseHandicap) {
        coursePlayed = course;
        teePlayed = tee;
        this.courseHandicap = courseHandicap;
        grossScore = 0;
        adjustedScore = 0;
        differential = 0.0f;
        scores = new short[18];
    }

    // Getters and Setters
    public String getDatePlayed() {
        return datePlayed;
    }

    public void setDatePlayed(int month, int day, int year) {
        String.format(datePlayed, "%02d/%02d/%04d", month, day, year);
    }

    public String getCoursePlayed() {
        return coursePlayed;
    }

    public Tee getTeePlayed() {
        return teePlayed;
    }

    public short getGrossScore() {
        return grossScore;
    }

    public short getAdjustedScore() {
        return adjustedScore;
    }

    public float getDifferential() {
        return differential;
    }
}
