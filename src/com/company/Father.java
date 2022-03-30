package com.company;

public class Father extends Granddad {
    private int age;
    private int growth;
    private String name;
    private Profession profession;

    public Father(int age, int growth, String name, Profession profession) {
        super(age, growth, name, profession);


    }

    public void aaaa() {
        System.out.println("Father");
    }

    public void bbb(String bbb1) {
        bbb1 = "ARCHITECT";
        System.out.println("profession " + bbb1);
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public int getGrowth() {
        return growth;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getInfo() {
        return super.getInfo();
    }
}
