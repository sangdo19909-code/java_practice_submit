package com.ohgiraffers.level01.basic;

import java.lang.Exception;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
