package org;

public class AnimalKingdom {


    private String species;
    private String speak;

    private Diet diet;
    private int numberOfLegs, numberOfEyes, numberOfFingers, numberOfTeeth;

    public AnimalKingdom(Diet diet, String species, String speak, int numberOfLegs, int numberOfEyes, int numberOfFingers, int numberOfTeeth) {
        this.diet = diet;
        this.species = species;
        this.speak = speak;
        this.numberOfLegs = numberOfLegs;
        this.numberOfEyes = numberOfEyes;
        this.numberOfFingers = numberOfFingers;
        this.numberOfTeeth = numberOfTeeth;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    public int getNumberOfFingers() {
        return numberOfFingers;
    }

    public void setNumberOfFingers(int numberOfFingers) {
        this.numberOfFingers = numberOfFingers;
    }

    public int getNumberOfTeeth() {
        return numberOfTeeth;
    }

    public void setNumberOfTeeth(int numberOfTeeth) {
        this.numberOfTeeth = numberOfTeeth;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    @Override
    public String toString() {
        return "AnimalKingdom{" +
                "species='" + species + '\'' +
                ", speak='" + speak + '\'' +
                ", diet=" + diet +
                ", numberOfLegs=" + numberOfLegs +
                ", numberOfEyes=" + numberOfEyes +
                ", numberOfFingers=" + numberOfFingers +
                ", numberOfTeeth=" + numberOfTeeth +
                '}';
    }
}