package com.csl.numberGame;

import java.util.HashSet;
import java.util.Set;

public abstract class NumberGame {
    Set<Integer> numbers = new HashSet<>();
    int numberCount = 0;

    public abstract void generate();

    public boolean volidate() {
        if (numbers.size() == numberCount)
            return true;
        else
            return false;
    }
}
