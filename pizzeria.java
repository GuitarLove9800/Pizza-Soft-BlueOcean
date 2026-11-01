import java.util.Scanner;
public class pizzeria {
    static Scanner sc = new Scanner(System.in);// declare Scanner como variable global ---- 

    // * Estilos de Comentarios
        // Comentario Normal
        // ! Este método quedará obsoleto en la próxima versión
        // ! ERROR / ALERTA: No modificar este bloque sin autorización del equipo
        // ? ¿Deberíamos cachear esta respuesta aquí?
        // TODO: implementar validación de token
        // * Información importante sobre el algoritmo
        // // const valorViejo = 10;




// ? ---------------------Funciones---------------------------------------------------------------------------------------------------








// ! -----------------------------------Main----------------------------------------------------------------------------------------
    public static void  main(String[]args){
        //ADVERTENCIA: NO METER FUNCIONES DENTRO DEL MAIN//
        int opMenu;
        do{
            System.out.println("· Seleccione un Opción · ");
            System.out.println(" 1 · Registrar CLiente ");
            System.out.println(" 2 · Realizar Pedido");
            System.out.println(" 3 · Salir ");
            opMenu = sc.nextInt();

        }while(opMenu > 4 && opMenu < 0 );
        System.out.println("Verificacion COmpletada");
        switch(opMenu) {
            case 1 :
                sc.nextLine();
                System.out.println("Registrar Cliente");
                System.out.println("Ingrese su nombre");
                String userClient = sc.nextLine();
                System.out.println("Nombre Registrado: 1" + userClient);
                break;
            
            case 2 :

                break;
            case 3:
        }

    
    
    
    
    
    //no borrar esto
        sc.close() ;
    }
    
    
}

