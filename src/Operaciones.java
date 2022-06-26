import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1, num2;
        double num3, num4;
        float num5, num6;
        //No se puede realizar operaciones con variables de tipo char y boolean
        System.out.println("Ingrese un numero entero : ");
        num1 = entrada.nextInt();
        System.out.println("Ingrese un numero entero: ");
        num2 = entrada.nextInt();
        System.out.println("La suma de enteros es: " + (num1 + num2));
        System.out.println("La resta de enteros es: " + (num1 - num2));
        if (num1 > 0 && num2 == 0) {
            System.out.println("La division para no se puede ejecutar");
        } else {
            System.out.println("La division es: " + (num1 / num2));
        }
        System.out.println("Los numeros con decimales deben ser ingresados con coma ej: 2,5 NO 2.5");
        System.out.println("Ingrese un numero decimal : ");
        num3 = entrada.nextDouble();
        System.out.println("Ingrese un numero decimal: ");
        num4 = entrada.nextDouble();
        System.out.println("La suma de decimales es: " + (num3 + num4));
        System.out.println("La resta de decimales es: " + (num3 - num4));
        if (num3 > 0 && num4 == 0) {
            System.out.println("La division no se puede ejecutar");
        } else {
            System.out.println("La division es: " + (num3 / num4));
        }
        System.out.println("Ingrese un  numero decimal: ");
        num5 = entrada.nextFloat();
        System.out.println("Ingrese un numero decimal: ");
        num6 = entrada.nextFloat();
        System.out.println("La suma de los dos decimales es: " + (num5 + num6));
        System.out.println("La resta de decimales es: " + (num5 - num6));
        if (num5 > 0 && num6 == 0) {
            System.out.println("La division no se puede ejecutar");
        } else {
            System.out.println("La division es: " + (num5 / num6));
        }
    }
}