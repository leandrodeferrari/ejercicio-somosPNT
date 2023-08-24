package ejercicio.escuelita.somospnt.domain;

import ejercicio.escuelita.somospnt.util.DecimalUtil;

/**
 *
 * @author deferrari
 */
public class CuidadoParaElCabello extends Producto {

    private double contenidoEnMl;
    
    public CuidadoParaElCabello(String nombre, double precio, double contenidoEnMl) {
        super(nombre, precio);
        this.contenidoEnMl = contenidoEnMl;
    }
    
    public double getContenidoEnMl() {
        return this.contenidoEnMl;
    }
    
    public void setContenidoEnMl(double contenidoEnMl) {
        this.contenidoEnMl = contenidoEnMl;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + 
               " /// Contenido: " + DecimalUtil.formatear(this.contenidoEnMl) + 
               "ml /// Precio: $" + DecimalUtil.formatear(this.precio);
    }
}
