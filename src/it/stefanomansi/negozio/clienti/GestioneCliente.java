package it.stefanomansi.negozio.clienti;

import java.util.ArrayList;
import java.util.List;

public class GestioneCliente {
    private final List<Cliente> clienti = new ArrayList<>();
    // Metodi

    // Aggiunta e Rimozione
    public void aggiungiCliente(Cliente c){
        clienti.add(c);
        System.out.println("Cliente aggiunto con successo");
    }

    public void rimuoviCliente(int id){
        boolean find = false;
        for(Cliente cliente : clienti){
            if(cliente.getId() == id){
                clienti.remove(cliente);
                System.out.println("Cliente rimosso con successo");
                find = true;
            }
        }
        if(!find){
            System.out.println("Cliente non trovato");
        }
    }

    public void visualizzaCLiente (){
        if(clienti.isEmpty()){
            System.out.println("Nessun Cliente da visualizzare");
        }
        else{
            clienti.forEach(System.out::println);
        }

    }
}
