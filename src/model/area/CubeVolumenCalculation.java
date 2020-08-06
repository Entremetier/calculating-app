package model.area;

public class CubeVolumenCalculation {

    public String cubeVolumen(String a){
        double distanceA = Double.parseDouble(a);
        double solution = (distanceA * distanceA) * distanceA;
        solution = Math.round(solution * 1000) / 1000.0;

        return Double.toString(solution);
    }
}
