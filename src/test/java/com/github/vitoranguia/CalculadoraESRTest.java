package com.github.vitoranguia;

import com.github.vitoranguia.CalculadoraESR;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraESRTest {

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
}
