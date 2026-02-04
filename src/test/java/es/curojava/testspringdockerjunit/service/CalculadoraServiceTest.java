package es.curojava.testspringdockerjunit.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import es.curojava.testspringdockerjunit.service.CalculadoraService;

public class CalculadoraServiceTest {

    private final CalculadoraService calculadoraService = new CalculadoraService();

    @Test
    void sumar_dosNumeros_devuelveLaSuma() {
        // given
        Integer a = 2;
        Integer b = 3;

        // when
        Integer resultado = calculadoraService.sumar(a, b);

        // then
        assertEquals(5, resultado);
    }
}
