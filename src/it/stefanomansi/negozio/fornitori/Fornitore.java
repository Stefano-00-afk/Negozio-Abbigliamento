package it.stefanomansi.negozio.fornitori;

public class Fornitore {
    private int id;
    private String nomeAzienda;
    private String email;
    private String categoriaProdotto;


    // Costruttori

    public Fornitore(int id,String nomeAzienda,String email,String categoriaProdotto) {
        this.id = id;
        this.nomeAzienda = nomeAzienda;
        this.email = email;
        this.categoriaProdotto = categoriaProdotto;

    }


    // Getter and Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeAzienda() {
        return nomeAzienda;
    }

    public void setNomeAzienda(String nomeAzienda) {
        this.nomeAzienda = nomeAzienda;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCategoriaProdotto() {
        return categoriaProdotto;
    }

    public void setCategoriaProdotto(String categoriaProdotto) {
        this.categoriaProdotto = categoriaProdotto;
    }


    @Override
    public String toString() {
        return "Ecco le informazioni del fornitore:\nId Fornitore : " + getId() + "\nAzienda : " + getNomeAzienda() + "\nEmail : " +
                getEmail() + "\nCategoria del prodotto: " + getCategoriaProdotto() + "\n";
    }
}
