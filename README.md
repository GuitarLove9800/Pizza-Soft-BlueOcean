# Desarrollo del proyecto
**Equipo 2:** Pablo Antonio Duarte, Emmanuel Alexander Poot, Isabella Medina 

## Fase 1. Análisis y planeación del proyecto.

### 1.1 Nombre
**Pizza Soft by BlueOcean** - Sistema de Ventas para una Pizzería

### 1.2 Descripción del problema
Una pizzería hace pedidos en el mostrador. Al momento de registrar los pedidos se realizan de forma manual, lo que ocasiona inconsistencias en los cobros de los pedidos o se confunden las órdenes.

Se desea registrar los pedidos; seleccionando los productos: tamaños, pizzas, extras, bebidas y las cantidades de cada uno, para saber cuánto calcular de monto final.

### 1.3 Objetivo
Desarrollar un programa que permita tomar pedidos en una pizzería, calcular los descuentos, IVA y generar un ticket de compra.

### 1.4 Módulos / Función

| Módulo | Función |
| :--- | :--- |
| **Inicio** | Menú de Inicio, Bienvenida, ¿Desea Iniciar el Programa?, Menú Principal: Iniciar pedido |
| **Cliente** | Registrar los datos de cliente: Folio de Servicio, Nombre de cliente |
| **Menú** | Mostrar el menú de la pizzería: Tamaño, Pizzas, Bebidas, Extras |
| **Proceso Principal** | Registrar los productos agregados por el cliente. |
| **Cálculos** | Obtener subtotal, descuentos, extras, IVA, total a pagar |
| **Reporte** | Mostrar el ticket |

### 1.5 Entradas del sistema
* Nombre del cliente.
* Tipo de Pizza
* Tamaño de Pizza
* Tipo de Bebida
* Tamaño de Bebida
* Extras
* Cantidad de pizzas
* Cantidad de bebidas
* Cantidad de extras

### 1.6 Procesos del sistema
1. Iniciar programa
2. Iniciar pedido
3. Registrar Nombre
4. Guardar productos seleccionados
5. Calcular subtotal
6. Calcular si aplica promoción (descuento): Si se piden 3 pizzas o más.
7. Calcular IVA
8. Obtener el total de la compra
9. Preparar información del comprobante

### 1.7 Salidas del sistema
* Folio de pedido
* Nombre del cliente
* Productos seleccionados 
* Subtotal
* Descuento (si se aplica o no)
* Impuesto IVA
* Total a pagar
* Ticket o comprobante

### 1.8 Variables Principales

| Variable | Tipo de Dato | Descripción |
| :--- | :--- | :--- |
| `folioServicio` | int | Numero de servicio realizado |
| `clientName` | String | Nombre del cliente |
| `opcionMenu` | int | Opción seleccionada para navegar por el menú |
| `continuarPedido` | int | Decide si agregar mas productos a los bucles |
| `typePizza` | String | Tipo de pizza |
| `sizePizza` | String | Tamaño de Pizza |
| `cantPizza` | int | Cantidad de unidades solicitadas de una pizza específica |
| `precioUnitarioPizza` | double | Precio individual asignado a la pizza según su tamaño y especialidad |
| `totalPizzasAcomuladas` | int | Contador total de pizzas compradas |
| `typeDrink` | String | Nombre de la bebida seleccionada |
| `sizeDrink` | String | Presentación o tamaño de la bebida seleccionada |
| `cantBebidas` | int | Cantidad de bebidas compradas |
| `precioUnitarioBebida` | double | Precio Individual |
| `typeExtra` | String | Nombre del producto complementario |
| `cantExtra` | String | Cantidad de unidades seleccionadas de un extra |
| `precioUnitarioExtra` | double | Precio individual asignado |
| `subtotal` | double | Acumulador monetario de la suma de los productos |
| `porcentajeDescuento` | double | Porcentaje de descuento aplicable |
| `descuento` | double | Monto en pesos descontado |
| `TASA_IVA` | Final double | Constante del impuesto |
| `iva` | double | Monto en dinero del impuesto |
| `totalPagar` | double | Importe final |

### 1.9 Algoritmo General del sistema
```text
INICIO
    Mostrar menú de inicio 
    Mostrar menú principal
    Solicitar datos del cliente
    Mostrar menú de proceso
    Tomar pedido
    Registrar la cantidad de cada producto
    Calcular el subtotal de pedido
    Aplicar descuento
    Calcular IVA
    Tener el total de la compra
    Mostrar resumen de pedido
    Generar ticket de compra
FIN
```

### 1.10 Diseño básico de menú y de comprobante en consola

#### Menú de inicio 
```text
-------------------------------------------------

| Bienvenido al sistema de inicio de Pizza Soft |
| ¿Desea iniciar programa? Presione “1”         |
-------------------------------------------------
```

#### Menú principal
```text
---------------------------

| Pizza Soft by BlueOcean |
| 1. Registrar cliente    |
| 2. Realizar pedido      |
| 3. Salir                |
---------------------------
```

#### Menú de Proceso: Nuevo pedido

**Cantidad de pizzas:**

* **Tamaños:**
  * Pizzeta (20cm diámetro) = 32.65%
  * Personal (25cm diámetro) = 51%
  * Pequeña (30cm diámetro) = 73.47%
  * Mediana (35cm diámetro) = 100%
  * Grande (40cm diámetro) = 130.6%
  * Jumbo (50cm diámetro) = 204.08%

* **Pizzas:**
  * **Pepperoni = \$100** (Salsa de tomate, queso mozzarella, pepperoni)
  * **Hawaiana = \$500** (Salsa de tomate, queso mozzarella, jamón, piña)
  * **Al pastor = \$133** (Salsa de tomate, queso mozzarella, carne al pastor)
  * **Cuatro quesos = \$125** (Mozzarella, manchego, parmesano, queso azul)
  * **Mexicana = \$139** (Salsa de tomate, queso mozzarella, chorizo, jalapeño, cebolla)
  * **BBQ Chicken = \$146** (Salsa BBQ, mozzarella, pollo, cebolla)
  * **Especial de la Casa = \$149** (Salsa de tomate, mozzarella, pepperoni, jamón, tocino, champiñones, pimiento)

**Cantidad de bebidas:**

| Bebida | Tamaño / Precio |
| :--- | :--- |
| De sabor, Coca Cola, Agua | 600 ml = \$12 <br> 2 L = \$40 |

**Extras:**
* Pan de ajo = \$31
* Dedos de queso = \$39

*Seleccione una opción:*

#### Ejemplo del ticket o comprobante
```text
========================================================================
                        Pizza Soft by BlueOcean
Folio de pedido: 24             Nombre del cliente: Amairani Pechuga de Pollo
------------------------------------------------------------------------
-Pizza_Pepperoni_Pequeña....................\$00.00
-Agua_2L....................................\$00.00
------------------------------------------------------------------------
Extra: 
-Dedos de queso.............................\$00.00
------------------------------------------------------------------------
Subtotal: ..................................\$00.00
Descuento: .................................\$00.00
IVA: .......................................\$00.00
Total: .....................................\$00.00
                                                 ¡Gracias por su compra!
========================================================================
```