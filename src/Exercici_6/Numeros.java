package Exercici_6;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

/*
Creu un objecte buit LinkedList<Integer>. Utilitzant un iterador ListIterator, afegeixi valors sencers
a la llista inserint-los sempre a la meitat d'aquesta.
 */
class Numeros {

    public static void main(String[] args) {
        //Instanciamos ojbeto de clase:
        Numeros numeros = new Numeros();

        //Creamos una Linkedlist de tipo Integer:
        LinkedList<Integer> lista_numeros = new LinkedList<>();

        //Creamos un iterador de la LinkedList:
        ListIterator<Integer> itera_numeros = lista_numeros.listIterator();


        int posicion = lista_numeros.size()/2;

        lista_numeros.add(numeros.generaNumero());
        while (itera_numeros.hasNext()){
            lista_numeros.add(posicion,numeros.generaNumero());

        }
        System.out.println(lista_numeros);

    }



        //Creamos un método que genere números aleatórios del 1 al 100:
        public Integer generaNumero(){
        Random random = new Random();
        int numero = random.nextInt(100)+1;
        return numero;
        }



}



