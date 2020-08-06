package model.area;

public class RectangleScopeCalculation {

    public String rectangleScope(String a, String b) {
        double distanceA = Double.parseDouble(a);
        double distanceB = Double.parseDouble(b);

        double solution = (2 * distanceA) + (2 * distanceB);

        return Double.toString(solution);
    }
}
