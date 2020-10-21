/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.m226a.police;

/**
 *
 * @author kappe
 */
public class Person {

    final int MÄNNLICH = 0;
    final int WEIBLICH = 1;
    final double ABBAU_WARTEZEIT = 0;
    final double ABBAU_PRO_STD = 0.1;
    final double ANTEIL_WASSER_IN_BLUT = 0.8;
    final double DICHTE_BLUT = 1.055;

    private double körperMasse;
    private double körperGrösse;
    private int geschlecht;
    private double promille = 0;
    private int age = 0;

    private AlkoholischesGetränk getränk;

    public Person(double körperMasse, double körperGrösse, int alter, int geschlecht) {
        this.körperMasse = körperMasse;
        this.körperGrösse = körperGrösse;
        this.geschlecht = geschlecht;
        this.age = 2020 - alter;

    }

    public void trinke(AlkoholischesGetränk getränk) {
        this.getränk = getränk;
    }

    private double getGKW() {
        double gkw = 0;

        switch (geschlecht) {
            case 0:
                gkw = 2.447 - 0.09516 * age + 0.1074 * körperGrösse + 0.3362 + körperMasse;
                break;

            case 1:
                gkw = 0.203 - 0.07 * age + 0.1069 * körperGrösse + 0.2466 + körperMasse;
                break;

        }
        return gkw;
    }

    public double getPromille() {

        double alkMasse = getränk.getAkloholmasse();

        promille = (0.8 * alkMasse) / (1.055 * getGKW());
        return promille;
    }
}
