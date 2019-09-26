package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {




    public List<Integer> exterminate(ArrayList<Integer> numbers){
        List<Integer> evenNumbers = new ArrayList<>();

            for (Integer number : numbers){
                if ((number % 2) == 0){
                    evenNumbers.add(number);
                }
            }
            return evenNumbers;



    }
}


