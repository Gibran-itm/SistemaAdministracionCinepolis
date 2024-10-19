package productos.tiposProductoCine;

import productos.productoCine;
import productos.tipo.tipoProducto;

public class Snacks extends productoCine {

    public Snacks (String nombre, double precio) {
        super(nombre, precio, tipoProducto.SNACKS);
    }
    public void mostrarDatos(){
        String.format("nombre: %s, precio: %.2f",
                nombre,
                precio);
    }
}
