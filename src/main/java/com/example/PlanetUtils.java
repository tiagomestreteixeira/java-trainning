package com.example;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class PlanetUtils {

    public List<Planet> getPlanetsBeginningWithM(List<Planet> planets) {
        return planets.stream()
                .filter(p -> p.getName().startsWith("M"))
                .collect(toList());
    }

    public List<Planet> getPlanetsWithRings(List<Planet> planets) {
        return planets.stream().filter(Planet::getHasRings).collect(toList());
    }

    public List<Planet> getPlanetsWithMoreThanThreeMoons(List<Planet> planets) {
        return planets.stream().filter(p -> p.getNumberOfMoons() > 3).collect(toList());
    }

    public List<Planet> getPlanetsWithDensityGreaterThanFive(List<Planet> planets) {
        return planets.stream().filter(p -> p.getDensity() > 5).collect(toList());
    }
}
