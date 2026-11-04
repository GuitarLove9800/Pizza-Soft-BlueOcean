	//Se muestra el menu principal
	Funcion opcionMenu <- menuPrincipal
		Mostrar "Menu"
		Mostrar "1.Registrar cliente"
		Mostrar "2.Realizar pedido"
		Mostrar "3.Salir"
		Mostrar "Seleccione una opcion"
		Leer opcionMenu
FinFuncion

//Se registra el cliente
Funcion nombre <- registrarCliente
	Mostrar "Registrar cliente"
	Mostrar "Ingrese nombre"
	Leer nombre
FinFuncion

//Tamaños de Pizza
Funcion opcionTamaños <- menuTamaños
	Mostrar "Tamaños"
	Mostrar "1. Pizzeta (20cm diámetro)"
	Mostrar "2. Personal (25cm diámetro)"
	Mostrar "3. Pequeña (30cm diámetro)"
	Mostrar "4. Mediana (35cm diámetro)"
	Mostrar "5. Grande (40cm diámetro)"
	Mostrar "6. Jumbo (50cm diámetro)"
	Mostrar "Seleccione el numero de tamaño"
	Leer opcionTamaños
FinFuncion

//valor de cada tamaño de pizza
Funcion tamañoProporcional <- proporcionTamaño(opcionTamaños)
	Segun opcionTamaños
		Caso 1: tamañoProporcional <- .3265
		Caso 2: tamañoProporcional <- .51
		Caso 3: tamañoProporcional <- .7347
		caso 4: tamañoProporcional <- 1
		Caso 5: tamañoProporcional <- 1.306	
		caso 6: tamañoProporcional <- 2.0408
		Defecto: Mostrar "Opcion no valida"
	FinSegun
FinFuncion

//Se muestra en el ticket que tamaño se escogio
Funcion tipoTamaño <- nombreTamaño (opcionTamaños)
	Segun opcionTamaños 
		Caso 1: tipoTamaño <- "Pizzeta (20cm diámetro)"
		Caso 2: tipoTamaño <- "Personal (25cm diámetro)"
		Caso 3: tipoTamaño <- "Pequeña (30cm diámetro)"
		caso 4: tipoTamaño <- "Mediana (35cm diámetro)"
		Caso 5: tipoTamaño <- "Grande (40cm diámetro)"	
		caso 6: tipoTamaño <- "Jumbo (50cm diámetro)"
		Defecto: Mostrar "Opcion no valida"
		FinSegun
FinFuncion

	//cantidad de pizzas
	Funcion cantidadP <- cantidadPizza
		Mostrar "¿Cuántas pizzas?"
		Leer cantidadP
	FinFuncion

	Funcion opcionPizzas<- saborPizza
		Mostrar "Pizzas"
		Mostrar "1. Pepperoni. Salsa de tomate, queso mozzarella, pepperoni"
		Mostrar "2. Hawaiana. Salsa de tomate, queso mozzarella, jamón, piña"
		Mostrar "3. Al pastor. Salsa de tomate, queso mozzarella, carne al pastor"
		Mostrar "4. Cuatro quesos. Mozzarella, manchego, parmesano, queso azul"
		Mostrar "5. Mexicana. Salsa de tomate, queso mozzarella, chorizo, jalapeño, cebolla"
		Mostrar "6. BBQ Chicken. Salsa BBQ, mozzarella, pollo, cebolla"
		Mostrar "7. Especial de la Casa. Salsa de tomate, mozzarella, pepperoni, jamón, tocino, champiñones, pimiento"
		Mostrar "Seleccione el sabor de la pizza"
		Leer opcionPizzas
	FinFuncion
	
	//Valor de cada sabor de pizza
	Funcion precioSabor <- saborPrecio (opcionPizzas)
		Segun opcionPizzas
			Caso 1:precioSabor<-100
			Caso 2:precioSabor<-500
			Caso 3:precioSabor<-133
			Caso 4:precioSabor<-125
			Caso 5:precioSabor<-139
			Caso 6:precioSabor<-146
			Caso 7:precioSabor<-149
		FinSegun
	FinFuncion
	
	//Se muestra en el ticket el sabor de pizza elegido
Funcion sabor<- nombreSabor (opcionPizzas)
	Segun opcionPizzas
		Caso 1:sabor<- "Pepperoni."
		Caso 2:sabor<- "Hawaiana."
		Caso 3:sabor<- "Al pastor."
		Caso 4:sabor<- "Cuatro quesos."
		Caso 5:sabor<- "Mexicana."
		Caso 6:sabor<- "BBQ Chicken."
		Caso 7:sabor<- "Especial de la Casa."
		Defecto: MOSTRAR "No se encontro el sabor"	
	FinSegun
FinFuncion

//Se muestra el menu de bebidas
Funcion opcionBebida <- menuBebida
	Mostrar "Bebidas"
	Mostrar "1.	De sabor"
	MOSTRAR "2.	Coca Cola"
	MOSTRAR "3.	Agua"
	Mostrar "Seleccione una bebida"
	Leer opcionBebida
FinFuncion

//Se muestra la bebida en el ticket
Funcion saborBebida <- nombreBebida(opcionBebida)
	Segun opcionBebida
		Caso 1:saborBebida<- "De sabor"
		Caso 2:saborBebida<- "Coca Cola"
		Caso 3:saborBebida<- "Agua"
		Defecto: Mostrar "No disponible"
	FinSegun
FinFuncion

//menu de tamaños de bebida
Funcion tamañoBebida <- menuTamañoBebida
	Mostrar "Tamaños de bebida"
	Mostrar "1.	600 ml"
	Mostrar "2. 2 L"
	Leer tamañoBebida
FinFuncion

//precio de bebidas
Funcion precioBebida <- valorBebida (tamañoBebida)
	Segun tamañoBebida
		Caso 1:precioBebida<- 12
		Caso 2:precioBebida<- 40
		Defecto: Mostrar "No disponible"
	FinSegun
FinFuncion

//tamaño de bebidas
Funcion tipoBebida <- tipodeBebida(tamañoBebida)
	Segun tamañoBebida
		Caso 1: tipoBebida<-"600ml"
		Caso 2: tipoBebida<-"2L"
	FinSegun
FinFuncion

//cantidad de bebidas
Funcion cantidadB <- cantidadBebida
	Mostrar "¿Cuantas bebidas?"
	Leer cantidadB
FinFuncion

//menu de los extras
Funcion opcionExtras <- menuExtras
	Mostrar "Extras"
	Mostrar "1.	Pan de ajo"
	MOSTRAR "2.	Dedos de queso"
	Mostrar "Seleccione una bebida"
	Leer opcionExtras
FinFuncion

//Se muestra en el ticket
Funcion saborExtras <- nombreExtras(opcionExtras)
	Segun opcionExtras
		Caso 1:saborExtras<- "Pan de ajo"
		Caso 2:saborExtras<- "Dedos de queso"
		Defecto: Mostrar "No disponible"
	FinSegun
FinFuncion

//precio de los extras
Funcion precioExtras <- valorExtra(opcionExtras)
	Segun opcionExtras
		Caso 1:precioExtras<- 31
		Caso 2:precioExtras<- 39
		Defecto: Mostrar "No disponible"
	FinSegun
FinFuncion

//cantidad de extras
Funcion cantidadE <- cantidadExtras
	Mostrar "¿Cuantos?"
	Leer cantidadE
FinFuncion

//precio de la pizza
Funcion precioP <- precioPizza(precioSabor, tamañoProporcional)
	precioP <- precioSabor*tamañoProporcional
FinFuncion

Funcion sub <- subtotal (cantidadP, precioP, cantidadB, precioBebida, cantidadE, precioExtras)
	sub <- cantidadP*precioP + cantidadB*precioBebida + cantidadE*precioExtras
FinFuncion

//Ticket (no devuelve nada, por eso es SubProceso)
SubProceso Ticket(nombre, sabor, tipoTamaño, precioP, cantidadP, saborBebida, tipoBebida, precioBebida, cantidadB, saborExtras, precioExtras, cantidadE, sub, descuento, iva, total)
	Mostrar "Pizza Soft by BlueOcean-Sistema de Ventas para una Pizzería"
	Mostrar "Nombre del cliente ", nombre
	Mostrar "Pizza ", sabor, " ", tipoTamaño, " $", precioP
	Mostrar "Numero de pizzas ", cantidadP
	Mostrar "Bebida ", saborBebida, " ", tipoBebida, " $", precioBebida
	Mostrar "Cantidad de bebida ", cantidadB
	Mostrar "Extras ", saborExtras, " $", precioExtras
	Mostrar "Numero de extras ", cantidadE
	Mostrar "Subtotal $", sub
	Mostrar "Descuento ", descuento
	Mostrar "IVA ", iva
	Mostrar "Total $", total
FinSubProceso

Algoritmo Pizzeria
Repetir
	opcionMenu <- menuPrincipal
	Segun opcionMenu
		Caso 1:
			nombre <- registrarCliente
		Caso 2: 
			// Pizza
			opcionTamaños <- menuTamaños
			tamañoProporcional <- proporcionTamaño(opcionTamaños)
			tipoTamaño <- nombreTamaño (opcionTamaños)
			cantidadP <- cantidadPizza
			
			opcionPizzas<- saborPizza
			precioSabor <- saborPrecio (opcionPizzas)
			sabor<- nombreSabor (opcionPizzas)
			
			//Bebidas
			Mostrar "¿Desea agregar bebidas?, Escriba 1"
			Leer agregarBebida
			Si (agregarBebida == 1) Entonces
				opcionBebida <- menuBebida
				saborBebida <- nombreBebida(opcionBebida)
				tamañoBebida <- menuTamañoBebida
				precioBebida <- valorBebida (tamañoBebida)
				tipoBebida <- tipodeBebida(tamañoBebida)
				cantidadB <- cantidadBebida
			FinSi
			
			// Extras
			Mostrar "¿Desea agregar extras?, Escriba 1"
			Leer agregarExtras
			Si (agregarExtras == 1) Entonces
				opcionExtras <- menuExtras
				saborExtras <- nombreExtras(opcionExtras)
				precioExtras <- valorExtra(opcionExtras)
				cantidadE <- cantidadExtras
			FinSi
			
			precioP <- precioPizza(precioSabor, tamañoProporcional)
			sub <- subtotal (cantidadP, precioP, cantidadB, precioBebida,  cantidadE, precioExtras)
			
			descuento = .20
			iva = .16
			
			Si cantidadP >= 2 Entonces
				total = sub*(1-descuento)*(1+iva )
			SiNo
				total = sub*(1+iva)
			FinSi
			
		Caso 3: Mostrar "Gracias por usar el sistema"
		Defecto: Mostrar "Opcion no valida"
	FinSegun
Hasta Que opcionMenu == 3
Ticket(nombre, sabor, tipoTamaño, precioP, cantidadP, saborBebida, tipoBebida, precioBebida, cantidadB, saborExtras, precioExtras, cantidadE, sub, descuento, iva, total)
FinAlgoritmo
