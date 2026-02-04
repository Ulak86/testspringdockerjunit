package es.curojava.testspringdockerjunit.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public Integer sumar (Integer a, Integer b) {
        return a + b;
    }
}
