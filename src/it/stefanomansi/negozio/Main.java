package it.stefanomansi.negozio;

import it.stefanomansi.negozio.clienti.Cliente;
import it.stefanomansi.negozio.clienti.GestioneCliente;
import it.stefanomansi.negozio.fornitori.Fornitore;
import it.stefanomansi.negozio.fornitori.GestioneFornitore;

public class Main {
    public static void main(String[] args) {

        // Istanze per gestire la logica delle classi di gestione...
        GestioneFornitore gestioneFornitore = new GestioneFornitore();
        GestioneCliente gestioneCliente = new GestioneCliente();

        // Registrazione Clienti
        Cliente c = new Cliente(0,"Stefano","Mansi","stefanomansi165@gmail.com");

        // Registrazione Fornitori
        Fornitore f = new Fornitore(0,"Abba s.r.l","abba@gmail.com","Maglioni");

        // Aggiunte clienti
        gestioneCliente.aggiungiCliente(c);

        // Aggiunte fornitori
        gestioneFornitore.aggiungiFornitore(f);

        // Visualizza Clienti
        gestioneCliente.visualizzaCLiente();

        // Visualizza fornitori
        gestioneFornitore.visualizzaFornitori();

    }
}
