package user.customer;

import user.Users;
import user.rol.Rol;

import java.time.LocalDate;

public class Customers extends Users {
    public String CURP;
    public int totalFunciones;

    public Customers(String id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, String CURP, int totalFunciones, String contraseña) {
        super(id, nombre, apellido, fechaNacimiento, direccion, contraseña, Rol.CLIENTES);

        this.CURP = CURP;
        this.totalFunciones = totalFunciones;

    }
    public String getCurp() {
        return CURP;
    }
    public int getTotalFunciones() {
        return totalFunciones;
}

}
