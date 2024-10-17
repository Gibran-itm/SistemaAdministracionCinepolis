package user.Trabajadores;

import user.Users;
import user.rol.Rol;

import java.time.LocalDate;

public class trabajadores extends Users {
    String rfc;
    String telefono;
    int añosTrabajando;
    public double sueldo;

    public trabajadores(String id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, String rfc, Double sueldo, String telefono, String contraseña, int añosTrabajando) {
        super(id, nombre, apellido, fechaNacimiento, direccion, contraseña, Rol.CINEPOLITOS);
        this.rfc = rfc;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.añosTrabajando= añosTrabajando;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getRfc() {

        return rfc;
    }
    public String getTelefono() {

        return telefono;
    }
    public int getAñosTrabajando() {
        return añosTrabajando;
}

public String mostrarDatos(){
        return String.format("Id: %s, nombre: %s, apellido: %s, fecha de nacimiento: %s, direccion: %s, rfc: %s, sueldo: %.2f, telefono: %s, años trabajando: %d",
                getId(),
                getNombre(),
                getApellido(),
                getFechaNacimiento(),
                getDireccion(),
                getRfc(),
                getSueldo(),
                getTelefono(),
                getAñosTrabajando()
                );
}

}
