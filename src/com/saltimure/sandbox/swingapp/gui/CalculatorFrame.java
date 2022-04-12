package com.saltimure.sandbox.swingapp.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.saltimure.sandbox.swingapp.calculator.Calculator;

@SuppressWarnings("serial")
public class CalculatorFrame extends JFrame implements ActionListener {
    
    private Calculator calc = new Calculator();
    
    private JButton enterButton, addButton, substractButton, multiplyButton, divideButton, resultButton;
    private JTextField calculatorConsole;
    private ArrayList<JButton> buttonsOfNumbersList = new ArrayList<JButton>();
    
    public CalculatorFrame() {
        //calc components
        for (int i = 0; i < 10; i++) {
            buttonsOfNumbersList.add(new JButton("" + i));
            buttonsOfNumbersList.get(i).addActionListener(this);
            this.add(buttonsOfNumbersList.get(i));
        }
        calculatorConsole = new JTextField("0");
        enterButton = new JButton("Enter");
        addButton = new JButton("+");
        substractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        resultButton = new JButton("=");
        
        //buttons actions
        enterButton.addActionListener(this);
        addButton.addActionListener(this);
        substractButton.addActionListener(this);
        divideButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        resultButton.addActionListener(this);
        GridLayout layout = new GridLayout(4, 3);
        
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(layout);
        this.add(enterButton);
        this.add(addButton);
        this.add(substractButton);
        this.add(divideButton);
        this.add(multiplyButton);
        this.add(resultButton);
        this.add(calculatorConsole);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == enterButton) {
            calc.getNumbers().add(Integer.parseInt(calculatorConsole.getText()));
            calculatorConsole.setText("");
        } 
        else if (e.getSource() == addButton) calc.getSymbols().add("+");
        else if (e.getSource() == substractButton) calc.getSymbols().add("-");
        else if (e.getSource() == divideButton) calc.getSymbols().add("/");
        else if (e.getSource() == multiplyButton) calc.getSymbols().add("*");
        else if (e.getSource() == resultButton) calculatorConsole.setText(String.valueOf(calc.calculate(calc.getNumbers(), calc.getSymbols())));
        else if (e.getSource() == buttonsOfNumbersList.get(0)) calculatorConsole.setText(calculatorConsole.getText().concat("0"));
        else if (e.getSource() == buttonsOfNumbersList.get(1)) calculatorConsole.setText(calculatorConsole.getText().concat("1"));
        else if (e.getSource() == buttonsOfNumbersList.get(2)) calculatorConsole.setText(calculatorConsole.getText().concat("2"));
        else if (e.getSource() == buttonsOfNumbersList.get(3)) calculatorConsole.setText(calculatorConsole.getText().concat("3"));
        else if (e.getSource() == buttonsOfNumbersList.get(4)) calculatorConsole.setText(calculatorConsole.getText().concat("4"));
        else if (e.getSource() == buttonsOfNumbersList.get(5)) calculatorConsole.setText(calculatorConsole.getText().concat("5"));
        else if (e.getSource() == buttonsOfNumbersList.get(6)) calculatorConsole.setText(calculatorConsole.getText().concat("6"));
        else if (e.getSource() == buttonsOfNumbersList.get(7)) calculatorConsole.setText(calculatorConsole.getText().concat("7"));
        else if (e.getSource() == buttonsOfNumbersList.get(8)) calculatorConsole.setText(calculatorConsole.getText().concat("8"));
        else if (e.getSource() == buttonsOfNumbersList.get(9)) calculatorConsole.setText(calculatorConsole.getText().concat("9"));
    }
}
