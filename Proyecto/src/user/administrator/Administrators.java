package  user.administrator;

import java.time.LocalDate;
import user.Users;
import user.rol.Rol;

public class Administrators extends Users{

    public double sueldo;
    public String rfc;
    public int antiguedad;
    public String telefono;

    public Administrators(String id, String nombre, String apellidos, LocalDate fechaNacimiento, String telefono, String contraseña, double sueldo, String rfc, int antiguedad) {
        super(id, nombre, apellidos, fechaNacimiento, telefono, contraseña, Rol.ADMIN);
        this.sueldo = sueldo;
        this.rfc = rfc;
        this.antiguedad = antiguedad;
    }

    public String mostrarDatos(){
        return String.format("Id: %s, nombre: %s, apellidos: %s, fecha de nacimiento: %s, telefono: %s, contraseña: %s, sueldo: %d, rfc: %s, antiguedad: %d",
                getId(),
                getNombre(),
                getApellido(),
                getFechaNacimiento(),
                getTelefono(),
                getContraseña(),
                getSueldo(),
                getRfc(),
                getAntiguedad()
        );


    }
    public double getSueldo() {
        return sueldo;
    }

    public String getRfc() {
        return rfc;
    }

    public int getAntiguedad() {
        return antiguedad;
    }
    public String getTelefono() {
        return telefono;
    }
}