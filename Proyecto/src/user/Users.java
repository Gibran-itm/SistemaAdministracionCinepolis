package user;

import user.rol.Rol;

import java.time.LocalDate;

public class Users {
    public String id;
    public String nombre;
    public String apellido;
    public LocalDate fechaNacimiento;
    public String direccion;
    public String contraseña;
    public Rol rol;


    public Users(String id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, String contraseña, Rol rol) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.contraseña = contraseña;
        this.rol = rol;
    }
    public String getId() {

        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {

        return apellido;
    }
    public LocalDate getFechaNacimiento() {

        return fechaNacimiento;
    }
    public String getDireccion() {

        return direccion;
    }
    public Rol getRol() {

        return rol;
    }

    public String getContraseña() {

        return contraseña;
    }
}
