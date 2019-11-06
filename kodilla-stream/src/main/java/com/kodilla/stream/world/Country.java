package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    BigDecimal peaple;
    public Country(int peaple) {
        this.peaple = new BigDecimal(peaple);
    }
    public BigDecimal getPeopleQuantity() {
        return peaple;
    }
}
