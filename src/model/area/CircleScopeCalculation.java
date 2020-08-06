package model.area;

public class CircleScopeCalculation {

    public String circleScope(String r){
        double radius = Double.parseDouble(r);
        double solution = 2 * Math.PI * radius;

        solution = Math.round(solution * 1000) / 1000.0;

        return Double.toString(solution);
    }
}
