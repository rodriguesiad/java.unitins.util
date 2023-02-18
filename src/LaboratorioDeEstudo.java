import unitins.ArrayTins;

import java.util.ArrayList;

class PlantaPredio {
    String enderco;
    String cor;
}

public class LaboratorioDeEstudo {

    public static void main(String[] args) {
        ArrayList<PlantaPredio> listaJava = new ArrayList<>();

        ArrayTins<PlantaPredio> listaTins = new ArrayTins<>();

        listaJava.add(new PlantaPredio());
        listaJava.add(new PlantaPredio());

        listaTins.add(new PlantaPredio());
        listaTins.add(new PlantaPredio());

        System.out.println("ListaJava\n" + listaJava);
        System.out.println("ListaTins\n" + listaTins);

        listaTins.addRecursivo(1, new PlantaPredio());

        System.out.println("ListaTins\n" + listaTins);

        listaJava.remove(1);
        listaTins.remove(1);

        System.out.println("ListaJava\n" + listaJava);
        System.out.println("ListaTins\n" + listaTins);

    }

}
