package co.com.ps;

import java.util.Scanner;

public class TrabajoEnClase3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] arregloNombre=new String[3];

        System.out.println("Ingrese su nombre1");
        String nombre1 =scanner.next();
        arregloNombre[0]=nombre1;

        System.out.println("Ingrese su nombre2");
        String nombre2 =scanner.next();
        arregloNombre[1]=nombre2;

        System.out.println("Ingrese su nombre3");
        String nombre3 =scanner.next();
        arregloNombre[2]=nombre3;

        System.out.println("---------------------------");
        System.out.println("nombre 1 "+arregloNombre[0]);
        System.out.println("nombre 2 "+arregloNombre[1]);
        System.out.println("nombre 3 "+arregloNombre[2]);

    }


}
