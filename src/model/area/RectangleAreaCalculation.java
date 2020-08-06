package model.area;

public class RectangleAreaCalculation {

    public String rectangleArea(String a, String b){
        double distanceA = Double.parseDouble(a);
        double distanceB = Double.parseDouble(b);

        double solution = distanceA * distanceB;

        return Double.toString(solution);
    }
}
