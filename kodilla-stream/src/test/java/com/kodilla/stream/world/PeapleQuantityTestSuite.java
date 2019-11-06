package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class PeapleQuantityTestSuite {
    public static List<Country> listOfCountrys(){
        List<Country> countries = new ArrayList<>();
        while (countries.size()<5){
            countries.add(new Country(1500000));
        }
        return countries;
    }
    public static List<Continent> listOfContinents() {
        List<Continent> continents = new ArrayList<>();
        while (continents.size()<5) {
            continents.add(new Continent());
        }
        for (Continent continent : continents) {
            continent.addCountries(listOfCountrys());
        }
        return continents;
    }


        @Test
        public void testGetPeapleQuantity() {
        World world = new World();
        world.addContinents(listOfContinents());
        BigDecimal peapleQuantity = world.getContinents().stream()
                .flatMap(land->land.getCountries().stream())
                .map(land -> land.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, value)-> sum = sum.add(value));
        int peapleTotalQuantity = 37500000;
        BigDecimal totalBigDecimal = new BigDecimal(peapleTotalQuantity);
        Assert.assertEquals(totalBigDecimal, peapleQuantity);
    }
}
