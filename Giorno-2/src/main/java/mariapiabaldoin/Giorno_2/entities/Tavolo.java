package mariapiabaldoin.Giorno_2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tavolo {

    private int numero;
    private int numeroCoperti;
    private StatoTavolo stato;
    private double costoCoperto;


}

