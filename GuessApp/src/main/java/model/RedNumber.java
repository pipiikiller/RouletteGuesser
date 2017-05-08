package model;

/**
 * Created by Bartek on 2017-05-08.
 */
public class RedNumber extends AbstractNumber {

    private final static String NUM_COLOR= "Red";

    public RedNumber(Short columnNumber, Short rowNumber){
        setColour(NUM_COLOR);
        setColumnNumber(columnNumber);
        setRowNumber(rowNumber);

    }
}
