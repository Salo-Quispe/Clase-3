import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args){
        Scanner sn= new Scanner(System.in);
        boolean Finalizar= false;
        int op;
        while (!Finalizar) {
            System.out.println("1:Suma");
            System.out.println("2:Resta");
            System.out.println("3:Multiplicacion");
            System.out.println("4:Division");
            System.out.println("5:Seno");
            System.out.println("6:Coseno");
            System.out.println("7:Tangente");
            System.out.println("8:Finalizar");
            try {
                System.out.println("Elija una opcion: ");
                op = sn.nextInt ();
                double x, y, total, rad, res=0;

                switch (op) {
                    case 1:
                        System.out.println ("+SUMA+");
                        System.out.println ("Ingresar el primer numero");
                        x = sn.nextDouble();
                        System.out.println("Ingresar el segundo numero");
                        y = sn.nextDouble();
                        total = x+y;
                        System.out.println("La suma de los dos numeros es: " + total);
                        break;
                    case 2:
                        System.out.println ("-RESTA-");
                        System.out.println ("Ingresar el primer numero");
                        x = sn.nextDouble();
                        System.out.println("Ingresar el segundo numero");
                        y = sn.nextDouble();
                        total = x-y;
                        System.out.println("La resta de los dos numeros es: " + total);
                        break;
                    case 3:
                        System.out.println ("*MULTIPLICACION*");
                        System.out.println ("Ingresar el primer numero");
                        x = sn.nextDouble();
                        System.out.println("Ingresar el segundo numero");
                        y = sn.nextDouble();
                        total = x*y;
                        System.out.println("La multiplicacion de los dos numeros es: " + total);
                        break;
                    case 4:
                        System.out.println ("/DIVISON/");
                        System.out.println ("Ingresar el primer numero");
                        x = sn.nextDouble();
                        System.out.println("Ingresar el segundo numero");
                        y = sn.nextDouble();
                        total = x/y;
                        System.out.println("La division de los dos numeros es: " + total);
                        break;
                    case 5:
                        System.out.println ("|SENO|");
                        System.out.println ("Ingresar el angulo en grados: ");
                        x = sn.nextDouble();
                        rad = Math.toRadians(x);
                        res = Math.sin(rad);
                        System.out.println("El seno de " + x + "es: " + res);
                        break;
                    case 6:
                        System.out.println ("~COSENO~");
                        System.out.println ("Ingresar el angulo en grados: ");
                        x = sn.nextDouble();
                        rad = Math.toRadians(x);
                        res = Math.cos(rad);
                        System.out.println("El coseno de " + x + "es: " + res);
                        break;
                    case 7:
                        System.out.println ("#TANGENTE#");
                        System.out.println ("Ingresar el angulo en grados: ");
                        x = sn.nextDouble();
                        rad = Math.toRadians(x);
                        res = Math.tan(rad);
                        System.out.println("La tangente de " + x + "es: " + res);
                        break;
                    case 8:
                        Finalizar = true;
                        System.out.println ("Fue un gusto ayudarlo :)");
                        break;
                    default:
                        System.out.println("La opción es incorrecta intentelo de nuevo");
                }
            } catch (InputMismatchException e) {
                System.out.println("Se debe ingresar una opción valida");
                sn.next();
            }
        }
    }
}
