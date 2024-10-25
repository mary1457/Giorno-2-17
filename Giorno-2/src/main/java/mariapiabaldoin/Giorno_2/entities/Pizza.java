package mariapiabaldoin.Giorno_2.entities;

import java.util.List;


public class Pizza extends Elemento {


    private List<Topping> toppings;


    public Pizza(String nome, int informazioniNutrizionali, double prezzo, List<Topping> toppings) {
        super(nome, informazioniNutrizionali, prezzo);
        this.toppings = toppings;
    }


    @Override
    public String toString() {
        return "Pizza{name='" + getNome() + "', calories=" + getInformazioniNutrizionali() + ", price=" + getPrezzo() + ", toppings=" + toppings + "}";
    }
}

