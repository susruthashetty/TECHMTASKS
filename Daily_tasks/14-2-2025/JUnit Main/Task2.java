package com.example;

public class Task2 {
	public void validateNumber(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
    }

}
