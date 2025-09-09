package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

class CalculadoraTest {
	
	@Test
	void somaTeste() {
		
		Calculadora calc = new Calculadora ();
		assertEquals (2.0, calc.soma(1.0, 1.0));
		
	 }
	
	 @Test
	 void multiplicacaoTeste() {
	      Calculadora calc = new Calculadora();
	      assertEquals(6.0, calc.multiplica(2.0, 3.0));
	 }

	 @Test
	 void divisaoTeste() {
	      Calculadora calc = new Calculadora();
	      assertEquals(2.0, calc.divide(6.0, 3.0));
	 }

	 @Test
	 void potenciacaoTeste() {
	        Calculadora calc = new Calculadora();
	        assertEquals(8.0, calc.potencia(2.0, 3.0));
	 }
}

