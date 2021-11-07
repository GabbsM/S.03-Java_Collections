package Exercici_3;

import java.util.*;

/*
Creu una classe generadora que retorni noms de personatges (com String) de la seva pel·lícula favorita cada que vegada que invoqui next(),
 i que torni al principi de la llista de personatges una vegada que hagi acabat amb tots els noms.
  Utilitzi aquest generador per a emplenar una matriu, un ArrayList, un LinkedList, un HashSet, un LinkedHashSet i un TreeSet,
   i després imprimeixi per pantalla cada contenidor
 */
public class Generador {


    public static void main(String[] args) {

        Generador generadorPersonajes = new Generador();


        //ArrayList:
        ArrayList<String> arrraylist = new ArrayList<>();
        for (int i = 0; i < generadorPersonajes.numPersonajes(); i++) {
            arrraylist.add(generadorPersonajes.next());

        }
        generadorPersonajes.reset();
        System.out.println();
        System.out.println("ArrayList:");
        System.out.println(arrraylist);

        //LinkedList:

        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < generadorPersonajes.numPersonajes(); i++) {
            linkedList.add(generadorPersonajes.next());
        }
        generadorPersonajes.reset();
        System.out.println();
        System.out.println("Linkedlist: ");
        System.out.println(linkedList);

        //Hashset:

        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < generadorPersonajes.numPersonajes(); i++) {
            hashSet.add(generadorPersonajes.next());
        }
        generadorPersonajes.reset();
        System.out.println();
        System.out.println("HashSet: ");
        System.out.println(hashSet);

        //LinkedHashSet:

        LinkedHashSet<String>linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < generadorPersonajes.numPersonajes(); i++) {
            linkedHashSet.add(generadorPersonajes.next());
        }
        generadorPersonajes.reset();
        System.out.println();
        System.out.println("LinkedHashSet: ");
        System.out.println(linkedHashSet);

        //TreeSet:

        TreeSet<String> treeSet = new TreeSet<>();
        for (int i = 0; i < generadorPersonajes.numPersonajes(); i++) {
            treeSet.add(generadorPersonajes.next());
        }
        generadorPersonajes.reset();
        System.out.println();
        System.out.println("TreeSet");
        System.out.println(treeSet);




        }



    int contador = 0;
    String[] personajes = new String[]{
            "Vitto Corleone",
            "Sonny Corleone",
            "Michael Corleone",
            "Fredo Corleone",
            "Tom Hagan",
    };

    public Integer numPersonajes() {
        return personajes.length;
    }

    public String next() {
        if (personajes.length == contador) {
            reset();
        }

        String personaje = personajes[contador];
        contador += 1;
        return personaje;
    }


    public void reset(){
        contador=0;
    }


}
