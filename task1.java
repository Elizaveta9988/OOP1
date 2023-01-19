import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[]args){
        ArrayList<BaseHero> farmer = new ArrayList<>();
        String[] farmerNames = {" Михаил, " "Егор ", "Дмитрий," " Сережа," "Елисей"};
                for (String name: farmerNames){
                    farmer.add(new Farmer (name) ;
                }
                for (BaseHero character: farmer){
                    System.out.printf(character);
                }
                System.out.printf("==================");
        ArrayList<BaseHero> rogue = new ArrayList<>();
        String[] rogueNames = {" Михаил, " "Егор ", "Дмитрий," " Сережа," "Елисей"};
        for (String name: farmerNames){
            farmer.add(new Rogue(name);
        }

        for (BaseHero character: rogue){
            System.out.printf(character);
        }
        System.out.printf("==================");


        ArrayList<BaseHero> sniper = new ArrayList<>();
        String[] sniperNames = {" Михаил, " "Егор ", "Дмитрий," " Сережа," "Елисей"};
        for (String name: farmerNames){
            farmer.add(new Sniper(name));
        }
        for (BaseHero character: sniper){
            System.out.printf(character);
        }
        System.out.printf("==================");


        ArrayList<BaseHero> mage = new ArrayList<>();
        String[] mageNames = {" Михаил, " "Егор ", "Дмитрий," " Сережа," "Елисей"};
        for (String name: farmerNames){
            farmer.add(new Mage(name));
        }
        for (BaseHero character: mage){
            System.out.printf(character);
        }
        System.out.printf("==================");

        ArrayList<BaseHero> spearman = new ArrayList<>();
        String[] spearmanNames = {" Михаил, " "Егор ", "Дмитрий," " Сережа," "Елисей"};
        for (String name: farmerNames){
            farmer.add(new Spearman(name));
        }
        for (BaseHero character: spearman){
            System.out.printf(character);
        }
        System.out.printf("==================");


        ArrayList<BaseHero> crossbownman = new ArrayList<>();
        String[] crossbownmanNames = {" Михаил, " "Егор ", "Дмитрий," " Сережа," "Елисей"};
        for (String name: farmerNames){
            farmer.add(new Crossbownman(name));
        }
        for (BaseHero character: crossbownman){
            System.out.printf(character);
        }
        System.out.printf("==================");


        ArrayList<BaseHero> monk = new ArrayList<>();
        String[] monkNames = {" Михаил, " "Егор ", "Дмитрий," " Сережа," "Елисей"};
        for (String name: farmerNames){
            farmer.add(new Monk(name));
        }
        for (BaseHero character: monk){
            System.out.printf(character);
        }
        System.out.printf("==================");

    }
}
