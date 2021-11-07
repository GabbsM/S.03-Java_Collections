package Exercici_5;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
Exercici 5. Creu i empleni un objecte List<Integer>. Creu un segon objecte List<Integer> de la mateixa grandària que el primer
 i utilitzi sengles objectes ListIterator per a llegir els elements de la primera llista i inserir-los en la segona en ordre invers
 (provi d'explorar diverses formes diferents de resoldre aquest problema).
 */
public class Lista_Numeros {

    public static void main(String[] args) {
        LinkedList<Integer> lista_numA = new LinkedList<>();
        lista_numA.add(1);
        lista_numA.add(2);
        lista_numA.add(3);

        LinkedList<Integer> lista_numB = new LinkedList<>();
        lista_numB.add(4);
        lista_numB.add(5);
        lista_numB.add(6);

        System.out.println("Lista A:" + lista_numA);
        System.out.println("Lista B:" +lista_numB);
        System.out.println();

        ListIterator<Integer> iter_numA = lista_numA.listIterator();
        ListIterator<Integer> iter_numB = lista_numB.listIterator();

        while (iter_numB.hasNext()){
            if(iter_numA.hasNext()){
                iter_numA.next();
            }
            iter_numA.add(iter_numB.next());
            System.out.println(lista_numA);
        }

    }


}
