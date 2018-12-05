package com.bpc;

public class GespersonnelTraitements {

    public void lancerAfficherEmployes(GespersonnelInterface G2) {
        GespersonnelJdbc gp10 = new GespersonnelJdbc();
        G2.cl.show(G2.panelCard0, "3");
        gp10.afficherEmployes(G2);
    }
}
