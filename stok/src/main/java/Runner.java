import org.example.consumer.Petrovich;
import org.example.item.Bike;
import org.example.stok.Stok;
import org.example.consumer.Reshar;
import org.example.importer.AbsolutCreator;
import org.example.importer.AistCreator;
import org.example.item.Vodka;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                "org.example.stok",
                "org.example.item",
                "org.example.importer",
                "org.example.consumer");

        Stok stok = context.getBean(Stok.class);
        AbsolutCreator absolutCreator = context.getBean(AbsolutCreator.class);
        AistCreator aistCreator = context.getBean(AistCreator.class);
        Bike bike = context.getBean(Bike.class);
        Vodka vodka = context.getBean(Vodka.class);
        Reshar reshar = context.getBean(Reshar.class);
        Petrovich petrovich = context.getBean(Petrovich.class);

        stok.getWorker().brokenItem(absolutCreator.importItemsStok(vodka, stok,3));
        stok.getWorker().brokenItem(aistCreator.importItemsStok(bike, stok, 3));
        reshar.takeItem(stok, bike);
        petrovich.takeItem(stok, vodka);
    }
}
