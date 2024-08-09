import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* Scanner yesid = new Scanner(System.in);
            System.out.println("Ingresa la edad:");

        int edad = yesid.nextInt();
    //int  edad = -1;
    if (edad <= 12) {
        System.out.println("es niño");
    }
        else if (edad >= 13 & edad <= 20) {
            System.out.println("es joven");
        }
        else if (edad >= 21 & edad <= 60) {
            System.out.println("es adulto");
    }
        else if (edad >= 60) {
            System.out.println("es adulto mayor");}



        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la nota obtenida");
        int notas = scanner.nextInt();

        switch (notas) {
            case
        }*/

        Scanner taller3 = new Scanner(System.in);

             System.out.println("Digite el valor de A:");

        double A = taller3.nextDouble();
            System.out.println("Digite el valor de B:");

        double B = taller3.nextDouble();
             System.out.println("Digite el valor de C:");

         double C = taller3.nextDouble();

        if (A == B || A == C || B == C) {
            System.out.println("Cuidado ha digitado valores iguales.");}

        else
        {
            double mayor = Math.max(A, Math.max(B, C));
            double menor = Math.min(A, Math.min(B, C));

            System.out.println("El numero mayor es: " + mayor);
            System.out.println("El numero menor es: " + menor);
        }

    }
}