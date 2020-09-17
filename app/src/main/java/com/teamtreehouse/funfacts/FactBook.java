package com.teamtreehouse.funfacts;

// Importing random so I get a random number
import java.util.Random;

// Creating a class FactBook to give us random Facts when button is pushed

class FactBook {

    //Fields or Member Variables - Properties about the object
    // Creating a String array called facts that holds a few random facts
    private String[] facts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built."
    };
    //Methods - Actions the object can take
    // creating an array to hold facts
    String getFact(){
        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];

    }
}
