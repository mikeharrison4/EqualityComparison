package com.company;

public class Duck implements Comparable<Duck> {

    private String name;
    private String type;
    private int weightInGrams;
    private int ageInMonths;

    public Duck(String name, String type, int weightInGrams, int ageInMonths) {
        this.name = name;
        this.type = type;
        this.weightInGrams = weightInGrams;
        this.ageInMonths = ageInMonths;
    }

    @Override
    public boolean equals( Object o ) {
        if(this == o) return true;
        if(o == null || o.getClass() != this.getClass()) return false;
        Duck duck = (Duck) o;
        return this.name.equals(duck.name) && this.type.equals(duck.type) && this.weightInGrams == duck.weightInGrams && this.ageInMonths == duck.ageInMonths;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + type.hashCode() + weightInGrams + ageInMonths;
    }

    @Override
    public int compareTo(Duck o) {
        return this.name.compareTo(o.name);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public int getAgeInMonths() {
        return ageInMonths;
    }
}
