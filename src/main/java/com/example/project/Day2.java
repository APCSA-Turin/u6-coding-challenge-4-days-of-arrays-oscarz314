
package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        String[][] niceNaughty = new String[2][names.length];
        Random rand = new Random();

        for(int i = 0; i < names.length; i++){
            int choice = rand.nextInt(2);
            niceNaughty[choice][i] = names[i];
        }
        

        return niceNaughty; //you must return a two dimensional string array
    }

    public static void main(String[] args) {

    }
}