package ejercicio.escuelita.somospnt.domain;

/**
 *
 * @author deferrari
 */
public class Fruta extends Producto {
    private String unidadDeVenta;
    
    public Fruta(String nombre, double precio, String unidadDeVenta) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }
    
    public String getUnidadDeVenta() {
        return this.unidadDeVenta;
    }
    
    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }
    
    @Override
    public String toString() {
        return super.toString() + " /// Unidad de venta: " + this.unidadDeVenta;
    }
}
