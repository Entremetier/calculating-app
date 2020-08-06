package model.area;

public class TrapezoidAreaCalculation {

    public String trapezoidArea(String a, String c, String h){
        double distanceA = Double.parseDouble(a);
        double distanceC = Double.parseDouble(c);
        double height = Double.parseDouble(h);
        double solution = (distanceA + distanceC) * height / 2;

        solution = Math.round(solution * 1000) /1000.0;
        return Double.toString(solution);
    }
}
