package model.calcualtor;

public class Subtraction {

    public String subtractionNumbers(String a, String b) {
        String ergebnis = "";
//        System.out.println("In der Subtraktionsmethode ist A: " + a + " B: " + b);

        if (a.contains(".") || b.contains(".")) {
            double numberA = Double.parseDouble(a);
            double numberB = Double.parseDouble(b);

//            System.out.println(numberA + numberB);
            double solution = numberA - numberB;
            ergebnis = Double.toString(solution);
            return ergebnis;
        } else {
            int numberA = Integer.parseInt(a);
            int numberB = Integer.parseInt(b);

//            System.out.println(numberA + numberB);
            int solution = numberA - numberB;
            ergebnis = Integer.toString(solution);
            return ergebnis;
        }
    }
}
