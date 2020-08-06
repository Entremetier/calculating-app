package model.area;

public class CubeSurfaceCalculation {

    public String cubeSurface(String a){
        double distanceA = Double.parseDouble(a);
        double solution = 6 * distanceA * distanceA;
        solution = Math.round(solution * 1000) / 1000.0;

        return Double.toString(solution);
    }
}
