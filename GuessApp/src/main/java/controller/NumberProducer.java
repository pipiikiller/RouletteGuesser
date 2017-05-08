package controller;

import model.AbstractNumber;

/**
 * Created by Bartek on 2017-05-08.
 */
public class NumberProducer {

    private AbstractNumber number;
    private Validator validator;

    public void produceNumber(int number){
        int validatedNumber = validator.validate(number);

    }

}
