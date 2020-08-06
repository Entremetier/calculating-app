package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartFrame extends JFrame {

    public StartFrame() {

        JLabel welcome = new JLabel("Art der Berechnung auswählen!", SwingConstants.CENTER);

        JButton calculator = new JButton("Taschenrechner");
        calculator.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CalculatorFrame();
            }
        });

        JButton percent = new JButton("Prozentrechnen");
        percent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PercentFrame();
            }
        });
        JButton area = new JButton("Fläche, Umfang und Volumen");
        area.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AreaFrame();
            }
        });

        this.add(welcome);
        this.add(calculator);
        this.add(percent);
        this.add(area);

        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Willkommen");
        this.setLayout(new GridLayout(4, 1));
        this.setVisible(true);
        this.setResizable(false);
    }
}
