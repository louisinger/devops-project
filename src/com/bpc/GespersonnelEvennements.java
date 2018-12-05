package com.bpc;

import java.awt.event.*;

public class GespersonnelEvennements implements ActionListener {

    GespersonnelTraitements tr = new GespersonnelTraitements();
    private GespersonnelInterface G1;

    public void enregistrerListener(GespersonnelInterface G2) {
        G1 = G2;
        G2.tous.addActionListener(this);
        G2.quitter.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (G1 != null) {
            if (e.getSource() == G1.tous) {
                tr.lancerAfficherEmployes(G1);
            } else if (e.getSource() == G1.quitter) {
                System.exit(0);
            }
        }
    }
}
