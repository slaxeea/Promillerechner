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
public class AlkoholischesGetränk {

    private int volumen;
    private double alkoholgehalt;
    private double getrunkenVor;

    final double BIER_ALKOHOLGEHALT = 0.05;
    final double WEIN_ALKOHOLGEHALT = 0.15;
    final double SCHNAPS_ALKOHOLGEHALT = 0.4;
    private double DICHTE_ALKOHOL = 0.8;

    public AlkoholischesGetränk(int volumen, double alkoholgehalt, double getrunkenVor) {
        this.volumen = volumen;
        this.alkoholgehalt = alkoholgehalt;
        this.getrunkenVor = getrunkenVor;
    }

    public double getAkloholmasse() {
        return volumen * alkoholgehalt * DICHTE_ALKOHOL;
    }

    public double getStundenSeitEinnahme() {
        return getrunkenVor;
    }
}
