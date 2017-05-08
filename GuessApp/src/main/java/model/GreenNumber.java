package model;


public class GreenNumber extends AbstractNumber {

    private final static String NUM_COLOR= "Green";

    public GreenNumber(Short columnNumber, Short rowNumber){
        setColour(NUM_COLOR);
        setColumnNumber(columnNumber);
        setRowNumber(rowNumber);
    }
}
