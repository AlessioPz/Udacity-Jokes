package com.bussolalabs.jokes.jlib;

import java.util.Random;

public class MyJoke {

    public static String makeJoke() {
        return jokes[new Random().nextInt(jokes.length)];
    }

    private static String[] jokes =
            {
                    "Can a kangaroo jump higher than a house? Of course, a house doesn’t jump at all.",
                    "Anton, do you think I’m a bad mother?\nMy name is Paul.",
                    "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.",
                    "Why is it a bad idea for two butt cheeks to get married? Because they part for every little shit.",
                    "I'd like to buy a new boomerang please. Also, can you tell me how to throw the old one away?",
                    "How can you tell you have a really bad case of acne?\nIt’s when the blind try to read your face.",
                    "It is so cold outside I saw a politician with his hands in his own pockets.",
                    "I wanted to grow my own food but I couldn’t get bacon seeds anywhere.",
                    "I can’t believe I forgot to go to the gym today. That’s 7 years in a row now."
            };
}
