package co.com.ps;

import java.util.Scanner;

public class TrabajoEnClase4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un numero");
        int num=scanner.nextInt();


        if (num < 0) {
            System.out.println("EL NUMERO ES NEGATIVO");
        } else if (num==0) {
            System.out.println("EL NUMERO ES 0");
        } else {
            System.out.println("EL NUMERO ES POSITIVO");
        }

        System.out.println("_____________________________");



        System.out.println("Ingresar el Precio del Articulo");
        double precio=scanner.nextDouble();

        System.out.println("Menu");
        System.out.println("1. Si es Electrónicos");
        System.out.println("2. Si es Ropa");
        System.out.println("3. Si es Alimentos");

        System.out.println("Ingresa el articulo del 1-3");
        int articulo=scanner.nextInt();
        double resultado;

        switch (articulo) {
            case 1:
                resultado = (precio * 0.1);
                break;
            case 2:
                resultado = precio * 0.05;
                break;
            case 3:
                resultado = precio * 0.02;
                break;
            default:
                System.out.println("Número no válido");
                return;
        }
        System.out.println("el valor del descuento es: "  + (resultado));
        System.out.println("el Precio total apagar es: "+(precio-resultado));
    }
}
