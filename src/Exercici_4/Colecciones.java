package Exercici_4;
import java.util.*;
/*
Escriba un ḿetodo que utilitzi un iterador per a recórrer una col·lecció i imprimeixi el resultat de toString() per a cada objecte del Contenidor.
 Empleni tots els diferents tipus de Java Collections amb una sèrie d'objectes i aplicació el mètode que hagi dissenyat a cada Contenidor
 */
class Colecciones {
    String nombre_grupos;
    String banda_musica;

    public Colecciones(String nombre_grupos) {
        this.nombre_grupos = nombre_grupos;
    }

   public String toString() {
        return nombre_grupos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Colecciones)) return false;
        Colecciones that = (Colecciones) o;
        return Objects.equals(nombre_grupos, that.nombre_grupos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre_grupos);
    }

    public static void main(String[] args) {
        //ArrayList:
        ArrayList<Colecciones> grupos = new ArrayList<>();
        grupos.add(new Colecciones("Love of lesbian"));
        grupos.add(new Colecciones("Viva Suecia"));
        grupos.add(new Colecciones("Dorian"));
        grupos.add(new Colecciones("Ivan Ferreiro"));

        //Iterador:
        System.out.println("ArrayList: ");
        Iterator<Colecciones> it = grupos.iterator();
        while (it.hasNext()) {
            String bandas = it.next().nombre_grupos;
            System.out.println(bandas);
        }

        //SetList:
        Set<Colecciones> set_grupos = new HashSet<>();
        set_grupos.add(new Colecciones("Love of lesbian"));
        set_grupos.add(new Colecciones("Viva Suecia"));
        set_grupos.add(new Colecciones("Dorian"));
        set_grupos.add(new Colecciones("Ivan Ferreiro"));

        System.out.println();
        System.out.println("HashSet: ");
        Iterator<Colecciones> set_it = grupos.iterator();
        while (set_it.hasNext()) {
            String bandas = set_it.next().toString();
            System.out.println(bandas);

        }
        // LinkedList:
        LinkedList<String> linked_grupos = new LinkedList<>();

        linked_grupos.add("Love of Lesbian");
        linked_grupos.add("Viva Suecia");
        linked_grupos.add("Dorian");
        linked_grupos.add("Ivan Ferreiro");

        System.out.println();
        System.out.println("LinkedList: ");
        Iterator<Colecciones> linked_it = grupos.iterator();
        while (linked_it.hasNext()) {
            String bandas = linked_it.next().toString();
            System.out.println(bandas);

        }

        //TreeSet


        TreeSet<String> treeset_grupos = new TreeSet<>();
        treeset_grupos.add("Love of Lesbian");
        treeset_grupos.add("Viva Suecia");
        treeset_grupos.add("Dorian");
        treeset_grupos.add("Ivan Ferreiro");

        System.out.println();
        System.out.println("TreeSet: ");
        Iterator<Colecciones> treeset_it = grupos.iterator();
        while (treeset_it.hasNext()) {
            String bandas = treeset_it.next().toString();
            System.out.println(bandas);
        }

        //HashMap:

        HashMap<String,Colecciones>lista_map = new HashMap<String,Colecciones>();
        Colecciones lol = new Colecciones("Love of lesbian");
        Colecciones vs = new Colecciones("Viva Suecia");
        Colecciones dorian = new Colecciones("Dorian");
        Colecciones iv = new Colecciones("Ivan Ferreiro");

            lista_map.put("Artista:",lol);
            lista_map.put("Artista:",vs);
            lista_map.put("Artista:",dorian);
            lista_map.put("Artista:",iv);

        System.out.println();
        System.out.println("HashMap: ");
            Iterator<Colecciones> it_map = grupos.iterator();
            while (it_map.hasNext()){
                String bandas = it_map.next().toString();
                System.out.println(bandas);
            }

    }

}