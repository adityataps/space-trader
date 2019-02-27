package cs2340.spacetraders.Model;

import java.util.ArrayList;
import java.util.Collections;

public class Coordinates {

    private ArrayList<Integer> xVals = new ArrayList<>(150);
    

    
    private ArrayList<Integer> yVals = new ArrayList<>(150);
    
    public Coordinates() {
    
        for (int i = 0; i < 150; i++) {
            xVals.add(i);
        }
    
        for (int i = 0; i < 100; i++) {
            yVals.add(i);
        }
    
        Collections.shuffle(xVals);
        Collections.shuffle(yVals);
        
    }
    
    public ArrayList<Integer> getxVals() {
        return xVals;
    }
    
    public ArrayList<Integer> getyVals() {
        return yVals;
    }

}