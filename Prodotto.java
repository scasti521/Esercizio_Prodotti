public class Prodotto {
    String nome;
    private double prezzo;
    String descrizione;
    private int quantità;

    public Prodotto(String nome, double prezzo, String descrizione, int quantità){
        this.nome=nome;
        this.prezzo=prezzo;
        this.descrizione=descrizione;
        this.quantità=quantità;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getQuantità() {
        return quantità;
    }

        

}
