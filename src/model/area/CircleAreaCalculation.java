package model.area;

public class CircleAreaCalculation {

    public String circleArea(String r){
        double radius = Double.parseDouble(r);
        double solution = Math.PI * (radius * radius);
        solution = Math.round(solution * 1000) / 1000.0;

        return Double.toString(solution);
    }
}
