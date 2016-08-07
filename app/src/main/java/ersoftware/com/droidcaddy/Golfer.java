package ersoftware.com.droidcaddy;

import java.util.Iterator;
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

    // Public Methods
    public void addScore(Score newScore) {
        history.addFirst(newScore);
        updateHandicapIndex();
    }

    // Private Methods
    private void updateHandicapIndex() {
        int numDifferentialsUsed = 0;

        switch(history.size()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                numDifferentialsUsed = 1;
                break;
            case 7:
            case 8:
                numDifferentialsUsed = 2;
                break;
            case 9:
            case 10:
                numDifferentialsUsed = 3;
                break;
            case 11:
            case 12:
                numDifferentialsUsed = 4;
                break;
            case 13:
            case 14:
                numDifferentialsUsed = 5;
                break;
            case 15:
            case 16:
                numDifferentialsUsed = 6;
                break;
            case 17:
                numDifferentialsUsed = 7;
                break;
            case 18:
                numDifferentialsUsed = 8;
                break;
            case 19:
                numDifferentialsUsed = 9;
                break;
            case 20:
                numDifferentialsUsed = 10;
                break;
            default:
                if(history.size() > 20) {
                    numDifferentialsUsed = 10;
                }
                else {
                    numDifferentialsUsed = 0;
                }
                break;
        }

        float sumDifferentials = 0.0f;
        Iterator<Score> iter = history.iterator();
        int count = 0;

        while(count < numDifferentialsUsed) {
            Score currentScore = iter.next();
            sumDifferentials += currentScore.getDifferential();
            count++;
        }
        handicapIndex = 0.96f * (sumDifferentials / (float)numDifferentialsUsed);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public float getHandicapIndex() {
        return handicapIndex;
    }
}

