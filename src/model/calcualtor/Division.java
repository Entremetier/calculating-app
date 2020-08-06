package model.calcualtor;

public class Division {

    public String divisionNumbers(String a, String b) {
        double numberA = Double.parseDouble(a);
        double numberB = Double.parseDouble(b);

        double solution = numberA / numberB;
        solution = Math.round(solution * 1000) / 1000.0;

        return Double.toString(solution);
    }
}
