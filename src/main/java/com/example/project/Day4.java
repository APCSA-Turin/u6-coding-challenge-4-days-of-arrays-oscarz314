package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private String name;
        private int speed;
        private int runDuration;
        private int restDuration;
        private int distanceTraveled;
        private int time = 1; 

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
        }

        public int getDistanceTraveled(){ // this method is required
            return distanceTraveled;
        }
        public String getName(){
            return name;
        }
        

        public void simulateSecond(){ //this method is required but not tested
            if (time <= runDuration){
                distanceTraveled += speed;
            }
            else if(time >= runDuration + restDuration){ // implement to wait
                time = 1;
            }

            time++;
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        int winner = 0;
        int winnerDistance = 0;

        for(int i = 0; i < time; i++){ //for how many seconds
            for(int j = 0; j < reindeers.length; j++){ // simulate seconds for each reindeer and get winner
                reindeers[j].simulateSecond();
                if (reindeers[j].getDistanceTraveled() > winnerDistance){
                    winnerDistance = reindeers[j].getDistanceTraveled();
                    winner = j;
                }
            }
        }

        return reindeers[winner].getName();
    }

    
    public static void main(String[] args) { // for testing purposed
        Day4.Reindeer[] reindeers = {
            new Day4.Reindeer("Dasher", 100, 5, 2),
            new Day4.Reindeer("Dancer", 120, 4, 3),
            new Day4.Reindeer("Prancer", 110, 6, 1)
        };
            String winner = Day4.simulateRace(10, reindeers);
            System.out.println(reindeers[0].getDistanceTraveled());
            System.out.println(reindeers[1].getDistanceTraveled());
            System.out.println(reindeers[2].getDistanceTraveled());
    }

 
}



