package model.area;

public class TriangleScopeCalculation {

    public String triangleScope(String a, String b, String c) {
        double distanceA = Double.parseDouble(a);
        double distanceB = Double.parseDouble(b);
        double distanceC = Double.parseDouble(c);

        double solution = distanceA + distanceB + distanceC;

        return Double.toString(solution);
    }
}
