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
public class Spruch {

    private double promille = 0;
    private String spruch = "";

    public Spruch(double promille) {
        this.promille = promille;
    }

    public String getSpruch() {
        if (promille <= 0.2) {
            spruch = "ja moin du hesch ja gar nüt gha lol";
        } else if (promille <= 0.8) {
            spruch = "nice";
        } else if (promille <= 1) {
            spruch = "jeez";
        } else if (promille <= 2) {
            spruch = "letsgoo";
        } else if (promille <= 2.5) {
            spruch = "uff freu dich uf morn lmao";
        } else if (promille <= 3) {
            spruch = "ich glaub du stirbs jz denn ";
        } else {
            spruch = "bruh ha ka was du gah hesch";
        }
        return spruch;
    }

}
