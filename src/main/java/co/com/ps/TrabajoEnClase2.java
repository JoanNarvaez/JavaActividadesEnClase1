package co.com.ps;
//mi objecto es control tv
public class TrabajoEnClase2 {

    private String color;
    public String tamano;
    private String peso;
    private String botones;

    public String getColor(){
        return this.color;
    }
    public String getTamano(){
        return this.tamano;
    }
    public String getPeso(){
        return this.peso;
    }
    public String getBotones(){
        return this.botones;
    }


    public void setColor(String color){
        this.color=color;
    }
    public void setTamano(String tamano){
        this.tamano=tamano;
    }
    public void setPeso(String peso){
        this.peso=peso;
    }
    public void setBotones(String botones){
        this.botones=botones;
    }

public void encender(){
    System.out.println("enciende el televisor");
}
public void volumen(){
        System.out.println("Se cambia el Volumen");
    }
 public void canales(){
        System.out.println("Se cambio el canal");
    }


}