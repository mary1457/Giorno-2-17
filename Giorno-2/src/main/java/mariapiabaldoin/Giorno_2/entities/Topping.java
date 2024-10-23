package mariapiabaldoin.Giorno_2.entities;


public class Topping extends Elemento {


    public Topping(String nome, int informazioniNutrizionali, double prezzo) {
        super(nome, informazioniNutrizionali, prezzo);
    }


    @Override
    public String toString() {
        return "Topping{name='" + getNome() + "', calories=" + getInformazioniNutrizionali() + ", price=" + getPrezzo() + "}";
    }
}

