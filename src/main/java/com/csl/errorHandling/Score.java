package com.csl.errorHandling;

public class Score {
    private int value;

    public Score(String s) throws ScoreFormatException{

        try {
            value = Integer.valueOf(s);

            if (value<0 || value>100)
                throw  new ScoreFormatException();

        } catch (NumberFormatException e) {
           throw  new ScoreFormatException();
        }

    }
}
