package ejercicio.escuelita.somospnt;

import ejercicio.escuelita.somospnt.exception.ProductoException;
import ejercicio.escuelita.somospnt.service.IProductoService;
import ejercicio.escuelita.somospnt.service.impl.ProductoServiceImpl;

/**
 *
 * @author deferrari
 */
public class EjercicioEscuelitaSomosPNT {
    public static void main(String[] args) {
        IProductoService servicio = new ProductoServiceImpl();

        try {
            servicio.ejecutar();
        } catch (ProductoException ex) {
            System.out.println("Ocurrió un problema con los productos");
            System.out.println(ex.getMessage());
        } catch (RuntimeException ex) {
            System.out.println("Ocurrió un problema inesperado");
            System.out.println(ex.getMessage());
        }
    }
}
