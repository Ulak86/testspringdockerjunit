package es.curojava.testspringdockerjunit.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.curojava.testspringdockerjunit.service.CalculadoraService;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	private final CalculadoraService calculadoraService;
	
	public CalculadoraController(CalculadoraService calculadoraService) {
		this.calculadoraService = calculadoraService;
	}
	
	@RequestMapping(name = "/sumar", method = org.springframework.web.bind.annotation.RequestMethod.GET)
	public ResponseEntity<Integer> sumar(@RequestParam int a, @RequestParam int b) {
		
		return ResponseEntity.ok(calculadoraService.sumar(a, b));
	}
}
