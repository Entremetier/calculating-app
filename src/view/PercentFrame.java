package view;

import model.prozentRechnung.GrundwertBerechnung;
import model.prozentRechnung.ProzentsatzBerechnung;
import model.prozentRechnung.ProzentwertBerechnung;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PercentFrame extends JFrame {

    private String prozentwert;
    private String grundwert;
    private String prozentsatz;

    public PercentFrame() {

        JLabel solution = new JLabel("Ergebnis", SwingConstants.CENTER);

        JLabel prozentwertLbl = new JLabel("Prozentwert (W):", SwingConstants.CENTER);
        JTextField prozentwertTxt = new JTextField();

        JLabel grundwertLbl = new JLabel("Grundwert (G):", SwingConstants.CENTER);
        JTextField grundwertTxt = new JTextField();

        JLabel percentageLbl = new JLabel("Prozentsatz (p):", SwingConstants.CENTER);
        JTextField percentageTxt = new JTextField();

        this.add(prozentwertLbl);
        this.add(prozentwertTxt);
        this.add(grundwertLbl);
        this.add(grundwertTxt);
        this.add(percentageLbl);
        this.add(percentageTxt);

        JButton calculate = new JButton("Berechnen");
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (prozentwertTxt.getText().isEmpty() && percentageTxt.getText().isEmpty() && grundwertTxt.getText().isEmpty()) {
                    solution.setText("Bitte Werte eingeben");
                } else if (prozentwertTxt.getText().isEmpty() && percentageTxt.getText().isEmpty()) {
                    solution.setText("Bitte Werte eingeben");
                } else if (prozentwertTxt.getText().isEmpty() && grundwertTxt.getText().isEmpty()) {
                    solution.setText("Bitte Werte eingeben");
                } else if (percentageTxt.getText().isEmpty() && grundwertTxt.getText().isEmpty()) {
                    solution.setText("Bitte Werte eingeben");
                } else if (prozentwertTxt.getText().isEmpty()) {
                    grundwert = grundwertTxt.getText();
                    prozentsatz = percentageTxt.getText();
                    solution.setText("W = " + new ProzentwertBerechnung().prozentwerBerechnung(grundwert, prozentsatz));
                    grundwertTxt.setText("");
                    percentageTxt.setText("");
                } else if (grundwertTxt.getText().isEmpty()) {
                    prozentwert = prozentwertTxt.getText();
                    prozentsatz = percentageTxt.getText();
                    solution.setText("G = " + new GrundwertBerechnung().grundwertBerechnung(prozentwert, prozentsatz));
                    prozentwertTxt.setText("");
                    percentageTxt.setText("");
                } else if (percentageTxt.getText().isEmpty()){
                    grundwert = grundwertTxt.getText();
                    prozentwert = prozentwertTxt.getText();
                    solution.setText("p = " + new ProzentsatzBerechnung().prozentsatzBerechnung(grundwert,prozentwert) + "%");
                    grundwertTxt.setText("");
                    prozentwertTxt.setText("");
                }
            }
        });

        this.add(calculate);
        this.add(solution);

        this.setSize(400, 400);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Prozentrechnen");
        this.setLayout(new GridLayout(4, 2));
        this.setVisible(true);
        this.setResizable(false);
    }
}
