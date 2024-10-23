package mariapiabaldoin.Giorno_2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ordine {

    private int numero;
    private StatoOrdine stato;
    private int numeroCoperti;
    private List<Elemento> orderedProducts = new ArrayList<>();
    private Tavolo tavolo;


    public Ordine(int numero, StatoOrdine stato, int numeroCoperti, Tavolo tavolo) {
        this.numero = numero;
        this.stato = stato;
        this.numeroCoperti = numeroCoperti;
        this.tavolo = tavolo;

    }


    public void addElemento(Elemento elemento) {
        this.orderedProducts.add(elemento);
    }


    public double getTotale() {
        return this.orderedProducts.stream()
                .mapToDouble(Elemento::getPrezzo)
                .sum() + (this.tavolo.getCostoCoperto() * this.numeroCoperti);
    }


    @Override
    public String toString() {
        return "Ordine{" +
                "numero=" + numero +
                ", tavolo=" + tavolo.getNumero() +
                ", stato=" + stato +
                ", numeroCoperti=" + numeroCoperti +
                ", importoTotale=" + getTotale() +
                '}';
    }
}
