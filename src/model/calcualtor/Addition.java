package model.calcualtor;

public class Addition {

    public String additionNumbers(String a, String b) {
//        System.out.println("In der Additionsmethode ist A: " + a + " B: " + b);

        if (a.contains(".") || b.contains(".")) {
            double numberA = Double.parseDouble(a);
            double numberB = Double.parseDouble(b);

//            System.out.println(numberA + numberB);
            double solution = numberA + numberB;
            return Double.toString(solution);
        } else {
            int numberA = Integer.parseInt(a);
            int numberB = Integer.parseInt(b);

//            System.out.println(numberA + numberB);
            int solution = numberA + numberB;
            return Integer.toString(solution);
        }
    }
}
