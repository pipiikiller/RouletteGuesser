package model;


public class BlackNumber extends AbstractNumber {

    private final static String NUM_COLOR= "Black";

    public BlackNumber(Short columnNumber, Short rowNumber){
        setColour(NUM_COLOR);
        setColumnNumber(columnNumber);
        setRowNumber(rowNumber);

    }


}
