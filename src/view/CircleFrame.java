package view;

import model.area.CircleAreaCalculation;
import model.area.CircleScopeCalculation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CircleFrame extends JFrame {

    private String radius;

    public CircleFrame(){

        this.setSize(400, 400);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Dreieck");
        this.setLayout(new GridLayout(7, 2));
        this.setVisible(true);
        this.setResizable(false);

        JLabel headerLbl = new JLabel("Flächeninhalt und Umfang");
        JLabel emptyLbl1 = new JLabel();

        JLabel radiusLbl = new JLabel("Radius (r):", SwingConstants.CENTER);
        JTextField radiusTxt = new JTextField();

        JLabel areaSolution = new JLabel("Ergebnis: pi * r2", SwingConstants.CENTER);
        JLabel scopeSolution = new JLabel("Ergebnis: 2 * pi * r", SwingConstants.CENTER);

        JButton areaCalculation = new JButton("Flächeninhalt berechnen");
        areaCalculation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                radius = radiusTxt.getText();
                areaSolution.setText("A = " + new CircleAreaCalculation().circleArea(radius));
            }
        });

        JButton scopeCalculation = new JButton("Umfang berechnen");
        scopeCalculation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                radius = radiusTxt.getText();
                scopeSolution.setText("U = " + new CircleScopeCalculation().circleScope(radius));
            }
        });

        this.add(headerLbl);
        this.add(emptyLbl1);
        this.add(radiusLbl);
        this.add(radiusTxt);
        this.add(areaCalculation);
        this.add(scopeCalculation);
        this.add(areaSolution);
        this.add(scopeSolution);
    }
}
