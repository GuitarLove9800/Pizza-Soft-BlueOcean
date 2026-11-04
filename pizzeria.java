import java.util.Scanner;
public class pizzeria {
        static Scanner sc = new Scanner(System.in);// declare Scanner como variable global ---- 

    // * Estilos de Comentarios
        // Comentario Normal
        // ! Este método quedará obsoleto en la próxima versión
        // ! ERROR / ALERTA: No modificar este bloque sin autorización del equipo
        // ? ¿Deberíamos cachear esta respuesta aquí?
        // TODO: implementar validación de token 
        // // const valorViejo = 10;




// ? ---------------------Funciones---------------------------------------------------------------------------------------------------










// ! -----------------------------------Main----------------------------------------------------------------------------------------
    public static void  main(String[]args){
        //ADVERTENCIA: NO METER FUNCIONES DENTRO DEL MAIN//
        mostrarBienvenida();
        int opcionMenu, opcionTamaños, cantidadPizza, opcionPizzas, agregarBebida, opcionBebida, tamañoBebida, cantidadBebida, agregarExtras, opcionExtras, cantidadExtras;
        String nombre, tipoTamaño, sabor, saborBebida, tipoBebida, saborExtras;
        double tamañoProporcional, precioSabor, precioP, precioBebida, precioExtras, sub, descuento, montoDescuento, ivaMonto, total;
        
        nombre = "Mostrador";
        agregarBebida = 0;
        cantidadBebida = 0;
        precioBebida = 0;
        saborBebida = "Ninguna";
        tipoBebida = "Ninguno";
        
        agregarExtras = 0;
        cantidadExtras = 0;
        precioExtras = 0;
        saborExtras = "Ninguno";

        do {
            opcionMenu = menuPrincipal();
            switch (opcionMenu){
                case 1: 
                    nombre = registrarCliente() ;
                    break;
                case 2 : 
                    opcionTamaños = menuTamaños();
                    tamañoProporcional = proporcionTamaño(opcionTamaños);
                    tipoTamaño = nombreTamaño(opcionTamaños);
                    cantidadPizza = pedirCantidadPizza();
                    
                    opcionPizzas = menuSaborPizza();
                    precioSabor = saborPrecio(opcionPizzas);
                    sabor = nombreSabor(opcionPizzas);
                    
                    System.out.print("¿Desea agregar bebidas? (Escriba 1 para Sí, otro número para No): ");
                    while (!sc.hasNextInt()) {
                        sc.next();
                    }
                    agregarBebida = sc.nextInt();
                    sc.nextLine();

                    if (agregarBebida == 1) {
                        opcionBebida = menuBebida();
                        saborBebida = nombreBebida(opcionBebida);
                        tamañoBebida = menuTamañoBebida();
                        precioBebida = valorBebida(tamañoBebida);
                        tipoBebida = tipodeBebida(tamañoBebida);
                        cantidadBebida = pedirCantidadBebida();
                    }
                    
                    System.out.print("¿Desea agregar extras? (Escriba 1 para Sí, otro número para No): ");
                    while (!sc.hasNextInt()) {
                        sc.next();
                    }
                    agregarExtras = sc.nextInt();
                    sc.nextLine();

                    if (agregarExtras == 1) {
                        opcionExtras = menuExtras();
                        saborExtras = nombreExtras(opcionExtras);
                        precioExtras = valorExtra(opcionExtras);
                        cantidadExtras = pedirCantidadExtras();
                    }
                    
                    precioP = calcularPrecioPizza(precioSabor, tamañoProporcional);
                    sub = calcularSubtotal(cantidadPizza, precioP, cantidadBebida, precioBebida, cantidadExtras, precioExtras);
                    
                    descuento = 0.20;
                    
                    if (cantidadPizza >= 2) {
                        montoDescuento = sub * descuento;
                    } else {
                        montoDescuento = 0;
                    }
                    
                    ivaMonto = (sub - montoDescuento) * 0.16;
                    total = (sub - montoDescuento) + ivaMonto;
                    
                    Ticket(nombre, sabor, tipoTamaño, precioP, cantidadPizza, agregarBebida, saborBebida, tipoBebida, precioBebida, cantidadBebida, agregarExtras, saborExtras, precioExtras, cantidadExtras, sub, montoDescuento, ivaMonto, total);
                    break;
                
                case 3 : 
                    System.out.println("¡Gracias por usar el sistema de Pizza Soft!");
                    break;
                default : 
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }
        }While (opcionMenu != 3);



    //no borrar esto
        sc.close() ;
        }


}