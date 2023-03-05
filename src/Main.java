import animals.Lion;
import animals.Snake;
import animals.Wolf;
import cage.AnimalCage;
import cage.LionCage;
import cage.SnakeCage;
import cage.WolfCage;
import factory.LionsFactory;
import terminal.MyParser;
import terminal.TerminalReader;
import zoo.Zoo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Wolf> wolfs = new ArrayList<>();
        wolfs.add(new Wolf(3, 5, 4, 4));
        wolfs.add(new Wolf(1, 2, 4, 5));
        wolfs.add(new Wolf(2, 3, 4, 3));
        wolfs.add(new Wolf(4, 6, 4, 2));
        wolfs.add(new Wolf(5, 8, 4, 1));
        WolfCage wolfCage = new WolfCage(wolfs);

        ArrayList<Lion> lions = LionsFactory.createLions(2);
        AnimalCage<Lion> lionCage = new LionCage(lions);

        ArrayList<Snake> snakes = new ArrayList<>();
        snakes.add(new Snake(1, 2, 3, 4));
        SnakeCage snakeCage = new SnakeCage(snakes);


        Zoo zoo1 = new Zoo(lionCage, wolfCage, snakeCage);


        MyParser parser = new MyParser();
        TerminalReader terminal = TerminalReader.newTerminalReader(parser);
        terminal.runReader(zoo1);


    }
}