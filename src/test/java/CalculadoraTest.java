

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.example.Calculadora;

public class CalculadoraTest {

    @Test
    public void testSuma() {
        assertEquals(5.0, calcularResultado(2.0, '+', 3.0), 0.0001);
    }

    @Test
    public void testResta() {
        assertEquals(2.0, calcularResultado(5.0, '-', 3.0), 0.0001);
    }

    @Test
    public void testMultiplicacion() {
        assertEquals(15.0, calcularResultado(5.0, '*', 3.0), 0.0001);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calcularResultado(6.0, '/', 3.0), 0.0001);
    }

    @Test
    public void testDivisionPorCero() {
        // Verifica que la división por cero genere un mensaje de error
        assertEquals("Error: No se puede dividir por cero.", obtenerMensajeError(5.0, '/', 0.0));
    }

    @Test
    public void testOperadorInvalido() {
        // Verifica que un operador no válido genere un mensaje de error
        assertEquals("Error: Operador no válido.", obtenerMensajeError(4.0, '$', 2.0));
    }

    private double calcularResultado(double num1, char operador, double num2) {
        return Calculadora.calcular(num1, operador, num2);
    }

    private String obtenerMensajeError(double num1, char operador, double num2) {
        return Calculadora.obtenerMensajeError(num1, operador, num2);
    }
}
