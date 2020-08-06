package model.prozentRechnung;

public class ProzentwertBerechnung {

    public String prozentwerBerechnung(String grundwert, String prozentsatz){

        double g = Double.parseDouble(grundwert);
        double p = Double.parseDouble(prozentsatz);

        double w = g * p / 100;
        return Double.toString(w);
    }
}
