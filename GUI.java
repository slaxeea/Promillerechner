/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.m226a.police;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author simon
 */
public class GUI {

    /**
     * Uses the ask functions below to create a Person and a
     * AlkoholischesGetränk
     */
    public void promilleRechner() {
        Person person = askPersonData();
        AlkoholischesGetränk getränk = askAlkoholischeGetränke();

        person.trinke(getränk);
        person.getPromille();

        Spruch spruch = new Spruch(person.getPromille());

        JFrame frame = new JFrame();
        String info = spruch.getSpruch();
        System.out.println(info + "\n" + person.getPromille());

        /*
        JOptionPane.showInternalMessageDialog(frame, "Ergebnisse",
                info, JOptionPane.INFORMATION_MESSAGE);
         */
    }

    /**
     * Reads user input needed for the calculation Takes no parameters
     *
     * @return returns all the generated input
     */
    private Person askPersonData() {

        JFrame frame = new JFrame();

        String name = JOptionPane.showInputDialog(frame, "What's ur name?");
        int date = Integer.parseInt(JOptionPane.showInputDialog(frame, "When were you born?"));

        int gender = Integer.parseInt(JOptionPane.showInputDialog(frame, "What gender are you? Enter 0 for male and 1 for Female"));

        double weight = Double.parseDouble(JOptionPane.showInputDialog(frame, "How much do u weigh? in kg plss"));

        double height = Double.parseDouble(JOptionPane.showInputDialog(frame, "How tall are you? in cm pls"));

        Person newPerson = new Person(weight, height, date, gender);
        return newPerson;
    }

    /**
     * Method which asks for all the needed details concerning the drink
     *
     * @return returns a AlkoholischesGetränk
     */
    private AlkoholischesGetränk askAlkoholischeGetränke() {

        JFrame frame = new JFrame();

        String getränke[] = {
            "Bier", "Wein", "Schnaps"
        };
        String getr = (String) JOptionPane.showInputDialog(frame,
                "What did you drink?",
                "Select the drink you had",
                JOptionPane.QUESTION_MESSAGE,
                null,
                getränke,
                getränke[0]);

        int time = Integer.parseInt(JOptionPane.showInputDialog(frame, "When did u drink? In hours pls"));
        int volume = Integer.parseInt(JOptionPane.showInputDialog(frame, "How much did u drink? in ml's pls"));
        double gehalt = 0;

        switch (getr) {
            case "Bier":
                gehalt = 0.05;
                break;
            case "Wein":
                gehalt = 0.1;
                break;
            case "Schnaps":
                gehalt = 0.4;
                break;
        }
        AlkoholischesGetränk a = new AlkoholischesGetränk(volume, gehalt, time);

        return a;
    }
}
