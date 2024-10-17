package ticket;

import seat.Seats;

import java.time.LocalTime;

public class Tickets {
    String ID;
    Double precio;
    Seats seats;
    LocalTime horaFuncion;


    public Tickets(String ID, Double precio, Seats seats, LocalTime horaFuncion) {
        this.ID = ID;
        this.precio = precio;
        this.seats = seats;
        this.horaFuncion = horaFuncion;
    }
    public String getID() {
        return ID;
    }
    public Double getPrecio() {
        return precio;
    }
    public Seats getSeats() {
        return seats;
    }
    public LocalTime getHoraFuncion() {
        return horaFuncion;
    }

    public void mostrarDatosTicket() {
        System.out.println("ID: " + ID + "Precio: " + precio + "Asientos: " + seats + "Hora de la Funcion: " + horaFuncion);
}
}