package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import geometria_Calculos.Circulos;
import geometria_Calculos.Rectangulos;

class TestCirculosRectangulos {

	@Test
	void test() {
		
		double radio = (new Circulos(8)).calcularRadioCirculo();
		assertEquals(radio, 4.0);
		
	}
	
	@Test
	void test2() {
		double perimetro = (new Circulos(10)).calcularPerimetroCirculo();
		assertEquals(perimetro, 31.41592653589793);
	}
	
	@Test
	void test3() {
		Circulos circulo = new Circulos();
		circulo.setDiametro(10);
		double area = circulo.calcularAreaCirculo();
		assertEquals(area, 78.53981633974483);
		
	}

	@Test
	void test4() {
		
		Rectangulos rectangulo = new Rectangulos();
		rectangulo.setAltura(4);
		rectangulo.setBase(7);
		double area = rectangulo.calcularAreaRectangulo();
		assertEquals(area, 28);
		
	}
	
	@Test
	void test5() {
		double area = (new Rectangulos(3, 6)).calcularAreaRectangulo();
		assertEquals(area, 18);
	}

}
