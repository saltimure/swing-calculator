package com.saltimure.sandbox.swingapp;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.saltimure.sandbox.swingapp.calculator.Calculator;

@SuppressWarnings("serial")
public class CalculatorFrame extends JFrame {
    
    private Calculator calc = new Calculator();
    
    public CalculatorFrame() {
        //calc components
        JTextField jTextField = new JTextField();
        jTextField.setPreferredSize(new Dimension(100, 50));
        JButton jButton = new JButton("Enter");
        jButton.setPreferredSize(new Dimension(100, 50));
        JButton addButton = new JButton("+");
        addButton.setPreferredSize(new Dimension(50, 50));
        JButton substractButton = new JButton("-");
        substractButton.setPreferredSize(new Dimension(50, 50));
        JButton multiplyButton = new JButton("*");
        multiplyButton.setPreferredSize(new Dimension(50, 50));
        JButton divideButton = new JButton("/");
        divideButton.setPreferredSize(new Dimension(50, 50));
        JButton resultButton = new JButton("=");
        resultButton.setPreferredSize(new Dimension(50, 50));
        
        //buttons actions
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.getNumbers().add(Integer.parseInt(jTextField.getText()));
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.getSymbols().add("+");
            }
        });
        substractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.getSymbols().add("-");
            }
        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.getSymbols().add("/");
            }
        });
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.getSymbols().add("*");
            }
        });
        resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(String.valueOf(calc.calculate(calc.getNumbers(), calc.getSymbols())));
            }
        });
        
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
        this.add(jButton);
        this.add(addButton);
        this.add(substractButton);
        this.add(divideButton);
        this.add(multiplyButton);
        this.add(resultButton);
        this.add(jTextField);
        this.pack();
        this.setVisible(true);
    }
}
