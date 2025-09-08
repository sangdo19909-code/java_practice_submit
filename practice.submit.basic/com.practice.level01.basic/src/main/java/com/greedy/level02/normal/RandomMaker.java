package com.greedy.level02.normal;

import java.util.Random;

public class RandomMaker {
    RandomMaker randomMaker = new RandomMaker();
    public int randomNumber(int min, int max) {
        Random random = new Random();
        int result = (int)random.nextInt(max - min + 1) + min
        return result;
    }
}-