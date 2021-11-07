package Exercici_2;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
Asseguri's que el Contenidor utilitzat en el punt anterior no permet duplicats, i verifiqui'l.
 */
public class Mes {

    String name;
    public Mes(String name){
        this.name = name;
    }

    public static void main(String[] args) {

        //En este caso , con el fin de no permitir elementos repetidos, usaremos un Set en lugar de un ArrayList.
        Set<Mes> meses = new HashSet<>();

        meses.add(new Mes("Enero"));
        meses.add(new Mes("Febrero"));
        meses.add(new Mes("Marzo"));
        meses.add(new Mes("Abril"));
        meses.add(new Mes("Mayo"));
        meses.add(new Mes("Junio"));
        meses.add(new Mes("Julio"));
        meses.add(new Mes("Agosto"));
        meses.add(new Mes("Septiembre"));
        meses.add(new Mes("Octubre"));
        meses.add(new Mes("Noviembre"));
        meses.add(new Mes("Diciembre"));

        // Imprimimos tamaño y lista para comprobar que están los 12 meses.
        System.out.println(meses.size());
        System.out.println(meses);

        // Instanciamos y agregamos a la lista un objeto repetido.
        meses.add(new Mes("Julio"));

        // Volvemos a imprimir tamaño y lista para comprobar que no se ha agregado.
        System.out.println(meses.size());
        System.out.println(meses);
    }



    public String toString(){
        return name;
    }

    // Sobreescribimos métodos equal y hashCode con el fin de que Set no permita agregar elementos repetidos.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mes)) return false;
        Mes mes = (Mes) o;
        return Objects.equals(name, mes.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
