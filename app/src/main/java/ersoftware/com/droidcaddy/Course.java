package ersoftware.com.droidcaddy;

/**
 * Created by Eric on 8/1/2016.
 */
public class Course {
    private String name;
    private short[][] pars;
    private short[][] handicaps;
    private short[] slope;
    private short[] rating;

    // Constructor
    public Course(String name) {
        this.name = name;
        pars = new short[Tee.NUM_TEES][18];
        handicaps = new short[Tee.NUM_TEES][18];
        slope = new short[Tee.NUM_TEES];
        rating = new short[Tee.NUM_TEES];
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public short getSlope(int tee) {
        return slope[tee];
    }

    public short getRating(int tee) {
        return rating[tee];
    }
}
