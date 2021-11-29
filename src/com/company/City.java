package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class City implements Comparable<City>{
    private int code;
    private String name;

    public City(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City:" +
                "\ncode:" + code +
                "\nname:" + name;
    }

    @Override
    public int compareTo(City o) {
        return o.getCode()!= this.code? 1:0;
    }
}
