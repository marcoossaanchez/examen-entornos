import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FacturaTest {

    @Test
    public void testSinDescuentoNiFidelizacion() {
        Factura factura = new Factura(100.0, 0.0, false);
        assertEquals(100.0, factura.calcularTotal());
    }

    @Test
    public void testConDescuentoSinFidelizacion() {
        Factura factura = new Factura(200.0, 20.0, false);
        assertEquals(160.0, factura.calcularTotal());
    }

    @Test
    public void testConDescuentoYFidelizacion() {
        Factura factura = new Factura(200.0, 20.0, true);
        assertEquals(152.0, factura.calcularTotal());
    }

    @Test
    public void testsindescuentoYFidelizacion() {
        Factura factura = new Factura(100.0, 0.0, true);
        assertEquals(95.0, factura.calcularTotal()); //
    }

    @Test
    public void testConDescuentoMAXSinFidelizacion() {
        Factura factura = new Factura(100.0, 100.0, false);
        assertEquals(0.0, factura.calcularTotal());
    }

    @Test
    public void testConDescuentoMAXYFidelizacion() {
        Factura factura = new Factura(100.0, 100.0, true);
        assertEquals(0.0, factura.calcularTotal());
    }

    @Test
    public void testConDescuentoNegativo() {
        Factura factura = new Factura(100.0, -10.0, false);
        assertEquals(100, factura.calcularTotal());
    }

    @Test
    public void testConDescuentoMayorA100() {
        Factura factura = new Factura(100.0, 150.0, false);
        assertEquals(100.0, factura.calcularTotal());
    }

    @Test
    public void testTotalNegativoTrasDescuento() {
        Factura factura = new Factura(-50.0, 50.0, false);
        assertEquals(0.0, factura.calcularTotal());
    }
}
