package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreaFrame extends JFrame {

    public AreaFrame(){

        this.setSize(400, 400);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Flächen, Umfang und Volumen");
        this.setLayout(new GridLayout(8, 1));
        this.setVisible(true);
        this.setResizable(false);

        JLabel optionsLbl = new JLabel("Wähle die Form des zu berechnenden Objektes", SwingConstants.CENTER);

        JButton cylinder = new JButton("Zylinder");
        cylinder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CylinderFrame();
            }
        });

        JButton trapezoid = new JButton("Trapez");
        trapezoid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TrapezoidFrame();
            }
        });

        JButton rectangle = new JButton("Rechteck");
        rectangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RectangleFrame();
            }
        });

        JButton triangle = new JButton("Dreieck");
        triangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TriangleFrame();
            }
        });

        JButton circle = new JButton("Kreis");
        circle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CircleFrame();
            }
        });

        JButton cube = new JButton("Würfel");
        cube.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CubeFrame();
            }
        });

        JButton cuboid = new JButton("Quader");
        cuboid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CuboidFrame();
            }
        });

        this.add(optionsLbl);
        this.add(cylinder);
        this.add(trapezoid);
        this.add(rectangle);
        this.add(triangle);
        this.add(circle);
        this.add(cube);
        this.add(cuboid);

    }
}
