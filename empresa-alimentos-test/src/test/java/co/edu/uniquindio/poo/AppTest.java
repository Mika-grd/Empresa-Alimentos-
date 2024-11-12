/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.EpresaAlimentos;
import co.edu.uniquindio.poo.model.ProductoEnvasado;
import co.edu.uniquindio.poo.model.ProductoPerecedero;
import co.edu.uniquindio.poo.model.ProductoRefrigerado;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void calcularPrecioVentaTestProductoEnvasado() {
        LOG.info("Iniciado test calcularPrecioVentaTestProductoEnvasado");
        EpresaAlimentos em1 = new EpresaAlimentos(null, null, null, null);
        ProductoEnvasado prEn1 = new ProductoEnvasado(null, 10000, null, 0, null, 0, null, 10, null);
        double test = em1.calcularPrecioVenta(prEn1);
        assertEquals(100000, test);
        LOG.info("Finalizando test calcularPrecioVentaTestProductoEnvasado");
    }
    @Test
    public void calcularPrecioVentaTestProductoPerecedero() {
        LOG.info("Iniciado test calcularPrecioVentaTestProductoPerecedero");
        EpresaAlimentos em1 = new EpresaAlimentos(null, null, null, null);
        ProductoPerecedero prEn1 = new ProductoPerecedero(null, 10000, null, 0, null, 0, null);
        double test = em1.calcularPrecioVenta(prEn1);
        assertEquals(13500, test);
        LOG.info("Finalizando test calcularPrecioVentaTestProductoPerecedero");
    }
    @Test
    public void calcularPrecioVentaTestRefrigerable() {
        LOG.info("Iniciado test calcularPrecioVentaTestRefrigerable");
        EpresaAlimentos em1 = new EpresaAlimentos(null, null, null, null);
        ProductoRefrigerado prEn1 = new ProductoRefrigerado(null, 10000, null, 0, null, 0, null, -20);
        double test = em1.calcularPrecioVenta(prEn1);
        assertEquals(200000, test);
        LOG.info("Finalizando test calcularPrecioVentaTestRefrigerable");
    }

    @Test
    public void calcularImpuestoTestProductoEnvasado() {
        LOG.info("Iniciado test calcularImpuestoTestProductoEnvasado");
        EpresaAlimentos em1 = new EpresaAlimentos(null, null, null, null);
        ProductoEnvasado prEn1 = new ProductoEnvasado(null, 10000, null, 0, null, 0, null, 10, null);
        em1.calcularPrecioVenta(prEn1);
        double test = em1.calcularImpuesto(prEn1);
        assertEquals(110000, test);
        LOG.info("Finalizando test calcularImpuestoTestProductoEnvasado");
    }
    @Test
    public void calcularImpuestoTestProductoPerecedero() {
        LOG.info("Iniciado test calcularImpuestoTestProductoPerecedero");
        EpresaAlimentos em1 = new EpresaAlimentos(null, null, null, null);
        ProductoPerecedero prEn1 = new ProductoPerecedero(null, 10000, null, 0, null, 0, null);
        em1.calcularPrecioVenta(prEn1);
        double test = em1.calcularImpuesto(prEn1);
        assertEquals(14580, test);
        LOG.info("Finalizando test calcularImpuestoTestProductoPerecedero");
    }
    @Test
    public void calcularImpuestoTestRefrigerable() {
        LOG.info("Iniciado test calcularImpuestoTestRefrigerable");
        EpresaAlimentos em1 = new EpresaAlimentos(null, null, null, null);
        ProductoRefrigerado prEn1 = new ProductoRefrigerado(null, 10000, null, 0, null, 0, null, -20);
        em1.calcularPrecioVenta(prEn1);
        double test = em1.calcularImpuesto(prEn1);
        assertEquals(210000, test);
        LOG.info("Finalizando test calcularImpuestoTestRefrigerable");
    }
}
