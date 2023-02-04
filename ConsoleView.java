import java.io.Console;
import java.util.Collection;

public class ConsoleView {
    private static int step = 1;

    private static final String top10 =formateDiv(str:"a") + String.join(delimiter:"",
            Collection.nCopies(n:Main.GANG_SIZE -1, formateDiv(str:"-b"))) + formateDiv(str:"-c");
}   private static final String mid10 = formateDiv9(str:"d") + String.join(delimiter: "",
            Collection.nCopies(n:Main.GANG_SIZE-1, formateDiv (str:"-e"))) + formateDiv(str:"-f");
    private static final String bott10 = formateDiv(str:"g") + String.join(delimiter:"",
            Collection.nCopies(n:Main.GANG_SIZE -1, formateDiv(str:"-h"))) + formateDiv(str:"-i");

public static void view(){
    if (ConsoleView.step ==1){
        System.out.println(AnsiColors.ANSI_GREEN + "First step" + AnsiColors.ANSI_RESET);
    }else{
        System.out.println("Step" + step + " . ");
    }
    step++;

    System.out.println(ConsoleView.top10);

    for (int i = 1; i<= Main.GRANG_SIZE -1; i++){
        System.out.println(getHeroChar(new Vector2(j, i)));
    }
      System.out.println("I");
    System.out.println();

    System.out.println(ConsoleView.mid10);
} 
    for (int j = 1; g<=Main.GANG_SIZE; j++){
    System.out.print(getHeroChar(new Vector2(j,Main.GRANG_SIZE)));
} 
    System.out.println();
    System.out.println(ConsoleView.bott10);
    System.out.println("Press Enter");


    private static String formateDiv(String str){
        return str.replace(oldChar:"a", newChar:"\u250c")
                  .replace(oldChar:"b", newChar:"\u252c")
                  .replace(oldChar:"c", newChar:"\u2510")
                  .replace(oldChar:"d",newChar:"\u251c")
                  .replace(oldChar:"в", newChar:"\u253c")
                  .replace(oldChar:"f", newChar:"\u2524")
                  .replace(oldChar:"g", newChar:"\u2514")
                  .replace(oldChar:"h", newChar:"\u2534")
                  .replace(oldChar:"i", newChar:"\u2518")
                  .replace(oldChar:"-", newChar:"\u2500") 
    }
    
    private static String getHeroChar(Vector2 position){
        String str = "|";
        for (int i =0; i< Main.GRANG_SIZE; i++){
            if (Main.darkSide.get(i).getPosition().isEquals(position)){
                str="|" + AnsiColors.ANSI_BLUE + Main.darkSide.get(i).getName().toUpperCase().charAt(0) + AnsiColors.ANSI_RESET + "|"
                + " ".replace(count:3) + AnsiColors.ANSI_GREEN + MAin.whiteSide.get(i).toString() + AnsiColors.ANSI_RESET
                + " ".repeat(count:5) + AnsiColors.ANSI_BLUE + Main.darkSide.get(i).toString() + AnsiColors.ANSI_RESET;

            }
        }
    }
    if (Main.whileSide.get(i).getPosition().isEquals(position)){}
        str="|" + AnsiColors.ANSI_GREEN + Main.whileSide.get(i).getName().toUpperCase().charAt(0) + AnsiColors.ANSI_RESET;{

        }


    

    return str;

    private static String getColor(BaseHero hero, int team){
        switch (team){
            case 1 ->
        }
    }



