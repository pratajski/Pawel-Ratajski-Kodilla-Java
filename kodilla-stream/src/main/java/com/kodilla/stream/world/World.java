package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;


public class World {
    private List<Continent> continentList;

    public World(List<Continent> continentList) {
        this.continentList = continentList;
    }


    public BigDecimal getPeopleQuantity() {
        return continentList.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

    @Override
    public int hashCode() {

        return Objects.hash(continentList);
    }
}
