package com.github.vitoranguia;

public class Main {
    public static void main(String[] args) {

        CalculadoraESR calculadora = new CalculadoraESR();

        int a = 10;
        int b = 5;

        System.out.println("Soma: " + calculadora.somar(a, b));
        System.out.println("Subtração: " + calculadora.subtrair(a, b));
        System.out.println("Multiplicação: " + calculadora.multiplicar(a, b));
        System.out.println("Divisão: " + calculadora.dividir(a, b));

    }
}