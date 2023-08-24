package ejercicio.escuelita.somospnt.domain;

import ejercicio.escuelita.somospnt.util.DecimalUtil;

/**
 *
 * @author deferrari
 */
public class Producto implements Comparable<Producto> {
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + 
                " /// Precio: $" + DecimalUtil.formatear(this.precio);
    }

    @Override
    public int compareTo(Producto p) {
        if (this.getPrecio() > p.getPrecio()) {
            return 1;
        } else if (this.getPrecio() < p.getPrecio()) {
            return -1;
        } else {
            return 0;
        }
    }
}
