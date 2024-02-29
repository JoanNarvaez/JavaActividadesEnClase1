package co.com.ps;

public class Alumno {

    int id;
    String nombre;
    String apellido;


    public Alumno() {
    }
// metodo constructor
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
//get significa traer obtener los datos, mostrar por pantlla hacer una operacion
    public int getId() {
        return id;
    }
// set significa colocar o seteame colocar establecer valores a caa uno de los atributos
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void mostrarNombre(){
        System.out.println("Hola, soy alumno y este es mi nombre");
    }

}
