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
| Módulo | Función | Estado en Código |
| :--- | :--- | :--- |
| **Inicio** | Menú de Inicio, Bienvenida con Arte ASCII, Menú Principal | ✅ Implementado |
| **Cliente** | Registrar los datos del cliente (Nombre) | ✅ Implementado |
| **Menú** | Mostrar el menú de la pizzería: Tamaño, Pizzas, Bebidas, Extras | ✅ Implementado |
| **Proceso Principal** | Registrar los productos agregados por el cliente. | ✅ Implementado |
| **Cálculos** | Obtener subtotal, descuentos, extras, IVA, total a pagar | ✅ Implementado |
| **Reporte** | Mostrar el ticket estilizado con ANSI | ✅ Implementado |

---

### 1.5 Entradas del sistema
- Nombre del cliente.
- Tipo / Sabor de Pizza
- Tamaño de Pizza
- Tipo de Bebida
- Tamaño de Bebida
- Extras
- Cantidad de pizzas
- Cantidad de bebidas
- Cantidad de extras

### 1.6 Procesos del sistema
1. Mostrar bienvenida e iniciar programa
2. Desplegar Menú Principal
3. Registrar Nombre del cliente
4. Guardar productos seleccionados (Pizzas, Bebidas, Extras)
5. Calcular subtotal de consumo
6. Calcular si aplica promoción (descuento del 20% si pide 2 o más pizzas)
7. Calcular IVA (16%)
8. Obtener el total de la compra
9. Generar y mostrar Ticket de compra estilizado

### 1.7 Salidas del sistema
- Nombre del cliente
- Productos seleccionados 
- Subtotal
- Descuento aplicado
- Impuesto IVA (16%)
- Total a pagar
- Ticket o comprobante con formato ANSI y arte ASCII

---

### 1.8 Variables Principales y su Mapeo en Código

| Variable | Tipo de Dato | Descripción |
| :--- | :--- | :--- |
| `nombre` | String | Nombre del cliente registrado |
| `opcionMenu` | int | Opción seleccionada para navegar por el menú principal |
| `opcionTamaños` | int | Opción seleccionada del tamaño de pizza |
| `tamañoProporcional` | double | Factor multiplicador según el tamaño de pizza |
| `tipoTamaño` | String | Descripción del tamaño de pizza elegido |
| `cantidadPizza` | int | Cantidad de unidades de pizza solicitadas |
| `opcionPizzas` | int | Opción de sabor de pizza |
| `precioSabor` | double | Precio base del sabor de la pizza |
| `precioP` | double | Precio unitario final calculado de la pizza |
| `sabor` | String | Nombre del sabor de pizza elegido |
| `agregarBebida` | int | Bandera de control (1 para sí, otro número para no) |
| `opcionBebida` | int | Opción de tipo de bebida |
| `saborBebida` | String | Nombre de la bebida |
| `tamañoBebida` | int | Opción de tamaño de bebida (600ml / 2L) |
| `tipoBebida` | String | Descripción del tamaño de la bebida |
| `precioBebida` | double | Precio de la bebida seleccionada |
| `cantidadBebida` | int | Cantidad de bebidas |
| `agregarExtras` | int | Bandera de control para extras (1 para sí) |
| `opcionExtras` | int | Opción del extra seleccionado |
| `saborExtras` | String | Nombre del extra |
| `precioExtras` | double | Precio unitario del extra |
| `cantidadExtras` | int | Cantidad de extras solicitados |
| `sub` | double | Subtotal monetario de la suma de consumos |
| `descuento` | double | Porcentaje de descuento fijo (0.20) |
| `montoDescuento` | double | Monto en dinero descontado |
| `ivaMonto` | double | Monto en dinero del impuesto IVA (16%) |
| `total` | double | Importe final a pagar |

---

### 1.9 Algoritmo General del sistema
```text
INICIO

    Mostrar bienvenida y arte ASCII
    Bucle Principal (Do-While):
        Mostrar menú principal
        Si opción == 1 -> Registrar nombre del cliente
        Si opción == 2 -> 
            Seleccionar Tamaño y Cantidad de Pizza
            Seleccionar Sabor de Pizza
            Preguntar y registrar Bebidas (opcional)
            Preguntar y registrar Extras (opcional)
            Calcular Subtotal
            Evaluar Descuento (Si cantidad de pizzas >= 2)
            Calcular IVA (16%)
            Calcular Total
            Imprimir Ticket detallado
        Si opción == 3 -> Salir del sistema
FIN
```

### 1.10 Diseño actual de menú y de comprobante en consola

#### Menú principal (Actual)
```text
=====================================
═════════════════════════════════════════════
Pizza Soft by BlueOcean - Menú
 1 · Registrar CLiente 
 2 · Realizar Pedido
 3 · Salir 
· Seleccione un Opción · 
```

#### Ejemplo del ticket o comprobante (Actual)
```text
==================================================
   ____  _             ____         __ _    
  |  _ \(_)__________ _/ ___|  ___  / _| |_ 
  | |_) | |_  /_  / _` \___ \ / _ \| |_| __|
  |  __/| |/ / / / (_| |___) | (_) |  _| |_ 
  |_|   |_/__/___\\__,_|____/ \___/|_|  \__| 
         S I S T E M A   D E   V E N T A S     
==================================================
 Cliente: Mostrador
--------------------------------------------------
 DETALLE DE CONSUMO:
 • Pizza: Pepperoni Mediana (35cm diámetro)
   Cant: 1 | P.Unit: $100.00
--------------------------------------------------
 Subtotal:          $100.00
 Descuento:        -$0.00
 IVA (16%):         $16.00
==================================================
 TOTAL A PAGAR:     $116.00
==================================================
        ¡Gracias por su compra en Pizza Soft!      
==================================================