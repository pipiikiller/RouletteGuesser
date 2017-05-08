package controller;

import exception.GusserException;

public class NumberValidator implements Validator{

    public int validate(int number) {

        if(isGreaterThanThirtySix(number) || isLessThanZero(number)){
            throw new GusserException(String.valueOf(number));
        }else{
            return number;
        }

    }

    public boolean isGreaterThanThirtySix(int number){
        if(number > 26){
            return true;
        }
        return false;
    }

    public boolean isLessThanZero(int number){
        if(number <0){
            return true;
        }
        return false;
    }

}
