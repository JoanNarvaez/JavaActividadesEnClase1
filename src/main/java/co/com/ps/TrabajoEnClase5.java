package co.com.ps;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Crear un programa que filtre las palabras que tengan mas de 5 caracteres
public class TrabajoEnClase5 {
    public static void main(String[] args) {


        List<String> listapalabras = Arrays.asList("Java", "Stream", "Ejemplo", "Programación", "Funcional");
        List<String> listafiltrada= new ArrayList<>();


        for (String palabra : listapalabras) {
            if (palabra.length()>5){
                listafiltrada.add(palabra);
            }

        }
        System.out.println(listafiltrada);
    }
}
