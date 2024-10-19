package productos.tiposProductoCine;

import productos.productoCine;
import productos.tipo.tipoProducto;

public class Palomitas extends productoCine {
    public Palomitas (String nombre, double precio) {
        super(nombre, precio, tipoProducto.PALOMITAS);
    }
    public void mostrarDatos(){
        String.format("nombre: %s, precio: %.2f",
                nombre,
                precio);
    }
}
