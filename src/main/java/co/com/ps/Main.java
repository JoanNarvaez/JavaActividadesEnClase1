package co.com.ps;

public class Main {

    public static void main(String[]args){ //METODO PRINCIPLA DONDE NOS PERMITE ESCRIBIR
        // NUESTRO CODIGO PRINCIPLA DE EJECUCIÓN

        System.out.println("hola mundo"); //mostrar informacion en consola con salto en linea ln
        System.out.println("hola joan");//se imprime sin salto en linea en conola
        System.out.println("______________________________________");
        TrabajoEnClase2 jn = new TrabajoEnClase2();
        jn.encender();
        jn.canales();
        jn.volumen();
        System.out.println("______________________________________");
        Alumno alum1 =new Alumno();
        Alumno alum2 =new Alumno(24,"Joan","Narvaez");

        // se puede agregar una variable para traerme el id
       // int id=alum2.getId();
        //System.out.println("La id del alumno 2 es: "+ id);
        //una sola linea de codigo
        System.out.println("La id del alumno 2 es: "+ alum2.getId());
        System.out.println("el nombre es "+ alum2.getNombre());
        System.out.println("el apellido es " + alum2.getApellido());
        System.out.println("______________________________________");


        alum1.setId(1151941723);
        alum1.setNombre("Andres");
        alum1.setApellido("Ordoñez");
        System.out.println("La id del alumno 1 es: "+ alum1.getId());
        System.out.println("el nombre es "+ alum1.getNombre());
        System.out.println("el apellido es " + alum1.getApellido());
        System.out.println("______________________________________");

        alum2.setId(55);
        System.out.println("La id del alumno 2 es: "+ alum2.getId());
        System.out.println("el nombre es "+ alum2.getNombre());
        System.out.println("el apellido es " + alum2.getApellido());
        System.out.println("______________________________________");




    }
}
