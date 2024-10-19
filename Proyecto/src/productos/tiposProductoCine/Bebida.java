package productos.tiposProductoCine;

import productos.productoCine;
import productos.tipo.tipoProducto;

public class Bebida extends productoCine {
    public Bebida(String nombre, double precio) {
        super(nombre, precio, tipoProducto.BEBIDA);
    }
    public void mostrarDatos(){
        String.format("nombre: %s, precio: %.2f",
                nombre,
                precio);
    }
}
