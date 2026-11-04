Algoritmo Pizzeria
	Definir opcionMenu, opcionTamaños, cantidadPizza, opcionPizzas, agregarBebida, opcionBebida, tamañoBebida, cantidadBebida, agregarExtras, opcionExtras, cantidadExtras como Entero
	Definir nombre, tipoTamaño, saborPizza, saborBebida, tipoBebida, saborExtras como Cadena
	Definir tamañoProporcional, precioSabor, precioPizza, precioBebida, precioExtras, subtotal, descuento, iva, total como Real

	// Inicializar variables opcionales para evitar errores si no se compran extras o bebidas
	cantidadBebida <- 0
	precioBebida <- 0
	saborBebida <- "Ninguna"
	tipoBebida <- "Ninguno"
	cantidadExtras <- 0
	precioExtras <- 0
	saborExtras <- "Ninguno"
	nombre <- "Mostrador"
	
	Repetir
		Mostrar "====================================="
		Mostrar "Pizza Soft by BlueOcean - Menú"
		Mostrar "1. Registrar cliente"
		Mostrar "2. Realizar pedido"
		Mostrar "3. Salir"
		Mostrar "Seleccione una opcion:"
		Leer opcionMenu

		Segun opcionMenu
			Caso 1:
				Mostrar "===== REGISTRO DE CLIENTE ====="
				Mostrar "Ingrese nombre:"
				Leer nombre
				
			Caso 2: 
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
					
				Mostrar "¿Cuántas pizzas?"
				Leer cantidadPizza
				
				// Unificamos la asignación de proporción y texto para evitar duplicar el Segun
				Segun opcionTamaños 
					Caso 1: 
						tamañoProporcional <- 0.3265
						tipoTamaño <- "Pizzeta (20cm diámetro)"
					Caso 2: 
						tamañoProporcional <- 0.51
						tipoTamaño <- "Personal (25cm diámetro)"
					Caso 3: 
						tamañoProporcional <- 0.7347
						tipoTamaño <- "Pequeña (30cm diámetro)"
					Caso 4: 
						tamañoProporcional <- 1
						tipoTamaño <- "Mediana (35cm diámetro)"
					Caso 5: 
						tamañoProporcional <- 1.306
						tipoTamaño <- "Grande (40cm diámetro)"	
					Caso 6: 
						tamañoProporcional <- 2.0408
						tipoTamaño <- "Jumbo (50cm diámetro)"
					De Otro Modo: 
						Mostrar "Opcion no valida"
						tamañoProporcional <- 1
						tipoTamaño <- "Desconocido"
				FinSegun
				
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
				
				// Unificamos sabor y precio en un solo bloque Segun con su respectivo De Otro Modo
				Segun opcionPizzas
					Caso 1:
						saborPizza <- "Pepperoni"
						precioSabor <- 100
					Caso 2:
						saborPizza <- "Hawaiana"
						precioSabor <- 500
					Caso 3:
						saborPizza <- "Al pastor"
						precioSabor <- 133
					Caso 4:
						saborPizza <- "Cuatro quesos"
						precioSabor <- 125
					Caso 5:
						saborPizza <- "Mexicana"
						precioSabor <- 139
					Caso 6:
						saborPizza <- "BBQ Chicken"
						precioSabor <- 146
					Caso 7:
						saborPizza <- "Especial de la Casa"
						precioSabor <- 149
					De Otro Modo: 
						Mostrar "No se encontro el sabor"
						saborPizza <- "Desconocido"
						precioSabor <- 0
				FinSegun
				
				// Bebidas
				Mostrar "¿Desea agregar bebidas? (Escriba 1 para Sí, otro número para No):"
				Leer agregarBebida
				Si (agregarBebida == 1) Entonces
					Mostrar "Bebidas:"
					Mostrar "1. De sabor"
					Mostrar "2. Coca Cola"
					Mostrar "3. Agua"
					Mostrar "Seleccione una bebida:"
					Leer opcionBebida
					
					Segun opcionBebida
						Caso 1: saborBebida <- "De sabor"
						Caso 2: saborBebida <- "Coca Cola"
						Caso 3: saborBebida <- "Agua"
						De Otro Modo: saborBebida <- "No disponible"
					FinSegun
					
					Mostrar "Tamaños de bebida:"
					Mostrar "1. 600 ml"
					Mostrar "2. 2 L"
					Leer tamañoBebida
					
					Segun tamañoBebida
						Caso 1: 
							precioBebida <- 12
							tipoBebida <- "600ml"
						Caso 2: 
							precioBebida <- 40
							tipoBebida <- "2L"
						De Otro Modo: 
							Mostrar "No disponible"
							precioBebida <- 0
							tipoBebida <- "N/A"
					FinSegun

					Mostrar "¿Cuantas bebidas?"
					Leer cantidadBebida
				FinSi
				
				// Extras
				Mostrar "¿Desea agregar extras? (Escriba 1 para Sí, otro número para No):"
				Leer agregarExtras
				
				Si (agregarExtras == 1) Entonces
					Mostrar "Extras:"
					Mostrar "1. Pan de ajo"
					Mostrar "2. Dedos de queso"
					Mostrar "Seleccione un extra:"
					Leer opcionExtras
					
					Segun opcionExtras
						Caso 1: 
							saborExtras <- "Pan de ajo"
							precioExtras <- 31
						Caso 2: 
							saborExtras <- "Dedos de queso"
							precioExtras <- 39
						De Otro Modo: 
							saborExtras <- "No disponible"
							precioExtras <- 0
					FinSegun
					
					Mostrar "¿Cuantos extras?"
					Leer cantidadExtras
				FinSi
					
				// Fórmulas matemáticas
				precioPizza <- precioSabor * tamañoProporcional
				subtotal <- (cantidadPizza * precioPizza) + (cantidadBebida * precioBebida) + (cantidadExtras * precioExtras)
				
				descuento <- 0.20
				iva <- 0.16
				
				Si cantidadPizza >= 2 Entonces
					total <- subtotal * (1 - descuento) * (1 + iva)
				SiNo
					total <- subtotal * (1 + iva)
				FinSi
				
				// Imprimir ticket de venta (Colocado aquí para que se imprima al terminar el pedido)
				Mostrar "====================================="
				Mostrar "  TICKET DE VENTA - PIZZA SOFT       "
				Mostrar "====================================="
				Mostrar "Cliente: ", nombre
				Mostrar "Pizza: ", saborPizza, " ", tipoTamaño, " - Unitario: $", precioPizza
				Mostrar "Cantidad de pizzas: ", cantidadPizza
				Si agregarBebida == 1 Entonces
					Mostrar "Bebida: ", saborBebida, " (", tipoBebida, ") - Unitario: $", precioBebida
					Mostrar "Cantidad de bebida: ", cantidadBebida
				FinSi
				Si agregarExtras == 1 Entonces
					Mostrar "Extra: ", saborExtras, " - Unitario: $", precioExtras
					Mostrar "Cantidad de extras: ", cantidadExtras
				FinSi
				Mostrar "-------------------------------------"
				Mostrar "Subtotal: $", subtotal
				Si cantidadPizza >= 2 Entonces
					Mostrar "Descuento aplicado: 20%"
				SiNo
					Mostrar "Descuento aplicado: $0.0"
				FinSi
				Mostrar "IVA (16% incluido/calculado)"
				Mostrar "Total a pagar: $", total
				Mostrar "====================================="
				
			Caso 3: 
				Mostrar "¡Gracias por usar el sistema de Pizza Soft!"
				
			De Otro Modo: 
				Mostrar "Opción no válida, intente de nuevo."
		FinSegun
	Hasta Que opcionMenu == 3
FinAlgoritmo
