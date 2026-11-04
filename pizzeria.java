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
                int opcionMenu, opcionTamaños, cantidadPizza, opcionPizzas, agregarBebida, opcionBebida, tamañoBebida, cantidadBebida, agregarExtras, opcionExtras, cantidadExtras;
                String nombre, tipoTamaño, saborPizza, saborBebida, tipoBebida, saborExtras;
                double tamañoProporcional, precioSabor, precioPizza, precioBebida, precioExtras, subtotal, descuento, iva, total;

                //!Inicializar variables opcionales para evitar errores si no se compran extras o bebidas
                cantidadBebida = 0;
                precioBebida = 0;
                saborBebida = "Ninguna";
                tipoBebida = "Ninguno";
                cantidadExtras = 0;
                precioExtras = 0;
                saborExtras = "Ninguno";
                nombre = "Mostrador";

                do{
                        System.out.println("============================");
                        System.out.println("Pizza Soft by BlueOcean - Menú");
                        System.out.println(" 1 · Registrar CLiente ");
                        System.out.println(" 2 · Realizar Pedido");
                        System.out.println(" 3 · Salir ");
                        System.out.println("· Seleccione un Opción · ");
                        opcionMenu = sc.nextInt();

                }while(opcionMenu > 4 && opcionMenu < 0 );

                switch(opcionMenu) {
                        case 1 :
                                sc.nextLine();
                                System.out.println("===== REGISTRO DE CLIENTE =====");
                                System.out.println("Ingrese su nombre");
                                nombre = sc.nextLine();
                                System.out.println("Nombre Registrado: 1" + nombre);


                                //TODO break del case 1
                                break;
                        
                        case 2 :
                                //! Menu de tamaño de pizzas 
                                System.out.println("===== MENU DE PIZZAS =====");
                                System.out.println("Tamaños");
                                System.out.println("1·Pizzeta (20cm diametro)");
                                System.out.println("2·Personal (25cm diametro)");
                                System.out.println("3·Pequeña (30cm diametro)");
                                System.out.println("4·Mediana (25cm Diametro)");
                                System.out.println("5·Grande (40cm Diametro)");
                                System.out.println("6· Jumbo (50cm Diametro)");
                                System.out.println("Selecciona el número de tamaño");
                                opcionTamaños =sc.nextInt();
                                // !cantidad de pizzas
                                System.out.println("¿Cuántas pizzas?");
                                cantidadPizza = sc.nextInt();
                                
                                //! Asignacion de Precios a Pizzas 
                                switch(opcionTamaños) {
                                        //? Pizzeta
                                        case 1: tamañoProporcional = 0.3265;
                                                tipoTamaño = "Pizzeta (20cm diámetro)";
                                                break;
                                        //? Personal
                                        case 2: tamañoProporcional = 0.51;
                                                tipoTamaño = "Personal (25cm diámetro)";
                                                break;
                                        //? Pequeña
                                        case 3: tamañoProporcional = 0.7347;
                                                tipoTamaño = "Pequeña (30cm diámetro)";
                                                break;
                                        //? Mediana
                                        case 4: tamañoProporcional = 1.00;
                                                tipoTamaño = "Mediana (35cm diámetro)";
                                                break;
                                        //? Grande
                                        case 5: tamañoProporcional = 1.306;
                                                tipoTamaño = "Grande (40cm diámetro)";
                                                break;
                                        //? Jumbo
                                        case 6: tamañoProporcional = 2.0408;
                                                tipoTamaño = "Jumbo (50cm diámetro)";
                                                break;
                                        default: System.out.println("Opción no valida");
                                                tamañoProporcional = 1;
                                                tipoTamaño = "Desconocido";

                                }
                
                                //!Mostrar menu de Pizzas
                                System.out.println("Pizzas");                
                                System.out.println("1·Pepperoni. Salsa de tomate, queso mozzarella, pepperoni");
                                System.out.println("2·Hawaiana. Salsa de tomate, queso mozzarella, jamón, piña");
                                System.out.println("3·Al pastor. Salsa de tomate, queso mozzarella, carne al pastor");                
                                System.out.println("4·Cuatro quesos. Mozzarella, manchego, parmesano, queso azul");
                                System.out.println("5·Mexicana. Salsa de tomate, queso mozzarella, chorizo, jalapeño, cebolla");
                                System.out.println("6·BBQ Chicken. Salsa BBQ, mozzarella, pollo, cebolla");      
                                System.out.println("7·Especial de la Casa. Salsa de tomate, mozzarella, pepperoni, jamón, tocino, champiñones, pimiento"); 
                                System.out.println("Seleccione el sabor de la pizza"); 
                                opcionPizzas = sc.nextInt();
                
                
                                //TODO Break del Case 2
                                break;
                        case 3:
                }






    //no borrar esto
        sc.close() ;
        }


}

