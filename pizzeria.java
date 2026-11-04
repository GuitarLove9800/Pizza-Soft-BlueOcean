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

            //Menu principal
            static int menuPrincipal(){
                    System.out.println("=====================================");
                    System.out.println("═════════════════════════════════════════════");
                    System.out.println("Pizza Soft by BlueOcean - Menú");
                    System.out.println(" 1 · Registrar CLiente ");
                    System.out.println(" 2 · Realizar Pedido");
                    System.out.println(" 3 · Salir ");
                    System.out.println("· Seleccione un Opción · ");
                    while (!sc.hasNextInt()) { //! while(!sc.hasNextInt())
                        System.out.print("Entrada inválida. Ingrese un número: ");
                        sc.next();
                    }
                    int opcion = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer
                    return opcion;
                }









// ! -----------------------------------Main----------------------------------------------------------------------------------------
        public static void  main(String[]args){
                //ADVERTENCIA: NO METER FUNCIONES DENTRO DEL MAIN//





    //no borrar esto
        sc.close() ;
        }


}

