package com.bpc;

import javax.swing.*;
import java.awt.*;


public class GespersonnelInterface extends JFrame {

    
    GespersonnelEvennements ev = new GespersonnelEvennements();
    private JMenuBar menuBar;
    JMenu menuAfficher, menuQuitter;
    JLabel labelNom, labelPrenom, labelAdresse, labelTelDom, labelTelPort, labelTelPro, labelCodePostal, labelVille, labelEmail;
    JPanel panelCard0, panelCard1, panelShowMemeAnnee, panelShowAll, panel, panelNord, panelSud, panelCentre;
    JMenuItem employeAjouter, employeSupp, employeModif, employeAffich, tous, quitter;
    JTextField nom, prenom, adresse, telPort, telDom, telPro, codePostal, ville, email;
    
    CardLayout cl = new CardLayout();


    public void lancer() {

        setTitle("HR Java");

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        menuAfficher = new JMenu("Show");
        menuQuitter = new JMenu("Quit");
        
        menuBar.add(menuAfficher);
        menuBar.add(menuQuitter);

        employeAffich = new JMenu("Employee");
        tous = new JMenuItem("All");
        quitter = new JMenuItem("Quit");

        menuQuitter.add(quitter);
        menuAfficher.add(employeAffich);
        employeAffich.add(tous);
        panelShowAll = new JPanel();
        panelShowMemeAnnee = new JPanel();

        panel = new JPanel();
        panelNord = new JPanel();
        panelCentre = new JPanel();
        panelSud = new JPanel();
        panelCard0 = new JPanel();
        panelCard1 = new JPanel();

        nom = new JTextField(10);
        prenom = new JTextField(10);
        adresse = new JTextField(10);
        telPort = new JTextField(10); 
        telDom = new JTextField(10); 
        telPro = new JTextField(10); 
        codePostal = new JTextField(10); 
        ville = new JTextField(10); 
        email = new JTextField(10);

        labelNom = new JLabel("Name    ");
        labelPrenom = new JLabel("First Name");
        labelAdresse = new JLabel("Address");
        labelTelDom = new JLabel ("Tel Home");
        labelTelPort = new JLabel ("Tel Mob");
        labelTelPro = new JLabel ("Tel Pro"); 
        labelCodePostal = new JLabel ("Postal Code"); 
        labelVille = new JLabel ("City  ");
        labelEmail = new JLabel ("Email  ");

        getContentPane().add(panelCard0);

        BorderLayout layoutbase = new BorderLayout(5, 5);
        panelCard0.setLayout(cl);
        panel.setLayout(layoutbase);
        panelShowAll.setLayout(layoutbase);
        panelShowMemeAnnee.setLayout(layoutbase);

        panelCard1.setBackground(Color.gray);

        panelCard0.add("1", panelCard1);
        panelCard0.add("2", panel);
        panelCard0.add("3", panelShowAll);
        panelCard0.add("4", panelShowMemeAnnee);

        panel.add(panelNord, BorderLayout.NORTH);
        panel.add(panelSud, BorderLayout.SOUTH);
        panel.add(panelCentre, BorderLayout.CENTER);

        panelNord.setLayout(new FlowLayout(FlowLayout.LEFT));

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        panelCentre.setLayout(gbl);


        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets.top = 5;
        gbc.insets.bottom = 5;
        gbc.insets.right = 10;
        gbc.insets.left = 10;
        gbc.weightx = 0;
        gbc.weighty = 0;
        
        panelCentre.add(labelNom);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbl.setConstraints(labelNom, gbc);

        panelCentre.add(nom);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbl.setConstraints(nom, gbc);

        panelCentre.add(labelPrenom);
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbl.setConstraints(labelPrenom, gbc);

        panelCentre.add(prenom);
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbl.setConstraints(prenom, gbc);

        panelCentre.add(labelAdresse);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbl.setConstraints(labelAdresse, gbc);

        panelCentre.add(adresse);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbl.setConstraints(adresse, gbc);
        
          panelCentre.add(labelTelDom);
        gbc.gridx = 4;
        gbc.gridy = 0;
        gbl.setConstraints(labelTelDom, gbc);

        panelCentre.add(telDom);
        gbc.gridx = 5;
        gbc.gridy = 0;
        gbl.setConstraints(telDom, gbc);
        
        panelCentre.add(labelTelPort);
        gbc.gridx = 4;
        gbc.gridy = 1;
        gbl.setConstraints(labelTelPort, gbc);

        panelCentre.add(telPort);
        gbc.gridx = 5;
        gbc.gridy = 1;
        gbl.setConstraints(telPort, gbc);
        
        panelCentre.add(labelTelPro);
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbl.setConstraints(labelTelPro, gbc);

        panelCentre.add(telPro);
        gbc.gridx = 5;
        gbc.gridy = 2;
        gbl.setConstraints(telPro, gbc);
        
        panelCentre.add(labelVille);
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbl.setConstraints(labelVille, gbc);

        panelCentre.add(ville);
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbl.setConstraints(ville, gbc);
        
        panelCentre.add(labelCodePostal);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbl.setConstraints(labelCodePostal, gbc);

        panelCentre.add(codePostal);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbl.setConstraints(codePostal, gbc);
        
        panelCentre.add(labelEmail);
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbl.setConstraints(labelEmail, gbc);

        panelCentre.add(email);
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbl.setConstraints(email, gbc);
        
        panelSud.setLayout(new FlowLayout());
        ev.enregistrerListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        Toolkit theKit = getToolkit();      
        Dimension wndSize = theKit.getScreenSize();  
        setBounds(wndSize.width / 4, wndSize.height / 4, wndSize.width / 2, wndSize.height / 2);
        pack();	
    }

    
}
