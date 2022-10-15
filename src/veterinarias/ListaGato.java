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
public class ListaGato extends Veterinarias{
     public String Input(String text) {
        return JOptionPane.showInputDialog(text);
    }

    public int Input1(String edad) {
        return Integer.parseInt(JOptionPane.showInputDialog(edad));
    }

    public int Input2(String Ne) {
        return Integer.parseInt(JOptionPane.showInputDialog(Ne));
    }

    public void addMino() {
        String nombre = Input("I¿Cual es el nombre del gato?");
        String raza = Input("Raza del gato");
        String color = Input("¿Cual es el color del gato?");
        int edad = Input1("Ingrese la edad del gato");
        String toxoplasmosis= Input("Cuenta con la toxoplasmosis (Si o No");
        Gato mino = new Gato();
        mino.setNombre(nombre);
        mino.setRaza(raza);
        mino.setColor(color);
        mino.setEdad(edad);
        mino.setToxoplasmosis(toxoplasmosis);
        ga.add(mino);
    }

    public void getGato() {
        Iterator it = ga.iterator();
        //verifica si existe otro elemento con el método hasNext()
        while (it.hasNext()) {
            Object objeto = it.next();
            Gato gar = (Gato) objeto;
            JOptionPane.showMessageDialog(null, gar.datos());
        }
    }

    public void limpiar() {
        int opcion;
        JOptionPane.showMessageDialog(null, "Tener en cuenta que el primer dato incertado empiezo en 0");
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el la posicion a eliminar"));
        ga.remove(opcion);
    }
}
