package Menu;

import java.time.LocalDate;
import java.util.Scanner;
import user.administrator.Administrators;
public class menu {
private Scanner sc = new Scanner(System.in);
    public void login(){
        Administrators admin = new Administrators (
            "001",
                "Admin",
                "Supremo",
                LocalDate.of(2004,9,17),
                "4452234568",
                "12354",
                10000,
                "refad678",
                2);

        }



        public void mostrarMenuAdmin(){
        int opcion=0;

        while(opcion!=5){
            System.out.println("***BIENVENIDO QUERIDO ADMINISTRADOR***");
            System.out.println("1. Registrar Cinepolito");
            System.out.println("2. Listar Cinepolito");
            System.out.println("3. Eliminar Cinepolito");
            System.out.println("4. Registrar Cliente");
            System.out.println("5. Listar Cliente");
            System.out.println("6. Eliminar Cliente");
            System.out.println("7. Agregar Funciones");
            System.out.println("8. Modificar Funciones");
            System.out.println("9. Listar Funciones");
            System.out.println("10. Eliminar Funciones");
            System.out.println("11. Mirar Boletos");
            System.out.println("12. Mirar Productos");
            System.out.println("13. Eliminar Productos");
            System.out.println("14. Mirar carrito");
            System.out.println("13. Revisar disponibilidad de la sala");
            System.out.println("14. Listar salas");
            System.out.println("15. Agregar Promociones");
            System.out.println("16. Modificar Promociones");
            System.out.println("17. Eliminar Promociones");
            System.out.println("18. Cerrar Sesion");

            System.out.println("\nSelecciona una opcion: ");
            opcion=sc.nextInt();
        }

    }

    public void mostrarMenuCliente(){
        int opcion=0;
        while(opcion!=5){
            System.out.println("1. Mirar Boletos");
            System.out.println("2. Mirar Productos");
            System.out.println("3. Mirar Promociones");
            System.out.println("4. Mirar Carrito");
            System.out.println("5. Cerrar Sesion");
        }
    }
    public void mostrarMenuCinepolito(){
        int opcion=0;
        while(opcion!=14){
            System.out.println("1. Agregar Funciones");
            System.out.println("2. Modificar Funciones");
            System.out.println("3. Listar Funciones");
            System.out.println("4. Eliminar Funciones");
            System.out.println("5. Mirar Boletos");
            System.out.println("6. Mirar Productos");
            System.out.println("7. Eliminar Productos");
            System.out.println("8. Mirar carrito");
            System.out.println("9. Revisar disponibilidad de la sala");
            System.out.println("10. Listar salas");
            System.out.println("11. Agregar Promociones");
            System.out.println("12. Modificar Promociones");
            System.out.println("13. Eliminar Promociones");
            System.out.println("14. Cerrar Sesion");
        }
    }
    }