package view;

import model.area.CylinderSurfaceCalculation;
import model.area.CylinderVolumeCalculation;
import model.area.TrapezoidAreaCalculation;
import model.area.TrapezoidScopeCalculation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrapezoidFrame extends JFrame {

    private String streckeA;
    private String streckeB;
    private String streckeC;
    private String streckeD;
    private String height;

    public TrapezoidFrame(){

        this.setSize(400, 400);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Trapez");
        this.setLayout(new GridLayout(8, 2));
        this.setVisible(true);
        this.setResizable(false);

        JLabel surface = new JLabel("Flächeninhalt und Umfang", SwingConstants.CENTER);
        JLabel emptyLabel1 = new JLabel();

        JLabel streckeALbl = new JLabel("Strecke A (a):", SwingConstants.CENTER);
        JTextField streckeATxt = new JTextField();

        JLabel streckeBLbl = new JLabel("Strecke B (b):", SwingConstants.CENTER);
        JTextField streckeBTxt = new JTextField();

        JLabel streckeCLbl = new JLabel("Strecke C (c):", SwingConstants.CENTER);
        JTextField streckeCTxt = new JTextField();

        JLabel streckeDLbl = new JLabel("Strecke D (d):", SwingConstants.CENTER);
        JTextField streckeDTxt = new JTextField();

        JLabel heightLbl = new JLabel("Höhe (h):", SwingConstants.CENTER);
        JTextField heightTxt = new JTextField();

        JLabel areaSolution = new JLabel("Ergebnis: a + c * h / 2", SwingConstants.CENTER);
        JLabel scopeSolution = new JLabel("Ergebnis: a + b + c + d", SwingConstants.CENTER);

        JButton areaCalculation = new JButton("Flächeninhalt berechnen");
        areaCalculation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                streckeA = streckeATxt.getText();
                streckeC = streckeCTxt.getText();
                height = heightTxt.getText();
                areaSolution.setText("A  = " + new TrapezoidAreaCalculation().trapezoidArea(streckeA, streckeC, height));
            }
        });

        JButton scopeCalculation = new JButton("Umfang berechnen");
        scopeCalculation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                streckeA = streckeATxt.getText();
                streckeB = streckeBTxt.getText();
                streckeC = streckeCTxt.getText();
                streckeD = streckeDTxt.getText();
                scopeSolution.setText("O = " + new TrapezoidScopeCalculation().trapezoidScope(streckeA, streckeB, streckeC, streckeD));
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
        this.add(streckeDLbl);
        this.add(streckeDTxt);
        this.add(heightLbl);
        this.add(heightTxt);
        this.add(areaCalculation);
        this.add(scopeCalculation);
        this.add(areaSolution);
        this.add(scopeSolution);
    }
}
