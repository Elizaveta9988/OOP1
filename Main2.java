import chars.*;

import java.nio.channels.AcceptPendingException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main2 {
    

public class Main {
    public static ArrayList<BaseHero> whiteSide = new ArrayList<>();
    public static ArrayList<BaseHero> darkSide = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);
    public static final int GANG_SIZE=10;


    public static final int GANG_SIZE = 2;
    public static ArrayList<BaseHero> whiteSide;
    public static ArrayList<BaseHero> darkSide;

    public static void main(String[] args) {
        init();

        Scanner scanner = new Scanner(System.in);
        while (true){
            ConsoleView.view();
            whiteSide.forEach(n -> n.step(darkSide));
            darkSide.forEach(n -> n.step(whiteSide));
            scanner.nextLine();
        }
    }

    private static void init(){
        whiteSide = new ArrayList<>();
        darkSide = new ArrayList<>();

        int x = 1;
        int y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {
            switch (new Random().nextInt(4)) {
                case 0: whiteSide.add(new Peasant(whiteSide, x, y++)); break;
                case 1: whiteSide.add(new Robber(whiteSide, x, y++)); break;
                case 2: whiteSide.add(new Sniper(whiteSide, x, y++)); break;
                default: whiteSide.add(new Monk(whiteSide, x, y++)); break;
            }
        }

         x = GANG_SIZE;
         y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {

            switch (new Random().nextInt(4)) {
                case 0: darkSide.add(new Peasant(darkSide, x, y++)); break;
                case 1: darkSide.add(new Spareman(darkSide, x, y++)); break;
                case 2: darkSide.add(new Xbowman(darkSide, x, y++)); break;
                default: darkSide.add(new Wizard(darkSide, x, y++)); break;
            }
        }
    }
}
}