package model.area;

public class CuboidVolumeCalculation {

    public String cuboidVolume(String a, String b, String c){
        double distanceA = Double.parseDouble(a);
        double distanceB = Double.parseDouble(b);
        double distanceC = Double.parseDouble(c);

        double solution = distanceA * distanceB * distanceC;
        solution = Math.round(solution * 1000) / 1000.0;

        return Double.toString(solution);
    }
}
