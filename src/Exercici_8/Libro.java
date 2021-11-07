package Exercici_8;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
Empleni un mapa LinkedHashMap amb claus de tipus String i objectes del tipus
que prefereixi. Extregui les parelles, ordeni-les segons les claus (en ordre alfabètic) i
 torni a inserir-les en el mapa.
 */
public class Libro {
    String titulo;
    public Libro(String titulo){
        this.titulo = titulo;
    }

    public String toString(){
        return titulo;
    }

    //Creamos un Hashmap con elementos clave-valor:
    public static void main(String[] args) {
        HashMap<String,Libro> libros = new HashMap<>();
        libros.put("c",new Libro("Reina Roja"));
        libros.put("e",new Libro("El resplandor"));
        libros.put("a",new Libro("La red oscura"));
        libros.put("d",new Libro("El señor de las moscas"));
        libros.put("b",new Libro("Apocalipsis Z"));

        System.out.println(libros);

        //Creamos un TreeMap para ordenarlos por las claves.
        TreeMap<String,Libro> t = new TreeMap<>();
        t.putAll(libros);
        for(String key: t.keySet()){
            System.out.println("Clave: " + key + " , Valor: " + t.get(key) );
        }

      /*  for (Map.Entry<String,Libro>entrada: libros.entrySet()){
            String clave =entrada.getKey();
            Libro valor = entrada.getValue();
            System.out.println(clave);
            System.out.println(valor);
            System.out.println();
        }*/

    }

}
