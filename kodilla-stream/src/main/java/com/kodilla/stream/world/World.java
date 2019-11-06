package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    static List<Continent> continents = new ArrayList<>();
    public void addContinents(List<Continent> newContinents){
        for(Continent continent: newContinents){
            continents.add(continent);
        }
    }
    public static BigDecimal getPeapleQuantity() {
        BigDecimal peapleCount = continents.stream()
                .flatMap(lands -> lands.getCountries().stream())
                .map(lands -> lands.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum , result)->sum=sum.add(result));
        return peapleCount;
    }
    public List<Continent> getContinents() {
        return continents;
    }
}
