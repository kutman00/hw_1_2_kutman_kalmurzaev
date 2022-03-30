package com.company;

public class Granddad {
    private int age;
    private int growth;
    private String name;
    private Profession profession;

    public Granddad(int age, int growth, String name, Profession profession) {
        this.age = age;
        this.growth = growth;
        this.name = name;
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public int getGrowth() {
        return growth;
    }

    public String getName() {
        return name;
    }

    public Profession getProfession() {
        return profession;
    }

    public String getInfo() {
        return
                "\nName: " + name +
                        "\nProfession: " + profession +
                        "\nGrowth: " + growth +
                        "\nAge: " + age;
    }
}
