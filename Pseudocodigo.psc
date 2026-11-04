// ==========================================
// FUNCIONES Y SUBPROCESOS (Nombres corregidos)
// ==========================================

Funcion opcionMenu <- menuPrincipal
	Mostrar "====================================="
	Mostrar "Pizza Soft by BlueOcean - Menú"
	Mostrar "1. Registrar cliente"
	Mostrar "2. Realizar pedido"
	Mostrar "3. Salir"
	Mostrar "Seleccione una opcion:"
	Leer opcionMenu
FinFuncion

Funcion nombreCliente <- registrarCliente
	Mostrar "===== REGISTRO DE CLIENTE ====="
	Mostrar "Ingrese nombre:"
	Leer nombreCliente
FinFuncion

Funcion opcionTamaños <- menuTamaños
	Mostrar "===== MENU DE PIZZAS ====="
	Mostrar "Tamaños:"
	Mostrar "1. Pizzeta (20cm diámetro)"
	Mostrar "2. Personal (25cm diámetro)"
	Mostrar "3. Pequeña (30cm diámetro)"
	Mostrar "4. Mediana (35cm diámetro)"
	Mostrar "5. Grande (40cm diámetro)"
	Mostrar "6. Jumbo (50cm diámetro)"
	Mostrar "Seleccione el numero de tamaño:"
	Leer opcionTamaños
FinFuncion

Funcion tamañoProporcional <- proporcionTamaño(opcionTamaños)
	Segun opcionTamaños
		Caso 1: tamañoProporcional <- 0.3265
		Caso 2: tamañoProporcional <- 0.51
		Caso 3: tamañoProporcional <- 0.7347
		Caso 4: tamañoProporcional <- 1
		Caso 5: tamañoProporcional <- 1.306	
		Caso 6: tamañoProporcional <- 2.0408
		De Otro Modo: 
			Mostrar "Opcion no valida. Se asigna Mediana por defecto."
			tamañoProporcional <- 1
	FinSegun
FinFuncion

Funcion tipoTamaño <- nombreTamaño (opcionTamaños)
	Segun opcionTamaños 
		Caso 1: tipoTamaño <- "Pizzeta (20cm diámetro)"
		Caso 2: tipoTamaño <- "Personal (25cm diámetro)"
		Caso 3: tipoTamaño <- "Pequeña (30cm diámetro)"
		Caso 4: tipoTamaño <- "Mediana (35cm diámetro)"
		Caso 5: tipoTamaño <- "Grande (40cm diámetro)"	
		Caso 6: tipoTamaño <- "Jumbo (50cm diámetro)"
		De Otro Modo: tipoTamaño <- "Mediana (35cm diámetro)"
	FinSegun
FinFuncion

Funcion cantidadP <- pedirCantidadPizza
	Mostrar "¿Cuántas pizzas?"
	Leer cantidadP
	Mientras cantidadP <= 0 Hacer
		Mostrar "Debe ser al menos 1. Intenta de nuevo:"
		Leer cantidadP
	FinMientras
FinFuncion

Funcion opcionPizzas <- menuSaborPizza
	Mostrar "Sabores de Pizza:"
	Mostrar "1. Pepperoni"
	Mostrar "2. Hawaiana"
	Mostrar "3. Al pastor"
	Mostrar "4. Cuatro quesos"
	Mostrar "5. Mexicana"
	Mostrar "6. BBQ Chicken"
	Mostrar "7. Especial de la Casa"
	Mostrar "Seleccione el sabor de la pizza:"
	Leer opcionPizzas
FinFuncion

Funcion precioSabor <- saborPrecio (opcionPizzas)
	Segun opcionPizzas
		Caso 1: precioSabor <- 100
		Caso 2: precioSabor <- 500
		Caso 3: precioSabor <- 133
		Caso 4: precioSabor <- 125
		Caso 5: precioSabor <- 139
		Caso 6: precioSabor <- 146
		Caso 7: precioSabor <- 149
		De Otro Modo: 
			Mostrar "Sabor no encontrado. Se asigna Pepperoni por defecto."
			precioSabor <- 100
	FinSegun
FinFuncion

Funcion sabor <- nombreSabor (opcionPizzas)
	Segun opcionPizzas
		Caso 1: sabor <- "Pepperoni"
		Caso 2: sabor <- "Hawaiana"
		Caso 3: sabor <- "Al pastor"
		Caso 4: sabor <- "Cuatro quesos"
		Caso 5: sabor <- "Mexicana"
		Caso 6: sabor <- "BBQ Chicken"
		Caso 7: sabor <- "Especial de la Casa"
		De Otro Modo: sabor <- "Pepperoni"
	FinSegun
FinFuncion

Funcion opcionBebida <- menuBebida
	Mostrar "Bebidas:"
	Mostrar "1. De sabor"
	Mostrar "2. Coca Cola"
	Mostrar "3. Agua"
	Mostrar "Seleccione una bebida:"
	Leer opcionBebida
FinFuncion

Funcion saborBebida <- nombreBebida(opcionBebida)
	Segun opcionBebida
		Caso 1: saborBebida <- "De sabor"
		Caso 2: saborBebida <- "Coca Cola"
		Caso 3: saborBebida <- "Agua"
		De Otro Modo: saborBebida <- "No disponible"
	FinSegun
FinFuncion

Funcion tamañoBebida <- menuTamañoBebida
	Mostrar "Tamaños de bebida:"
	Mostrar "1. 600 ml"
	Mostrar "2. 2 L"
	Leer tamañoBebida
FinFuncion

Funcion precioBebida <- valorBebida (tamañoBebida)
	Segun tamañoBebida
		Caso 1: precioBebida <- 12
		Caso 2: precioBebida <- 40
		De Otro Modo: precioBebida <- 0
	FinSegun
FinFuncion

Funcion tipoBebida <- tipodeBebida(tamañoBebida)
	Segun tamañoBebida
		Caso 1: tipoBebida <- "600ml"
		Caso 2: tipoBebida <- "2L"
		De Otro Modo: tipoBebida <- "N/A"
	FinSegun
FinFuncion

Funcion cantidadB <- pedirCantidadBebida
	Mostrar "¿Cuantas bebidas?"
	Leer cantidadB
FinFuncion

Funcion opcionExtras <- menuExtras
	Mostrar "Extras:"
	Mostrar "1. Pan de ajo"
	Mostrar "2. Dedos de queso"
	Mostrar "Seleccione un extra:"
	Leer opcionExtras
FinFuncion

Funcion saborExtras <- nombreExtras(opcionExtras)
	Segun opcionExtras
		Caso 1: saborExtras <- "Pan de ajo"
		Caso 2: saborExtras <- "Dedos de queso"
		De Otro Modo: saborExtras <- "No disponible"
	FinSegun
FinFuncion

Funcion precioExtras <- valorExtra(opcionExtras)
	Segun opcionExtras
		Caso 1: precioExtras <- 31
		Caso 2: precioExtras <- 39
		De Otro Modo: precioExtras <- 0
	FinSegun
FinFuncion

Funcion cantidadE <- pedirCantidadExtras
	Mostrar "¿Cuantos extras?"
	Leer cantidadE
FinFuncion

Funcion precioP <- calcularPrecioPizza(precioSabor, tamañoProporcional)
	precioP <- precioSabor * tamañoProporcional
FinFuncion

Funcion sub <- calcularSubtotal (cantidadP, precioP, cantidadB, precioBebida, cantidadE, precioExtras)
	sub <- (cantidadP * precioP) + (cantidadB * precioBebida) + (cantidadE * precioExtras)
FinFuncion

SubProceso Ticket(nombre, sabor, tipoTamaño, precioP, cantidadP, agregarBebida, saborBebida, tipoBebida, precioBebida, cantidadB, agregarExtras, saborExtras, precioExtras, cantidadE, sub, montoDescuento, ivaMonto, total)
	Mostrar "====================================="
	Mostrar "  TICKET DE VENTA - PIZZA SOFT       "
	Mostrar "====================================="
	Mostrar "Nombre del cliente: ", nombre
	Mostrar "Pizza: ", sabor, " ", tipoTamaño, " - Unitario: $", precioP
	Mostrar "Numero de pizzas: ", cantidadP
	Si agregarBebida == 1 Entonces
		Mostrar "Bebida: ", saborBebida, " (", tipoBebida, ") - Unitario: $", precioBebida
		Mostrar "Cantidad de bebida: ", cantidadB
	FinSi
	Si agregarExtras == 1 Entonces
		Mostrar "Extra: ", saborExtras, " - Unitario: $", precioExtras
		Mostrar "Numero de extras: ", cantidadE
	FinSi
	Mostrar "-------------------------------------"
	Mostrar "Subtotal: $", sub
	Mostrar "Descuento aplicado: $", montoDescuento
	Mostrar "IVA (16%): $", ivaMonto
	Mostrar "Total a pagar: $", total
	Mostrar "====================================="
FinSubProceso


// ==========================================
// ALGORITMO PRINCIPAL
// ==========================================
Algoritmo Pizzeria
	Definir opcionMenu, opcionTamaños, cantidadPizza, opcionPizzas, agregarBebida, opcionBebida, tamañoBebida, cantidadBebida, agregarExtras, opcionExtras, cantidadExtras como Entero
	Definir nombre, tipoTamaño, sabor, saborBebida, tipoBebida, saborExtras como Cadena
	Definir tamañoProporcional, precioSabor, precioP, precioBebida, precioExtras, sub, descuento, montoDescuento, ivaMonto, total como Real

	nombre <- "Mostrador"
	agregarBebida <- 0
	cantidadBebida <- 0
	precioBebida <- 0
	saborBebida <- "Ninguna"
	tipoBebida <- "Ninguno"
	
	agregarExtras <- 0
	cantidadExtras <- 0
	precioExtras <- 0
	saborExtras <- "Ninguno"

	Repetir
		opcionMenu <- menuPrincipal
		Segun opcionMenu
			Caso 1:
				nombre <- registrarCliente
				
			Caso 2: 
				opcionTamaños <- menuTamaños
				tamañoProporcional <- proporcionTamaño(opcionTamaños)
				tipoTamaño <- nombreTamaño (opcionTamaños)
				cantidadPizza <- pedirCantidadPizza
				
				opcionPizzas <- menuSaborPizza
				precioSabor <- saborPrecio (opcionPizzas)
				sabor <- nombreSabor (opcionPizzas)
				
				Mostrar "¿Desea agregar bebidas? (Escriba 1 para Sí, otro número para No):"
				Leer agregarBebida
				Si (agregarBebida == 1) Entonces
					opcionBebida <- menuBebida
					saborBebida <- nombreBebida(opcionBebida)
					tamañoBebida <- menuTamañoBebida
					precioBebida <- valorBebida (tamañoBebida)
					tipoBebida <- tipodeBebida(tamañoBebida)
					cantidadBebida <- pedirCantidadBebida
				FinSi
				
				Mostrar "¿Desea agregar extras? (Escriba 1 para Sí, otro número para No):"
				Leer agregarExtras
				Si (agregarExtras == 1) Entonces
					opcionExtras <- menuExtras
					saborExtras <- nombreExtras(opcionExtras)
					precioExtras <- valorExtra(opcionExtras)
					cantidadExtras <- pedirCantidadExtras
				FinSi
				
				precioP <- calcularPrecioPizza(precioSabor, tamañoProporcional)
				sub <- calcularSubtotal (cantidadPizza, precioP, cantidadBebida, precioBebida, cantidadExtras, precioExtras)
				
				descuento <- 0.20
				
				Si cantidadPizza >= 2 Entonces
					montoDescuento <- sub * descuento
				SiNo
					montoDescuento <- 0
				FinSi
				
				ivaMonto <- (sub - montoDescuento) * 0.16
				total <- (sub - montoDescuento) + ivaMonto
				
				Ticket(nombre, sabor, tipoTamaño, precioP, cantidadPizza, agregarBebida, saborBebida, tipoBebida, precioBebida, cantidadBebida, agregarExtras, saborExtras, precioExtras, cantidadExtras, sub, montoDescuento, ivaMonto, total)
				
			Caso 3: 
				Mostrar "¡Gracias por usar el sistema de Pizza Soft!"
				
			De Otro Modo: 
				Mostrar "Opción no válida, intente de nuevo."
		FinSegun
Hasta Que opcionMenu == 3
FinAlgoritmo