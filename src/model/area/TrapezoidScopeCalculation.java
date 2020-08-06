package model.area;

public class TrapezoidScopeCalculation {

    public String trapezoidScope(String a, String b, String c, String d){
        double distanceA = Double.parseDouble(a);
        double distanceB = Double.parseDouble(b);
        double distanceC = Double.parseDouble(c);
        double distanceD = Double.parseDouble(d);

        double solution = distanceA + distanceB + distanceC + distanceD;

        solution = Math.round(solution * 1000) / 1000.0;
        return Double.toString(solution);

    }
}
