package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    List<Country> countries = new ArrayList<>();

    public List<Country> getCountries() {
        return countries;
    }

    public void addCountries(List<Country> newCountrie) {
        for (Country country : newCountrie) {
            countries.add(country);
        }
    }
}
