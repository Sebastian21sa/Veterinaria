/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinarias;

import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian Sanchez
 */
public class ListaPerro extends Veterinarias{
    public String Input(String text) {
        return JOptionPane.showInputDialog(text);
    }

    public int Input1(String edad) {
        return Integer.parseInt(JOptionPane.showInputDialog(edad));
    }

    public int Input2(String entrenamiento) {
        return Integer.parseInt(JOptionPane.showInputDialog(entrenamiento));
    }

    public void addCa() {
        Perro dog = new Perro();
        String nombre = Input("Cual es el nombre del perro?");
        dog.setNombre(nombre);
        String raza = Input("Raza del perro:");
        dog.setRaza(raza);
        String color = Input("Color del Perro:");
        dog.setColor(color);
        int edad = Input1("Edad del Perro:");
        dog.setEdad(edad);
        int entrenamiento = Input2("Ingrese El nivel de 1 a 10 de entrenamiento del perro");
        dog.setEntrenamiento(entrenamiento);
        if (entrenamiento > 10) {
            JOptionPane.showMessageDialog(null, "Solo de 1 a 10");
        }
        pe.add(dog);
    }

    public void getPerro() {
        Iterator it = pe.iterator();
        //verifica si existe otro elemento con el método hasNext()
        while (it.hasNext()) {
            Object objeto = it.next();
            Perro dogi = (Perro) objeto;
            JOptionPane.showMessageDialog(null, dogi.datos());
        }

    }

    public void limpiar() {
        int opcion;
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Que posicion eliminar?, recuerde que la primer posicion del arraylist es 0"));
        pe.remove(opcion);
    }
}
