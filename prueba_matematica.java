package prog_inical;

import java.util.Scanner;

public class prueba_matematica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Registro del usuario
        System.out.print("Ingrese su ID: ");
        String usuario = scanner.nextLine();
        
        System.out.print("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();
        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese su correo electrónico: ");
        String correo = scanner.nextLine();
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
                  scanner.nextLine();
        
        System.out.print("Ingrese su nacionalidad: ");
        String nacionalidad = scanner.nextLine();
        
        System.out.println("\n¡Registro exitoso, " + nombre + "!");
        
        boolean continuar = true;
        while (continuar) {
            
            System.out.println("\nSelecciona el área MATEMÁTICA en la que desea practicar:");
            System.out.println("1. Ecuaciones de primer grado");
            System.out.println("2. Criba de Eratóstenes");
            System.out.println("3. División de números enteros");
            
            System.out.print("Ingrese el número correspondiente: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            String videoUrl = "";
            String ejercicio = "";
            String pregunta = "";
            String respuesta = "";
            
            switch (choice) {
                case 1:
                    videoUrl = "https://www.youtube.com/watch?v=zsVHjJpbFIA&t=2s";
                    ejercicio = "Resuelva la ecuación: 2x + 5 = 15";
                    pregunta = "¿Cuál es el valor de x en la ecuación 3x - 7 = 8?";
                    respuesta = "5";
                    break;
                case 2:
                    videoUrl = "https://www.youtube.com/watch?v=0Xoa9bFlAEs";
                    ejercicio = "¿El 54 es un número primo?";
                    pregunta = "¿Cuántos números primos hay entre 1 y 150?";
                    respuesta = "35";
                    break;
                case 3:
                    videoUrl = "https://www.youtube.com/watch?v=KT0R9UQ3S-4";
                    ejercicio = "Realice la división de  125 ÷ 5";
                    pregunta = "Resuelva: 48 ÷ 6";
                    respuesta = "8";
                    break;
                default:
                    System.out.println("Opción no válida. Saliendo del programa.");
                    return;
            }
            
            System.out.println("\nMire este video para aprender sobre el tema: " + videoUrl);
            System.out.println("\nEjercicio de práctica: " + ejercicio);
            
            // Evaluación final
            System.out.print("\nTest: " + pregunta + " Respuesta: ");
            String respuesta_usuario = scanner.nextLine();
            
            if (respuesta_usuario.equals(respuesta)) {
                System.out.println("\n¡Correcto! Has aprendido bien el tema.");
            } else {
                System.out.println("\nIncorrecto. La respuesta correcta era: " + respuesta);
            }
            
            System.out.print("\n¿Desea seleccionar otra área de aprendizaje? (si/no): ");
            String response = scanner.nextLine().toLowerCase();
            if (!response.equals("si")) {
                continuar = false;
            }
        }
        
        System.out.println("\n¡Gracias por participar!");
        scanner.close();
    }
}
