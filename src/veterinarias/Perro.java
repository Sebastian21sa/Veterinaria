/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinarias;

/**
 *
 * @author Sebastian Sanchez
 */
public class Perro {
    private String nombre;
    private String raza;
    private String color;
    private int edad;
    private int entrenamiento;

    public Perro() {
        nombre = "";
        raza = "";
        color = "";
        edad = 0;
        entrenamiento = 0;
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

    public int getEntrenamiento() {
        return entrenamiento;
    }

    public void setEntrenamiento(int entrenamiento) {
        this.entrenamiento = entrenamiento;
    }
          public String datos(){
        return "El gato se llama "+nombre+" es un "+raza+ " es de color " +color + " tiene "+edad+" años " + " y tiene un nivel de entrenamiento de "+ entrenamiento;
      }
}
