package mariapiabaldoin.Giorno_2;


import mariapiabaldoin.Giorno_2.entities.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class Runner implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Giorno2Application.class);
        try {
            Menu m = (Menu) ctx.getBean("menu");
            m.printMenu();

            Tavolo t1 = (Tavolo) ctx.getBean("Tavolo1");

            Ordine o1 = new Ordine(1, StatoOrdine.IN_CORSO, 4, t1);

            o1.addElemento(ctx.getBean("pizzaMargherita", Pizza.class));
            o1.addElemento(ctx.getBean("pizzaHawaiian", Pizza.class));
            o1.addElemento(ctx.getBean("lemonade", Bevanda.class));
            o1.addElemento(ctx.getBean("lemonade", Bevanda.class));
            o1.addElemento(ctx.getBean("wine", Bevanda.class));

            System.out.println("DETTAGLI TAVOLO 1:");
            System.out.println(o1.toString());

            System.out.println("CONTO TAVOLO 1");
            System.out.println(o1.getTotale());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        } finally {
            ctx.close();
        }
    }
}
