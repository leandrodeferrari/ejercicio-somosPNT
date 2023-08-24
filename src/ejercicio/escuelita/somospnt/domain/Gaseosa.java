package ejercicio.escuelita.somospnt.domain;

import ejercicio.escuelita.somospnt.util.DecimalUtil;

/**
 *
 * @author deferrari
 */
public class Gaseosa extends Producto {
    private double litros;
    
    public Gaseosa(String nombre, double precio, double litros) {
        super(nombre, precio);
        this.litros = litros;
    }
    
    public double getLitros() {
        return this.litros;
    }
    
    public void setLitros(double litros) {
        this.litros = litros;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + 
                " /// Litros: " + this.litros + 
                " /// Precio: $" + DecimalUtil.formatear(this.precio);
    }
}
