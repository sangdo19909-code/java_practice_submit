package com.greedy.level02.normal;

public class RandomMaker {
    RandomMaker randomMaker = new RandomMaker();
    public int randomNumber(int min, int max) {
        int result = (int)(Math.random() * (max - min)) + min;
        return result;
    }
}
