package padroescomportamentais.interpreter;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraAreaTest {

    @Test
    void testCalculoAreaRetangulo() {
        InterpretadorExpressao retangulo = new RetanguloExpressao(5, 10);
        double areaRetangulo = retangulo.interpretar();
        assertEquals(50, areaRetangulo);
    }

    @Test
    void testCalculoAreaCirculo() {
        InterpretadorExpressao circulo = new CirculoExpressao(3);
        double areaCirculo = circulo.interpretar();
        assertEquals(28.27, areaCirculo, 0.01);
    }
}