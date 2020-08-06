package view;

import model.calcualtor.Addition;
import model.calcualtor.Division;
import model.calcualtor.Multiply;
import model.calcualtor.Subtraction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame extends JFrame {

    private String a = "";
    private String b = "";
    private String buttonName = "";

    public CalculatorFrame() {

        JPanel solutionPanel = new JPanel();
        solutionPanel.setLayout(new GridLayout(1, 1));
        JLabel solution = new JLabel("0", SwingConstants.CENTER);

        solutionPanel.add(solution);
        this.add(solutionPanel);

        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new GridLayout(2, 1));

        JButton clearAllButton = new JButton("Speicher löschen");
        clearAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solution.setText("0");
                a = "0";
                b = "0";
            }
        });

        JButton clearButton = new JButton("Aktuelle Zahl löschen");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solution.setText("0");
                System.out.println("A: " + a + " B: " + b);
            }
        });

        middlePanel.add(clearAllButton);
        middlePanel.add(clearButton);
        this.add(middlePanel);

        JPanel calculatingPanel = new JPanel();
        calculatingPanel.setLayout(new GridLayout(4, 4));

        JButton one = new JButton("1");
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (solution.getText().equals("0")) {
                    solution.setText("1");
                } else {
                    solution.setText(solution.getText() + "1");
                }
            }
        });

        JButton two = new JButton("2");
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (solution.getText().equals("0")) {
                    solution.setText("2");
                } else {
                    solution.setText(solution.getText() + "2");
                }
            }
        });

        JButton three = new JButton("3");
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (solution.getText().equals("0")) {
                    solution.setText("3");
                } else {
                    solution.setText(solution.getText() + "3");
                }
            }
        });

        JButton four = new JButton("4");
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (solution.getText().equals("0")) {
                    solution.setText("4");
                } else {
                    solution.setText(solution.getText() + "4");
                }
            }
        });

        JButton five = new JButton("5");
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (solution.getText().equals("0")) {
                    solution.setText("5");
                } else {
                    solution.setText(solution.getText() + "5");
                }
            }
        });

        JButton six = new JButton("6");
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (solution.getText().equals("0")) {
                    solution.setText("6");
                } else {
                    solution.setText(solution.getText() + "6");
                }
            }
        });

        JButton seven = new JButton("7");
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (solution.getText().equals("0")) {
                    solution.setText("7");
                } else {
                    solution.setText(solution.getText() + "7");
                }
            }
        });

        JButton eight = new JButton("8");
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (solution.getText().equals("0")) {
                    solution.setText("8");
                } else {
                    solution.setText(solution.getText() + "8");
                }
            }
        });
        JButton nine = new JButton("9");
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (solution.getText().equals("0")) {
                    solution.setText("9");
                } else {
                    solution.setText(solution.getText() + "9");
                }
            }
        });

        JButton zero = new JButton("0");
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (solution.getText().equals("0")) {
                    solution.setText("0");
                } else {
                    solution.setText(solution.getText() + "0");
                }
            }
        });

        JButton comma = new JButton(",");
        comma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (solution.getText().equals("0")) {
                    solution.setText("0.");
                } else if (solution.getText().contains(".")) {
                    solution.setText(solution.getText());
                } else {
                    solution.setText(solution.getText() + ".");
                }
            }
        });

        JButton plus = new JButton("+");
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonName = "addition";
                a = solution.getText();
                solution.setText("0");
                System.out.println(a);
            }
        });

        JButton minus = new JButton("-");
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonName = "subtraktion";
                a = solution.getText();
                solution.setText("0");
                System.out.println(a);
            }
        });
        JButton divided = new JButton("/");
        divided.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonName = "division";
                a = solution.getText();
                solution.setText("0");
                System.out.println(a);
            }
        });
        JButton multiply = new JButton("x");
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonName = "multiplikation";
                a = solution.getText();
                solution.setText("0");
                System.out.println(a);
            }
        });

        JButton equal = new JButton("=");
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (buttonName.equals("addition")) {
                    b = solution.getText();
                    solution.setText(new Addition().additionNumbers(a, b));
                } else if (buttonName.equals("subtraktion")){
                    b = solution.getText();
                    solution.setText(new Subtraction().subtractionNumbers(a,b));
                } else if (buttonName.equals("division")){
                    b = solution.getText();
                    solution.setText(new Division().divisionNumbers(a,b));
                } else if (buttonName.equals("multiplikation")){
                    b = solution.getText();
                    solution.setText(new Multiply().multiplyNumbers(a,b));
                }
            }
        });

        calculatingPanel.add(plus);
        calculatingPanel.add(one);
        calculatingPanel.add(two);
        calculatingPanel.add(three);

        calculatingPanel.add(minus);
        calculatingPanel.add(four);
        calculatingPanel.add(five);
        calculatingPanel.add(six);

        calculatingPanel.add(multiply);
        calculatingPanel.add(seven);
        calculatingPanel.add(eight);
        calculatingPanel.add(nine);

        calculatingPanel.add(divided);
        calculatingPanel.add(equal);
        calculatingPanel.add(zero);
        calculatingPanel.add(comma);
        this.add(calculatingPanel);

        this.setSize(400, 400);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Taschenrechner");
        this.setLayout(new GridLayout(3, 1));
        this.setVisible(true);
        this.setResizable(false);
    }
}
