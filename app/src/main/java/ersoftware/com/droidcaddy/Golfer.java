package ersoftware.com.droidcaddy;

import java.util.LinkedList;

/**
 * Created by Eric on 8/1/2016.
 */
public class Golfer {
    private String name;
    private float handicapIndex;
    private LinkedList<Score> history;

    // Constructor
    public Golfer(String name) {
        this.name = name;
        handicapIndex = -100.0f;
        history = new LinkedList<Score>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public float getHandicapIndex() {
        return handicapIndex;
    }
}
