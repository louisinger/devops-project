package com.bpc;

import javax.swing.*;

public class Gespersonnel {

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException err) {
            System.out.println(err.getMessage());
        }

        GespersonnelInterface prog = new GespersonnelInterface();
        prog.lancer();
    }

}
