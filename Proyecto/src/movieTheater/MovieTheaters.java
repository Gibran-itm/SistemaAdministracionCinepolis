package movieTheater;

import seat.Seats;
import user.Users;
import user.administrator.Administrators;
import user.customer.Customers;
import user.Trabajadores.trabajadores;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Random;

public class MovieTheaters {

    public MovieTheaters() {
        Administrators administrators = new Administrators(
                "001",
                "Diego",
                "Guzmán",
                LocalDate.of(2005, 11, 12),
                "4451010809",
                "12354",
                25999,
                "adm102938482",
                2
        );
        this.listaAdmin.add(administrators);
        this.listaUser.add(administrators);
    }

    public ArrayList<Administrators> listaAdmin = new ArrayList<>();
    public ArrayList<Users> listaUser = new ArrayList<>();
    public ArrayList<Customers> listaCustom = new ArrayList<>();
    public ArrayList<trabajadores> listaTrabajadores = new ArrayList<>();
    public ArrayList<Seats> listaAsientos = new ArrayList<>();


    public String generarIdAdmin(String apellido, int antiguedad, String fechaNacimiento) {
        LocalDate fecha = LocalDate.now();
        Random rdm = new Random();
        String apell = apellido.substring(0, 2).toUpperCase();
        int ant = antiguedad;
        char ultimoDigitofecha = apellido.charAt(apellido.length() - 1);
        char penultimoDigitofecha = apellido.charAt(apellido.length() - 2);
        int yearActual = fecha.getYear();
        int aleatorio = rdm.nextInt(9999);
        int lista = listaAdmin.size() + 1;
        return String.format("ADM-%s%d%c%c%d%d%d",
                apell,
                ant,
                ultimoDigitofecha,
                penultimoDigitofecha,
                yearActual,
                aleatorio,
                lista);

    }

    public String generarIdCustomer(String apellido, String CURP) {
        LocalDate fecha = LocalDate.now();
        Random rdm= new Random();
        String apell = apellido.substring(0, 2).toUpperCase();
        char primerDigitoCurp = CURP.charAt(0);
        char segundoDigitoCurp = CURP.charAt(1);
        int yearActual = fecha.getYear();
        int aleatorio = rdm.nextInt(9999);
        int lista = listaCustom.size()+1;
        return String.format("CUS-%s%c%c%d%d%d",
                apell,
                primerDigitoCurp,
                segundoDigitoCurp,
                yearActual,
                aleatorio,
                lista);

    }

    public String generarIdTrabajador(String apellido, String nombre, String fechaNacimiento) {
        LocalDate fecha = LocalDate.now();
        Random rdm= new Random();
        String apell = apellido.substring(0, 2).toUpperCase();
        char ultimoDigitoFechaNac = fechaNacimiento.charAt(apellido.length() - 1);
        char penultimoDigitoFechaNac = fechaNacimiento.charAt(apellido.length() - 2);
        char primerDigitoNombre = nombre.charAt(0);
        char segundoDigitoNombre = nombre.charAt(1);
        int aleatorio= rdm.nextInt(9999);
        int yearActual = fecha.getYear();
        int lista = listaTrabajadores.size()+1;
        return String.format("TRAB-%s%c%c%c%c%d%d%d",
                apell,
                ultimoDigitoFechaNac,
                penultimoDigitoFechaNac,
                primerDigitoNombre,
                segundoDigitoNombre,
                yearActual,
                aleatorio,
                lista);
    }

    }