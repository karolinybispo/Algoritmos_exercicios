package Praticando_JUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstJUnitJupiterTests {

    private final CalculadoraSoma calculadoraSoma = new CalculadoraSoma();

    @Test
    void calcular(){
        assertEquals(4, calculadoraSoma.calcular(2,2));
    }
}