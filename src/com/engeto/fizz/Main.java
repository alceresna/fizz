package com.engeto.fizz;

public class Main {
    public static void main(String[] args) {

        String str="";
        for (int i = 1; i <= 100; i++) {
            if (i%3 == 0&&i%5 == 0) str = "FizzBuzz";
            else if (i%3 == 0) str = "Fizz";
            else if (i%5 == 0) str = "Buzz";
            else str = Integer.toString(i);
            System.out.println(str);
        }

    }
}