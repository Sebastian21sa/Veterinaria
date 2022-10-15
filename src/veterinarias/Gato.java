/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinarias;

/**
 *
 * @author Sebastian Sanchez
 */
public class Gato {
    private String nombre;
    private String raza;
    private String color;
    private String toxoplasmosis;
        private int edad;

    public Gato() {
        nombre = "";
        raza = "";
        color = "";
        edad = 0;
        toxoplasmosis = "";
        
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getToxoplasmosis() {
        return toxoplasmosis;
    }

    public void setToxoplasmosis(String toxoplasmosis) {
        this.toxoplasmosis = toxoplasmosis;
    }

      public String datos(){
        return "Nombre Del Gato: "+nombre+" Raza: "+raza+ " color gato: " +color + " edad gatuno "+edad+" años " +" y "+ toxoplasmosis + " la toxoplasmosis";
      }
}
