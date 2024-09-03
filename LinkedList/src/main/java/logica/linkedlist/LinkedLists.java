
package logica.linkedlist;
import java.util.LinkedList;
import java.util.List;


public class LinkedLists {

    public static void main(String[] args) {
   // ArrayList para guardar personas dentro
        List<Persona> lista = new LinkedList<>();
        lista.add(new Persona(0, "Patricio", 25));

        // Recorrer la lista con un índice
        for (int i = 0; i < lista.size(); i++) {
            String nombre = lista.get(i).getNombre(); // Obtener el nombre de la persona
            System.out.println("Prueba forINT " + nombre);
        }
        
        //agregar al principio
        lista.add(0, new Persona(5, "Probando", 323));
        
        // forEach funcion flecha
//        lista.forEach(item -> System.out.println(item.getEdad()));

        // Usar un bucle for-each
        for (Persona person : lista) {
            System.out.println(person.getNombre()); // Imprimir el nombre de cada persona
        }
    }
}