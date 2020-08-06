package view;

import model.area.CubeSurfaceCalculation;
import model.area.CubeVolumenCalculation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CubeFrame extends JFrame {

    private String streckeA;

    public CubeFrame(){

        this.setSize(400, 400);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Würfel");
        this.setLayout(new GridLayout(4, 2));
        this.setVisible(true);
        this.setResizable(false);

        JLabel headerLbl = new JLabel("Oberfläche und Volumen");
        JLabel emptyLbl1 = new JLabel();

        JLabel streckeALbl = new JLabel("Strecke A (a):", SwingConstants.CENTER);
        JTextField streckeATxt = new JTextField();

        JLabel surfaceSolution = new JLabel("Ergebnis: 6 * a * a", SwingConstants.CENTER);
        JLabel volumeSolution = new JLabel("Ergebnis: a * a * a", SwingConstants.CENTER);

        JButton surfaceCalculation = new JButton("Oberfläche berechnen");
        surfaceCalculation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            streckeA = streckeATxt.getText();
            surfaceSolution.setText("O = " + new CubeSurfaceCalculation().cubeSurface(streckeA));
            }
        });

        JButton volumenCalculation = new JButton("Volumen berechnen");
        volumenCalculation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                streckeA = streckeATxt.getText();
                volumeSolution.setText("V = " + new CubeVolumenCalculation().cubeVolumen(streckeA));
            }
        });

        this.add(headerLbl);
        this.add(emptyLbl1);
        this.add(streckeALbl);
        this.add(streckeATxt);
        this.add(surfaceCalculation);
        this.add(volumenCalculation);
        this.add(surfaceSolution);
        this.add(volumeSolution);
    }
}
