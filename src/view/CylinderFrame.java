package view;

import model.area.CylinderSurfaceCalculation;
import model.area.CylinderVolumeCalculation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CylinderFrame extends JFrame {

    private String radius;
    private String height;

    public CylinderFrame(){

        this.setSize(400, 400);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Zylinder");
        this.setLayout(new GridLayout(5, 2));
        this.setVisible(true);
        this.setResizable(false);

        JLabel surface = new JLabel("Oberfläche und Volumen", SwingConstants.CENTER);
        JLabel emptyLabel1 = new JLabel();
        JLabel radiusLbl = new JLabel("Radius (r):", SwingConstants.CENTER);
        JTextField radiusTxt = new JTextField();
        JLabel heightLbl = new JLabel("Höhe (h):", SwingConstants.CENTER);
        JTextField heightTxt = new JTextField();
        JLabel solutionSurface = new JLabel("Ergebnis: 2 * pi * d + 2 * pi * r * h", SwingConstants.CENTER);
        JLabel solutionVolume = new JLabel("Ergebnis: pi * d * h", SwingConstants.CENTER);

        JButton surfaceCalculation = new JButton("Oberfläche berechnen");
        surfaceCalculation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                radius = radiusTxt.getText();
                height = heightTxt.getText();
                solutionSurface.setText("O = " + new CylinderSurfaceCalculation().cylinderSurface(radius, height));
            }
        });

        JButton volumeCalculation = new JButton("Volumen berechnen");
        volumeCalculation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                radius = radiusTxt.getText();
                height = heightTxt.getText();
                solutionVolume.setText("V = " + new CylinderVolumeCalculation().cylinderVolume(radius,height));
            }
        });

        this.add(surface);
        this.add(emptyLabel1);
        this.add(radiusLbl);
        this.add(radiusTxt);
        this.add(heightLbl);
        this.add(heightTxt);
        this.add(surfaceCalculation);
        this.add(volumeCalculation);
        this.add(solutionSurface);
        this.add(solutionVolume);
    }
}
