package movieTheater;

import seat.Seats;
import user.Users;
import user.administrator.Administrators;
import user.customer.Customers;
import user.Trabajadores.trabajadores;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Currency;

public class MovieTheaters {

    public MovieTheaters() {
        Administrators administrators= new Administrators(
                "001",
                "Diego",
                "Guzmán",
                LocalDate.of(2005,11,12),
                "4451010809",
                "12354",
                25999,
                "adm102938482",
                2
                );
        this.listaAdmin.add(administrators);
        this.listaUser.add(administrators);
    }

    public ArrayList<Administrators> listaAdmin= new ArrayList<>();
    public ArrayList<Users> listaUser= new ArrayList<>();
    public ArrayList<Customers> listaCustom= new ArrayList<>();
    public ArrayList<trabajadores> listaTrabajadores= new ArrayList<>();
    public ArrayList<Seats> listaAsientos= new ArrayList<>();

}
