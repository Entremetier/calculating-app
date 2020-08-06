package model.area;

public class CylinderSurfaceCalculation {

    public String cylinderSurface(String r, String h){
        double radius = Double.parseDouble(r);
        double height = Double.parseDouble(h);
        double diameter = radius * 2;

        double solution  = (2 * Math.PI * diameter) + (2 * Math.PI * radius * height);
        solution = Math.round(solution * 1000) / 1000.0;

        return Double.toString(solution);

    }
}
