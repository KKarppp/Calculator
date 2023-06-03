import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Font.*;

public class GUI implements ActionListener {
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bAdd, bSub, bDiv, bMult, bEqual, bPoint, bFact,bClear,bDelete,bMemory,bPercent;
    JTextField textField, operatorField;
    char operator = 'o';
    String numberBuilder = "";
    double number1 = 0;
    double number2 = 1;
    double result = 0;
    Calculator calculator = new Calculator();
    public GUI() {
        JFrame frame = new JFrame("Calculator");

        textField = new JTextField();
        textField.setEditable(false);
        textField.setBounds(50, 25, 300, 50);
     //   textField.setFont(Font.getFont("JurassicPark-BL48"));
        frame.add(textField);

        operatorField = new JTextField();
        operatorField.setEditable(false);
        operatorField.setBounds(5,25,30,50);
        frame.add(operatorField);

        ImageIcon icon = new ImageIcon("floppsa.png");


// Number creating buttons

        //note for future self: it's better to do this with arrays
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bPoint = new JButton(".");
// Function buttons
        bEqual = new JButton("=");
        bAdd = new JButton("+");
        bSub = new JButton("-");
        bDiv = new JButton("/");
        bMult = new JButton("*");
        bFact = new JButton("!");
        bClear = new JButton("C");
        bDelete = new JButton("Del");
        bMemory = new JButton("ANS");
        bPercent = new JButton("%");

// Button           Appearance

        /* apple orange?*/
        bEqual.setBackground(Color.getHSBColor(212,554,550));
/*other orange*/
        bAdd.setBackground(Color.getHSBColor(212,554,570));
        bSub.setBackground(Color.getHSBColor(212,554,570));
        bMult.setBackground(Color.getHSBColor(212,554,570));
        bDiv.setBackground(Color.getHSBColor(212,554,570));
        bPercent.setBackground(Color.getHSBColor(212,554,570));
// blueish
        bClear.setBackground(Color.getHSBColor(4844487,55,5868));
        bDelete.setBackground(Color.getHSBColor(4844487,55,5868));
        bMemory.setBackground(Color.getHSBColor(4844487,55,5868));

/* number color -> dark gray + foreground white*/
        b0.setBackground(Color.darkGray);
        b1.setBackground(Color.darkGray);
        b2.setBackground(Color.darkGray);
        b3.setBackground(Color.darkGray);
        b4.setBackground(Color.darkGray);
        b5.setBackground(Color.darkGray);
        b6.setBackground(Color.darkGray);
        b7.setBackground(Color.darkGray);
        b8.setBackground(Color.darkGray);
        b9.setBackground(Color.darkGray);
        bPoint.setBackground(Color.darkGray);
//foreground numbs
        b0.setForeground(Color.white);
        b1.setForeground(Color.white);
        b2.setForeground(Color.white);
        b3.setForeground(Color.white);
        b4.setForeground(Color.white);
        b5.setForeground(Color.white);
        b6.setForeground(Color.white);
        b7.setForeground(Color.white);
        b8.setForeground(Color.white);
        b9.setForeground(Color.white);
        bPoint.setForeground(Color.white);

//FUNCTIONALITY   numbers
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bPoint.addActionListener(this);
//FUNCTIONALITY   functions
        bEqual.addActionListener(this);
        bAdd.addActionListener(this);
        bSub.addActionListener(this);
        bMult.addActionListener(this);
        bDiv.addActionListener(this);
        bFact.addActionListener(this);
        bClear.addActionListener(this);
        bDelete.addActionListener(this);
        bMemory.addActionListener(this);
        bPercent.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100,10,10,10)); // wymiary
        panel.setLayout(new GridLayout(5,4,10,7));


        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(bAdd);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(bSub);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(bMult);
        panel.add(b0);
        panel.add(bPoint);
        panel.add(bDiv);
        panel.add(bPercent);
        panel.add(bClear);
        panel.add(bDelete);
        panel.add(bMemory);
        panel.add(bEqual);

        panel.setBackground(Color.gray);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Super new Calculator");
        frame.pack();
        frame.setVisible(true);
        frame.setSize(420, 550);
        frame.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {

    new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

//number creation
        if(e.getSource() == b0) {
                textField.setText(textField.getText().concat(String.valueOf(0)));
            }
        if(e.getSource() == b1) {
            textField.setText(textField.getText().concat(String.valueOf(1)));
        }
        if(e.getSource() == b2) {
            textField.setText(textField.getText().concat(String.valueOf(2)));
        }
        if(e.getSource() == b3) {
            textField.setText(textField.getText().concat(String.valueOf(3)));
        }
        if(e.getSource() == b4) {
            textField.setText(textField.getText().concat(String.valueOf(4)));
        }
        if(e.getSource() == b5) {
            textField.setText(textField.getText().concat(String.valueOf(5)));
        }
        if(e.getSource() == b6) {
            textField.setText(textField.getText().concat(String.valueOf(6)));
        }
        if(e.getSource() == b7) {
            textField.setText(textField.getText().concat(String.valueOf(7)));
        }
        if(e.getSource() == b8) {
            textField.setText(textField.getText().concat(String.valueOf(8)));
        }
        if(e.getSource() == b9) {
            textField.setText(textField.getText().concat(String.valueOf(9)));
        }
        if(e.getSource() == bPoint) {
            textField.setText(textField.getText().concat(String.valueOf('.')));
        }
        if(e.getSource() == bClear) {
            textField.setText("");
        }
        if(e.getSource() == bDelete) {
            number1 = 0;
            number2 = 0;
            textField.setText("");
            operatorField.setText("");
        }
        if(e.getSource() == bMemory) {
            textField.setText(String.valueOf(result));
        }
        numberBuilder = textField.getText();
//operations

        if(e.getSource() == bAdd) {
            number1 = Double.parseDouble(numberBuilder);
            operator = '+';
            textField.setText("");
            operatorField.setText("+");
        }

        if(e.getSource() == bSub) {
            number1 = Double.parseDouble(numberBuilder);
            operator = '-';
            textField.setText("");
            operatorField.setText("-");
        }
        if(e.getSource() == bMult) {
            number1 = Double.parseDouble(numberBuilder);
            operator = '*';
            textField.setText("");
            operatorField.setText("*");
        }
        if(e.getSource() == bDiv) {
            number1 = Double.parseDouble(numberBuilder);
            operator = '/';
            textField.setText("");
            operatorField.setText("/");
        }
        if(e.getSource() == bPercent) {
            number1 = Double.parseDouble(numberBuilder);
            operator = '%';
            textField.setText("");
            operatorField.setText("%");
        }

        if(e.getSource() == bEqual) {
            number2 = Double.parseDouble(numberBuilder);
            switch (operator) {
                case '+':
                    result = calculator.add(number1, number2);
                    break;
                case '-':
                    result = calculator.subtract(number1, number2);
                    break;
                case '*':
                    result = calculator.multiply(number1, number2);
                    break;
                case '/':
                    result = calculator.divide(number1, number2);
                    break;
                case '%':
                    result = calculator.percentage(number1, number2);
                    break;
            }
            operatorField.setText("=");
            textField.setText(String.valueOf(result));
        }
    }
}
