import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TesteVisitor {
    @Test
    void testCalculoDeArea() {
        FormaGeometrica circulo = new Circulo(3);
        FormaGeometrica retangulo = new Retangulo(4, 6);

        CalculadoraDeArea calculadora = new CalculadoraDeArea();

        circulo.aceitar(calculadora);
        retangulo.aceitar(calculadora);

        double areaTotal = calculadora.getAreaTotal();
        assertEquals(52.27, areaTotal, 0.01);
    }

    @Test
    void testCriacaoDeCirculoComRaioInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Circulo(-1));
    }

    @Test
    void testCriacaoDeRetanguloComValoresInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(0, 6));
    }

}
