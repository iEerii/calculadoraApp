import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true) {
            System.out.println("**** Aplicacion Calculadora ****");
            //Muestra del menu
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                //validar que la opcion del usuario exista en el menu
                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) {
                    System.out.println("Hasta pronto");
                    break;
                } else {
                    System.out.println("Opcion erronea: " + operacion);
                }
                //Imprimir un salto de linea antes de reptir el ciclo
                System.out.println();
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }
    }

    private static void mostrarMenu(){
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    """);
        System.out.print("Seleccione la operación que desee realizar: ");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.print("Proporcione el valor del operando1: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.print("Proporcione el valor del operando2: ");
        var operando2 = Double.parseDouble(consola.nextLine());

        double resultado;
        switch (operacion) {
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("El resultado de la suma es: " + resultado);
            }
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("El resultado de la resta es: " + resultado);
            }
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("El resultado de la multiplicacion es: " + resultado);
            }
            case 4 -> {
                resultado = operando1 / operando2;
                System.out.println("El resultado de la division es: " + resultado);
            }
            default -> System.out.println("Opcion erronea: " + operacion);
        }
    }
}
