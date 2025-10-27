package it.stefanomansi.negozio.clienti;

public class Cliente {
    private int id;
    private String nome;
    private String cognome;
    private String email;


    // Costruttori

    public Cliente (int id,String nome,String cognome,String email){
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }

    // Getters And Setters

    public int getId (){
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {

        return "Ecco le informazioni del Cliente :\nId cliente : " + getId() +
                "\nNome e Cognome : " + getNome() + " " + getCognome() + "\nEmail : " + getEmail() +"\n";
    }
}
