package view;

import model.area.CubeVolumenCalculation;
import model.area.CuboidSurfaceCalculation;
import model.area.CuboidVolumeCalculation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CuboidFrame extends JFrame {

    private String streckeA;
    private String streckeB;
    private String streckeC;

    public CuboidFrame() {

        this.setSize(400, 400);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Quader");
        this.setLayout(new GridLayout(6, 2));
        this.setVisible(true);
        this.setResizable(false);

        JLabel surface = new JLabel("Oberfläche und Umfang", SwingConstants.CENTER);
        JLabel emptyLabel1 = new JLabel();

        JLabel streckeALbl = new JLabel("Strecke A (a):", SwingConstants.CENTER);
        JTextField streckeATxt = new JTextField();

        JLabel streckeBLbl = new JLabel("Strecke B (b):", SwingConstants.CENTER);
        JTextField streckeBTxt = new JTextField();

        JLabel streckeCLbl = new JLabel("Strecke C (c):", SwingConstants.CENTER);
        JTextField streckeCTxt = new JTextField();

        JLabel surfaceSolution = new JLabel("Ergebnis: 2 * a * b + 2 * b * c + 2 * a * c", SwingConstants.CENTER);
        JLabel volumeSolution = new JLabel("Ergebnis: a * b * c", SwingConstants.CENTER);

        JButton surfaceCalculation = new JButton("Oberfläche berechnen");
        surfaceCalculation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                streckeA = streckeATxt.getText();
                streckeB = streckeBTxt.getText();
                streckeC = streckeCTxt.getText();
                surfaceSolution.setText("O = " + new CuboidSurfaceCalculation().cuboidSurface(streckeA, streckeB, streckeC));
            }
        });

        JButton volumenCalculation = new JButton("Volumen berechnen");
        volumenCalculation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                streckeA = streckeATxt.getText();
                streckeB = streckeBTxt.getText();
                streckeC = streckeCTxt.getText();
                volumeSolution.setText("V = " + new CuboidVolumeCalculation().cuboidVolume(streckeA, streckeB, streckeC));
            }
        });

        this.add(surface);
        this.add(emptyLabel1);
        this.add(streckeALbl);
        this.add(streckeATxt);
        this.add(streckeBLbl);
        this.add(streckeBTxt);
        this.add(streckeCLbl);
        this.add(streckeCTxt);
        this.add(surfaceCalculation);
        this.add(volumenCalculation);
        this.add(surfaceSolution);
        this.add(volumeSolution);
    }
}
