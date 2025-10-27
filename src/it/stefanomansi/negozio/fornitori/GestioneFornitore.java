package it.stefanomansi.negozio.fornitori;

import java.util.ArrayList;
import java.util.List;

public class GestioneFornitore {

    private final List<Fornitore> fornitori = new ArrayList<>();

    // Metodi

    public void aggiungiFornitore(Fornitore f){
        fornitori.add(f);
        System.out.println("Fornitore aggiunto con successo.");
    }

    public void rimuoviFornitore(Fornitore f){
        fornitori.remove(f);
    }
    public void visualizzaFornitori(){
        if(fornitori.isEmpty()){
            System.out.println("Nessun fornitore da visualizzare");
        }
        else {
            fornitori.forEach(System.out::println);
        }
    }
}
