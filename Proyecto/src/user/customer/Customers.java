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
    public String mostrarDatos(){
        return String.format("Id: %s, nombre: %s, apellido: %s, fecha de nacimiento: %s, direccion: %s, CURP: %s, total de funciones: %d",
                getId(),
                getNombre(),
                getApellido(),
                getFechaNacimiento(),
                getDireccion(),
                getCurp(),
                getTotalFunciones()
        );
    }

}
