package co.com.ps;

import java.util.Scanner;

public class TrabajoEnClase1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese su Nombre");
        String nombre =scanner.next();
        System.out.println(nombre +" Digite 3 Numeros");
        System.out.println("Digite el Primer numero");
        double num1 =scanner.nextDouble();
        System.out.println("Digite el Segundo numero");
        double num2 =scanner.nextDouble();
        System.out.println("Digite el tercer numero");
        double num3 =scanner.nextDouble();

        double resultado=((num1+num2+num3)/3);
        System.out.println(resultado);
    }
}
