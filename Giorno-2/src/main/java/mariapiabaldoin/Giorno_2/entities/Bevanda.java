package mariapiabaldoin.Giorno_2.entities;

public class Bevanda extends Elemento {

    public Bevanda(String nome, int informazioniNutrizionali, double prezzo) {
        super(nome, informazioniNutrizionali, prezzo);
    }

    @Override
    public String toString() {
        return "Bevanda{name='" + getNome() + "', calories=" + getInformazioniNutrizionali() + ", price=" + getPrezzo() + "}";
    }
}
