package com.saltimure.sandbox.swingapp.calculator;

import java.util.ArrayList;

public class Calculator {
    
    private ArrayList<Integer> numbers = new ArrayList<>();
    private ArrayList<String> symbols = new ArrayList<>();
    
    public int calculate(ArrayList<Integer> numbers, ArrayList<String> symbols) {
        int result = numbers.get(0);
        int i = 1;
        for (String symbol: symbols) {
            switch (symbol) {
                case "+": 
                    result += numbers.get(i);
                    break;
                case "-": 
                    result -= numbers.get(i);
                    break;
                case "/": 
                    result /= numbers.get(i);
                    break;
                case "*": 
                    result *= numbers.get(i);
                    break;
            }
            ++i;
        }
        symbols.clear();
        numbers.clear();
        return result;
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public ArrayList<String> getSymbols() {
        return symbols;
    }

    public void setSymbols(ArrayList<String> symbols) {
        this.symbols = symbols;
    }
    
}
