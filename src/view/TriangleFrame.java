package view;

import model.area.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TriangleFrame extends JFrame{

    private String grundlinie;
    private String heightTriangle;
    private String streckeA;
    private String streckeB;
    private String streckeC;


    public TriangleFrame(){

        this.setSize(400, 400);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Dreieck");
        this.setLayout(new GridLayout(8, 2));
        this.setVisible(true);
        this.setResizable(false);

        JLabel headerLbl = new JLabel("Flächeninhalt und Umfang");
        JLabel emptyLbl1 = new JLabel();

        JLabel grundlinieLbl = new JLabel("Grundlinie (g):", SwingConstants.CENTER);
        JTextField grundlinieTxt = new JTextField();

        JLabel heightLbl = new JLabel("Höhe (h):", SwingConstants.CENTER);
        JTextField heightTxt = new JTextField();

        JLabel streckeALbl = new JLabel("Strecke A (a):", SwingConstants.CENTER);
        JTextField streckeATxt = new JTextField();

        JLabel streckeBLbl = new JLabel("Strecke B (b):", SwingConstants.CENTER);
        JTextField streckeBTxt = new JTextField();

        JLabel streckeCLbl = new JLabel("Strecke C (c):", SwingConstants.CENTER);
        JTextField streckeCTxt = new JTextField();

        JLabel areaSolution = new JLabel("Ergebnis: g * h / 2", SwingConstants.CENTER);
        JLabel scopeSolution = new JLabel("Ergebnis: a + b + c", SwingConstants.CENTER);

        JButton areaCalculation = new JButton("Flächeninhalt berechnen");
        areaCalculation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                grundlinie = grundlinieTxt.getText();
                heightTriangle = heightTxt.getText();

                areaSolution.setText("A = " + new TriangleAreaCalculation().triangleArea(grundlinie, heightTriangle));
            }
        });

        JButton scopeCalculation = new JButton("Umfang berechnen");
        scopeCalculation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                streckeA = streckeATxt.getText();
                streckeB = streckeBTxt.getText();
                streckeC = streckeCTxt.getText();

                scopeSolution.setText("U = " + new TriangleScopeCalculation().triangleScope(streckeA, streckeB, streckeC));
            }
        });

        this.add(headerLbl);
        this.add(emptyLbl1);
        this.add(grundlinieLbl);
        this.add(grundlinieTxt);
        this.add(heightLbl);
        this.add(heightTxt);
        this.add(streckeALbl);
        this.add(streckeATxt);
        this.add(streckeBLbl);
        this.add(streckeBTxt);
        this.add(streckeCLbl);
        this.add(streckeCTxt);
        this.add(areaCalculation);
        this.add(scopeCalculation);
        this.add(areaSolution);
        this.add(scopeSolution);
    }
}
