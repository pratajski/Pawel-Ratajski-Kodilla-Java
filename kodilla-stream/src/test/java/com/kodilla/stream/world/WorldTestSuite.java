package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        Country poland = new Country(new BigDecimal("55"), "Poland");
        Country germany = new Country(new BigDecimal("100"), "Germany");

        ArrayList<Country> countries = new ArrayList<>();
        countries.add(poland);
        countries.add(germany);

        Continent europe = new Continent(countries);

        ArrayList<Continent> continents = new ArrayList<>();
        continents.add(europe);
        World world = new World(continents);

        Assert.assertEquals(new BigDecimal("155"), world.getPeopleQuantity());
    }



}
