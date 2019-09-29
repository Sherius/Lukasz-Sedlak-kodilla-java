package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.Processor;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        //Executor codeToExecute = () -> System.out.println("this is an example");
        processor.execute(() -> System.out.println("this is and example test"));

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Abc", "Abc", ((a, b) -> a + "Make it beauty" + b));
        poemBeautifier.beautify("<<<<", ">>>>", (a, b) -> a + "Make it beauty" + b);
        poemBeautifier.beautify("[[[[", "]]]]", (a, b) -> a + "Make it beauty" + b);
        poemBeautifier.beautify("", "", (a, b) -> "Make it beauty".toUpperCase());

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);




    }
}