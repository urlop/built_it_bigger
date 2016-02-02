package com.example;

import java.util.Random;

public class MyJokeJava {

    String[] myJokes;

    public MyJokeJava() {
        myJokes = new String[3];
        myJokes[0] = "Most people believe that if it ain't broke, don't fix it.\n" +
                "Engineers believe that if it ain't broke, it doesn't have enough features yet.";
        myJokes[1] = "What's the difference between a blonde and Windows 95?\n" +
                "The blonde operates on more laptops!";
        myJokes[2] = "Are you the droid I'm looking for?";
    }

    public String tellJokeJava(){
        Random rand = new Random();
        return myJokes[rand.nextInt(3)];
    }
}
