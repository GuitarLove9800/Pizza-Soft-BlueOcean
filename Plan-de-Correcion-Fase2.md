# 🍕 Plan de Corrección Fase 2 — Pizza Soft by BlueOcean

* **Proyecto:** Pizza Soft by BlueOcean (`GuitarLove9800/Pizza-Soft-BlueOcean`)
* **Equipo:** Emmanuel Poot, Isabella Medina y Pablo Duarte
* **Fecha de inicio:** Martes 24 de noviembre
* **Fecha límite de entrega (Corrección Fase 2):** **Viernes 27 de noviembre**
* **Hito de cierre:** Reunión en **Microsoft Teams** para realizar la **retrospectiva** de las correcciones de Fase 2 y organizar la arquitectura de la **Fase 3** (arreglos y archivos).

---

## 1. Reglas de Flujo de Trabajo y Repositorio (Git & GitHub)

Para atender la observación sobre el historial de Git y asegurar que cada integrante tenga autoría real y verificable en su propia parte del código:

1. **Estructura del proyecto:** Mover/organizar el proyecto dentro de la ruta solicitada `PF-Equipo2/src/` (manteniendo `pizzeria.java` limpio y actualizado, más la documentación correspondiente).
2. **Trabajo estrictamente por ramas individuales:**
   * `dev/emma` $\rightarrow$ Emmanuel Poot
   * `dev/Isa` $\rightarrow$ Isabella Medina
   * `dev/pablo` $\rightarrow$ Pablo Duarte
3. **Prohibido copiar/pegar código completo entre ramas o subir archivos enteros en un solo commit:** Cada integrante programa únicamente sus funciones asignadas desde cero o editando su módulo, haciendo **commits pequeños, descriptivos y frecuentes** conforme avanza cada tarea.
4. **Apoyo entre compañeros:** Si alguien termina antes, apoya explicando la lógica por llamada o chat, pero **no** programa la parte del compañero.
5. **Integración final (`Pull Request` / `git merge`):** Una vez que cada integrante pruebe su rama localmente, se abre un **Pull Request** hacia `main` (o una rama de integración `release/fase2`), se revisan conflictos en equipo y se fusiona antes de la reunión en Teams.

---

## 2. División Equitativa del Trabajo (3 Bloques)

La carga técnica y documental de las observaciones se divide en **3 módulos independientes** para minimizar conflictos al hacer `merge` y balancear la complejidad entre los tres integrantes.

---

### 👨‍💻 Bloque 1: Emmanuel Poot (`dev/emma`)
**Enfoque:** *Motor de entrada/validación global, refactorización del `main` y flujo de múltiples pizzas con ciclo `for`.*

#### Tareas técnicas a implementar:
1. **Crear la función universal de validación `leerEntero(int minimo, int maximo)`:**
   * Eliminar las **11 copias** repetidas de `while (!sc.hasNextInt())`, `nextInt()` y `nextLine()` distribuidas en el código.
   * La función debe mostrar un mensaje claro cuando se ingrese texto, `0`, números negativos o valores fuera de `[minimo, maximo]`, limpiando el buffer correctamente y repitiendo hasta recibir un dato válido.
   * Esto corrige automáticamente las cantidades negativas en bebidas/extras (`-2 panes de ajo`) y evita el cierre/salto del segundo `nextInt()` en `pedirCantidadPizza`.
2. **Eliminar asignaciones "por defecto" en las funciones de precios y nombres:**
   * Quitar los mensajes y valores por defecto (`"Se asigna Mediana por defecto"`, `"Pepperoni"` por defecto) dentro de las funciones de precio/nombre; las funciones de precio **solo deben calcular y devolver el valor numérico**, sin imprimir en consola.
3. **Implementar el ciclo `for` para capturar múltiples pizzas por pedido:**
   * Al pedir `N` pizzas en un mismo pedido, usar un ciclo `for (int i = 1; i <= cantidadPizzas; i++)` para preguntar el tamaño y sabor de cada pizza individualmente (preparando la lógica que en Fase 3 recorrerá arreglos).
4. **Sacar el flujo principal del `main` hacia `tomarPedido()` y reiniciar estado:**
   * Extraer la lógica del pedido fuera de `main` a una función dedicada `tomarPedido()`.
   * Garantizar que **todas las variables del pedido** (pizzas, bebidas, extras, subtotales, nombre de cliente si no se registró en la opción 1) se inicialicen/reinicien en `0` o `"Mostrador"` al iniciar cada nuevo pedido, corrigiendo el bug donde el segundo pedido cobraba cosas del primero o arrastraba el nombre del cliente anterior.
5. **Limpieza general de código:**
   * Eliminar comentarios basura generados por extensiones/IA (ej. *"¿Deberíamos cachear esta respuesta aquí?"*, *"TODO: implementar validación de token"*) y constantes/variables sin uso.

---

### 👩‍💻 Bloque 2: Isabella Medina (`dev/Isa`)
**Enfoque:** *Menús dinámicos sin duplicidad, estandarización de nombres de funciones/variables y actualización del documento Fase 1 + Pseudocódigo.*

#### Tareas técnicas a implementar:
1. **Eliminar menús duplicados e imprimir precios dinámicamente con `for`:**
   * Eliminar las listas hardcoded repetidas en `menuTamaños`, `menuSaborPizza`, `menuBebida` y `menuExtras`.
   * Construir los menús usando ciclos `for` que consulten directamente las funciones de nombre y precio (ej. `for (int i = 1; i <= 7; i++) System.out.println(i + ". " + obtenerNombreSabor(i) + " - $" + obtenerPrecioSabor(i));`).
   * Con esto se cumple el requisito pendiente de Fase 1: **mostrar siempre los precios en todos los menús** (tamaños, sabores, bebidas y extras) y evitar tener que editar dos lugares si cambia un nombre o precio.
2. **Corregir nombres de funciones y variables (Convenciones Java):**
   * Renombrar funciones para que inicien en **minúscula** y usen un **verbo** que describa exactamente lo que hacen o devuelven:
     * `menuTamaños()` $\rightarrow$ `elegirTamaño()` (y análogos `elegirSabor()`, `elegirBebida()`, `elegirExtra()`).
     * `tipodeBebida()` $\rightarrow$ `obtenerTamañoBebida()` (ya que devuelve `"600ml"` o `"2L"`).
     * Variables como `saborBebida` $\rightarrow$ `nombreBebida` y `saborExtras` $\rightarrow$ `nombreExtra`.
     * `Ticket(...)` $\rightarrow$ `imprimirTicket(...)`.
3. **Actualizar Pseudocódigo y Documento técnico (Sección Fase 1):**
   * Corregir en el documento la regla de la promoción para que coincida exactamente con el programa (**2 pizzas o más** vs **3 pizzas o más**).
   * Revisar y corregir el precio de la pizza **Hawaiana** ($500 en el documento frente al rango real de $100–$149).
   * Corregir la tabla de variables del documento: cambiar `cantExtra` de `String` a `int`, `Final double` a `final double` (minúsculas) y el error ortográfico `"Acomuladas"` a `"Acumuladas"`.
   * Actualizar el ticket de ejemplo de la página 9 del documento (quitar los `$00.00` y el nombre de la compañera del grupo, poniendo un caso real).
   * Mantener sincronizado `Pseudocodigo.psc` con los nuevos nombres de funciones.

---

### 👨‍💻 Bloque 3: Pablo Duarte (`dev/pablo`)
**Enfoque:** *Módulo financiero (cálculos, constantes, regla de promoción), modularización del Ticket y evidencias de ejecución.*

#### Tareas técnicas a implementar:
1. **Extraer los cálculos financieros del `main` y usar constantes (`static final`):**
   * Declarar a nivel de clase las constantes `static final double PORCENTAJE_DESCUENTO = 0.20;` y `static final double PORCENTAJE_IVA = 0.16;` (eliminando la reasignación repetida de `descuento = 0.20` en cada vuelta y el `0.16` suelto en el código).
   * Crear funciones específicas para los cálculos fuera del `main`: `calcularSubtotal(...)`, `calcularDescuento(...)`, `calcularIVA(...)` y `calcularTotal(...)`.
2. **Corregir tipos de datos y alcance de la promoción del 20 %:**
   * Cambiar los parámetros de cantidades en `calcularSubtotal(...)` de `double` a **`int`** (`cantidadPizzas`, `cantidadBebidas`, `cantidadExtras`), ya que son cantidades enteras en todo el sistema.
   * Ajustar la lógica de descuento para que el **20 % aplique únicamente sobre el subtotal de las pizzas** (cuando se pidan 2 o más pizzas) y **no** descuente bebidas ni extras, verificando consistencia con el documento.
3. **Dividir el Ticket en 3 funciones limpias (adiós a los 18 parámetros):**
   * Partir `mostrarBienvenida()` si es necesario y dividir `Ticket` (de 45 líneas y 18 parámetros) en tres funciones cohesivas:
     1. `imprimirEncabezado(String nombreCliente)`: resuelve en un solo lugar el cliente registrado o `"Mostrador"` por defecto (eliminando el duplicado de `"Mostrador"` en `main` y en el ternario).
     2. `imprimirDetalle(...)`: imprime cada renglón adquirido mostrando **cantidad, descripción, precio unitario e importe por renglón**.
     3. `imprimirTotales(double subtotalPizzas, double subtotalExtrasBebidas, double descuento, double iva, double total)`: muestra el desglose claro de subtotal, descuento aplicado, IVA (16 %) y total a pagar.
4. **Capturar evidencias de ejecución para el documento:**
   * Una vez integradas las ramas, ejecutar pruebas completas y tomar capturas de pantalla limpias (solo consola/ejecución, no código):
     * Una captura por pantalla del flujo.
     * Evidencia de **datos rechazados** por validación (letras, negativos, opciones fuera de rango).
     * Evidencia de un **ticket completo impreso** con cuentas reales y múltiples sabores.

---

## 3. Cronograma de Ejecución (Martes 24 – Viernes 27 de Noviembre)

| Día | Actividad Principal | Responsables | Entregable / Verificación |
| :--- | :--- | :--- | :--- |
| **Martes 24 Nov** | Crear estructura `PF-Equipo2/src/`, revisar ramas individuales (`dev/emma`, `dev/Isa`, `dev/pablo`) y comenzar desarrollo aislado. | Todo el equipo | Primeros commits pequeños en cada rama individual con las firmas de funciones acordadas. |
| **Miércoles 25 Nov** | **Día fuerte de codificación:**<br>• Emma: `leerEntero`, `for` de pizzas y `tomarPedido()`.<br>• Isa: menús con `for` + precios, renombrado y correcciones doc Fase 1.<br>• Pablo: constantes, funciones de cálculo y división del ticket en 3 partes. | Emmanuel<br>Isabella<br>Pablo | Cada integrante compila y prueba sus funciones localmente; commits subidos a GitHub al final del día. |
| **Jueves 26 Nov** | **Integración y pruebas cruzadas:**<br>• Abrir Pull Requests hacia `main`.<br>• Resolver conflictos de merge entre los 3 módulos.<br>• Pablo toma las capturas de ejecución (validaciones rechazadas + ticket completo) e Isa las integra al documento. | Todo el equipo | Rama `main` compilando sin errores, sin warnings ni código muerto, y documento actualizado. |
| **Viernes 27 Nov** | **Cierre Fase 2 y Reunión en Teams:**<br>• Verificación final de entrega.<br>• **Reunión en Microsoft Teams:** Retrospectiva de Fase 2 (qué funcionó y qué mejorar en Git/equipo) y reparto de tareas para **Fase 3** (arreglos y manejo de archivos). | Todo el equipo | Entrega oficial de Fase 2 completada y plan de acción de Fase 3 definido. |

---

## 4. Checklist de Validación Antes del Merge Final

Antes de dar por cerrada la Fase 2 el **viernes 27 de noviembre**, verificaremos juntos en la prueba final:

- [ ] **Pedido 1 vs. Pedido 2:** Al hacer un segundo pedido sin registrar cliente, el nombre sale como `"Mostrador"` y el total **no** suma bebidas, extras ni pizzas del pedido anterior.
- [ ] **Validaciones estrictas:** Si se ingresa una letra, un `0`, un número negativo (ej. `-2` en extras) o una opción fuera de rango (ej. tamaño `9`), el sistema rechaza el dato con mensaje claro y vuelve a pedirlo sin asignar valores por defecto.
- [ ] **Menús con precios:** Todos los menús (tamaños, sabores, bebidas y extras) muestran su precio al usuario y se generan mediante ciclos `for` sin textos duplicados.
- [ ] **Múltiples pizzas:** Si el cliente pide 3 pizzas, el ciclo `for` solicita tamaño y sabor para cada una de las 3 pizzas.
- [ ] **Promoción e IVA:** El descuento del 20 % se aplica solo a las pizzas (a partir de 2 pizzas), luego se calcula el IVA del 16 % y el ticket muestra el importe por renglón.
- [ ] **Historial de Git limpio:** Cada integrante tiene sus propios commits en su rama antes del merge a `main`.