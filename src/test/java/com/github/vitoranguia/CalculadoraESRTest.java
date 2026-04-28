package com.github.vitoranguia;

import com.github.vitoranguia.CalculadoraESR;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * testes
 */
public class CalculadoraESRTest {

    @Test
    void TestMultiplicarDoisNumerosInteiros() {
        CalculadoraESR calculadora = new CalculadoraESR();
        int resultado = calculadora.multiplicar(5, 3);
        assertEquals(15, resultado);
    }

    @Test
    void TestSubtrairDoisNumerosInteiros() {
        CalculadoraESR calculadora = new CalculadoraESR();
        int resultado = calculadora.subtrair(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    void SomarDoisNumerosInteiros() {
        CalculadoraESR calculadora = new CalculadoraESR();
        int resultado = calculadora.somar(5, 3);
        assertEquals(8, resultado);
    }

    @Test
    void SomarNumeradorMenorQueDenominador() {
        CalculadoraESR calculadora = new CalculadoraESR();
        int resultado = calculadora.somar(5, 10);
        assertEquals(15, resultado);
    }

    @Test
    void SomarNumeradorComZero() {
        CalculadoraESR calculadora = new CalculadoraESR();
        int resultado = calculadora.somar(5, 0);
        assertEquals(5, resultado);
    }

    @Test
    void DividirPorZero() {
        CalculadoraESR calculadora = new CalculadoraESR();
        try {
            calculadora.dividir(5, 0);
        } catch (IllegalArgumentException e) {
            assertEquals("Não é possível dividir por zero!", e.getMessage());
        }
    }

    @Test
    void DividirDoisInteiros(){
        CalculadoraESR calculadora = new CalculadoraESR();
        double resultado = calculadora.dividir(10, 2);
        assertEquals(5.0, resultado);
    }

    @Test
    void DividirNumeradorMenorQueDenominador() {
        CalculadoraESR calculadora = new CalculadoraESR();
        double resultado = calculadora.dividir(5, 10);
        assertEquals(0.5, resultado);
    }
}
