package com.saltimure.sandbox.swingapp;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextField;

import com.saltimure.sandbox.swingapp.gui.Frame;

public class Main {
    
    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static ArrayList<String> symbols = new ArrayList<>();
    
    public static void main(String[] args) {
        Frame frame = new Frame(1000, 1000, "Calculator");
        JTextField jTextField = new JTextField();
        jTextField.setPreferredSize(new Dimension(100, 50));
        jTextField.setText("123");
        
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
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numbers.add(Integer.parseInt(jTextField.getText()));
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                symbols.add("+");
            }
        });
        substractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                symbols.add("-");
            }
        });
        resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(String.valueOf(calculate(numbers, symbols)));
            }
        });
        
        frame.add(jButton);
        frame.add(addButton);
        frame.add(substractButton);
        frame.add(divideButton);
        frame.add(multiplyButton);
        frame.add(resultButton);
        frame.add(jTextField);
        frame.pack();
        frame.setVisible(true);
    }
    
    public static int calculate(ArrayList<Integer> numbers, ArrayList<String> symbols) {
        int result = numbers.get(0);
        int i = 1;
        for (String symbol: symbols) {
            switch (symbol) {
                case "+": 
                    result = result + numbers.get(i);
                    break;
                case "-": 
                    result = result - numbers.get(i);
                    break;
            }
            ++i;
        }
        System.out.println(result);
        symbols.clear();
        numbers.clear();
        return result;
    }
}
