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

     // Códigos ANSI para dar color en la terminal
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String NARANJA = "\u001B[38;5;208m"; // Naranja brillante
    public static final String AMARILLO = "\u001B[33m";
    public static final String CYAN = "\u001B[36m";
    public static final String VERDE = "\u001B[32m";
    //? Mostrar Bienvenida-----
    static void mostrarBienvenida(){
        System.out.println(NARANJA + "        .=@@@@@@@:.@@@@@.                                                                                      " + RESET);
        System.out.println(NARANJA + "    :=%@@@%######@@@###@@#                                                                                     " + RESET);
        System.out.println(NARANJA + "  .#@@@*++++++++++*++++%@#            .*=.   :#%@@@@@@##                                                        " + RESET);
        System.out.println(NARANJA + "  :@@*++++++++++++++@@@@@:%@@@@@@@@@@@@@@@@@@@@@@@%*++++#%@@*.                                                 " + RESET);
        System.out.println(NARANJA + "  :@@*+++++++#*++++++*#@@@%###+++*##@##+++++++++*++++++++++#@@-                                                " + RESET);
        System.out.println(NARANJA + "  :@@*+++++%@@%++++++++++++++++++++++++++++++++++++++%#+++++#@%.                                               " + RESET);
        System.out.println(NARANJA + "  :@@*+++++%@%*++++++++++++++++++++++++++#+++++++#@@@@@#++++*@@-                ...                            " + RESET);
        System.out.println(NARANJA + "  :@@*+++++*++++++++++++##@@@++++++@@@@@#+++++#@@@@##++++++++#@@          .=++%@@@@@@@@@@@@@@*++:              " + RESET);
        System.out.println(NARANJA + "  :@@*++++++++++++%+++++@@@#+++++#@@@@@*+++++#@@%++++++++++++#@@        .*%@@%+:::...........::::%@@@%#.       " + RESET);
        System.out.println(NARANJA + "  .*@%+++++++++#@@@+++++@@#+++++#@@@@%*+++++#@@%+++++*@@*+++++%@@     :@@%#:..:=**++++++*********=::..-##@@#-.   " + RESET);
        System.out.println(NARANJA + "   -@@++++++@@@@@@@+++++@++++++%@@@@%++++++%@@@+++++*##*++++++%@@ .+@@=..-=++++=+++=++++++++++++++*++=-..:=#@@+= " + RESET);
        System.out.println(NARANJA + "   -@@++++++@@* *@@+++++++++++@%++++++++++++++++++++++++++++++%@@:@@-.--=++++++++++++++++++=+++++==++++++*=...=@@%:" + RESET);
        System.out.println(NARANJA + "   -@@++++++@@*  #@%++++++++++++++++++++++++++++**+++++*%*+++#@@-@#:.:-----========+++++++++++++++++++++++++*=:.:+%@+:" + RESET);
        System.out.println(NARANJA + "   .*@%++++#@@+  -@@#++##+++++++###@@#######%@@@@@@@@@@@@@@@@@@=@%:.::::::-----====--==========++++++++++++++++*-..=%@#:" + RESET);
        System.out.println(NARANJA + "    +@@@++#@@%     @@@@@@@@@@@@@@@@*@@@@@@@@*.         -:  +@#.:::...........:-====----=======+++++++++++++++=*...+@@" + RESET);
        System.out.println(NARANJA + "      +@@@@#=                                       .*@@+.:-%%############+-::--==---=====++++++++++++++++==:..+@%:" + RESET);
        System.out.println(NARANJA + "                                                    :%@=..:-+#%%%%%##%%%%######+=.:-===---+=======+++++++=++++=...=@#:" + RESET);
        System.out.println(NARANJA + "                                                   :@@-:---:::.=##%%%%%%%%%%%%#####:..--===::======+++++++++++==*..:*@*" + RESET);
        System.out.println(NARANJA + "                                               :%@%=.:-=-::--::-##%##%%%%%%%%%%%%%##*-:.:----:--=====+++++++++==+*:.=@@-" + RESET);
        System.out.println(NARANJA + "                                            .#@@=..:---------::.+%%%%%#-----:#%##%%%%%#+-..-:--.:-=====+++++++++=-==:.@%=" + RESET);
        System.out.println(NARANJA + "                                           .%@*..:--:---=--==-.:.*%#%#=::::::.*%##%%%%%%###+...:::::.-=====+++++++=---..+@=" + RESET);
        System.out.println(NARANJA + "                                          :#@*..:-------------.::+%%%#*+#######%%####%########*=..::::..-====+++=+++=---..=@*" + RESET);
        System.out.println(NARANJA + "                                         :%@-.:-----------:--::.*#%%%%%%%%%%%%%%%####%##%%%#####*=..::::::====+++++++=--=:.+@%" + RESET);
        System.out.println(NARANJA + "                                         :@*:.-----:::-------::.##%%%##%%%#%%%###+.........*##%%###*-.::.:::=====++++++==-=:.*@%" + RESET);
        System.out.println(NARANJA + "                                        -%@#::--:===------:-:::=#%%%%%%%%%%%#=-::---------::::::=#%###=..-:::::===+++++++==--:.+@*" + RESET);
        System.out.println(NARANJA + "                                      -%@+:.=::::-------:::.:*%%%%%%%###%%=::---------------:-:.:.:#%##*+..::::::===+=++++=-:-..#@+" + RESET);
        System.out.println(NARANJA + "                                     =@#::%%%##+:::..:::-*#%%%%%%####%%#+.:--::------=----------:::.#%%%#+..::::::======+++=--:.:@%:" + RESET);
        System.out.println(NARANJA + "                                   :@%-.+%%%%%%%######%#%%##=++-:.-##%%=:--:-----------------:---:::=#####*-.:::::-==========-::.-@-" + RESET);
        System.out.println(NARANJA + "                                  +@@:-%%%##%##%%%%%%%%%%##*:---:::##%::---:=------:::::::--=----.:::###%+##=.:::::-=-=======--:.-%@:" + RESET);
        System.out.println(NARANJA + "                                 =@#.-%%###%#*+....::..=*##.::::*##%##.--------------------------:::=##%%#+###..::---:--::--==-::.+@:" + RESET);
        System.out.println(NARANJA + "                               .*@*.+%###%=-::---------:.+##++#%%%%%##.:--::-----------:----::--:::.#%%##%#*=##-.:::::-::.:===+-:.+@:" + RESET);
        System.out.println(NARANJA + "                              -@@+.#%##%-.----==--------:.*#%%%%%%#%%#.::-:--=-----------------:.:.#%%%%%%%#-*#*-.::..=***######+.=@:" + RESET);
        System.out.println(NARANJA + "                            .%@*.-#%%%+.:-------------:::.*#%%%%%%%%%##+:-------------==----::.::+##%+:=:.##*:*#*-.=*##%#%##%%%*-.*@:" + RESET);
        System.out.println(NARANJA + "                           =@%.:#*+#%*.:-------------::.:.*%%%%##%%%%%%##+:.:-----------:::::..+##%##=..=+%###==+.+*####%%%%%%%=.+@=" + RESET);
        System.out.println(NARANJA + "                         .@@=.:%#=+#%*.:-:+====-:---::::.+%%%##%%%%%##%%%#####*-..........-*#%%%%%#%%%%%%%%%#%.++:+###%##%%##*:.@@+" + RESET);
        System.out.println(NARANJA + "                        -@%=:#%+=##%%#+:::---::-:::.::.=%%%%%%%%##*+*#%##%%%%%%%%%%%%%%%%%%%%%##%%%%%%%%#+-+**#*++-..+++**+=.:+@@=" + RESET);
        System.out.println(NARANJA + "                       =@%.-#%#%%%%%%###+...::::...-+%%%%%%%%%+-:::-::::=#%##%%%#:--:=##%%##%###+=+*-+###*###**::...:......*#@@-" + RESET);
        System.out.println(NARANJA + "                      +@*.-%#####%%%%%%%%########@@%%%%##%%%#-:----:----:=#%%%#+:::..+##%%%%###*+#*=....:==-...-@@@@@@@@@@@%=" + RESET);
        System.out.println(NARANJA + "                    .*@-.+%*-:::#%%%%%######%%%%%%%%%%%%%%%#---=-:------:.+#%%%%#%%%#*+++####*-==.-=%@@@#++#@@@*=" + RESET);
        System.out.println(NARANJA + "                    #@=.%%#*+++#%%#%##%%#%%%%%%#%#=-=--=###*.:-=---:--:-:-*#%%%%%%######**+++*=:.*@#:::::::::." + RESET);
        System.out.println(NARANJA + "                   @@+.#%#%%%%%*:..:::::...*#%%%#+---::-###*.---:------:+#####**+=............-@@%.               *@@@@@@@@=@%:" + RESET);
        System.out.println(NARANJA + "                  %@+.*%##%#*:.::::--===-::::+%%#..:-####%%%*-:-::::--#####*-.:==#@@@@@@@@@@@@#=                .+@@##++++#@@%%@@=" + RESET);
        System.out.println(NARANJA + "                 +@%.=%%##*:::-----::---:-:::.:######%%%##%%%%#*#######*#*-.:@@+:::                         #@@*++++++++++++@@+" + RESET);
        System.out.println(NARANJA + "                =%@.:%%%#.::--=----------::-:::.%%##%%%%##%%%%%%%####*##*-.#@#          .%@@@@@@@@**@@@@*. @@@#+++++++++++++@@#." + RESET);
        System.out.println(NARANJA + "               .*@:.@%%=.:----=------:-----:-.:.#%###%###%%%%###==-:-=--.-#@+          .#@@#*+++++@@@####%@@@@%++++#@#++++++*@@@@@+" + RESET);
        System.out.println(NARANJA + "               -@=.#%%=:--------:----------=-::.###%%%%%%%%%%#==:.:#%##%%@=           .@@#++++++++%++++++++%@@%++++%+++++++++++++%@@" + RESET);
        System.out.println(NARANJA + "              :@*:=%#+.:--:----------------=:...####%%%###%%#=:.:@@#===                 @@#++++++%@+++++++++++*%++++++++++++++++++#@@#" + RESET);
        System.out.println(NARANJA + "             +@#:=%%#=.---:-----------------::.*######%%%%%#=:.*@*                      @@#+++++#@+++++*@%++++++++++++++++++++%@@@@*:" + RESET);
        System.out.println(NARANJA + "            #@#.=%%%#=.-----::-------::---.:.-*####**######==.+@@                       @@@*+++++%+++++%@@%+++++++++++*%*+++++%@%." + RESET);
        System.out.println(NARANJA + "           .#@..+%%%%#=.:-:=-----:::::-=--:::+#*++-+****##**=.=@#.                      .%@@*+++++++++#@@@%++++++++++@@@*+++++%@% " + RESET);
        System.out.println(NARANJA + "          .#@:.%%##%#%#-.:-:-----:--==-:::=#*+=..:++:.--+=-..*@*.                       -%@@+++++++++%@@%++++++++++@@@*++++#@@  " + RESET);
        System.out.println(NARANJA + "          -@=.%%%%%%%%%#*.::-----------=**#+=..#@@@@@@%#-=%%@#                          %@@@@++++++++++%@@%++++%+++++@@@*++++*@@%%%%:" + RESET);
        System.out.println(NARANJA + "         .%@=.%%%%%%%%%%###:::::::--=#####+=.+@#      .****.                            #@@#++++++++*+++++++++++*@*++++@@@*++++++%%%%@@@" + RESET);
        System.out.println(NARANJA + "         .@#:*%%##%%#%%%%%%%%##########=*+-.*@+                                         #@@+++++++*%@@+++++++++#@@%++++@@@@++++++++++#@@" + RESET);
        System.out.println(NARANJA + "         %@+.+%%#%%%%########++=+=:...+++:.@@+                                           @@@@@@@@@@@@@@#+++*@@@@@@@@@@@*+@@@+++++++#@@@" + RESET);
        System.out.println(NARANJA + "        #@+.+#%%%%%######*+-...::....:..:=%@=                                             .******=    *#@@@@@%*. .*****    +*@@@@@@@%*" + RESET);
        System.out.println(NARANJA + "        .%%.-#####%%@#***-.-#@@@@@@@@%%@@@*-                                                                                          " + RESET);
        System.out.println(NARANJA + "        *@%.=##%%%%%##--..%@*                                                                                                          " + RESET);
        System.out.println(NARANJA + "        .@%.:+###%###*.-.#@                                                                                                            " + RESET);
        System.out.println(NARANJA + "         :@%=....:==:.=.+@%                                                                                                            " + RESET);
        System.out.println(NARANJA + "           =%@@@@*.....-%@.                                                                                                            " + RESET);
        System.out.println(NARANJA + "               .*@@%%@@#.                                                                                                              " + RESET);
        System.out.println(NARANJA + "                   .:::                                                                                                                " + RESET);
        System.out.println(AMARILLO + "\n\t\t\t\t\t¡BIENVENIDO A PIZZA SOFT BY BLUEOCEAN!\n" + RESET);
    }


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
                    while (!sc.hasNextInt()) { //! while(!sc.hasNextInt()) sirve para validar que el usuario solo ingrese numeros enteros
                        System.out.print("Entrada inválida. Ingrese un número: ");
                        sc.next();
                    }
                    int opcion = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer
                    return opcion;
                }
            
            //Registrar cliente
            static String registrarCliente() {
                System.out.println("===== REGISTRO DE CLIENTE =====");
                System.out.print("Ingrese nombre: ");
                return sc.nextLine();
            }

            // Menú tamaños de pizza
            static int menuTamaños() {
                System.out.println("===== MENU DE PIZZAS =====");
                System.out.println("Tamaños:");
                System.out.println("1. Pizzeta (20cm diámetro)");
                System.out.println("2. Personal (25cm diámetro)");
                System.out.println("3. Pequeña (30cm diámetro)");
                System.out.println("4. Mediana (35cm diámetro)");
                System.out.println("5. Grande (40cm diámetro)");
                System.out.println("6. Jumbo (50cm diámetro)");
                System.out.print("Seleccione el numero de tamaño: ");
                while (!sc.hasNextInt()) {
                    System.out.print("Entrada inválida: ");
                    sc.next();
                }
                int op = sc.nextInt();
                sc.nextLine();
                return op;
            }

        //El precio de cada tamaño
        static double proporcionTamaño(int opcionTamaños) {
        switch (opcionTamaños) {
            case 1: return 0.3265;
            case 2: return 0.51;
            case 3: return 0.7347;
            case 4: return 1.0;
            case 5: return 1.306;
            case 6: return 2.0408;
            default:
                System.out.println("Opcion no valida. Se asigna Mediana por defecto.");
                return 1.0;
            }
        }

        //El nombre para que aparesca en el ticket
        static String nombreTamaño(int opcionTamaños) {
            switch (opcionTamaños) {
                case 1: return "Pizzeta (20cm diámetro)";
                case 2: return "Personal (25cm diámetro)";
                case 3: return "Pequeña (30cm diámetro)";
                case 4: return "Mediana (35cm diámetro)";
                case 5: return "Grande (40cm diámetro)";
                case 6: return "Jumbo (50cm diámetro)";
                default: return "Mediana (35cm diámetro)";
            }
        }

        //la cantidad de pizza
        static int pedirCantidadPizza() {
            System.out.print("¿Cuántas pizzas?: ");
            while (!sc.hasNextInt()) {
                System.out.print("Ingrese un número válido: ");
                sc.next();
            }
            int cantidad = sc.nextInt();
            sc.nextLine();
            while (cantidad <= 0) {
                System.out.print("Debe ser al menos 1. Intenta de nuevo: ");
                cantidad = sc.nextInt();
                sc.nextLine();
            }
            return cantidad;
        }

        //menu de sabores de pizza
        static int menuSaborPizza() {
            System.out.println("Sabores de Pizza:");
            System.out.println("1. Pepperoni");
            System.out.println("2. Hawaiana");
            System.out.println("3. Al pastor");
            System.out.println("4. Cuatro quesos");
            System.out.println("5. Mexicana");
            System.out.println("6. BBQ Chicken");
            System.out.println("7. Especial de la Casa");
            System.out.print("Seleccione el sabor de la pizza: ");
            while (!sc.hasNextInt()) {
                System.out.print("Entrada inválida: ");
                sc.next();
            }
            int op = sc.nextInt();
            sc.nextLine();
            return op;
        }

        //el precio de cada sabor de pizza
        static double saborPrecio(int opcionPizzas) {
        switch (opcionPizzas) {
            case 1: return 100;
            case 2: return 500;
            case 3: return 133;
            case 4: return 125;
            case 5: return 139;
            case 6: return 146;
            case 7: return 149;
            default:
                System.out.println("Sabor no encontrado. Se asigna Pepperoni por defecto.");
                return 100;
        }
    }

        //el nombre de la pizza en el ticket
        static String nombreSabor(int opcionPizzas) {
            switch (opcionPizzas) {
                case 1: return "Pepperoni";
                case 2: return "Hawaiana";
                case 3: return "Al pastor";
                case 4: return "Cuatro quesos";
                case 5: return "Mexicana";
                case 6: return "BBQ Chicken";
                case 7: return "Especial de la Casa";
                default: return "Pepperoni";
            }
        }

    //menu de bebidas
    static int menuBebida() {
        System.out.println("Bebidas:");
        System.out.println("1. De sabor");
        System.out.println("2. Coca Cola");
        System.out.println("3. Agua");
        System.out.print("Seleccione una bebida: ");
        while (!sc.hasNextInt()) {
            System.out.print("Entrada inválida: ");
            sc.next();
        }
        int op = sc.nextInt();
        sc.nextLine();
        return op;
    }

    //el nombre que aparece en el ticket
    static String nombreBebida(int opcionBebida) {
        switch (opcionBebida) {
            case 1: return "De sabor";
            case 2: return "Coca Cola";
            case 3: return "Agua";
            default: return "No disponible";
        }
    }

    //menu de tamaños de bebida
    static int menuTamañoBebida() {
        System.out.println("Tamaños de bebida:");
        System.out.println("1. 600 ml");
        System.out.println("2. 2 L");
        System.out.print("Seleccione tamaño: ");
        while (!sc.hasNextInt()) {
            System.out.print("Entrada inválida: ");
            sc.next();
        }
        int op = sc.nextInt();
        sc.nextLine();
        return op;
    }

    //el precio de la bebida
    static double valorBebida(int tamañoBebida) {
        switch (tamañoBebida) {
            case 1: return 12;
            case 2: return 40;
            default: return 0;
        }
    }

    //el tamaño que se ve en el ticket
    static String tipodeBebida(int tamañoBebida) {
        switch (tamañoBebida) {
            case 1: return "600ml";
            case 2: return "2L";
            default: return "N/A";
        }
    }

    //cantidad de bebidas
    static int pedirCantidadBebida() {
        System.out.print("¿Cuantas bebidas?: ");
        while (!sc.hasNextInt()) {
            System.out.print("Ingrese número válido: ");
            sc.next();
        }
        int cantidad = sc.nextInt();
        sc.nextLine();
        return cantidad;
    }

    //menu de extras
    static int menuExtras() {
        System.out.println("Extras:");
        System.out.println("1. Pan de ajo");
        System.out.println("2. Dedos de queso");
        System.out.print("Seleccione un extra: ");
        while (!sc.hasNextInt()) {
            System.out.print("Entrada inválida: ");
            sc.next();
        }
        int op = sc.nextInt();
        sc.nextLine();
        return op;
    }

    //el nombre que se muestra en el titulo
        public static String nombreExtras(int opcionExtras) {
        switch (opcionExtras) {
            case 1: return "Pan de ajo";
            case 2: return "Dedos de queso";
            default: return "No disponible";
        }
    }

    //precio de los extras
    static double valorExtra(int opcionExtras) {
        switch (opcionExtras) {
            case 1: return 31;
            case 2: return 39;
            default: return 0;
        }
    }

    //cantidad de extras
    static int pedirCantidadExtras() {
        System.out.print("¿Cuantos extras?: ");
        while (!sc.hasNextInt()) {
            System.out.print("Ingrese número válido: ");
            sc.next();
        }
        int cantidad = sc.nextInt();
        sc.nextLine();
        return cantidad;
    }

//Funciones de Pablo
    public static double calcularPrecioPizza(double precioSabor, double tamañoProporcional) {
        return precioSabor * tamañoProporcional;
    }
    
    public static double calcularSubtotal(double cantidadP, double precioP, double cantidadB, double precioBebida, double cantidadE, double precioExtras) {
        return (cantidadP * precioP) + (cantidadB * precioBebida) + (cantidadE * precioExtras);
    }




















    static void Ticket(String nombre, String sabor, String tipoTamaño, double precioP, int cantidadP, int agregarBebida, String saborBebida, String tipoBebida, double precioBebida, int cantidadB, int agregarExtras, String saborExtras, double precioExtras, int cantidadE, double sub, double montoDescuento, double ivaMonto, double total) {
        
        // Códigos ANSI para dar color y estilo en la consola
        final String RESET = "\u001B[0m";
        final String BOLD = "\u001B[1m";
        final String CYAN = "\u001B[36m";
        final String GREEN = "\u001B[32m";
        final String YELLOW = "\u001B[33m";
        final String PURPLE = "\u001B[35m";
        final String WHITE = "\u001B[37m";

        System.out.println(CYAN + BOLD + "\n==================================================");
        System.out.println("  ____  _              ____         __ _   ");
        System.out.println(" |  _ \\(_)__________ _/ ___|  ___  / _| |_ ");
        System.out.println(" | |_) | |_  /_  / _` \\___ \\ / _ \\| |_| __|");
        System.out.println(" |  __/| |/ / / / (_| |___) | (_) |  _| |_ ");
        System.out.println(" |_|   |_/__/___\\__,_|____/ \\___/|_|  \\__| ");
        System.out.println("         S I S T E M A  D E  V E N T A S    ");
        System.out.println("==================================================" + RESET);
        
        System.out.println(YELLOW + " Cliente: " + RESET + (nombre.isEmpty() ? "Mostrador" : nombre));
        System.out.println(CYAN + "--------------------------------------------------" + RESET);
        System.out.println(BOLD + " DETALLE DE CONSUMO:" + RESET);
        
        // Detalle de la Pizza
        System.out.println(" • Pizza: " + sabor + " " + tipoTamaño);
        System.out.println("   Cant: " + cantidadP + " | P.Unit: $" + String.format("%.2f", precioP));
        
        // Detalle de Bebida (Si se agregó)
        if (agregarBebida == 1) {
            System.out.println(" • Bebida: " + saborBebida + " (" + tipoBebida + ")");
            System.out.println("   Cant: " + cantidadB + " | P.Unit: $" + String.format("%.2f", precioBebida));
        }
        
        // Detalle de Extras (Si se agregó)
        if (agregarExtras == 1) {
            System.out.println(" • Extra: " + saborExtras);
            System.out.println("   Cant: " + cantidadE + " | P.Unit: $" + String.format("%.2f", precioExtras));
        }
        
        System.out.println(CYAN + "--------------------------------------------------" + RESET);
        System.out.println(WHITE + " Subtotal:          $" + String.format("%.2f", sub) + RESET);
        System.out.println(PURPLE + " Descuento:        -$" + String.format("%.2f", montoDescuento) + RESET);
        System.out.println(WHITE + " IVA (16%):         $" + String.format("%.2f", ivaMonto) + RESET);
        System.out.println(CYAN + "==================================================" + RESET);
        System.out.println(GREEN + BOLD + " TOTAL A PAGAR:     $" + String.format("%.2f", total) + RESET);
        System.out.println(CYAN + "==================================================" + RESET);
        System.out.println(YELLOW + "       ¡Gracias por su compra en Pizza Soft!      " + RESET);
        System.out.println(CYAN + "==================================================\n" + RESET);
    }
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
        }while (opcionMenu != 3);



    //no borrar esto
        sc.close() ;
        }


}