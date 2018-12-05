package com.bpc;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class GespersonnelJdbc {

    String nom, prenom, adresse, email, telDom, telPort, telPro, codePostal, ville;
    GespersonnelTraitements tr = new GespersonnelTraitements();
    GespersonnelInterface G1;

    Connection con;
    Statement stmnt;
    ResultSet rs;
    PreparedStatement pstmnt;
    private String urlBase;
    private String user;
    private String mdp;

    public GespersonnelJdbc() {

        try {
            urlBase = "jdbc:derby://localhost:1527/JavaProjet";
            user = "test";
            mdp = "test";
            con = DriverManager.getConnection(urlBase, user, mdp);
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
    }

    public void afficherEmployes(GespersonnelInterface G2) {
        String requete = "SELECT * from EMPLOYES";
        JTextArea status = new JTextArea(1, 10);
        JLabel titreShowAll = new JLabel("Java Human Resources");

        try {
            stmnt = con.createStatement();
            ResultsModel rmodel = new ResultsModel();
            rmodel.setResultSet(stmnt.executeQuery(requete));
            JTable table = new JTable(rmodel);
            G2.panelShowAll.add(titreShowAll, BorderLayout.NORTH);
            JScrollPane sPane = new JScrollPane(table);
            G2.panelShowAll.add(sPane, BorderLayout.CENTER);
            status.setLineWrap(true);
            status.setWrapStyleWord(true);
            G2.panelShowAll.add(status, BorderLayout.SOUTH);
            status.setText("Nb of employees :  " + rmodel.getRowCount());
        } catch (SQLException sqle) {
            System.err.println("Message : " + sqle.getMessage());
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(G1.panelCentre, "Fatal Error!", "Please check", JOptionPane.ERROR_MESSAGE);
        }

    }

}
