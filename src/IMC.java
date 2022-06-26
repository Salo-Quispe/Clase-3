import java.util.Scanner;
public class IMC{
    public static void main(String [] args){
        Scanner leer = new Scanner(System.in);
        float x,y,total;

        System.out.println("Calculo del IMC ");
        System.out.print("Ingrese su peso en Kg: ");
        x=leer.nextFloat();

        System.out.print("Ingrese su altura en centimetros: ");
        y=leer.nextFloat();

        total=x / y;
        System.out.println("El IMC es: " +total);
    }
}
