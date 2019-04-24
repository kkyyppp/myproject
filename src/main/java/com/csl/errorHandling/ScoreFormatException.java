package com.csl.errorHandling;

public class ScoreFormatException extends Exception {
    @Override
    public String getMessage() {
        return "成績格式錯誤";
    }
}
