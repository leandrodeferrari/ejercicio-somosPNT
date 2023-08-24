package ejercicio.escuelita.somospnt.service.impl;

import ejercicio.escuelita.somospnt.domain.CuidadoParaElCabello;
import ejercicio.escuelita.somospnt.domain.Fruta;
import ejercicio.escuelita.somospnt.domain.Gaseosa;
import ejercicio.escuelita.somospnt.domain.Producto;
import ejercicio.escuelita.somospnt.exception.ProductoException;
import ejercicio.escuelita.somospnt.service.IProductoService;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author deferrari
 */
public class ProductoServiceImpl implements IProductoService {

    private List<Producto> productos;

    @Override
    public void ejecutar() {
        this.cargarProductos();
        Producto productoMasBarato = this.buscarProductoMasBarato();
        Producto productoMasCaro = this.buscarProductoMasCaro();

        this.mostrarProductosPorConsola();
        this.mostrarSeparacionPorConsola();
        this.mostrarNombreDelProductoMasCaroPorConsola(productoMasCaro.getNombre());
        this.mostrarNombreDelProductoMasBaratoPorConsola(productoMasBarato.getNombre());
    }

    private void cargarProductos() {
        this.productos = Arrays.asList(
                new Gaseosa("Coca-Cola Zero", 20, 1.5),
                new Gaseosa("Coca-Cola", 18, 1.5),
                new CuidadoParaElCabello("Shampoo Sedal", 19, 500),
                new Fruta("Frutillas", 64, "kilo")
        );
    }

    private Producto buscarProductoMasBarato() {
        this.validarProductos(this.productos);

        Optional<Producto> optional = this.productos.stream().min(Producto::compareTo);

        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new ProductoException("No se pudo encontrar el producto más barato");
        }
    }

    private Producto buscarProductoMasCaro() {
        this.validarProductos(this.productos);

        Optional<Producto> optional = this.productos.stream().max(Producto::compareTo);

        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new ProductoException("No se pudo encontrar el producto más caro");
        }
    }

    private void mostrarProductosPorConsola() {
        this.validarProductos(this.productos);

        this.productos.forEach(System.out::println);
    }

    private void mostrarSeparacionPorConsola() {
        System.out.println("=============================");
    }

    private void mostrarNombreDelProductoMasCaroPorConsola(String nombre) {
        this.validarNombreDeProducto(nombre);

        System.out.println("Producto más caro: " + nombre);
    }

    private void mostrarNombreDelProductoMasBaratoPorConsola(String nombre) {
        this.validarNombreDeProducto(nombre);

        System.out.println("Producto más barato: " + nombre);
    }

    private void validarNombreDeProducto(String nombre) {
        if (nombre == null) {
            throw new ProductoException("El nombre del producto no puede ser nulo");
        }

        if (nombre.isEmpty()) {
            throw new ProductoException("El nombre del producto no puede estar vacío");
        }
    }

    private void validarProductos(List<Producto> productos) {
        if (productos == null) {
            throw new ProductoException("La lista de productos no puede ser nula");
        }

        if (productos.isEmpty()) {
            throw new ProductoException("La lista de productos no puede estar vacía");
        }
    }
}
