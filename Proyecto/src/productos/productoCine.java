package productos;

import productos.tipo.tipoProducto;

public class productoCine {
    public String nombre;
    public double precio;
    public tipoProducto tipo;

    public productoCine(String nombre, double precio, tipoProducto tipoProducto) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo=tipo;
    }


    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public tipoProducto getTipo() {
        return tipo;
    }
    public void mostrarDatosProducto() {
    String.format("nombre: %s, precio: %s",
            getNombre(),
            getPrecio()
    );
    }
}
