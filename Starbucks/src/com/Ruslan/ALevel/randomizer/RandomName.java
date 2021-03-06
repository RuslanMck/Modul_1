package com.Ruslan.ALevel.randomizer;

import java.util.Random;

public class RandomName {

    private String[] names = new String[]{"Ron",
            "Bert", "Alex", "Alastair", "Andrew ", "Angus", "Bartholomew", "Berthold", "Elvis", "Gabe", "Harold", "Hector", "Jack", "Karl", "Malcolm", "Abigail",
            "Alana", "Barbara", "Carmen", "Gladys", "Julia", "Marina"};
    private Random random = new Random();
    private int rnd;

    /**
     * This method returns you a random name from names array.
     * @return random name.
     */
    public String setRandomName(){
        rnd = random.nextInt(names.length );
        return names[rnd];
    }
}
