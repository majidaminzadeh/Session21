package com.tosan.example1;

import com.tosan.calculator.Adder;

public class Example1 {
    public static void main(String[] args) {
        Adder adder = new Adder();
        adder.add(10, 15);
        System.out.println("Test Maven adder: " + adder.add(10, 15));
    }
}
