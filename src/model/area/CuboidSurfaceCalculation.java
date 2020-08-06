package model.area;

public class CuboidSurfaceCalculation {

    public String cuboidSurface(String a, String b, String c){
        double distanceA = Double.parseDouble(a);
        double distanceB = Double.parseDouble(b);
        double distanceC = Double.parseDouble(c);
        double solution = (2 * distanceA * distanceB) + (2 * distanceB * distanceC) + (2 * distanceA * distanceC);
        solution = Math.round(solution * 1000) / 1000.0;

        return Double.toString(solution);
    }
}
