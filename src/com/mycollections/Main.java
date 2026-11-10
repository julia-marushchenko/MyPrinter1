/**
 *  Java program to create and print the objects many times.
 */

package com.mycollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // String variable.
        String string = "X";

        // Printing string 4 times.
        printManyTimes(string, 4);

        // List variable.
        List<String> words = new ArrayList<>();
        words.add("polymorphism");
        words.add("inheritance");
        words.add("encapsulation");
        words.add("abstraction");

        // Printing objects of words.
        printManyTimes(words, 5);

    }

    // Method to print object-type parameter number of times.
    public static void printManyTimes(Object object, int times) {
        int index = 0;
        while (index < times) {
            System.out.println(object.toString());
            index = index + 1;
        }
    }
}