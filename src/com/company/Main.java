package com.company;

public class Main {

    public static void main(String[] args) {
      Father father = new Father(25,170,"Калыс",Profession.ARCHITECT);
     Granddad granddad = new Granddad(50,180,"Асан",Profession.TEACHER);
     Granddad granddad1 = new Granddad(60,190,"Акыл",Profession.PROGRAMMER);
        System.out.println(father.getInfo());
        System.out.println(granddad.getInfo());
        System.out.println(granddad1.getInfo());
    }
}
