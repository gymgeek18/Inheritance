package com.company;

// This program performs.... single-level, multi-level inheritance,

public class Main {       // Main.java is where we call the programs from

    public static void main(String[] args) {
	Samsung s = new Samsung(); // A new object called s has been created
    Nokia n = new Nokia();     // A new object called s has been created
    Iphone i = new Iphone();   // A new object called s has been created

    n.setColor("Green");
    n.setCost(2000);
    n.setRAM("6GB");
    n.setAndroid_version("Android Marshmello");

    i.setColor("Purple");
    i.setCost(3500);
    i.setRAM("4GB");
    i.setAndroid_version("Android kitkat");

    s.setColor("Blue");
    s.setCost(40000);
    s.setRAM("6GB");
    s.setAndroid_version("Android Pie");

    System.out.println("Samsung mobile details: ");
    System.out.println("Cost: "+s.getCost());
    System.out.println("Color: "+s.getColor());
    System.out.println("RAM: "+s.getRAM());
    System.out.println("Android version: "+s.getAndroid_version());

    System.out.println("Nokia mobile details: ");
    System.out.println("Cost: "+n.getCost());
    System.out.println("Color: "+n.getColor());
    System.out.println("RAM: "+n.getRAM());
    System.out.println("Android version: "+n.getAndroid_version());

    System.out.println("Iphone mobile details: ");
    System.out.println("Cost: "+i.getCost());
    System.out.println("Color: "+i.getColor());
    System.out.println("RAM: "+i.getRAM());
    System.out.println("Android version: "+i.getAndroid_version());



    }
}
