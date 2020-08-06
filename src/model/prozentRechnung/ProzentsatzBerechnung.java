package model.prozentRechnung;

public class ProzentsatzBerechnung {

    public String prozentsatzBerechnung(String grundwert, String prozentwert){

        double g = Double.parseDouble(grundwert);
        double w = Double.parseDouble(prozentwert);

        double p = w / g * 100;
        return Double.toString(p);
    }
}
