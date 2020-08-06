package model.prozentRechnung;

public class GrundwertBerechnung {

    public String grundwertBerechnung(String prozentwert, String prozentsatz){

        double w = Double.parseDouble(prozentwert);
        double p = Double.parseDouble(prozentsatz);

        double g = w / p * 100;
        g = Math.round(g*100)/100.0;
        return Double.toString(g);
    }
}
