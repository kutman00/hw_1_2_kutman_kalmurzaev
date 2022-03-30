package com.company;

public class Ason extends Father {
    private int age;
    private String name;
    private int growth;

    public Ason(int age, int growth, String name, Profession profession, int age1, String name1, int growth1) {
        super(age, growth, name, profession);
        this.age = age1;
        this.name = name1;
        this.growth = growth1;
    }

    public String getInfo() {
        return
                "\nName: " + name +
                        "\nGrowth: " + growth +
                        "\nAge: " + age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getGrowth() {
        return growth;
    }

}
