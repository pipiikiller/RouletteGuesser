package model;


public abstract class AbstractNumber {

    private String colour;
    private Short rowNumber;
    private Short columnNumber;

    private static final int [] firstRowNumbers={1,4,7,10,13,16,19,22,25,28,31,24};
    private static final int [] secondRowNumbers={2,5,8,11,14,17,20,23,26,29,32,35};
    private static final int [] thridRowNumbers={3,6,9,12,15,18,21,24,27,30,33,36};
    private static final int [] firstColumnNumbers={1,2,3,4,5,6,7,8,9,10,11,12};
    private static final int [] secondColumnNumbers={13,14,15,16,17,18,19,20,21,22,23,24};
    private static final int [] thirdColumnNumbers={25,26,27,28,29,30,31,32,33,34,35,36};

    public boolean isInFirstRow(int firstRow){
        for(int checkNumber:firstRowNumbers){
            if(checkNumber == firstRow){
                return true;
            }
        }
        return false;
    }

    public boolean isInSecondRow(int secondRow){
        for(int checkNumber:secondRowNumbers){
            if(checkNumber == secondRow){
                return true;
            }
        }
        return false;
    }

    public boolean isInThirdRow(int thirdRow){
        for(int checkNumber:thridRowNumbers){
            if(checkNumber == thirdRow){
                return true;
            }
        }
        return false;
    }

    public boolean isInFirstColumn(int firstColumn){
        for(int checkNumber:firstColumnNumbers){
            if(checkNumber == firstColumn){
                return true;
            }
        }
        return false;
    }

    public boolean isInSecondColumn(int secondColumn){
        for(int checkNumber:secondColumnNumbers){
            if(checkNumber == secondColumn){
                return true;
            }
        }
        return false;
    }

    public boolean isInThirdColumn(int thirdColumn){
        for(int checkNumber:thirdColumnNumbers){
            if(checkNumber == thirdColumn){
                return true;
            }
        }
        return false;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Short getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(Short rowNumber) {
        this.rowNumber = rowNumber;
    }

    public Short getColumnNumber() {
        return columnNumber;
    }

    public void setColumnNumber(Short columnNumber) {
        this.columnNumber = columnNumber;
    }
}
