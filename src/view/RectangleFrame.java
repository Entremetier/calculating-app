package view;

import model.area.RectangleAreaCalculation;
import model.area.RectangleScopeCalculation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RectangleFrame extends JFrame {

    private String distanceA;
    private String distanceB;

    public RectangleFrame(){

        this.setSize(400, 400);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Rechteck");
        this.setLayout(new GridLayout(5, 2));
        this.setVisible(true);
        this.setResizable(false);

        JLabel headerLbl = new JLabel("Flächeninhalt und Umfang");
        JLabel emptyLbl1 = new JLabel();

        JLabel streckeALbl = new JLabel("Strecke A (a):", SwingConstants.CENTER);
        JTextField streckeATxt = new JTextField();

        JLabel streckeBLbl = new JLabel("Strecke B (b):", SwingConstants.CENTER);
        JTextField streckeBTxt = new JTextField();

        JLabel areaSolution = new JLabel("Ergebnis: a * b", SwingConstants.CENTER);
        JLabel scopeSolution = new JLabel("Ergebnis: 2 * a + 2 * b", SwingConstants.CENTER);

        JButton areaCalculation = new JButton("Flächeninhalt berechnen");
        areaCalculation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                distanceA = streckeATxt.getText();
                distanceB = streckeBTxt.getText();

                areaSolution.setText("A = " + new RectangleAreaCalculation().rectangleArea(distanceA, distanceB));
            }
        });

        JButton scopeCalculation = new JButton("Umfang berechnen");
        scopeCalculation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                distanceA = streckeATxt.getText();
                distanceB = streckeBTxt.getText();

                scopeSolution.setText("U = " + new RectangleScopeCalculation().rectangleScope(distanceA, distanceB));
            }
        });

        this.add(headerLbl);
        this.add(emptyLbl1);
        this.add(streckeALbl);
        this.add(streckeATxt);
        this.add(streckeBLbl);
        this.add(streckeBTxt);
        this.add(areaCalculation);
        this.add(scopeCalculation);
        this.add(areaSolution);
        this.add(scopeSolution);
    }
}
