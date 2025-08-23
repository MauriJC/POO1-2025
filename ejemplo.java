import java.util.Scanner; // Importamos la clase Scanner para leer datos por consola
// Sintaxis del import: import [paquete].[clase];


// Tipos de datos primitivos y de referencia en Java
// Tipos primitivos: int, double, float, char, boolean, byte, short, long
// Tipos de datos de referencia: String <= Referencia quiere decir que apunta a un objeto en memoria

public class ejemplo {

    public static void main(String[] args) {
        // =========================
        // DECLARACIÓN DE VARIABLES CON DIFERENTES TIPOS DE DATOS
        // =========================
        
        // Tipos de datos primitivos
        int edad;                    // Número entero
        double salario;              // Número decimal (doble precisión)
        float altura;                // Número decimal (simple precisión)
        char inicial;                // Un solo carácter
        boolean esEstudiante;        // Verdadero o falso
        byte numeroPequeno;          // Número entero pequeño (-128 a 127)
        short numeroMediano;         // Número entero mediano (-32,768 a 32,767)
        long numeroGrande;           // Número entero grande
        
        // Tipos de datos de referencia (objetos)
        String nombre;               // Cadena de texto
        String apellido;             // Otra cadena de texto
        
        // =========================
        // CREACIÓN DEL OBJETO SCANNER
        // =========================
        
        // Scanner es la clase que nos permite leer datos desde la consola
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== PROGRAMA DE INGRESO DE DATOS POR CONSOLA ===");
        System.out.println("Por favor, ingresa los siguientes datos:\n");
        
        // =========================
        // INGRESO DE DATOS POR CONSOLA
        // =========================
        
        // Leer String (texto)
        System.out.print("Ingresa tu nombre: ");
        nombre = scanner.nextLine(); // nextLine() lee toda la línea incluyendo espacios

        // Ejemplo de lectura de un tipo de dato erroneo
        //nombre = scanner.nextInt();
        // Si usamos un tipo de dato incorrecto, el programa lanzará una excepción
        // Por ejemplo, si intentamos leer un String con nextInt(), se producirá un
        // Error de tipo (InputMismatchException)

        
        System.out.print("Ingresa tu apellido: ");
        apellido = scanner.nextLine();
        
        // Leer int (número entero)
        System.out.print("Ingresa tu edad: ");
        edad = scanner.nextInt(); // nextInt() lee un número entero
        
        // Leer double (número decimal)
        System.out.print("Ingresa tu salario: ");
        salario = scanner.nextDouble(); // nextDouble() lee un número decimal
        
        // IMPORTANTE: SEPARADOR DECIMAL
        // En algunos sistemas (configuración regional en español), Java espera COMA (,) como separador decimal
        // En otros sistemas (configuración en inglés), Java espera PUNTO (.) como separador decimal
        // Esto depende de la configuración regional (Locale) de tu sistema operativo
        
        // Leer float (número decimal de menor precisión)
        System.out.print("Ingresa tu altura en metros (usa coma como separador: ej: 1,75): ");
        altura = scanner.nextFloat(); // nextFloat() lee un número decimal flotante
        
        // Si quieres FORZAR el uso de punto (.) independientemente del sistema:
        // scanner.useLocale(Locale.US); // Descomenta esta línea para usar punto siempre
        
        // Leer char (un solo carácter)
        System.out.print("Ingresa la inicial de tu segundo nombre: ");
        inicial = scanner.next().charAt(0); // next() lee una palabra, charAt(0) toma el primer carácter
        
        // Leer boolean (verdadero o falso)
        System.out.print("¿Eres estudiante? (true/false): ");
        esEstudiante = scanner.nextBoolean(); // nextBoolean() lee true o false
        
        // Leer byte (número pequeño)
        System.out.print("Ingresa tu número favorito del 1 al 10: ");
        numeroPequeno = scanner.nextByte(); // nextByte() lee un número byte
        
        // Leer short (número mediano)
        System.out.print("Ingresa el año en que naciste: ");
        numeroMediano = scanner.nextShort(); // nextShort() lee un número short
        
        // Leer long (número grande)
        System.out.print("Ingresa tu número de teléfono: ");
        numeroGrande = scanner.nextLong(); // nextLong() lee un número long
        
        // =========================
        // MOSTRAR LOS DATOS INGRESADOS
        // =========================
        
        System.out.println("\n=== DATOS INGRESADOS ===");
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Salario: $" + salario);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Inicial del segundo nombre: " + inicial);
        System.out.println("¿Es estudiante?: " + esEstudiante);
        System.out.println("Número favorito: " + numeroPequeno);
        System.out.println("Año de nacimiento: " + numeroMediano);
        System.out.println("Número de teléfono: " + numeroGrande);
        
        // =========================
        // OPERACIONES CON LOS DATOS
        // =========================
        
        System.out.println("\n=== OPERACIONES CON LOS DATOS ===");
        
        // Operaciones matemáticas
        int anioActual = 2025;
        int anioCalculado = anioActual - edad;
        System.out.println("Según tu edad, naciste aproximadamente en: " + anioCalculado);
        
        // Operaciones con strings
        String nombreCompleto = nombre.toUpperCase() + " " + apellido.toUpperCase();
        System.out.println("Nombre en mayúsculas: " + nombreCompleto);
        
        // Operaciones condicionales
        if (esEstudiante) {
            System.out.println("Tienes descuento de estudiante disponible!");
        } else {
            System.out.println("No tienes descuento de estudiante.");
        }
        
        // Operación con altura
        if (altura >= 1.80) {
            System.out.println("Eres una persona alta!");
        } else if (altura >= 1.60) {
            System.out.println("Tienes una altura promedio.");
        } else {
            System.out.println("Eres una persona de baja estatura.");
        }
        
        // =========================
        // INFORMACIÓN SOBRE TIPOS DE DATOS
        // =========================
        
        System.out.println("\n=== INFORMACIÓN SOBRE TIPOS DE DATOS ===");
        System.out.println("byte: rango de -128 a 127, tamaño: 1 byte");
        System.out.println("short: rango de -32,768 a 32,767, tamaño: 2 bytes");
        System.out.println("int: rango de -2,147,483,648 a 2,147,483,647, tamaño: 4 bytes");
        System.out.println("long: rango muy grande, tamaño: 8 bytes");
        System.out.println("float: números decimales con precisión simple, tamaño: 4 bytes");
        System.out.println("double: números decimales con doble precisión, tamaño: 8 bytes");
        System.out.println("char: un solo carácter Unicode, tamaño: 2 bytes");
        System.out.println("boolean: solo puede ser true o false, tamaño: 1 bit");
        System.out.println("String: cadena de caracteres, tamaño variable");
        
        // Cerrar el scanner para liberar recursos
        scanner.close();
        
        // =========================
        // DIFERENCIAS ENTRE TIPOS PRIMITIVOS Y DE REFERENCIA
        // =========================
        
        System.out.println("\n=== DIFERENCIAS ENTRE TIPOS PRIMITIVOS Y DE REFERENCIA ===");
        
        // TIPOS PRIMITIVOS:
        // - Almacenan el VALOR directamente en la variable
        // - Se almacenan en la pila (stack) de memoria
        // - Son más rápidos de acceder
        // - Tienen tamaño fijo
        
        System.out.println("\n--- TIPOS PRIMITIVOS ---");
        int numero1 = 10;
        int numero2 = numero1; // Se copia el VALOR
        numero1 = 20; // Cambiar numero1 NO afecta numero2
        
        System.out.println("numero1: " + numero1); // 20
        System.out.println("numero2: " + numero2); // 10 (no cambió)
        System.out.println("Los primitivos almacenan el valor directamente");
        
        // TIPOS DE REFERENCIA:
        // - Almacenan una REFERENCIA (dirección de memoria) al objeto
        // - El objeto real se almacena en el heap de memoria
        // - Pueden ser null (no apuntar a nada)
        // - Tienen métodos asociados
        
        System.out.println("\n--- TIPOS DE REFERENCIA ---");
        String texto1 = new String("Hola");
        String texto2 = texto1; // Se copia la REFERENCIA, no el contenido
        
        System.out.println("texto1: " + texto1); // "Hola"
        System.out.println("texto2: " + texto2); // "Hola"
        System.out.println("¿Son el mismo objeto? " + (texto1 == texto2)); // true (misma referencia)
        
        // Ejemplo con StringBuilder (mutable)
        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = sb1; // Misma referencia
        sb1.append(" es genial"); // Modificar sb1 también afecta sb2
        
        System.out.println("sb1: " + sb1); // "Java es genial"
        System.out.println("sb2: " + sb2); // "Java es genial" (mismo objeto)
        
        // =========================
        // COMPARACIÓN VISUAL
        // =========================
        
        System.out.println("\n--- COMPARACIÓN VISUAL ---");
        System.out.println("PRIMITIVOS:");
        System.out.println("int x = 5;    [x: 5]           <- El valor 5 está EN la variable");
        System.out.println("int y = x;    [x: 5] [y: 5]    <- Se copia el valor");
        
        System.out.println("\nREFERENCIA:");
        System.out.println("String s1 = \"Hola\";   [s1: ->] -----> [\"Hola\" en memoria]");
        System.out.println("String s2 = s1;       [s1: ->] -----> [\"Hola\" en memoria]");
        System.out.println("                      [s2: ->] -------^");
        System.out.println("Ambas variables apuntan al mismo objeto en memoria");
        
        // =========================
        // CARACTERÍSTICAS IMPORTANTES
        // =========================
        
        System.out.println("\n--- CARACTERÍSTICAS ---");
        System.out.println("PRIMITIVOS:");
        System.out.println("✓ Más rápidos");
        System.out.println("✓ Menos memoria");
        System.out.println("✓ No pueden ser null");
        System.out.println("✓ Tienen valores por defecto (0, false, etc.)");
        System.out.println("✗ No tienen métodos");
        
        System.out.println("\nREFERENCIA:");
        System.out.println("✓ Tienen métodos útiles");
        System.out.println("✓ Pueden ser null");
        System.out.println("✓ Más flexibles");
        System.out.println("✗ Usan más memoria");
        System.out.println("✗ Acceso más lento");
        
        // Ejemplo de null y referencias
        String textoConValor = "Hola mundo";
        String textoNulo; // Sin inicializar inicialmente
        
        System.out.println("\nEjemplo de null y referencias:");
        System.out.println("textoConValor: " + textoConValor); // "Hola mundo"
        
        // Podemos asignar null a una variable de referencia
        textoNulo = null;
        System.out.println("textoNulo: " + textoNulo); // null
        
        // Verificar si es null antes de usar métodos
        System.out.println("Verificando si las variables son null:");
        System.out.println("¿textoConValor es null? " + (textoConValor == null)); // false
        System.out.println("¿textoNulo es null? " + (textoNulo == null)); // true
        
        // Uso seguro de métodos
        if (textoConValor != null) {
            System.out.println("Longitud de textoConValor: " + textoConValor.length());
        }
        
        // Ahora asignamos un valor a textoNulo
        textoNulo = "Java es genial";
        if (textoNulo != null) {
            System.out.println("Ahora textoNulo tiene valor: " + textoNulo);
            System.out.println("Su longitud es: " + textoNulo.length());
        }
        
        System.out.println("\n¡Programa terminado exitosamente!");
    }
}
