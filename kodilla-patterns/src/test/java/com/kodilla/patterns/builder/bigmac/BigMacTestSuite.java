package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigMacNew() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("With Sezam")
                .burgers(2)
                .sauce("Barbecue")
                .ingredient("Onion")
                .ingredient("Becon")
                .ingredient("Chili")
                .ingredient("Chees")
                .build();
        System.out.println(bigMac);
        //When
        int ingredientCount = bigMac.getIngredients().size();
        //Then
        Assert.assertEquals(4,ingredientCount);

    }
}
