package com.kkw.jokelibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class jokes {

     List<String> jokes = Arrays.asList(
            "I dreamed I was forced to eat a giant marshmallow. When I woke up, my pillow was gone.",
            "I got another letter from this lawyer today. It said “Final Notice”. Good that he will not bother me anymore. ",
            " Of course I should clean my windows. But privacy is important too.",
            "8 p.m. I get an SMS from my girlfriend: Me or football?!" + "\n" + "11 p.m. I SMS my girlfriend: You of course.",
            "I am nobody. Nobody is perfect. I am perfect.",
            "Pessimist: \"Things just can't get any worse!\"\n" + "Optimist: \"Nah, of course they can!\"",
            "I'm not lazy. I'm just naturally a very relaxed person.",
            "I'm standing outside. In other words, I'm outstanding.",
            "Scientists have now discovered how women keep their secrets. They do so within groups of 40.",
            "Light travels faster than sound. That is why some people appear quite bright until you hear them talk.",
            "A child’s observation: If a mother laughs at dad’s jokes, we have guests.",
            "That awkward moment when your entire Math class is discussing whether the result is 15 or 16 and your answer is 1053.",
            "All my life I thought air was for free. That was until I bought a bag of crisps.",
            "Of course you're not fat. Just grab a couple of chairs and come sit with us.",
            "Where do pencils spend their vacations?" + "\n" + "In Pencilvania."
                    );


    public  String getJoke(){

        Random random = new Random();
        String randomJoke = jokes.get(random.nextInt(jokes.size()));
        return randomJoke;
    }

}
