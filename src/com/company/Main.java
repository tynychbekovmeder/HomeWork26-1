package com.company;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<City> cities=new TreeSet<>();

        cities.add(new City(1, "Tokyo"));
        cities.add(new City(2, "Denver"));
        cities.add(new City(3, "Mali"));
        cities.add(new City(4, "Nicca"));
        cities.add(new City(5, "Helsinki"));
        cities.add(new City(6, "Paris"));
        cities.add(new City(7, "Berlin"));
        cities.add(new City(8, "Moscow"));
        cities.add(new City(9, "New York"));

        for (City s:cities) {
           if (s.getCode()%2==1){
               Set<City> newCities=new TreeSet<>();
               newCities.add(s);
               System.out.println(newCities);
           }
        }
    }
}
