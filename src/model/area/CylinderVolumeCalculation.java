package model.area;

public class CylinderVolumeCalculation {

    public String cylinderVolume(String r, String h){
        double radius = Double.parseDouble(r);
        double height = Double.parseDouble(h);

        double diameter = radius * 2;
        double solution = Math.PI * diameter * height;

        solution = Math.round(solution * 1000) / 1000.0;

        return Double.toString(solution);
    }
}
