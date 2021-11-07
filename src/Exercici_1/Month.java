package Exercici_1;
import java.util.ArrayList;
import java.util.Objects;

/*
Exercici 1. Creu un objecte de tipus Month amb un atribut "name" (que contingui el nom del mes de l'any).
Anyada 11 objectes Month (cadascun amb el seu atribut diferent) en un Contenidor Java, a excepció de l'objecte amb atribut "Agost".
Després, efectuï la inserció en el lloc que correspon a aquest mes i demostri que el Contenidor manté l'ordre correcte.
 */
public class Month {
    String name;
   public Month(String name){
       this.name = name;
   }

    @Override
    public String toString() {
        return name ;
    }

    public static void main(String[] args) {

       //Creamos una Arraylist de tipo Month y vamos creando los 11 objetos-meses salvo Agosto.
        ArrayList<Month> meses = new ArrayList<>();
        meses.add(new Month("Enero"));
        meses.add(new Month("Febrero"));
        meses.add(new Month("Marzo"));
        meses.add(new Month("Abril"));
        meses.add(new Month("Mayo"));
        meses.add(new Month("Junio"));
        meses.add(new Month("Julio"));
        meses.add(new Month("Septiembre"));
        meses.add(new Month("Octubre"));
        meses.add(new Month("Noviembre"));
        meses.add(new Month("Diciembre"));


        // Imprimimos cuantos objetos hay en la ArrayList e imprimimos la propia ArrayList.
        System.out.println(meses.size());
        System.out.println(meses);

        // Creamos el objeto "Agosto" y lo agregamos en la lista en la séptima posición.
        Month agosto = new Month("Agosto");
        meses.add(7,agosto);

        // Volvemos a imprimir tamaño y lista para comprobar que todo ha ido bien.
        System.out.println(meses.size());
        System.out.println(meses);
    }


}

