package com.saltimure.sandbox.swingapp.gui;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Frame extends JFrame{
    
    public Frame(int width, int height) {
        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
    }
}
