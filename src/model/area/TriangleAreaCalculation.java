package model.area;

public class TriangleAreaCalculation {

    public String triangleArea(String grundlinie, String heightTriangle) {
        double grundlinieDouble = Double.parseDouble(grundlinie);
        double heightDouble = Double.parseDouble(heightTriangle);

        double solution = grundlinieDouble * heightDouble / 2;

        return Double.toString(solution);
    }
}
