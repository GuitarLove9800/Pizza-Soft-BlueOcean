 Algoritmo Pizzeria
Repetir
		Mostrar "Menu"
		Mostrar "1.Registrar cliente"
		Mostrar "2.Realizar pedido"
		Mostrar "3.Salir"
		Mostrar "Seleccione una opcion"
		Leer opcionMenu

		Segun opcionMenu
			Caso 1:
				Mostrar "Registrar cliente"
				Mostrar "Ingrese nombre"
				Leer nombre
			Caso 2: 
				MOSTRAR "MENU"
				//menu de tamaño de pizza
				Mostrar "Tamaños"
				Mostrar "1.	Pizzeta (20cm diámetro) = $32.65"
				Mostrar "2.	Personal (25cm diámetro) = $51"
				Mostrar "3.	Pequeña (30cm diámetro) = $73.47"
				Mostrar "4.	Mediana (35cm diámetro) = $100"
				Mostrar "5.	Grande (40cm diámetro) = $130.6"
				Mostrar "6.	Jumbo (50cm diámetro) = $204.08"
				Mostrar "Seleccione el numero de tamaño"
				Leer opcionTamaños
					
				//cantidad de pizzas
				Mostrar "¿Cuántas pizzas?"
				Leer cantidadPizza
				
				Segun opcionTamaños 
					Caso 1: precioPizza <- 32.65
					Caso 2: precioPizza <- 51
					Caso 3: precioPizza <- 73.47
					caso 4: precioPizza <- 100 
					Caso 5: precioPizza <- 130.6	
					caso 6: precioPizza <- 204.08
					Defecto: Mostrar "Opcion no valida"
				FinSegun
				
				Segun opcionTamaños 
					Caso 1: tipoTamaño <- "Pizzeta (20cm diámetro)"
					Caso 2: tipoTamaño <- "Personal (25cm diámetro)"
					Caso 3: tipoTamaño <- "Pequeña (30cm diámetro)"
					caso 4: tipoTamaño <- "Mediana (35cm diámetro)"
					Caso 5: tipoTamaño <- "Grande (40cm diámetro)"	
					caso 6: tipoTamaño <- "Jumbo (50cm diámetro)"
					Defecto: Mostrar "Opcion no valida"
				FinSegun
				
				//menu de sabor de pizza
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
				
				Segun opcionPizzas
					Caso 1:saborPizza<- "Pepperoni."
					Caso 2:saborPizza<- "Hawaiana."
					Caso 3:saborPizza<- "Al pastor."
					Caso 4:saborPizza<- "Cuatro quesos."
					Caso 5:saborPizza<- "Mexicana."
					Caso 6:saborPizza<- "BBQ Chicken."
					Caso 7:saborPizza<- "Especial de la Casa."
					Defecto: MOSTRAR "No se encontro el sabor"	
				FinSegun
				
				//Bebidas
				Mostrar "¿Desea agregar bebidas?, Escriba 1"
				Leer agregarBebida
				Si (agregarBebida == 1) Entonces
					//Menu de bebidas
					Mostrar "Bebidas"
					Mostrar "1.	De sabor"
					MOSTRAR "2.	Coca Cola"
					MOSTRAR "3.	Agua"
					Mostrar "Seleccione una bebida"
					Leer opcionBebida
					
					Segun opcionBebida
						Caso 1:saborBebida<- "De sabor"
						Caso 2:saborBebida<- "Coca Cola"
						Caso 3:saborBebida<- "Agua"
						Defecto: Mostrar "No disponible"
					FinSegun
					
					Mostrar "Tamaños de bebida"
					Mostrar "1.	600 ml"
					Mostrar "2. 2 L"
					Leer tamañoBebida
					
					Segun TamañoBebida
						Caso 1:precioBebida<- 12
						Caso 2:precioBebida<- 40
						Defecto: Mostrar "No disponible"
					FinSegun

					Mostrar "¿Cuantas bebidas?"
					Leer cantidadBebida
					
				FinSi
				
				// Extras
				Mostrar "¿Desea agregar extras?, Escriba 1"
				Leer agregarExtras
				
				Si (agregarExtras == 1) Entonces
					//Menu de extras
					Mostrar "Extras"
					Mostrar "1.	Pan de ajo"
					MOSTRAR "2.	Dedos de queso"
					Mostrar "Seleccione una bebida"
					Leer opcionExtras
					
					Segun opcionExtras
						Caso 1:saborExtras<- "Pan de ajo"
						Caso 2:saborExtras<- "Dedos de queso"
						Defecto: Mostrar "No disponible"
					FinSegun
					
					Segun opcionExtras
						Caso 1:precioExtras<- 31
						Caso 2:precioExtras<- 39
						Defecto: Mostrar "No disponible"
					FinSegun
					
					Mostrar "¿Cuantos?"
					Leer cantidadExtras
				FinSi
					
				//formulas
				subtotal<- cantidadPizza*precioPizza + cantidadBebida*precioBebida + cantidadExtras*precioExtras
				Mostrar "Llevas $" subtotal
				
				descuento = .20
				iva = .16
				
				Si cantidadPizza >= 2 Entonces
					total = subtotal*(1-descuento)*(1+iva )
				SiNo
					total = subtotal*(1+iva)
				FinSi
				
				
				Caso 3: Mostrar "Gracias por usar el sistema"
			Defecto: Mostrar "Opcion no valida"
		FinSegun
Hasta que opcionMenu == 3
	
	//Imprimir ticket
	Mostrar "Pizza Soft by BlueOcean-Sistema de Ventas para una Pizzería"
	Mostrar "Nombre del cliente " nombre
	Mostrar "Pizza " saborPizza, tipoTamaño," $" precioPizza
	Mostrar "Numero de pizzas " cantidadPizza
	Mostrar "Bebida " saborBebida, tamañoBebida, " $" precioBebida
	Mostrar "Cantidad de bebida " cantidadBebida
	Mostrar "Extras " saborExtras, " $" precioExtras
	Mostrar "Numero de extras " cantidadExtras
	Mostrar "Subtotal $" subtotal
	Mostrar "Descuento " descuento
	Mostrar "IVA " iva
	Mostrar "Total $" total

FinAlgoritmo
